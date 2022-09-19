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
import com.liferay.portal.kernel.util.SetUtil;

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchbienenvoelkerException;
import de.timowolfinger.liferay.beeInformationSystem.model.bienenvoelker;
import de.timowolfinger.liferay.beeInformationSystem.model.bienenvoelkerTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenvoelkerImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenvoelkerModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.bienenvoelkerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.bienenvoelkerUtil;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.constants.PersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the bienenvoelker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {bienenvoelkerPersistence.class, BasePersistence.class})
public class bienenvoelkerPersistenceImpl
	extends BasePersistenceImpl<bienenvoelker>
	implements bienenvoelkerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>bienenvoelkerUtil</code> to access the bienenvoelker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		bienenvoelkerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public bienenvoelkerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("bienenvoelker_id", "muttervolk");

		setDBColumnNames(dbColumnNames);

		setModelClass(bienenvoelker.class);

		setModelImplClass(bienenvoelkerImpl.class);
		setModelPKClass(long.class);

		setTable(bienenvoelkerTable.INSTANCE);
	}

	/**
	 * Caches the bienenvoelker in the entity cache if it is enabled.
	 *
	 * @param bienenvoelker the bienenvoelker
	 */
	@Override
	public void cacheResult(bienenvoelker bienenvoelker) {
		entityCache.putResult(
			bienenvoelkerImpl.class, bienenvoelker.getPrimaryKey(),
			bienenvoelker);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bienenvoelkers in the entity cache if it is enabled.
	 *
	 * @param bienenvoelkers the bienenvoelkers
	 */
	@Override
	public void cacheResult(List<bienenvoelker> bienenvoelkers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bienenvoelkers.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (bienenvoelker bienenvoelker : bienenvoelkers) {
			if (entityCache.getResult(
					bienenvoelkerImpl.class, bienenvoelker.getPrimaryKey()) ==
						null) {

				cacheResult(bienenvoelker);
			}
		}
	}

	/**
	 * Clears the cache for all bienenvoelkers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bienenvoelkerImpl.class);

		finderCache.clearCache(bienenvoelkerImpl.class);
	}

	/**
	 * Clears the cache for the bienenvoelker.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bienenvoelker bienenvoelker) {
		entityCache.removeResult(bienenvoelkerImpl.class, bienenvoelker);
	}

	@Override
	public void clearCache(List<bienenvoelker> bienenvoelkers) {
		for (bienenvoelker bienenvoelker : bienenvoelkers) {
			entityCache.removeResult(bienenvoelkerImpl.class, bienenvoelker);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(bienenvoelkerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(bienenvoelkerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bienenvoelker with the primary key. Does not add the bienenvoelker to the database.
	 *
	 * @param bienenvoelker_id the primary key for the new bienenvoelker
	 * @return the new bienenvoelker
	 */
	@Override
	public bienenvoelker create(long bienenvoelker_id) {
		bienenvoelker bienenvoelker = new bienenvoelkerImpl();

		bienenvoelker.setNew(true);
		bienenvoelker.setPrimaryKey(bienenvoelker_id);

		return bienenvoelker;
	}

	/**
	 * Removes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws NoSuchbienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public bienenvoelker remove(long bienenvoelker_id)
		throws NoSuchbienenvoelkerException {

		return remove((Serializable)bienenvoelker_id);
	}

	/**
	 * Removes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws NoSuchbienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public bienenvoelker remove(Serializable primaryKey)
		throws NoSuchbienenvoelkerException {

		Session session = null;

		try {
			session = openSession();

			bienenvoelker bienenvoelker = (bienenvoelker)session.get(
				bienenvoelkerImpl.class, primaryKey);

			if (bienenvoelker == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbienenvoelkerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bienenvoelker);
		}
		catch (NoSuchbienenvoelkerException noSuchEntityException) {
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
	protected bienenvoelker removeImpl(bienenvoelker bienenvoelker) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bienenvoelker)) {
				bienenvoelker = (bienenvoelker)session.get(
					bienenvoelkerImpl.class, bienenvoelker.getPrimaryKeyObj());
			}

			if (bienenvoelker != null) {
				session.delete(bienenvoelker);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bienenvoelker != null) {
			clearCache(bienenvoelker);
		}

		return bienenvoelker;
	}

	@Override
	public bienenvoelker updateImpl(bienenvoelker bienenvoelker) {
		boolean isNew = bienenvoelker.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bienenvoelker);
			}
			else {
				bienenvoelker = (bienenvoelker)session.merge(bienenvoelker);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			bienenvoelkerImpl.class, bienenvoelker, false, true);

		if (isNew) {
			bienenvoelker.setNew(false);
		}

		bienenvoelker.resetOriginalValues();

		return bienenvoelker;
	}

	/**
	 * Returns the bienenvoelker with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws NoSuchbienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public bienenvoelker findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbienenvoelkerException {

		bienenvoelker bienenvoelker = fetchByPrimaryKey(primaryKey);

		if (bienenvoelker == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbienenvoelkerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bienenvoelker;
	}

	/**
	 * Returns the bienenvoelker with the primary key or throws a <code>NoSuchbienenvoelkerException</code> if it could not be found.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws NoSuchbienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public bienenvoelker findByPrimaryKey(long bienenvoelker_id)
		throws NoSuchbienenvoelkerException {

		return findByPrimaryKey((Serializable)bienenvoelker_id);
	}

	/**
	 * Returns the bienenvoelker with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker, or <code>null</code> if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public bienenvoelker fetchByPrimaryKey(long bienenvoelker_id) {
		return fetchByPrimaryKey((Serializable)bienenvoelker_id);
	}

	/**
	 * Returns all the bienenvoelkers.
	 *
	 * @return the bienenvoelkers
	 */
	@Override
	public List<bienenvoelker> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @return the range of bienenvoelkers
	 */
	@Override
	public List<bienenvoelker> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenvoelkers
	 */
	@Override
	public List<bienenvoelker> findAll(
		int start, int end,
		OrderByComparator<bienenvoelker> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenvoelkers
	 */
	@Override
	public List<bienenvoelker> findAll(
		int start, int end, OrderByComparator<bienenvoelker> orderByComparator,
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

		List<bienenvoelker> list = null;

		if (useFinderCache) {
			list = (List<bienenvoelker>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BIENENVOELKER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BIENENVOELKER;

				sql = sql.concat(bienenvoelkerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<bienenvoelker>)QueryUtil.list(
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
	 * Removes all the bienenvoelkers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bienenvoelker bienenvoelker : findAll()) {
			remove(bienenvoelker);
		}
	}

	/**
	 * Returns the number of bienenvoelkers.
	 *
	 * @return the number of bienenvoelkers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BIENENVOELKER);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "bienenvoelker_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BIENENVOELKER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return bienenvoelkerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bienenvoelker persistence.
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

		_setbienenvoelkerUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setbienenvoelkerUtilPersistence(null);

		entityCache.removeCache(bienenvoelkerImpl.class.getName());
	}

	private void _setbienenvoelkerUtilPersistence(
		bienenvoelkerPersistence bienenvoelkerPersistence) {

		try {
			Field field = bienenvoelkerUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, bienenvoelkerPersistence);
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

	private static final String _SQL_SELECT_BIENENVOELKER =
		"SELECT bienenvoelker FROM bienenvoelker bienenvoelker";

	private static final String _SQL_COUNT_BIENENVOELKER =
		"SELECT COUNT(bienenvoelker) FROM bienenvoelker bienenvoelker";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bienenvoelker.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No bienenvoelker exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		bienenvoelkerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"bienenvoelker_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private bienenvoelkerModelArgumentsResolver
		_bienenvoelkerModelArgumentsResolver;

}