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

import de.timowolfinger.liferay_bis_service.exception.NoSuchtrachtenException;
import de.timowolfinger.liferay_bis_service.model.impl.trachtenImpl;
import de.timowolfinger.liferay_bis_service.model.impl.trachtenModelImpl;
import de.timowolfinger.liferay_bis_service.model.trachten;
import de.timowolfinger.liferay_bis_service.model.trachtenTable;
import de.timowolfinger.liferay_bis_service.service.persistence.impl.constants.bisPersistenceConstants;
import de.timowolfinger.liferay_bis_service.service.persistence.trachtenPersistence;
import de.timowolfinger.liferay_bis_service.service.persistence.trachtenUtil;

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
 * The persistence implementation for the trachten service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {trachtenPersistence.class, BasePersistence.class})
public class trachtenPersistenceImpl
	extends BasePersistenceImpl<trachten> implements trachtenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>trachtenUtil</code> to access the trachten persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		trachtenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public trachtenPersistenceImpl() {
		setModelClass(trachten.class);

		setModelImplClass(trachtenImpl.class);
		setModelPKClass(long.class);

		setTable(trachtenTable.INSTANCE);
	}

	/**
	 * Caches the trachten in the entity cache if it is enabled.
	 *
	 * @param trachten the trachten
	 */
	@Override
	public void cacheResult(trachten trachten) {
		entityCache.putResult(
			trachtenImpl.class, trachten.getPrimaryKey(), trachten);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the trachtens in the entity cache if it is enabled.
	 *
	 * @param trachtens the trachtens
	 */
	@Override
	public void cacheResult(List<trachten> trachtens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (trachtens.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (trachten trachten : trachtens) {
			if (entityCache.getResult(
					trachtenImpl.class, trachten.getPrimaryKey()) == null) {

				cacheResult(trachten);
			}
		}
	}

	/**
	 * Clears the cache for all trachtens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(trachtenImpl.class);

		finderCache.clearCache(trachtenImpl.class);
	}

	/**
	 * Clears the cache for the trachten.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(trachten trachten) {
		entityCache.removeResult(trachtenImpl.class, trachten);
	}

	@Override
	public void clearCache(List<trachten> trachtens) {
		for (trachten trachten : trachtens) {
			entityCache.removeResult(trachtenImpl.class, trachten);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(trachtenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(trachtenImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new trachten with the primary key. Does not add the trachten to the database.
	 *
	 * @param id the primary key for the new trachten
	 * @return the new trachten
	 */
	@Override
	public trachten create(long id) {
		trachten trachten = new trachtenImpl();

		trachten.setNew(true);
		trachten.setPrimaryKey(id);

		return trachten;
	}

	/**
	 * Removes the trachten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the trachten
	 * @return the trachten that was removed
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	@Override
	public trachten remove(long id) throws NoSuchtrachtenException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the trachten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the trachten
	 * @return the trachten that was removed
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	@Override
	public trachten remove(Serializable primaryKey)
		throws NoSuchtrachtenException {

		Session session = null;

		try {
			session = openSession();

			trachten trachten = (trachten)session.get(
				trachtenImpl.class, primaryKey);

			if (trachten == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtrachtenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(trachten);
		}
		catch (NoSuchtrachtenException noSuchEntityException) {
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
	protected trachten removeImpl(trachten trachten) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(trachten)) {
				trachten = (trachten)session.get(
					trachtenImpl.class, trachten.getPrimaryKeyObj());
			}

			if (trachten != null) {
				session.delete(trachten);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (trachten != null) {
			clearCache(trachten);
		}

		return trachten;
	}

	@Override
	public trachten updateImpl(trachten trachten) {
		boolean isNew = trachten.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(trachten);
			}
			else {
				trachten = (trachten)session.merge(trachten);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(trachtenImpl.class, trachten, false, true);

		if (isNew) {
			trachten.setNew(false);
		}

		trachten.resetOriginalValues();

		return trachten;
	}

	/**
	 * Returns the trachten with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the trachten
	 * @return the trachten
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	@Override
	public trachten findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtrachtenException {

		trachten trachten = fetchByPrimaryKey(primaryKey);

		if (trachten == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtrachtenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return trachten;
	}

	/**
	 * Returns the trachten with the primary key or throws a <code>NoSuchtrachtenException</code> if it could not be found.
	 *
	 * @param id the primary key of the trachten
	 * @return the trachten
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	@Override
	public trachten findByPrimaryKey(long id) throws NoSuchtrachtenException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the trachten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the trachten
	 * @return the trachten, or <code>null</code> if a trachten with the primary key could not be found
	 */
	@Override
	public trachten fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the trachtens.
	 *
	 * @return the trachtens
	 */
	@Override
	public List<trachten> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @return the range of trachtens
	 */
	@Override
	public List<trachten> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trachtens
	 */
	@Override
	public List<trachten> findAll(
		int start, int end, OrderByComparator<trachten> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of trachtens
	 */
	@Override
	public List<trachten> findAll(
		int start, int end, OrderByComparator<trachten> orderByComparator,
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

		List<trachten> list = null;

		if (useFinderCache) {
			list = (List<trachten>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TRACHTEN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TRACHTEN;

				sql = sql.concat(trachtenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<trachten>)QueryUtil.list(
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
	 * Removes all the trachtens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (trachten trachten : findAll()) {
			remove(trachten);
		}
	}

	/**
	 * Returns the number of trachtens.
	 *
	 * @return the number of trachtens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TRACHTEN);

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
		return _SQL_SELECT_TRACHTEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return trachtenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the trachten persistence.
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

		_settrachtenUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_settrachtenUtilPersistence(null);

		entityCache.removeCache(trachtenImpl.class.getName());
	}

	private void _settrachtenUtilPersistence(
		trachtenPersistence trachtenPersistence) {

		try {
			Field field = trachtenUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, trachtenPersistence);
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

	private static final String _SQL_SELECT_TRACHTEN =
		"SELECT trachten FROM trachten trachten";

	private static final String _SQL_COUNT_TRACHTEN =
		"SELECT COUNT(trachten) FROM trachten trachten";

	private static final String _ORDER_BY_ENTITY_ALIAS = "trachten.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No trachten exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		trachtenPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private trachtenModelArgumentsResolver _trachtenModelArgumentsResolver;

}