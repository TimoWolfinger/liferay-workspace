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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBienenvoelkerException;
import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker;
import de.timowolfinger.liferay.beeInformationSystem.model.BienenvoelkerTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvoelkerImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvoelkerModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenvoelkerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenvoelkerUtil;
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
@Component(service = {BienenvoelkerPersistence.class, BasePersistence.class})
public class BienenvoelkerPersistenceImpl
	extends BasePersistenceImpl<Bienenvoelker>
	implements BienenvoelkerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BienenvoelkerUtil</code> to access the bienenvoelker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BienenvoelkerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public BienenvoelkerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("bienenvoelker_id", "muttervolk");

		setDBColumnNames(dbColumnNames);

		setModelClass(Bienenvoelker.class);

		setModelImplClass(BienenvoelkerImpl.class);
		setModelPKClass(long.class);

		setTable(BienenvoelkerTable.INSTANCE);
	}

	/**
	 * Caches the bienenvoelker in the entity cache if it is enabled.
	 *
	 * @param bienenvoelker the bienenvoelker
	 */
	@Override
	public void cacheResult(Bienenvoelker bienenvoelker) {
		entityCache.putResult(
			BienenvoelkerImpl.class, bienenvoelker.getPrimaryKey(),
			bienenvoelker);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bienenvoelkers in the entity cache if it is enabled.
	 *
	 * @param bienenvoelkers the bienenvoelkers
	 */
	@Override
	public void cacheResult(List<Bienenvoelker> bienenvoelkers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bienenvoelkers.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Bienenvoelker bienenvoelker : bienenvoelkers) {
			if (entityCache.getResult(
					BienenvoelkerImpl.class, bienenvoelker.getPrimaryKey()) ==
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
		entityCache.clearCache(BienenvoelkerImpl.class);

		finderCache.clearCache(BienenvoelkerImpl.class);
	}

	/**
	 * Clears the cache for the bienenvoelker.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bienenvoelker bienenvoelker) {
		entityCache.removeResult(BienenvoelkerImpl.class, bienenvoelker);
	}

	@Override
	public void clearCache(List<Bienenvoelker> bienenvoelkers) {
		for (Bienenvoelker bienenvoelker : bienenvoelkers) {
			entityCache.removeResult(BienenvoelkerImpl.class, bienenvoelker);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BienenvoelkerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BienenvoelkerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bienenvoelker with the primary key. Does not add the bienenvoelker to the database.
	 *
	 * @param bienenvoelker_id the primary key for the new bienenvoelker
	 * @return the new bienenvoelker
	 */
	@Override
	public Bienenvoelker create(long bienenvoelker_id) {
		Bienenvoelker bienenvoelker = new BienenvoelkerImpl();

		bienenvoelker.setNew(true);
		bienenvoelker.setPrimaryKey(bienenvoelker_id);

		return bienenvoelker;
	}

	/**
	 * Removes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws NoSuchBienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public Bienenvoelker remove(long bienenvoelker_id)
		throws NoSuchBienenvoelkerException {

		return remove((Serializable)bienenvoelker_id);
	}

	/**
	 * Removes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws NoSuchBienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public Bienenvoelker remove(Serializable primaryKey)
		throws NoSuchBienenvoelkerException {

		Session session = null;

		try {
			session = openSession();

			Bienenvoelker bienenvoelker = (Bienenvoelker)session.get(
				BienenvoelkerImpl.class, primaryKey);

			if (bienenvoelker == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBienenvoelkerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bienenvoelker);
		}
		catch (NoSuchBienenvoelkerException noSuchEntityException) {
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
	protected Bienenvoelker removeImpl(Bienenvoelker bienenvoelker) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bienenvoelker)) {
				bienenvoelker = (Bienenvoelker)session.get(
					BienenvoelkerImpl.class, bienenvoelker.getPrimaryKeyObj());
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
	public Bienenvoelker updateImpl(Bienenvoelker bienenvoelker) {
		boolean isNew = bienenvoelker.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bienenvoelker);
			}
			else {
				bienenvoelker = (Bienenvoelker)session.merge(bienenvoelker);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BienenvoelkerImpl.class, bienenvoelker, false, true);

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
	 * @throws NoSuchBienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public Bienenvoelker findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBienenvoelkerException {

		Bienenvoelker bienenvoelker = fetchByPrimaryKey(primaryKey);

		if (bienenvoelker == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBienenvoelkerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bienenvoelker;
	}

	/**
	 * Returns the bienenvoelker with the primary key or throws a <code>NoSuchBienenvoelkerException</code> if it could not be found.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws NoSuchBienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public Bienenvoelker findByPrimaryKey(long bienenvoelker_id)
		throws NoSuchBienenvoelkerException {

		return findByPrimaryKey((Serializable)bienenvoelker_id);
	}

	/**
	 * Returns the bienenvoelker with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker, or <code>null</code> if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public Bienenvoelker fetchByPrimaryKey(long bienenvoelker_id) {
		return fetchByPrimaryKey((Serializable)bienenvoelker_id);
	}

	/**
	 * Returns all the bienenvoelkers.
	 *
	 * @return the bienenvoelkers
	 */
	@Override
	public List<Bienenvoelker> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @return the range of bienenvoelkers
	 */
	@Override
	public List<Bienenvoelker> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenvoelkers
	 */
	@Override
	public List<Bienenvoelker> findAll(
		int start, int end,
		OrderByComparator<Bienenvoelker> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenvoelkers
	 */
	@Override
	public List<Bienenvoelker> findAll(
		int start, int end, OrderByComparator<Bienenvoelker> orderByComparator,
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

		List<Bienenvoelker> list = null;

		if (useFinderCache) {
			list = (List<Bienenvoelker>)finderCache.getResult(
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

				sql = sql.concat(BienenvoelkerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Bienenvoelker>)QueryUtil.list(
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
		for (Bienenvoelker bienenvoelker : findAll()) {
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
		return BienenvoelkerModelImpl.TABLE_COLUMNS_MAP;
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

		_setBienenvoelkerUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBienenvoelkerUtilPersistence(null);

		entityCache.removeCache(BienenvoelkerImpl.class.getName());
	}

	private void _setBienenvoelkerUtilPersistence(
		BienenvoelkerPersistence bienenvoelkerPersistence) {

		try {
			Field field = BienenvoelkerUtil.class.getDeclaredField(
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
		"SELECT bienenvoelker FROM Bienenvoelker bienenvoelker";

	private static final String _SQL_COUNT_BIENENVOELKER =
		"SELECT COUNT(bienenvoelker) FROM Bienenvoelker bienenvoelker";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bienenvoelker.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Bienenvoelker exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		BienenvoelkerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"bienenvoelker_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private BienenvoelkerModelArgumentsResolver
		_bienenvoelkerModelArgumentsResolver;

}