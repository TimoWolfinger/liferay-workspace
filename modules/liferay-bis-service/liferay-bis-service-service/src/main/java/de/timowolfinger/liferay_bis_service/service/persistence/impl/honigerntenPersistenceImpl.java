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

import de.timowolfinger.liferay_bis_service.exception.NoSuchhonigerntenException;
import de.timowolfinger.liferay_bis_service.model.honigernten;
import de.timowolfinger.liferay_bis_service.model.honigerntenTable;
import de.timowolfinger.liferay_bis_service.model.impl.honigerntenImpl;
import de.timowolfinger.liferay_bis_service.model.impl.honigerntenModelImpl;
import de.timowolfinger.liferay_bis_service.service.persistence.honigerntenPersistence;
import de.timowolfinger.liferay_bis_service.service.persistence.honigerntenUtil;
import de.timowolfinger.liferay_bis_service.service.persistence.impl.constants.bisPersistenceConstants;

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
 * The persistence implementation for the honigernten service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {honigerntenPersistence.class, BasePersistence.class})
public class honigerntenPersistenceImpl
	extends BasePersistenceImpl<honigernten> implements honigerntenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>honigerntenUtil</code> to access the honigernten persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		honigerntenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public honigerntenPersistenceImpl() {
		setModelClass(honigernten.class);

		setModelImplClass(honigerntenImpl.class);
		setModelPKClass(long.class);

		setTable(honigerntenTable.INSTANCE);
	}

	/**
	 * Caches the honigernten in the entity cache if it is enabled.
	 *
	 * @param honigernten the honigernten
	 */
	@Override
	public void cacheResult(honigernten honigernten) {
		entityCache.putResult(
			honigerntenImpl.class, honigernten.getPrimaryKey(), honigernten);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the honigerntens in the entity cache if it is enabled.
	 *
	 * @param honigerntens the honigerntens
	 */
	@Override
	public void cacheResult(List<honigernten> honigerntens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (honigerntens.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (honigernten honigernten : honigerntens) {
			if (entityCache.getResult(
					honigerntenImpl.class, honigernten.getPrimaryKey()) ==
						null) {

				cacheResult(honigernten);
			}
		}
	}

	/**
	 * Clears the cache for all honigerntens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(honigerntenImpl.class);

		finderCache.clearCache(honigerntenImpl.class);
	}

	/**
	 * Clears the cache for the honigernten.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(honigernten honigernten) {
		entityCache.removeResult(honigerntenImpl.class, honigernten);
	}

	@Override
	public void clearCache(List<honigernten> honigerntens) {
		for (honigernten honigernten : honigerntens) {
			entityCache.removeResult(honigerntenImpl.class, honigernten);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(honigerntenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(honigerntenImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new honigernten with the primary key. Does not add the honigernten to the database.
	 *
	 * @param id the primary key for the new honigernten
	 * @return the new honigernten
	 */
	@Override
	public honigernten create(long id) {
		honigernten honigernten = new honigerntenImpl();

		honigernten.setNew(true);
		honigernten.setPrimaryKey(id);

		return honigernten;
	}

	/**
	 * Removes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws NoSuchhonigerntenException if a honigernten with the primary key could not be found
	 */
	@Override
	public honigernten remove(long id) throws NoSuchhonigerntenException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws NoSuchhonigerntenException if a honigernten with the primary key could not be found
	 */
	@Override
	public honigernten remove(Serializable primaryKey)
		throws NoSuchhonigerntenException {

		Session session = null;

		try {
			session = openSession();

			honigernten honigernten = (honigernten)session.get(
				honigerntenImpl.class, primaryKey);

			if (honigernten == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchhonigerntenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(honigernten);
		}
		catch (NoSuchhonigerntenException noSuchEntityException) {
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
	protected honigernten removeImpl(honigernten honigernten) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(honigernten)) {
				honigernten = (honigernten)session.get(
					honigerntenImpl.class, honigernten.getPrimaryKeyObj());
			}

			if (honigernten != null) {
				session.delete(honigernten);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (honigernten != null) {
			clearCache(honigernten);
		}

		return honigernten;
	}

	@Override
	public honigernten updateImpl(honigernten honigernten) {
		boolean isNew = honigernten.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(honigernten);
			}
			else {
				honigernten = (honigernten)session.merge(honigernten);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(honigerntenImpl.class, honigernten, false, true);

		if (isNew) {
			honigernten.setNew(false);
		}

		honigernten.resetOriginalValues();

		return honigernten;
	}

	/**
	 * Returns the honigernten with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the honigernten
	 * @return the honigernten
	 * @throws NoSuchhonigerntenException if a honigernten with the primary key could not be found
	 */
	@Override
	public honigernten findByPrimaryKey(Serializable primaryKey)
		throws NoSuchhonigerntenException {

		honigernten honigernten = fetchByPrimaryKey(primaryKey);

		if (honigernten == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchhonigerntenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return honigernten;
	}

	/**
	 * Returns the honigernten with the primary key or throws a <code>NoSuchhonigerntenException</code> if it could not be found.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten
	 * @throws NoSuchhonigerntenException if a honigernten with the primary key could not be found
	 */
	@Override
	public honigernten findByPrimaryKey(long id)
		throws NoSuchhonigerntenException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the honigernten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten, or <code>null</code> if a honigernten with the primary key could not be found
	 */
	@Override
	public honigernten fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the honigerntens.
	 *
	 * @return the honigerntens
	 */
	@Override
	public List<honigernten> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @return the range of honigerntens
	 */
	@Override
	public List<honigernten> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of honigerntens
	 */
	@Override
	public List<honigernten> findAll(
		int start, int end, OrderByComparator<honigernten> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of honigerntens
	 */
	@Override
	public List<honigernten> findAll(
		int start, int end, OrderByComparator<honigernten> orderByComparator,
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

		List<honigernten> list = null;

		if (useFinderCache) {
			list = (List<honigernten>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HONIGERNTEN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HONIGERNTEN;

				sql = sql.concat(honigerntenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<honigernten>)QueryUtil.list(
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
	 * Removes all the honigerntens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (honigernten honigernten : findAll()) {
			remove(honigernten);
		}
	}

	/**
	 * Returns the number of honigerntens.
	 *
	 * @return the number of honigerntens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_HONIGERNTEN);

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
		return _SQL_SELECT_HONIGERNTEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return honigerntenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the honigernten persistence.
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

		_sethonigerntenUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_sethonigerntenUtilPersistence(null);

		entityCache.removeCache(honigerntenImpl.class.getName());
	}

	private void _sethonigerntenUtilPersistence(
		honigerntenPersistence honigerntenPersistence) {

		try {
			Field field = honigerntenUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, honigerntenPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
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

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HONIGERNTEN =
		"SELECT honigernten FROM honigernten honigernten";

	private static final String _SQL_COUNT_HONIGERNTEN =
		"SELECT COUNT(honigernten) FROM honigernten honigernten";

	private static final String _ORDER_BY_ENTITY_ALIAS = "honigernten.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No honigernten exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		honigerntenPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private honigerntenModelArgumentsResolver
		_honigerntenModelArgumentsResolver;

}