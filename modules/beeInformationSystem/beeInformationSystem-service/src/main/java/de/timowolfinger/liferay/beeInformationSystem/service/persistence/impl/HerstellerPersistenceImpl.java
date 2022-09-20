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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchHerstellerException;
import de.timowolfinger.liferay.beeInformationSystem.model.Hersteller;
import de.timowolfinger.liferay.beeInformationSystem.model.HerstellerTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HerstellerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HerstellerUtil;
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
 * The persistence implementation for the hersteller service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {HerstellerPersistence.class, BasePersistence.class})
public class HerstellerPersistenceImpl
	extends BasePersistenceImpl<Hersteller> implements HerstellerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HerstellerUtil</code> to access the hersteller persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HerstellerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public HerstellerPersistenceImpl() {
		setModelClass(Hersteller.class);

		setModelImplClass(HerstellerImpl.class);
		setModelPKClass(long.class);

		setTable(HerstellerTable.INSTANCE);
	}

	/**
	 * Caches the hersteller in the entity cache if it is enabled.
	 *
	 * @param hersteller the hersteller
	 */
	@Override
	public void cacheResult(Hersteller hersteller) {
		entityCache.putResult(
			HerstellerImpl.class, hersteller.getPrimaryKey(), hersteller);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the herstellers in the entity cache if it is enabled.
	 *
	 * @param herstellers the herstellers
	 */
	@Override
	public void cacheResult(List<Hersteller> herstellers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (herstellers.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Hersteller hersteller : herstellers) {
			if (entityCache.getResult(
					HerstellerImpl.class, hersteller.getPrimaryKey()) == null) {

				cacheResult(hersteller);
			}
		}
	}

	/**
	 * Clears the cache for all herstellers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HerstellerImpl.class);

		finderCache.clearCache(HerstellerImpl.class);
	}

	/**
	 * Clears the cache for the hersteller.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Hersteller hersteller) {
		entityCache.removeResult(HerstellerImpl.class, hersteller);
	}

	@Override
	public void clearCache(List<Hersteller> herstellers) {
		for (Hersteller hersteller : herstellers) {
			entityCache.removeResult(HerstellerImpl.class, hersteller);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HerstellerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(HerstellerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new hersteller with the primary key. Does not add the hersteller to the database.
	 *
	 * @param hersteller_id the primary key for the new hersteller
	 * @return the new hersteller
	 */
	@Override
	public Hersteller create(long hersteller_id) {
		Hersteller hersteller = new HerstellerImpl();

		hersteller.setNew(true);
		hersteller.setPrimaryKey(hersteller_id);

		return hersteller;
	}

	/**
	 * Removes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws NoSuchHerstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public Hersteller remove(long hersteller_id)
		throws NoSuchHerstellerException {

		return remove((Serializable)hersteller_id);
	}

	/**
	 * Removes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws NoSuchHerstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public Hersteller remove(Serializable primaryKey)
		throws NoSuchHerstellerException {

		Session session = null;

		try {
			session = openSession();

			Hersteller hersteller = (Hersteller)session.get(
				HerstellerImpl.class, primaryKey);

			if (hersteller == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHerstellerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hersteller);
		}
		catch (NoSuchHerstellerException noSuchEntityException) {
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
	protected Hersteller removeImpl(Hersteller hersteller) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hersteller)) {
				hersteller = (Hersteller)session.get(
					HerstellerImpl.class, hersteller.getPrimaryKeyObj());
			}

			if (hersteller != null) {
				session.delete(hersteller);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hersteller != null) {
			clearCache(hersteller);
		}

		return hersteller;
	}

	@Override
	public Hersteller updateImpl(Hersteller hersteller) {
		boolean isNew = hersteller.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hersteller);
			}
			else {
				hersteller = (Hersteller)session.merge(hersteller);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(HerstellerImpl.class, hersteller, false, true);

		if (isNew) {
			hersteller.setNew(false);
		}

		hersteller.resetOriginalValues();

		return hersteller;
	}

	/**
	 * Returns the hersteller with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hersteller
	 * @return the hersteller
	 * @throws NoSuchHerstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public Hersteller findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHerstellerException {

		Hersteller hersteller = fetchByPrimaryKey(primaryKey);

		if (hersteller == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHerstellerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hersteller;
	}

	/**
	 * Returns the hersteller with the primary key or throws a <code>NoSuchHerstellerException</code> if it could not be found.
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller
	 * @throws NoSuchHerstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public Hersteller findByPrimaryKey(long hersteller_id)
		throws NoSuchHerstellerException {

		return findByPrimaryKey((Serializable)hersteller_id);
	}

	/**
	 * Returns the hersteller with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller, or <code>null</code> if a hersteller with the primary key could not be found
	 */
	@Override
	public Hersteller fetchByPrimaryKey(long hersteller_id) {
		return fetchByPrimaryKey((Serializable)hersteller_id);
	}

	/**
	 * Returns all the herstellers.
	 *
	 * @return the herstellers
	 */
	@Override
	public List<Hersteller> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @return the range of herstellers
	 */
	@Override
	public List<Hersteller> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of herstellers
	 */
	@Override
	public List<Hersteller> findAll(
		int start, int end, OrderByComparator<Hersteller> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of herstellers
	 */
	@Override
	public List<Hersteller> findAll(
		int start, int end, OrderByComparator<Hersteller> orderByComparator,
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

		List<Hersteller> list = null;

		if (useFinderCache) {
			list = (List<Hersteller>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HERSTELLER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HERSTELLER;

				sql = sql.concat(HerstellerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Hersteller>)QueryUtil.list(
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
	 * Removes all the herstellers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Hersteller hersteller : findAll()) {
			remove(hersteller);
		}
	}

	/**
	 * Returns the number of herstellers.
	 *
	 * @return the number of herstellers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_HERSTELLER);

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
		return "hersteller_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HERSTELLER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HerstellerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hersteller persistence.
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

		_setHerstellerUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setHerstellerUtilPersistence(null);

		entityCache.removeCache(HerstellerImpl.class.getName());
	}

	private void _setHerstellerUtilPersistence(
		HerstellerPersistence herstellerPersistence) {

		try {
			Field field = HerstellerUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, herstellerPersistence);
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

	private static final String _SQL_SELECT_HERSTELLER =
		"SELECT hersteller FROM Hersteller hersteller";

	private static final String _SQL_COUNT_HERSTELLER =
		"SELECT COUNT(hersteller) FROM Hersteller hersteller";

	private static final String _ORDER_BY_ENTITY_ALIAS = "hersteller.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Hersteller exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		HerstellerPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private HerstellerModelArgumentsResolver _herstellerModelArgumentsResolver;

}