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
import com.liferay.portal.kernel.util.SetUtil;

import de.timowolfinger.liferay_bis_service.exception.NoSuchbehandlungenException;
import de.timowolfinger.liferay_bis_service.model.behandlungen;
import de.timowolfinger.liferay_bis_service.model.behandlungenTable;
import de.timowolfinger.liferay_bis_service.model.impl.behandlungenImpl;
import de.timowolfinger.liferay_bis_service.model.impl.behandlungenModelImpl;
import de.timowolfinger.liferay_bis_service.service.persistence.behandlungenPersistence;
import de.timowolfinger.liferay_bis_service.service.persistence.behandlungenUtil;
import de.timowolfinger.liferay_bis_service.service.persistence.impl.constants.bisPersistenceConstants;

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
 * The persistence implementation for the behandlungen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {behandlungenPersistence.class, BasePersistence.class})
public class behandlungenPersistenceImpl
	extends BasePersistenceImpl<behandlungen>
	implements behandlungenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>behandlungenUtil</code> to access the behandlungen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		behandlungenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public behandlungenPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("medikament_id", "dmedikament_id");

		setDBColumnNames(dbColumnNames);

		setModelClass(behandlungen.class);

		setModelImplClass(behandlungenImpl.class);
		setModelPKClass(long.class);

		setTable(behandlungenTable.INSTANCE);
	}

	/**
	 * Caches the behandlungen in the entity cache if it is enabled.
	 *
	 * @param behandlungen the behandlungen
	 */
	@Override
	public void cacheResult(behandlungen behandlungen) {
		entityCache.putResult(
			behandlungenImpl.class, behandlungen.getPrimaryKey(), behandlungen);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the behandlungens in the entity cache if it is enabled.
	 *
	 * @param behandlungens the behandlungens
	 */
	@Override
	public void cacheResult(List<behandlungen> behandlungens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (behandlungens.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (behandlungen behandlungen : behandlungens) {
			if (entityCache.getResult(
					behandlungenImpl.class, behandlungen.getPrimaryKey()) ==
						null) {

				cacheResult(behandlungen);
			}
		}
	}

	/**
	 * Clears the cache for all behandlungens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(behandlungenImpl.class);

		finderCache.clearCache(behandlungenImpl.class);
	}

	/**
	 * Clears the cache for the behandlungen.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(behandlungen behandlungen) {
		entityCache.removeResult(behandlungenImpl.class, behandlungen);
	}

	@Override
	public void clearCache(List<behandlungen> behandlungens) {
		for (behandlungen behandlungen : behandlungens) {
			entityCache.removeResult(behandlungenImpl.class, behandlungen);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(behandlungenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(behandlungenImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new behandlungen with the primary key. Does not add the behandlungen to the database.
	 *
	 * @param id the primary key for the new behandlungen
	 * @return the new behandlungen
	 */
	@Override
	public behandlungen create(long id) {
		behandlungen behandlungen = new behandlungenImpl();

		behandlungen.setNew(true);
		behandlungen.setPrimaryKey(id);

		return behandlungen;
	}

	/**
	 * Removes the behandlungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the behandlungen
	 * @return the behandlungen that was removed
	 * @throws NoSuchbehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public behandlungen remove(long id) throws NoSuchbehandlungenException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the behandlungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the behandlungen
	 * @return the behandlungen that was removed
	 * @throws NoSuchbehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public behandlungen remove(Serializable primaryKey)
		throws NoSuchbehandlungenException {

		Session session = null;

		try {
			session = openSession();

			behandlungen behandlungen = (behandlungen)session.get(
				behandlungenImpl.class, primaryKey);

			if (behandlungen == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbehandlungenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(behandlungen);
		}
		catch (NoSuchbehandlungenException noSuchEntityException) {
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
	protected behandlungen removeImpl(behandlungen behandlungen) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(behandlungen)) {
				behandlungen = (behandlungen)session.get(
					behandlungenImpl.class, behandlungen.getPrimaryKeyObj());
			}

			if (behandlungen != null) {
				session.delete(behandlungen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (behandlungen != null) {
			clearCache(behandlungen);
		}

		return behandlungen;
	}

	@Override
	public behandlungen updateImpl(behandlungen behandlungen) {
		boolean isNew = behandlungen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(behandlungen);
			}
			else {
				behandlungen = (behandlungen)session.merge(behandlungen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			behandlungenImpl.class, behandlungen, false, true);

		if (isNew) {
			behandlungen.setNew(false);
		}

		behandlungen.resetOriginalValues();

		return behandlungen;
	}

	/**
	 * Returns the behandlungen with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the behandlungen
	 * @return the behandlungen
	 * @throws NoSuchbehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public behandlungen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbehandlungenException {

		behandlungen behandlungen = fetchByPrimaryKey(primaryKey);

		if (behandlungen == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbehandlungenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return behandlungen;
	}

	/**
	 * Returns the behandlungen with the primary key or throws a <code>NoSuchbehandlungenException</code> if it could not be found.
	 *
	 * @param id the primary key of the behandlungen
	 * @return the behandlungen
	 * @throws NoSuchbehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public behandlungen findByPrimaryKey(long id)
		throws NoSuchbehandlungenException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the behandlungen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the behandlungen
	 * @return the behandlungen, or <code>null</code> if a behandlungen with the primary key could not be found
	 */
	@Override
	public behandlungen fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the behandlungens.
	 *
	 * @return the behandlungens
	 */
	@Override
	public List<behandlungen> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>behandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @return the range of behandlungens
	 */
	@Override
	public List<behandlungen> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>behandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of behandlungens
	 */
	@Override
	public List<behandlungen> findAll(
		int start, int end, OrderByComparator<behandlungen> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>behandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of behandlungens
	 */
	@Override
	public List<behandlungen> findAll(
		int start, int end, OrderByComparator<behandlungen> orderByComparator,
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

		List<behandlungen> list = null;

		if (useFinderCache) {
			list = (List<behandlungen>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BEHANDLUNGEN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BEHANDLUNGEN;

				sql = sql.concat(behandlungenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<behandlungen>)QueryUtil.list(
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
	 * Removes all the behandlungens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (behandlungen behandlungen : findAll()) {
			remove(behandlungen);
		}
	}

	/**
	 * Returns the number of behandlungens.
	 *
	 * @return the number of behandlungens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BEHANDLUNGEN);

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
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BEHANDLUNGEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return behandlungenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the behandlungen persistence.
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

		_setbehandlungenUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setbehandlungenUtilPersistence(null);

		entityCache.removeCache(behandlungenImpl.class.getName());
	}

	private void _setbehandlungenUtilPersistence(
		behandlungenPersistence behandlungenPersistence) {

		try {
			Field field = behandlungenUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, behandlungenPersistence);
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

	private static final String _SQL_SELECT_BEHANDLUNGEN =
		"SELECT behandlungen FROM behandlungen behandlungen";

	private static final String _SQL_COUNT_BEHANDLUNGEN =
		"SELECT COUNT(behandlungen) FROM behandlungen behandlungen";

	private static final String _ORDER_BY_ENTITY_ALIAS = "behandlungen.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No behandlungen exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		behandlungenPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"medikament_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private behandlungenModelArgumentsResolver
		_behandlungenModelArgumentsResolver;

}