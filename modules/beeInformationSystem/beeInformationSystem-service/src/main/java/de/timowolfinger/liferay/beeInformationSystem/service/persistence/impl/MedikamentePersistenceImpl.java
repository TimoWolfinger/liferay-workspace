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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchMedikamenteException;
import de.timowolfinger.liferay.beeInformationSystem.model.Medikamente;
import de.timowolfinger.liferay.beeInformationSystem.model.MedikamenteTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamenteImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamenteModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.MedikamentePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.MedikamenteUtil;
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
 * The persistence implementation for the medikamente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {MedikamentePersistence.class, BasePersistence.class})
public class MedikamentePersistenceImpl
	extends BasePersistenceImpl<Medikamente> implements MedikamentePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedikamenteUtil</code> to access the medikamente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedikamenteImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public MedikamentePersistenceImpl() {
		setModelClass(Medikamente.class);

		setModelImplClass(MedikamenteImpl.class);
		setModelPKClass(long.class);

		setTable(MedikamenteTable.INSTANCE);
	}

	/**
	 * Caches the medikamente in the entity cache if it is enabled.
	 *
	 * @param medikamente the medikamente
	 */
	@Override
	public void cacheResult(Medikamente medikamente) {
		entityCache.putResult(
			MedikamenteImpl.class, medikamente.getPrimaryKey(), medikamente);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medikamentes in the entity cache if it is enabled.
	 *
	 * @param medikamentes the medikamentes
	 */
	@Override
	public void cacheResult(List<Medikamente> medikamentes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medikamentes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Medikamente medikamente : medikamentes) {
			if (entityCache.getResult(
					MedikamenteImpl.class, medikamente.getPrimaryKey()) ==
						null) {

				cacheResult(medikamente);
			}
		}
	}

	/**
	 * Clears the cache for all medikamentes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedikamenteImpl.class);

		finderCache.clearCache(MedikamenteImpl.class);
	}

	/**
	 * Clears the cache for the medikamente.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Medikamente medikamente) {
		entityCache.removeResult(MedikamenteImpl.class, medikamente);
	}

	@Override
	public void clearCache(List<Medikamente> medikamentes) {
		for (Medikamente medikamente : medikamentes) {
			entityCache.removeResult(MedikamenteImpl.class, medikamente);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedikamenteImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MedikamenteImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new medikamente with the primary key. Does not add the medikamente to the database.
	 *
	 * @param medikamente_id the primary key for the new medikamente
	 * @return the new medikamente
	 */
	@Override
	public Medikamente create(long medikamente_id) {
		Medikamente medikamente = new MedikamenteImpl();

		medikamente.setNew(true);
		medikamente.setPrimaryKey(medikamente_id);

		return medikamente;
	}

	/**
	 * Removes the medikamente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente that was removed
	 * @throws NoSuchMedikamenteException if a medikamente with the primary key could not be found
	 */
	@Override
	public Medikamente remove(long medikamente_id)
		throws NoSuchMedikamenteException {

		return remove((Serializable)medikamente_id);
	}

	/**
	 * Removes the medikamente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medikamente
	 * @return the medikamente that was removed
	 * @throws NoSuchMedikamenteException if a medikamente with the primary key could not be found
	 */
	@Override
	public Medikamente remove(Serializable primaryKey)
		throws NoSuchMedikamenteException {

		Session session = null;

		try {
			session = openSession();

			Medikamente medikamente = (Medikamente)session.get(
				MedikamenteImpl.class, primaryKey);

			if (medikamente == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedikamenteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medikamente);
		}
		catch (NoSuchMedikamenteException noSuchEntityException) {
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
	protected Medikamente removeImpl(Medikamente medikamente) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medikamente)) {
				medikamente = (Medikamente)session.get(
					MedikamenteImpl.class, medikamente.getPrimaryKeyObj());
			}

			if (medikamente != null) {
				session.delete(medikamente);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medikamente != null) {
			clearCache(medikamente);
		}

		return medikamente;
	}

	@Override
	public Medikamente updateImpl(Medikamente medikamente) {
		boolean isNew = medikamente.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medikamente);
			}
			else {
				medikamente = (Medikamente)session.merge(medikamente);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(MedikamenteImpl.class, medikamente, false, true);

		if (isNew) {
			medikamente.setNew(false);
		}

		medikamente.resetOriginalValues();

		return medikamente;
	}

	/**
	 * Returns the medikamente with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medikamente
	 * @return the medikamente
	 * @throws NoSuchMedikamenteException if a medikamente with the primary key could not be found
	 */
	@Override
	public Medikamente findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedikamenteException {

		Medikamente medikamente = fetchByPrimaryKey(primaryKey);

		if (medikamente == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedikamenteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medikamente;
	}

	/**
	 * Returns the medikamente with the primary key or throws a <code>NoSuchMedikamenteException</code> if it could not be found.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente
	 * @throws NoSuchMedikamenteException if a medikamente with the primary key could not be found
	 */
	@Override
	public Medikamente findByPrimaryKey(long medikamente_id)
		throws NoSuchMedikamenteException {

		return findByPrimaryKey((Serializable)medikamente_id);
	}

	/**
	 * Returns the medikamente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente, or <code>null</code> if a medikamente with the primary key could not be found
	 */
	@Override
	public Medikamente fetchByPrimaryKey(long medikamente_id) {
		return fetchByPrimaryKey((Serializable)medikamente_id);
	}

	/**
	 * Returns all the medikamentes.
	 *
	 * @return the medikamentes
	 */
	@Override
	public List<Medikamente> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @return the range of medikamentes
	 */
	@Override
	public List<Medikamente> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medikamentes
	 */
	@Override
	public List<Medikamente> findAll(
		int start, int end, OrderByComparator<Medikamente> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medikamentes
	 */
	@Override
	public List<Medikamente> findAll(
		int start, int end, OrderByComparator<Medikamente> orderByComparator,
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

		List<Medikamente> list = null;

		if (useFinderCache) {
			list = (List<Medikamente>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDIKAMENTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDIKAMENTE;

				sql = sql.concat(MedikamenteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Medikamente>)QueryUtil.list(
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
	 * Removes all the medikamentes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Medikamente medikamente : findAll()) {
			remove(medikamente);
		}
	}

	/**
	 * Returns the number of medikamentes.
	 *
	 * @return the number of medikamentes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MEDIKAMENTE);

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
		return "medikamente_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDIKAMENTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedikamenteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medikamente persistence.
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

		_setMedikamenteUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setMedikamenteUtilPersistence(null);

		entityCache.removeCache(MedikamenteImpl.class.getName());
	}

	private void _setMedikamenteUtilPersistence(
		MedikamentePersistence medikamentePersistence) {

		try {
			Field field = MedikamenteUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, medikamentePersistence);
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

	private static final String _SQL_SELECT_MEDIKAMENTE =
		"SELECT medikamente FROM Medikamente medikamente";

	private static final String _SQL_COUNT_MEDIKAMENTE =
		"SELECT COUNT(medikamente) FROM Medikamente medikamente";

	private static final String _ORDER_BY_ENTITY_ALIAS = "medikamente.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Medikamente exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		MedikamentePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private MedikamenteModelArgumentsResolver
		_medikamenteModelArgumentsResolver;

}