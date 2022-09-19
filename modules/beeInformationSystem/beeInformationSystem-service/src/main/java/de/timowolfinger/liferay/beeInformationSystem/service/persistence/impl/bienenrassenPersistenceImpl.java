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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchbienenrassenException;
import de.timowolfinger.liferay.beeInformationSystem.model.bienenrassen;
import de.timowolfinger.liferay.beeInformationSystem.model.bienenrassenTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenrassenImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenrassenModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.bienenrassenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.bienenrassenUtil;
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
 * The persistence implementation for the bienenrassen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {bienenrassenPersistence.class, BasePersistence.class})
public class bienenrassenPersistenceImpl
	extends BasePersistenceImpl<bienenrassen>
	implements bienenrassenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>bienenrassenUtil</code> to access the bienenrassen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		bienenrassenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public bienenrassenPersistenceImpl() {
		setModelClass(bienenrassen.class);

		setModelImplClass(bienenrassenImpl.class);
		setModelPKClass(long.class);

		setTable(bienenrassenTable.INSTANCE);
	}

	/**
	 * Caches the bienenrassen in the entity cache if it is enabled.
	 *
	 * @param bienenrassen the bienenrassen
	 */
	@Override
	public void cacheResult(bienenrassen bienenrassen) {
		entityCache.putResult(
			bienenrassenImpl.class, bienenrassen.getPrimaryKey(), bienenrassen);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bienenrassens in the entity cache if it is enabled.
	 *
	 * @param bienenrassens the bienenrassens
	 */
	@Override
	public void cacheResult(List<bienenrassen> bienenrassens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bienenrassens.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (bienenrassen bienenrassen : bienenrassens) {
			if (entityCache.getResult(
					bienenrassenImpl.class, bienenrassen.getPrimaryKey()) ==
						null) {

				cacheResult(bienenrassen);
			}
		}
	}

	/**
	 * Clears the cache for all bienenrassens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bienenrassenImpl.class);

		finderCache.clearCache(bienenrassenImpl.class);
	}

	/**
	 * Clears the cache for the bienenrassen.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bienenrassen bienenrassen) {
		entityCache.removeResult(bienenrassenImpl.class, bienenrassen);
	}

	@Override
	public void clearCache(List<bienenrassen> bienenrassens) {
		for (bienenrassen bienenrassen : bienenrassens) {
			entityCache.removeResult(bienenrassenImpl.class, bienenrassen);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(bienenrassenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(bienenrassenImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bienenrassen with the primary key. Does not add the bienenrassen to the database.
	 *
	 * @param bienenrassen_id the primary key for the new bienenrassen
	 * @return the new bienenrassen
	 */
	@Override
	public bienenrassen create(long bienenrassen_id) {
		bienenrassen bienenrassen = new bienenrassenImpl();

		bienenrassen.setNew(true);
		bienenrassen.setPrimaryKey(bienenrassen_id);

		return bienenrassen;
	}

	/**
	 * Removes the bienenrassen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen that was removed
	 * @throws NoSuchbienenrassenException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public bienenrassen remove(long bienenrassen_id)
		throws NoSuchbienenrassenException {

		return remove((Serializable)bienenrassen_id);
	}

	/**
	 * Removes the bienenrassen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bienenrassen
	 * @return the bienenrassen that was removed
	 * @throws NoSuchbienenrassenException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public bienenrassen remove(Serializable primaryKey)
		throws NoSuchbienenrassenException {

		Session session = null;

		try {
			session = openSession();

			bienenrassen bienenrassen = (bienenrassen)session.get(
				bienenrassenImpl.class, primaryKey);

			if (bienenrassen == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbienenrassenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bienenrassen);
		}
		catch (NoSuchbienenrassenException noSuchEntityException) {
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
	protected bienenrassen removeImpl(bienenrassen bienenrassen) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bienenrassen)) {
				bienenrassen = (bienenrassen)session.get(
					bienenrassenImpl.class, bienenrassen.getPrimaryKeyObj());
			}

			if (bienenrassen != null) {
				session.delete(bienenrassen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bienenrassen != null) {
			clearCache(bienenrassen);
		}

		return bienenrassen;
	}

	@Override
	public bienenrassen updateImpl(bienenrassen bienenrassen) {
		boolean isNew = bienenrassen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bienenrassen);
			}
			else {
				bienenrassen = (bienenrassen)session.merge(bienenrassen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			bienenrassenImpl.class, bienenrassen, false, true);

		if (isNew) {
			bienenrassen.setNew(false);
		}

		bienenrassen.resetOriginalValues();

		return bienenrassen;
	}

	/**
	 * Returns the bienenrassen with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bienenrassen
	 * @return the bienenrassen
	 * @throws NoSuchbienenrassenException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public bienenrassen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbienenrassenException {

		bienenrassen bienenrassen = fetchByPrimaryKey(primaryKey);

		if (bienenrassen == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbienenrassenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bienenrassen;
	}

	/**
	 * Returns the bienenrassen with the primary key or throws a <code>NoSuchbienenrassenException</code> if it could not be found.
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen
	 * @throws NoSuchbienenrassenException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public bienenrassen findByPrimaryKey(long bienenrassen_id)
		throws NoSuchbienenrassenException {

		return findByPrimaryKey((Serializable)bienenrassen_id);
	}

	/**
	 * Returns the bienenrassen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen, or <code>null</code> if a bienenrassen with the primary key could not be found
	 */
	@Override
	public bienenrassen fetchByPrimaryKey(long bienenrassen_id) {
		return fetchByPrimaryKey((Serializable)bienenrassen_id);
	}

	/**
	 * Returns all the bienenrassens.
	 *
	 * @return the bienenrassens
	 */
	@Override
	public List<bienenrassen> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @return the range of bienenrassens
	 */
	@Override
	public List<bienenrassen> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenrassens
	 */
	@Override
	public List<bienenrassen> findAll(
		int start, int end, OrderByComparator<bienenrassen> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenrassens
	 */
	@Override
	public List<bienenrassen> findAll(
		int start, int end, OrderByComparator<bienenrassen> orderByComparator,
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

		List<bienenrassen> list = null;

		if (useFinderCache) {
			list = (List<bienenrassen>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BIENENRASSEN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BIENENRASSEN;

				sql = sql.concat(bienenrassenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<bienenrassen>)QueryUtil.list(
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
	 * Removes all the bienenrassens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bienenrassen bienenrassen : findAll()) {
			remove(bienenrassen);
		}
	}

	/**
	 * Returns the number of bienenrassens.
	 *
	 * @return the number of bienenrassens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BIENENRASSEN);

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
		return "bienenrassen_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BIENENRASSEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return bienenrassenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bienenrassen persistence.
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

		_setbienenrassenUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setbienenrassenUtilPersistence(null);

		entityCache.removeCache(bienenrassenImpl.class.getName());
	}

	private void _setbienenrassenUtilPersistence(
		bienenrassenPersistence bienenrassenPersistence) {

		try {
			Field field = bienenrassenUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, bienenrassenPersistence);
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

	private static final String _SQL_SELECT_BIENENRASSEN =
		"SELECT bienenrassen FROM bienenrassen bienenrassen";

	private static final String _SQL_COUNT_BIENENRASSEN =
		"SELECT COUNT(bienenrassen) FROM bienenrassen bienenrassen";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bienenrassen.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No bienenrassen exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		bienenrassenPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private bienenrassenModelArgumentsResolver
		_bienenrassenModelArgumentsResolver;

}