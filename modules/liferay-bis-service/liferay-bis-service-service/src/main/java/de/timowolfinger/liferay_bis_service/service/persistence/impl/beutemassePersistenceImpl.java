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

import de.timowolfinger.liferay_bis_service.exception.NoSuchbeutemasseException;
import de.timowolfinger.liferay_bis_service.model.beutemasse;
import de.timowolfinger.liferay_bis_service.model.beutemasseTable;
import de.timowolfinger.liferay_bis_service.model.impl.beutemasseImpl;
import de.timowolfinger.liferay_bis_service.model.impl.beutemasseModelImpl;
import de.timowolfinger.liferay_bis_service.service.persistence.beutemassePersistence;
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
 * The persistence implementation for the beutemasse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {beutemassePersistence.class, BasePersistence.class})
public class beutemassePersistenceImpl
	extends BasePersistenceImpl<beutemasse> implements beutemassePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>beutemasseUtil</code> to access the beutemasse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		beutemasseImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public beutemassePersistenceImpl() {
		setModelClass(beutemasse.class);

		setModelImplClass(beutemasseImpl.class);
		setModelPKClass(long.class);

		setTable(beutemasseTable.INSTANCE);
	}

	/**
	 * Caches the beutemasse in the entity cache if it is enabled.
	 *
	 * @param beutemasse the beutemasse
	 */
	@Override
	public void cacheResult(beutemasse beutemasse) {
		entityCache.putResult(
			beutemasseImpl.class, beutemasse.getPrimaryKey(), beutemasse);
	}

	/**
	 * Caches the beutemasses in the entity cache if it is enabled.
	 *
	 * @param beutemasses the beutemasses
	 */
	@Override
	public void cacheResult(List<beutemasse> beutemasses) {
		for (beutemasse beutemasse : beutemasses) {
			if (entityCache.getResult(
					beutemasseImpl.class, beutemasse.getPrimaryKey()) == null) {

				cacheResult(beutemasse);
			}
		}
	}

	/**
	 * Clears the cache for all beutemasses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(beutemasseImpl.class);

		finderCache.clearCache(beutemasseImpl.class);
	}

	/**
	 * Clears the cache for the beutemasse.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(beutemasse beutemasse) {
		entityCache.removeResult(beutemasseImpl.class, beutemasse);
	}

	@Override
	public void clearCache(List<beutemasse> beutemasses) {
		for (beutemasse beutemasse : beutemasses) {
			entityCache.removeResult(beutemasseImpl.class, beutemasse);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(beutemasseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(beutemasseImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new beutemasse with the primary key. Does not add the beutemasse to the database.
	 *
	 * @param id the primary key for the new beutemasse
	 * @return the new beutemasse
	 */
	@Override
	public beutemasse create(long id) {
		beutemasse beutemasse = new beutemasseImpl();

		beutemasse.setNew(true);
		beutemasse.setPrimaryKey(id);

		return beutemasse;
	}

	/**
	 * Removes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws NoSuchbeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public beutemasse remove(long id) throws NoSuchbeutemasseException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws NoSuchbeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public beutemasse remove(Serializable primaryKey)
		throws NoSuchbeutemasseException {

		Session session = null;

		try {
			session = openSession();

			beutemasse beutemasse = (beutemasse)session.get(
				beutemasseImpl.class, primaryKey);

			if (beutemasse == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbeutemasseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(beutemasse);
		}
		catch (NoSuchbeutemasseException noSuchEntityException) {
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
	protected beutemasse removeImpl(beutemasse beutemasse) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(beutemasse)) {
				beutemasse = (beutemasse)session.get(
					beutemasseImpl.class, beutemasse.getPrimaryKeyObj());
			}

			if (beutemasse != null) {
				session.delete(beutemasse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (beutemasse != null) {
			clearCache(beutemasse);
		}

		return beutemasse;
	}

	@Override
	public beutemasse updateImpl(beutemasse beutemasse) {
		boolean isNew = beutemasse.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(beutemasse);
			}
			else {
				beutemasse = (beutemasse)session.merge(beutemasse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(beutemasseImpl.class, beutemasse, false, true);

		if (isNew) {
			beutemasse.setNew(false);
		}

		beutemasse.resetOriginalValues();

		return beutemasse;
	}

	/**
	 * Returns the beutemasse with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws NoSuchbeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public beutemasse findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbeutemasseException {

		beutemasse beutemasse = fetchByPrimaryKey(primaryKey);

		if (beutemasse == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbeutemasseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return beutemasse;
	}

	/**
	 * Returns the beutemasse with the primary key or throws a <code>NoSuchbeutemasseException</code> if it could not be found.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws NoSuchbeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public beutemasse findByPrimaryKey(long id)
		throws NoSuchbeutemasseException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the beutemasse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse, or <code>null</code> if a beutemasse with the primary key could not be found
	 */
	@Override
	public beutemasse fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the beutemasses.
	 *
	 * @return the beutemasses
	 */
	@Override
	public List<beutemasse> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	@Override
	public List<beutemasse> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of beutemasses
	 */
	@Override
	public List<beutemasse> findAll(
		int start, int end, OrderByComparator<beutemasse> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of beutemasses
	 */
	@Override
	public List<beutemasse> findAll(
		int start, int end, OrderByComparator<beutemasse> orderByComparator,
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

		List<beutemasse> list = null;

		if (useFinderCache) {
			list = (List<beutemasse>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BEUTEMASSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BEUTEMASSE;

				sql = sql.concat(beutemasseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<beutemasse>)QueryUtil.list(
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
	 * Removes all the beutemasses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (beutemasse beutemasse : findAll()) {
			remove(beutemasse);
		}
	}

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BEUTEMASSE);

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
		return _SQL_SELECT_BEUTEMASSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return beutemasseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the beutemasse persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new beutemasseModelArgumentsResolver(),
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
		entityCache.removeCache(beutemasseImpl.class.getName());

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

	private static final String _SQL_SELECT_BEUTEMASSE =
		"SELECT beutemasse FROM beutemasse beutemasse";

	private static final String _SQL_COUNT_BEUTEMASSE =
		"SELECT COUNT(beutemasse) FROM beutemasse beutemasse";

	private static final String _ORDER_BY_ENTITY_ALIAS = "beutemasse.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No beutemasse exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		beutemassePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class beutemasseModelArgumentsResolver
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

			beutemasseModelImpl beutemasseModelImpl =
				(beutemasseModelImpl)baseModel;

			long columnBitmask = beutemasseModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(beutemasseModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						beutemasseModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(beutemasseModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return beutemasseImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return beutemasseTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			beutemasseModelImpl beutemasseModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = beutemasseModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = beutemasseModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}