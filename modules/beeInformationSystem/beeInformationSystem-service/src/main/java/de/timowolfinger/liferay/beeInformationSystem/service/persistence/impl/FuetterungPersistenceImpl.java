/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchFuetterungException;
import de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung;
import de.timowolfinger.liferay.beeInformationSystem.model.FuetterungTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuetterungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuetterungUtil;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.constants.PersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the fuetterung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FuetterungPersistence.class, BasePersistence.class})
public class FuetterungPersistenceImpl
	extends BasePersistenceImpl<Fuetterung> implements FuetterungPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FuetterungUtil</code> to access the fuetterung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FuetterungImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public FuetterungPersistenceImpl() {
		setModelClass(Fuetterung.class);

		setModelImplClass(FuetterungImpl.class);
		setModelPKClass(long.class);

		setTable(FuetterungTable.INSTANCE);
	}

	/**
	 * Caches the fuetterung in the entity cache if it is enabled.
	 *
	 * @param fuetterung the fuetterung
	 */
	@Override
	public void cacheResult(Fuetterung fuetterung) {
		entityCache.putResult(
			FuetterungImpl.class, fuetterung.getPrimaryKey(), fuetterung);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fuetterungs in the entity cache if it is enabled.
	 *
	 * @param fuetterungs the fuetterungs
	 */
	@Override
	public void cacheResult(List<Fuetterung> fuetterungs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fuetterungs.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Fuetterung fuetterung : fuetterungs) {
			if (entityCache.getResult(
					FuetterungImpl.class, fuetterung.getPrimaryKey()) == null) {

				cacheResult(fuetterung);
			}
		}
	}

	/**
	 * Clears the cache for all fuetterungs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FuetterungImpl.class);

		finderCache.clearCache(FuetterungImpl.class);
	}

	/**
	 * Clears the cache for the fuetterung.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Fuetterung fuetterung) {
		entityCache.removeResult(FuetterungImpl.class, fuetterung);
	}

	@Override
	public void clearCache(List<Fuetterung> fuetterungs) {
		for (Fuetterung fuetterung : fuetterungs) {
			entityCache.removeResult(FuetterungImpl.class, fuetterung);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FuetterungImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FuetterungImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new fuetterung with the primary key. Does not add the fuetterung to the database.
	 *
	 * @param fuetterung_id the primary key for the new fuetterung
	 * @return the new fuetterung
	 */
	@Override
	public Fuetterung create(long fuetterung_id) {
		Fuetterung fuetterung = new FuetterungImpl();

		fuetterung.setNew(true);
		fuetterung.setPrimaryKey(fuetterung_id);

		return fuetterung;
	}

	/**
	 * Removes the fuetterung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung that was removed
	 * @throws NoSuchFuetterungException if a fuetterung with the primary key could not be found
	 */
	@Override
	public Fuetterung remove(long fuetterung_id)
		throws NoSuchFuetterungException {

		return remove((Serializable)fuetterung_id);
	}

	/**
	 * Removes the fuetterung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fuetterung
	 * @return the fuetterung that was removed
	 * @throws NoSuchFuetterungException if a fuetterung with the primary key could not be found
	 */
	@Override
	public Fuetterung remove(Serializable primaryKey)
		throws NoSuchFuetterungException {

		Session session = null;

		try {
			session = openSession();

			Fuetterung fuetterung = (Fuetterung)session.get(
				FuetterungImpl.class, primaryKey);

			if (fuetterung == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuetterungException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fuetterung);
		}
		catch (NoSuchFuetterungException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Fuetterung removeImpl(Fuetterung fuetterung) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fuetterung)) {
				fuetterung = (Fuetterung)session.get(
					FuetterungImpl.class, fuetterung.getPrimaryKeyObj());
			}

			if (fuetterung != null) {
				session.delete(fuetterung);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fuetterung != null) {
			clearCache(fuetterung);
		}

		return fuetterung;
	}

	@Override
	public Fuetterung updateImpl(Fuetterung fuetterung) {
		boolean isNew = fuetterung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fuetterung);
			}
			else {
				fuetterung = (Fuetterung)session.merge(fuetterung);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(FuetterungImpl.class, fuetterung, false, true);

		if (isNew) {
			fuetterung.setNew(false);
		}

		fuetterung.resetOriginalValues();

		return fuetterung;
	}

	/**
	 * Returns the fuetterung with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fuetterung
	 * @return the fuetterung
	 * @throws NoSuchFuetterungException if a fuetterung with the primary key could not be found
	 */
	@Override
	public Fuetterung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuetterungException {

		Fuetterung fuetterung = fetchByPrimaryKey(primaryKey);

		if (fuetterung == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuetterungException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fuetterung;
	}

	/**
	 * Returns the fuetterung with the primary key or throws a <code>NoSuchFuetterungException</code> if it could not be found.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung
	 * @throws NoSuchFuetterungException if a fuetterung with the primary key could not be found
	 */
	@Override
	public Fuetterung findByPrimaryKey(long fuetterung_id)
		throws NoSuchFuetterungException {

		return findByPrimaryKey((Serializable)fuetterung_id);
	}

	/**
	 * Returns the fuetterung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung, or <code>null</code> if a fuetterung with the primary key could not be found
	 */
	@Override
	public Fuetterung fetchByPrimaryKey(long fuetterung_id) {
		return fetchByPrimaryKey((Serializable)fuetterung_id);
	}

	/**
	 * Returns all the fuetterungs.
	 *
	 * @return the fuetterungs
	 */
	@Override
	public List<Fuetterung> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @return the range of fuetterungs
	 */
	@Override
	public List<Fuetterung> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fuetterungs
	 */
	@Override
	public List<Fuetterung> findAll(
		int start, int end, OrderByComparator<Fuetterung> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fuetterungs
	 */
	@Override
	public List<Fuetterung> findAll(
		int start, int end, OrderByComparator<Fuetterung> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Fuetterung> list = null;

		if (useFinderCache) {
			list = (List<Fuetterung>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FUETTERUNG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FUETTERUNG;

				sql = sql.concat(FuetterungModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Fuetterung>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the fuetterungs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Fuetterung fuetterung : findAll()) {
			remove(fuetterung);
		}
	}

	/**
	 * Returns the number of fuetterungs.
	 *
	 * @return the number of fuetterungs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FUETTERUNG);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "fuetterung_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FUETTERUNG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FuetterungModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fuetterung persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_setFuetterungUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFuetterungUtilPersistence(null);

		entityCache.removeCache(FuetterungImpl.class.getName());
	}

	private void _setFuetterungUtilPersistence(
		FuetterungPersistence fuetterungPersistence) {

		try {
			Field field = FuetterungUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, fuetterungPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = PersistenceConstants.SERVICE_CONFIGURATION_FILTER, unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FUETTERUNG =
		"SELECT fuetterung FROM Fuetterung fuetterung";

	private static final String _SQL_COUNT_FUETTERUNG =
		"SELECT COUNT(fuetterung) FROM Fuetterung fuetterung";

	private static final String _ORDER_BY_ENTITY_ALIAS = "fuetterung.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Fuetterung exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		FuetterungPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FuetterungModelArgumentsResolver _fuetterungModelArgumentsResolver;

}