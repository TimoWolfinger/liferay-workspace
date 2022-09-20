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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchHonigernteException;
import de.timowolfinger.liferay.beeInformationSystem.model.Honigernte;
import de.timowolfinger.liferay.beeInformationSystem.model.HonigernteTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HonigerntePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HonigernteUtil;
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
 * The persistence implementation for the honigernte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {HonigerntePersistence.class, BasePersistence.class})
public class HonigerntePersistenceImpl
	extends BasePersistenceImpl<Honigernte> implements HonigerntePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HonigernteUtil</code> to access the honigernte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HonigernteImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public HonigerntePersistenceImpl() {
		setModelClass(Honigernte.class);

		setModelImplClass(HonigernteImpl.class);
		setModelPKClass(long.class);

		setTable(HonigernteTable.INSTANCE);
	}

	/**
	 * Caches the honigernte in the entity cache if it is enabled.
	 *
	 * @param honigernte the honigernte
	 */
	@Override
	public void cacheResult(Honigernte honigernte) {
		entityCache.putResult(
			HonigernteImpl.class, honigernte.getPrimaryKey(), honigernte);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the honigerntes in the entity cache if it is enabled.
	 *
	 * @param honigerntes the honigerntes
	 */
	@Override
	public void cacheResult(List<Honigernte> honigerntes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (honigerntes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Honigernte honigernte : honigerntes) {
			if (entityCache.getResult(
					HonigernteImpl.class, honigernte.getPrimaryKey()) == null) {

				cacheResult(honigernte);
			}
		}
	}

	/**
	 * Clears the cache for all honigerntes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HonigernteImpl.class);

		finderCache.clearCache(HonigernteImpl.class);
	}

	/**
	 * Clears the cache for the honigernte.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Honigernte honigernte) {
		entityCache.removeResult(HonigernteImpl.class, honigernte);
	}

	@Override
	public void clearCache(List<Honigernte> honigerntes) {
		for (Honigernte honigernte : honigerntes) {
			entityCache.removeResult(HonigernteImpl.class, honigernte);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HonigernteImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(HonigernteImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new honigernte with the primary key. Does not add the honigernte to the database.
	 *
	 * @param honigernte_id the primary key for the new honigernte
	 * @return the new honigernte
	 */
	@Override
	public Honigernte create(long honigernte_id) {
		Honigernte honigernte = new HonigernteImpl();

		honigernte.setNew(true);
		honigernte.setPrimaryKey(honigernte_id);

		return honigernte;
	}

	/**
	 * Removes the honigernte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte that was removed
	 * @throws NoSuchHonigernteException if a honigernte with the primary key could not be found
	 */
	@Override
	public Honigernte remove(long honigernte_id)
		throws NoSuchHonigernteException {

		return remove((Serializable)honigernte_id);
	}

	/**
	 * Removes the honigernte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the honigernte
	 * @return the honigernte that was removed
	 * @throws NoSuchHonigernteException if a honigernte with the primary key could not be found
	 */
	@Override
	public Honigernte remove(Serializable primaryKey)
		throws NoSuchHonigernteException {

		Session session = null;

		try {
			session = openSession();

			Honigernte honigernte = (Honigernte)session.get(
				HonigernteImpl.class, primaryKey);

			if (honigernte == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHonigernteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(honigernte);
		}
		catch (NoSuchHonigernteException noSuchEntityException) {
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
	protected Honigernte removeImpl(Honigernte honigernte) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(honigernte)) {
				honigernte = (Honigernte)session.get(
					HonigernteImpl.class, honigernte.getPrimaryKeyObj());
			}

			if (honigernte != null) {
				session.delete(honigernte);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (honigernte != null) {
			clearCache(honigernte);
		}

		return honigernte;
	}

	@Override
	public Honigernte updateImpl(Honigernte honigernte) {
		boolean isNew = honigernte.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(honigernte);
			}
			else {
				honigernte = (Honigernte)session.merge(honigernte);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(HonigernteImpl.class, honigernte, false, true);

		if (isNew) {
			honigernte.setNew(false);
		}

		honigernte.resetOriginalValues();

		return honigernte;
	}

	/**
	 * Returns the honigernte with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the honigernte
	 * @return the honigernte
	 * @throws NoSuchHonigernteException if a honigernte with the primary key could not be found
	 */
	@Override
	public Honigernte findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHonigernteException {

		Honigernte honigernte = fetchByPrimaryKey(primaryKey);

		if (honigernte == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHonigernteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return honigernte;
	}

	/**
	 * Returns the honigernte with the primary key or throws a <code>NoSuchHonigernteException</code> if it could not be found.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte
	 * @throws NoSuchHonigernteException if a honigernte with the primary key could not be found
	 */
	@Override
	public Honigernte findByPrimaryKey(long honigernte_id)
		throws NoSuchHonigernteException {

		return findByPrimaryKey((Serializable)honigernte_id);
	}

	/**
	 * Returns the honigernte with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte, or <code>null</code> if a honigernte with the primary key could not be found
	 */
	@Override
	public Honigernte fetchByPrimaryKey(long honigernte_id) {
		return fetchByPrimaryKey((Serializable)honigernte_id);
	}

	/**
	 * Returns all the honigerntes.
	 *
	 * @return the honigerntes
	 */
	@Override
	public List<Honigernte> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @return the range of honigerntes
	 */
	@Override
	public List<Honigernte> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of honigerntes
	 */
	@Override
	public List<Honigernte> findAll(
		int start, int end, OrderByComparator<Honigernte> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of honigerntes
	 */
	@Override
	public List<Honigernte> findAll(
		int start, int end, OrderByComparator<Honigernte> orderByComparator,
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

		List<Honigernte> list = null;

		if (useFinderCache) {
			list = (List<Honigernte>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HONIGERNTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HONIGERNTE;

				sql = sql.concat(HonigernteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Honigernte>)QueryUtil.list(
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
	 * Removes all the honigerntes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Honigernte honigernte : findAll()) {
			remove(honigernte);
		}
	}

	/**
	 * Returns the number of honigerntes.
	 *
	 * @return the number of honigerntes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_HONIGERNTE);

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
		return "honigernte_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HONIGERNTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HonigernteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the honigernte persistence.
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

		_setHonigernteUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setHonigernteUtilPersistence(null);

		entityCache.removeCache(HonigernteImpl.class.getName());
	}

	private void _setHonigernteUtilPersistence(
		HonigerntePersistence honigerntePersistence) {

		try {
			Field field = HonigernteUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, honigerntePersistence);
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

	private static final String _SQL_SELECT_HONIGERNTE =
		"SELECT honigernte FROM Honigernte honigernte";

	private static final String _SQL_COUNT_HONIGERNTE =
		"SELECT COUNT(honigernte) FROM Honigernte honigernte";

	private static final String _ORDER_BY_ENTITY_ALIAS = "honigernte.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Honigernte exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		HonigerntePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private HonigernteModelArgumentsResolver _honigernteModelArgumentsResolver;

}