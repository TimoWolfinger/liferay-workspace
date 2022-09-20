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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchFuetterungenException;
import de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen;
import de.timowolfinger.liferay.beeInformationSystem.model.FuetterungenTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungenImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungenModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuetterungenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuetterungenUtil;
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
 * The persistence implementation for the fuetterungen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FuetterungenPersistence.class, BasePersistence.class})
public class FuetterungenPersistenceImpl
	extends BasePersistenceImpl<Fuetterungen>
	implements FuetterungenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FuetterungenUtil</code> to access the fuetterungen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FuetterungenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public FuetterungenPersistenceImpl() {
		setModelClass(Fuetterungen.class);

		setModelImplClass(FuetterungenImpl.class);
		setModelPKClass(long.class);

		setTable(FuetterungenTable.INSTANCE);
	}

	/**
	 * Caches the fuetterungen in the entity cache if it is enabled.
	 *
	 * @param fuetterungen the fuetterungen
	 */
	@Override
	public void cacheResult(Fuetterungen fuetterungen) {
		entityCache.putResult(
			FuetterungenImpl.class, fuetterungen.getPrimaryKey(), fuetterungen);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fuetterungens in the entity cache if it is enabled.
	 *
	 * @param fuetterungens the fuetterungens
	 */
	@Override
	public void cacheResult(List<Fuetterungen> fuetterungens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fuetterungens.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Fuetterungen fuetterungen : fuetterungens) {
			if (entityCache.getResult(
					FuetterungenImpl.class, fuetterungen.getPrimaryKey()) ==
						null) {

				cacheResult(fuetterungen);
			}
		}
	}

	/**
	 * Clears the cache for all fuetterungens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FuetterungenImpl.class);

		finderCache.clearCache(FuetterungenImpl.class);
	}

	/**
	 * Clears the cache for the fuetterungen.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Fuetterungen fuetterungen) {
		entityCache.removeResult(FuetterungenImpl.class, fuetterungen);
	}

	@Override
	public void clearCache(List<Fuetterungen> fuetterungens) {
		for (Fuetterungen fuetterungen : fuetterungens) {
			entityCache.removeResult(FuetterungenImpl.class, fuetterungen);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FuetterungenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FuetterungenImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new fuetterungen with the primary key. Does not add the fuetterungen to the database.
	 *
	 * @param fuetterungen_id the primary key for the new fuetterungen
	 * @return the new fuetterungen
	 */
	@Override
	public Fuetterungen create(long fuetterungen_id) {
		Fuetterungen fuetterungen = new FuetterungenImpl();

		fuetterungen.setNew(true);
		fuetterungen.setPrimaryKey(fuetterungen_id);

		return fuetterungen;
	}

	/**
	 * Removes the fuetterungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen that was removed
	 * @throws NoSuchFuetterungenException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public Fuetterungen remove(long fuetterungen_id)
		throws NoSuchFuetterungenException {

		return remove((Serializable)fuetterungen_id);
	}

	/**
	 * Removes the fuetterungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fuetterungen
	 * @return the fuetterungen that was removed
	 * @throws NoSuchFuetterungenException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public Fuetterungen remove(Serializable primaryKey)
		throws NoSuchFuetterungenException {

		Session session = null;

		try {
			session = openSession();

			Fuetterungen fuetterungen = (Fuetterungen)session.get(
				FuetterungenImpl.class, primaryKey);

			if (fuetterungen == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuetterungenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fuetterungen);
		}
		catch (NoSuchFuetterungenException noSuchEntityException) {
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
	protected Fuetterungen removeImpl(Fuetterungen fuetterungen) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fuetterungen)) {
				fuetterungen = (Fuetterungen)session.get(
					FuetterungenImpl.class, fuetterungen.getPrimaryKeyObj());
			}

			if (fuetterungen != null) {
				session.delete(fuetterungen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fuetterungen != null) {
			clearCache(fuetterungen);
		}

		return fuetterungen;
	}

	@Override
	public Fuetterungen updateImpl(Fuetterungen fuetterungen) {
		boolean isNew = fuetterungen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fuetterungen);
			}
			else {
				fuetterungen = (Fuetterungen)session.merge(fuetterungen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FuetterungenImpl.class, fuetterungen, false, true);

		if (isNew) {
			fuetterungen.setNew(false);
		}

		fuetterungen.resetOriginalValues();

		return fuetterungen;
	}

	/**
	 * Returns the fuetterungen with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fuetterungen
	 * @return the fuetterungen
	 * @throws NoSuchFuetterungenException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public Fuetterungen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuetterungenException {

		Fuetterungen fuetterungen = fetchByPrimaryKey(primaryKey);

		if (fuetterungen == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuetterungenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fuetterungen;
	}

	/**
	 * Returns the fuetterungen with the primary key or throws a <code>NoSuchFuetterungenException</code> if it could not be found.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen
	 * @throws NoSuchFuetterungenException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public Fuetterungen findByPrimaryKey(long fuetterungen_id)
		throws NoSuchFuetterungenException {

		return findByPrimaryKey((Serializable)fuetterungen_id);
	}

	/**
	 * Returns the fuetterungen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen, or <code>null</code> if a fuetterungen with the primary key could not be found
	 */
	@Override
	public Fuetterungen fetchByPrimaryKey(long fuetterungen_id) {
		return fetchByPrimaryKey((Serializable)fuetterungen_id);
	}

	/**
	 * Returns all the fuetterungens.
	 *
	 * @return the fuetterungens
	 */
	@Override
	public List<Fuetterungen> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @return the range of fuetterungens
	 */
	@Override
	public List<Fuetterungen> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fuetterungens
	 */
	@Override
	public List<Fuetterungen> findAll(
		int start, int end, OrderByComparator<Fuetterungen> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fuetterungens
	 */
	@Override
	public List<Fuetterungen> findAll(
		int start, int end, OrderByComparator<Fuetterungen> orderByComparator,
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

		List<Fuetterungen> list = null;

		if (useFinderCache) {
			list = (List<Fuetterungen>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FUETTERUNGEN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FUETTERUNGEN;

				sql = sql.concat(FuetterungenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Fuetterungen>)QueryUtil.list(
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
	 * Removes all the fuetterungens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Fuetterungen fuetterungen : findAll()) {
			remove(fuetterungen);
		}
	}

	/**
	 * Returns the number of fuetterungens.
	 *
	 * @return the number of fuetterungens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FUETTERUNGEN);

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
		return "fuetterungen_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FUETTERUNGEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FuetterungenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fuetterungen persistence.
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

		_setFuetterungenUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFuetterungenUtilPersistence(null);

		entityCache.removeCache(FuetterungenImpl.class.getName());
	}

	private void _setFuetterungenUtilPersistence(
		FuetterungenPersistence fuetterungenPersistence) {

		try {
			Field field = FuetterungenUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, fuetterungenPersistence);
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

	private static final String _SQL_SELECT_FUETTERUNGEN =
		"SELECT fuetterungen FROM Fuetterungen fuetterungen";

	private static final String _SQL_COUNT_FUETTERUNGEN =
		"SELECT COUNT(fuetterungen) FROM Fuetterungen fuetterungen";

	private static final String _ORDER_BY_ENTITY_ALIAS = "fuetterungen.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Fuetterungen exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		FuetterungenPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FuetterungenModelArgumentsResolver
		_fuetterungenModelArgumentsResolver;

}