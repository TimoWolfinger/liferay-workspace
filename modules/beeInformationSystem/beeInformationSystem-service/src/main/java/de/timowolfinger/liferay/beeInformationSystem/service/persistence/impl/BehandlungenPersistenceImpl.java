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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBehandlungenException;
import de.timowolfinger.liferay.beeInformationSystem.model.Behandlungen;
import de.timowolfinger.liferay.beeInformationSystem.model.BehandlungenTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungenImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungenModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BehandlungenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BehandlungenUtil;
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
 * The persistence implementation for the behandlungen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {BehandlungenPersistence.class, BasePersistence.class})
public class BehandlungenPersistenceImpl
	extends BasePersistenceImpl<Behandlungen>
	implements BehandlungenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BehandlungenUtil</code> to access the behandlungen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BehandlungenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public BehandlungenPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("medikament_id", "dmedikament_id");

		setDBColumnNames(dbColumnNames);

		setModelClass(Behandlungen.class);

		setModelImplClass(BehandlungenImpl.class);
		setModelPKClass(long.class);

		setTable(BehandlungenTable.INSTANCE);
	}

	/**
	 * Caches the behandlungen in the entity cache if it is enabled.
	 *
	 * @param behandlungen the behandlungen
	 */
	@Override
	public void cacheResult(Behandlungen behandlungen) {
		entityCache.putResult(
			BehandlungenImpl.class, behandlungen.getPrimaryKey(), behandlungen);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the behandlungens in the entity cache if it is enabled.
	 *
	 * @param behandlungens the behandlungens
	 */
	@Override
	public void cacheResult(List<Behandlungen> behandlungens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (behandlungens.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Behandlungen behandlungen : behandlungens) {
			if (entityCache.getResult(
					BehandlungenImpl.class, behandlungen.getPrimaryKey()) ==
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
		entityCache.clearCache(BehandlungenImpl.class);

		finderCache.clearCache(BehandlungenImpl.class);
	}

	/**
	 * Clears the cache for the behandlungen.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Behandlungen behandlungen) {
		entityCache.removeResult(BehandlungenImpl.class, behandlungen);
	}

	@Override
	public void clearCache(List<Behandlungen> behandlungens) {
		for (Behandlungen behandlungen : behandlungens) {
			entityCache.removeResult(BehandlungenImpl.class, behandlungen);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BehandlungenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BehandlungenImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new behandlungen with the primary key. Does not add the behandlungen to the database.
	 *
	 * @param behandlungen_id the primary key for the new behandlungen
	 * @return the new behandlungen
	 */
	@Override
	public Behandlungen create(long behandlungen_id) {
		Behandlungen behandlungen = new BehandlungenImpl();

		behandlungen.setNew(true);
		behandlungen.setPrimaryKey(behandlungen_id);

		return behandlungen;
	}

	/**
	 * Removes the behandlungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param behandlungen_id the primary key of the behandlungen
	 * @return the behandlungen that was removed
	 * @throws NoSuchBehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public Behandlungen remove(long behandlungen_id)
		throws NoSuchBehandlungenException {

		return remove((Serializable)behandlungen_id);
	}

	/**
	 * Removes the behandlungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the behandlungen
	 * @return the behandlungen that was removed
	 * @throws NoSuchBehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public Behandlungen remove(Serializable primaryKey)
		throws NoSuchBehandlungenException {

		Session session = null;

		try {
			session = openSession();

			Behandlungen behandlungen = (Behandlungen)session.get(
				BehandlungenImpl.class, primaryKey);

			if (behandlungen == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBehandlungenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(behandlungen);
		}
		catch (NoSuchBehandlungenException noSuchEntityException) {
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
	protected Behandlungen removeImpl(Behandlungen behandlungen) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(behandlungen)) {
				behandlungen = (Behandlungen)session.get(
					BehandlungenImpl.class, behandlungen.getPrimaryKeyObj());
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
	public Behandlungen updateImpl(Behandlungen behandlungen) {
		boolean isNew = behandlungen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(behandlungen);
			}
			else {
				behandlungen = (Behandlungen)session.merge(behandlungen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BehandlungenImpl.class, behandlungen, false, true);

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
	 * @throws NoSuchBehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public Behandlungen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBehandlungenException {

		Behandlungen behandlungen = fetchByPrimaryKey(primaryKey);

		if (behandlungen == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBehandlungenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return behandlungen;
	}

	/**
	 * Returns the behandlungen with the primary key or throws a <code>NoSuchBehandlungenException</code> if it could not be found.
	 *
	 * @param behandlungen_id the primary key of the behandlungen
	 * @return the behandlungen
	 * @throws NoSuchBehandlungenException if a behandlungen with the primary key could not be found
	 */
	@Override
	public Behandlungen findByPrimaryKey(long behandlungen_id)
		throws NoSuchBehandlungenException {

		return findByPrimaryKey((Serializable)behandlungen_id);
	}

	/**
	 * Returns the behandlungen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param behandlungen_id the primary key of the behandlungen
	 * @return the behandlungen, or <code>null</code> if a behandlungen with the primary key could not be found
	 */
	@Override
	public Behandlungen fetchByPrimaryKey(long behandlungen_id) {
		return fetchByPrimaryKey((Serializable)behandlungen_id);
	}

	/**
	 * Returns all the behandlungens.
	 *
	 * @return the behandlungens
	 */
	@Override
	public List<Behandlungen> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @return the range of behandlungens
	 */
	@Override
	public List<Behandlungen> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of behandlungens
	 */
	@Override
	public List<Behandlungen> findAll(
		int start, int end, OrderByComparator<Behandlungen> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of behandlungens
	 */
	@Override
	public List<Behandlungen> findAll(
		int start, int end, OrderByComparator<Behandlungen> orderByComparator,
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

		List<Behandlungen> list = null;

		if (useFinderCache) {
			list = (List<Behandlungen>)finderCache.getResult(
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

				sql = sql.concat(BehandlungenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Behandlungen>)QueryUtil.list(
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
		for (Behandlungen behandlungen : findAll()) {
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
		return "behandlungen_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BEHANDLUNGEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BehandlungenModelImpl.TABLE_COLUMNS_MAP;
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

		_setBehandlungenUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBehandlungenUtilPersistence(null);

		entityCache.removeCache(BehandlungenImpl.class.getName());
	}

	private void _setBehandlungenUtilPersistence(
		BehandlungenPersistence behandlungenPersistence) {

		try {
			Field field = BehandlungenUtil.class.getDeclaredField(
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

	private static final String _SQL_SELECT_BEHANDLUNGEN =
		"SELECT behandlungen FROM Behandlungen behandlungen";

	private static final String _SQL_COUNT_BEHANDLUNGEN =
		"SELECT COUNT(behandlungen) FROM Behandlungen behandlungen";

	private static final String _ORDER_BY_ENTITY_ALIAS = "behandlungen.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Behandlungen exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		BehandlungenPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"medikament_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private BehandlungenModelArgumentsResolver
		_behandlungenModelArgumentsResolver;

}