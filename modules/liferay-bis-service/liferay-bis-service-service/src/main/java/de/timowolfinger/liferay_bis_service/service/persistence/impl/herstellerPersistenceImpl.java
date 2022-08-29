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

package de.timowolfinger.liferay_bis_service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.OrderByComparator;

import de.timowolfinger.liferay_bis_service.exception.NoSuchherstellerException;
import de.timowolfinger.liferay_bis_service.model.hersteller;
import de.timowolfinger.liferay_bis_service.model.herstellerTable;
import de.timowolfinger.liferay_bis_service.model.impl.herstellerImpl;
import de.timowolfinger.liferay_bis_service.model.impl.herstellerModelImpl;
import de.timowolfinger.liferay_bis_service.service.persistence.herstellerPersistence;
import de.timowolfinger.liferay_bis_service.service.persistence.impl.constants.bisPersistenceConstants;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
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
@Component(service = {herstellerPersistence.class, BasePersistence.class})
public class herstellerPersistenceImpl
	extends BasePersistenceImpl<hersteller> implements herstellerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>herstellerUtil</code> to access the hersteller persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		herstellerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public herstellerPersistenceImpl() {
		setModelClass(hersteller.class);

		setModelImplClass(herstellerImpl.class);
		setModelPKClass(long.class);

		setTable(herstellerTable.INSTANCE);
	}

	/**
	 * Caches the hersteller in the entity cache if it is enabled.
	 *
	 * @param hersteller the hersteller
	 */
	@Override
	public void cacheResult(hersteller hersteller) {
		entityCache.putResult(
			herstellerImpl.class, hersteller.getPrimaryKey(), hersteller);
	}

	/**
	 * Caches the herstellers in the entity cache if it is enabled.
	 *
	 * @param herstellers the herstellers
	 */
	@Override
	public void cacheResult(List<hersteller> herstellers) {
		for (hersteller hersteller : herstellers) {
			if (entityCache.getResult(
					herstellerImpl.class, hersteller.getPrimaryKey()) == null) {

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
		entityCache.clearCache(herstellerImpl.class);

		finderCache.clearCache(herstellerImpl.class);
	}

	/**
	 * Clears the cache for the hersteller.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(hersteller hersteller) {
		entityCache.removeResult(herstellerImpl.class, hersteller);
	}

	@Override
	public void clearCache(List<hersteller> herstellers) {
		for (hersteller hersteller : herstellers) {
			entityCache.removeResult(herstellerImpl.class, hersteller);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(herstellerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(herstellerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new hersteller with the primary key. Does not add the hersteller to the database.
	 *
	 * @param id the primary key for the new hersteller
	 * @return the new hersteller
	 */
	@Override
	public hersteller create(long id) {
		hersteller hersteller = new herstellerImpl();

		hersteller.setNew(true);
		hersteller.setPrimaryKey(id);

		return hersteller;
	}

	/**
	 * Removes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws NoSuchherstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public hersteller remove(long id) throws NoSuchherstellerException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws NoSuchherstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public hersteller remove(Serializable primaryKey)
		throws NoSuchherstellerException {

		Session session = null;

		try {
			session = openSession();

			hersteller hersteller = (hersteller)session.get(
				herstellerImpl.class, primaryKey);

			if (hersteller == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchherstellerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hersteller);
		}
		catch (NoSuchherstellerException noSuchEntityException) {
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
	protected hersteller removeImpl(hersteller hersteller) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hersteller)) {
				hersteller = (hersteller)session.get(
					herstellerImpl.class, hersteller.getPrimaryKeyObj());
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
	public hersteller updateImpl(hersteller hersteller) {
		boolean isNew = hersteller.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hersteller);
			}
			else {
				hersteller = (hersteller)session.merge(hersteller);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(herstellerImpl.class, hersteller, false, true);

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
	 * @throws NoSuchherstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public hersteller findByPrimaryKey(Serializable primaryKey)
		throws NoSuchherstellerException {

		hersteller hersteller = fetchByPrimaryKey(primaryKey);

		if (hersteller == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchherstellerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hersteller;
	}

	/**
	 * Returns the hersteller with the primary key or throws a <code>NoSuchherstellerException</code> if it could not be found.
	 *
	 * @param id the primary key of the hersteller
	 * @return the hersteller
	 * @throws NoSuchherstellerException if a hersteller with the primary key could not be found
	 */
	@Override
	public hersteller findByPrimaryKey(long id)
		throws NoSuchherstellerException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the hersteller with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the hersteller
	 * @return the hersteller, or <code>null</code> if a hersteller with the primary key could not be found
	 */
	@Override
	public hersteller fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the herstellers.
	 *
	 * @return the herstellers
	 */
	@Override
	public List<hersteller> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>herstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @return the range of herstellers
	 */
	@Override
	public List<hersteller> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>herstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of herstellers
	 */
	@Override
	public List<hersteller> findAll(
		int start, int end, OrderByComparator<hersteller> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>herstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of herstellers
	 */
	@Override
	public List<hersteller> findAll(
		int start, int end, OrderByComparator<hersteller> orderByComparator,
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

		List<hersteller> list = null;

		if (useFinderCache) {
			list = (List<hersteller>)finderCache.getResult(
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

				sql = sql.concat(herstellerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<hersteller>)QueryUtil.list(
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
		for (hersteller hersteller : findAll()) {
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
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HERSTELLER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return herstellerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hersteller persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new herstellerModelArgumentsResolver(),
			new HashMapDictionary<>());

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(herstellerImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	@Override
	@Reference(
		target = bisPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = bisPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = bisPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HERSTELLER =
		"SELECT hersteller FROM hersteller hersteller";

	private static final String _SQL_COUNT_HERSTELLER =
		"SELECT COUNT(hersteller) FROM hersteller hersteller";

	private static final String _ORDER_BY_ENTITY_ALIAS = "hersteller.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No hersteller exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		herstellerPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class herstellerModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			herstellerModelImpl herstellerModelImpl =
				(herstellerModelImpl)baseModel;

			long columnBitmask = herstellerModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(herstellerModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						herstellerModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(herstellerModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return herstellerImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return herstellerTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			herstellerModelImpl herstellerModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = herstellerModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = herstellerModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}