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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBehandlungException;
import de.timowolfinger.liferay.beeInformationSystem.model.Behandlung;
import de.timowolfinger.liferay.beeInformationSystem.model.BehandlungTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BehandlungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BehandlungUtil;
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
 * The persistence implementation for the behandlung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {BehandlungPersistence.class, BasePersistence.class})
public class BehandlungPersistenceImpl
	extends BasePersistenceImpl<Behandlung> implements BehandlungPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BehandlungUtil</code> to access the behandlung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BehandlungImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public BehandlungPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("medikament_id", "dmedikament_id");

		setDBColumnNames(dbColumnNames);

		setModelClass(Behandlung.class);

		setModelImplClass(BehandlungImpl.class);
		setModelPKClass(long.class);

		setTable(BehandlungTable.INSTANCE);
	}

	/**
	 * Caches the behandlung in the entity cache if it is enabled.
	 *
	 * @param behandlung the behandlung
	 */
	@Override
	public void cacheResult(Behandlung behandlung) {
		entityCache.putResult(
			BehandlungImpl.class, behandlung.getPrimaryKey(), behandlung);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the behandlungs in the entity cache if it is enabled.
	 *
	 * @param behandlungs the behandlungs
	 */
	@Override
	public void cacheResult(List<Behandlung> behandlungs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (behandlungs.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Behandlung behandlung : behandlungs) {
			if (entityCache.getResult(
					BehandlungImpl.class, behandlung.getPrimaryKey()) == null) {

				cacheResult(behandlung);
			}
		}
	}

	/**
	 * Clears the cache for all behandlungs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BehandlungImpl.class);

		finderCache.clearCache(BehandlungImpl.class);
	}

	/**
	 * Clears the cache for the behandlung.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Behandlung behandlung) {
		entityCache.removeResult(BehandlungImpl.class, behandlung);
	}

	@Override
	public void clearCache(List<Behandlung> behandlungs) {
		for (Behandlung behandlung : behandlungs) {
			entityCache.removeResult(BehandlungImpl.class, behandlung);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BehandlungImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BehandlungImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new behandlung with the primary key. Does not add the behandlung to the database.
	 *
	 * @param behandlung_id the primary key for the new behandlung
	 * @return the new behandlung
	 */
	@Override
	public Behandlung create(long behandlung_id) {
		Behandlung behandlung = new BehandlungImpl();

		behandlung.setNew(true);
		behandlung.setPrimaryKey(behandlung_id);

		return behandlung;
	}

	/**
	 * Removes the behandlung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung that was removed
	 * @throws NoSuchBehandlungException if a behandlung with the primary key could not be found
	 */
	@Override
	public Behandlung remove(long behandlung_id)
		throws NoSuchBehandlungException {

		return remove((Serializable)behandlung_id);
	}

	/**
	 * Removes the behandlung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the behandlung
	 * @return the behandlung that was removed
	 * @throws NoSuchBehandlungException if a behandlung with the primary key could not be found
	 */
	@Override
	public Behandlung remove(Serializable primaryKey)
		throws NoSuchBehandlungException {

		Session session = null;

		try {
			session = openSession();

			Behandlung behandlung = (Behandlung)session.get(
				BehandlungImpl.class, primaryKey);

			if (behandlung == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBehandlungException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(behandlung);
		}
		catch (NoSuchBehandlungException noSuchEntityException) {
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
	protected Behandlung removeImpl(Behandlung behandlung) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(behandlung)) {
				behandlung = (Behandlung)session.get(
					BehandlungImpl.class, behandlung.getPrimaryKeyObj());
			}

			if (behandlung != null) {
				session.delete(behandlung);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (behandlung != null) {
			clearCache(behandlung);
		}

		return behandlung;
	}

	@Override
	public Behandlung updateImpl(Behandlung behandlung) {
		boolean isNew = behandlung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(behandlung);
			}
			else {
				behandlung = (Behandlung)session.merge(behandlung);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(BehandlungImpl.class, behandlung, false, true);

		if (isNew) {
			behandlung.setNew(false);
		}

		behandlung.resetOriginalValues();

		return behandlung;
	}

	/**
	 * Returns the behandlung with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the behandlung
	 * @return the behandlung
	 * @throws NoSuchBehandlungException if a behandlung with the primary key could not be found
	 */
	@Override
	public Behandlung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBehandlungException {

		Behandlung behandlung = fetchByPrimaryKey(primaryKey);

		if (behandlung == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBehandlungException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return behandlung;
	}

	/**
	 * Returns the behandlung with the primary key or throws a <code>NoSuchBehandlungException</code> if it could not be found.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung
	 * @throws NoSuchBehandlungException if a behandlung with the primary key could not be found
	 */
	@Override
	public Behandlung findByPrimaryKey(long behandlung_id)
		throws NoSuchBehandlungException {

		return findByPrimaryKey((Serializable)behandlung_id);
	}

	/**
	 * Returns the behandlung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung, or <code>null</code> if a behandlung with the primary key could not be found
	 */
	@Override
	public Behandlung fetchByPrimaryKey(long behandlung_id) {
		return fetchByPrimaryKey((Serializable)behandlung_id);
	}

	/**
	 * Returns all the behandlungs.
	 *
	 * @return the behandlungs
	 */
	@Override
	public List<Behandlung> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @return the range of behandlungs
	 */
	@Override
	public List<Behandlung> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of behandlungs
	 */
	@Override
	public List<Behandlung> findAll(
		int start, int end, OrderByComparator<Behandlung> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of behandlungs
	 */
	@Override
	public List<Behandlung> findAll(
		int start, int end, OrderByComparator<Behandlung> orderByComparator,
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

		List<Behandlung> list = null;

		if (useFinderCache) {
			list = (List<Behandlung>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BEHANDLUNG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BEHANDLUNG;

				sql = sql.concat(BehandlungModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Behandlung>)QueryUtil.list(
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
	 * Removes all the behandlungs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Behandlung behandlung : findAll()) {
			remove(behandlung);
		}
	}

	/**
	 * Returns the number of behandlungs.
	 *
	 * @return the number of behandlungs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BEHANDLUNG);

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
		return "behandlung_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BEHANDLUNG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BehandlungModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the behandlung persistence.
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

		_setBehandlungUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBehandlungUtilPersistence(null);

		entityCache.removeCache(BehandlungImpl.class.getName());
	}

	private void _setBehandlungUtilPersistence(
		BehandlungPersistence behandlungPersistence) {

		try {
			Field field = BehandlungUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, behandlungPersistence);
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

	private static final String _SQL_SELECT_BEHANDLUNG =
		"SELECT behandlung FROM Behandlung behandlung";

	private static final String _SQL_COUNT_BEHANDLUNG =
		"SELECT COUNT(behandlung) FROM Behandlung behandlung";

	private static final String _ORDER_BY_ENTITY_ALIAS = "behandlung.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Behandlung exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		BehandlungPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"medikament_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private BehandlungModelArgumentsResolver _behandlungModelArgumentsResolver;

}