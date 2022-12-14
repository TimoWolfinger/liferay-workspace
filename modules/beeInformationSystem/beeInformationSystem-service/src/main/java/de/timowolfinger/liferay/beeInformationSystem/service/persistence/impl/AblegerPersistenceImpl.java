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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchAblegerException;
import de.timowolfinger.liferay.beeInformationSystem.model.Ableger;
import de.timowolfinger.liferay.beeInformationSystem.model.AblegerTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.AblegerImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.AblegerModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.AblegerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.AblegerUtil;
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
 * The persistence implementation for the ableger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {AblegerPersistence.class, BasePersistence.class})
public class AblegerPersistenceImpl
	extends BasePersistenceImpl<Ableger> implements AblegerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AblegerUtil</code> to access the ableger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AblegerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public AblegerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("bienenvolk_id", "muttervolk_id");

		setDBColumnNames(dbColumnNames);

		setModelClass(Ableger.class);

		setModelImplClass(AblegerImpl.class);
		setModelPKClass(long.class);

		setTable(AblegerTable.INSTANCE);
	}

	/**
	 * Caches the ableger in the entity cache if it is enabled.
	 *
	 * @param ableger the ableger
	 */
	@Override
	public void cacheResult(Ableger ableger) {
		entityCache.putResult(
			AblegerImpl.class, ableger.getPrimaryKey(), ableger);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ablegers in the entity cache if it is enabled.
	 *
	 * @param ablegers the ablegers
	 */
	@Override
	public void cacheResult(List<Ableger> ablegers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ablegers.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Ableger ableger : ablegers) {
			if (entityCache.getResult(
					AblegerImpl.class, ableger.getPrimaryKey()) == null) {

				cacheResult(ableger);
			}
		}
	}

	/**
	 * Clears the cache for all ablegers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AblegerImpl.class);

		finderCache.clearCache(AblegerImpl.class);
	}

	/**
	 * Clears the cache for the ableger.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Ableger ableger) {
		entityCache.removeResult(AblegerImpl.class, ableger);
	}

	@Override
	public void clearCache(List<Ableger> ablegers) {
		for (Ableger ableger : ablegers) {
			entityCache.removeResult(AblegerImpl.class, ableger);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AblegerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AblegerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new ableger with the primary key. Does not add the ableger to the database.
	 *
	 * @param ableger_id the primary key for the new ableger
	 * @return the new ableger
	 */
	@Override
	public Ableger create(long ableger_id) {
		Ableger ableger = new AblegerImpl();

		ableger.setNew(true);
		ableger.setPrimaryKey(ableger_id);

		return ableger;
	}

	/**
	 * Removes the ableger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ableger_id the primary key of the ableger
	 * @return the ableger that was removed
	 * @throws NoSuchAblegerException if a ableger with the primary key could not be found
	 */
	@Override
	public Ableger remove(long ableger_id) throws NoSuchAblegerException {
		return remove((Serializable)ableger_id);
	}

	/**
	 * Removes the ableger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ableger
	 * @return the ableger that was removed
	 * @throws NoSuchAblegerException if a ableger with the primary key could not be found
	 */
	@Override
	public Ableger remove(Serializable primaryKey)
		throws NoSuchAblegerException {

		Session session = null;

		try {
			session = openSession();

			Ableger ableger = (Ableger)session.get(
				AblegerImpl.class, primaryKey);

			if (ableger == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAblegerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ableger);
		}
		catch (NoSuchAblegerException noSuchEntityException) {
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
	protected Ableger removeImpl(Ableger ableger) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ableger)) {
				ableger = (Ableger)session.get(
					AblegerImpl.class, ableger.getPrimaryKeyObj());
			}

			if (ableger != null) {
				session.delete(ableger);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ableger != null) {
			clearCache(ableger);
		}

		return ableger;
	}

	@Override
	public Ableger updateImpl(Ableger ableger) {
		boolean isNew = ableger.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ableger);
			}
			else {
				ableger = (Ableger)session.merge(ableger);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(AblegerImpl.class, ableger, false, true);

		if (isNew) {
			ableger.setNew(false);
		}

		ableger.resetOriginalValues();

		return ableger;
	}

	/**
	 * Returns the ableger with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ableger
	 * @return the ableger
	 * @throws NoSuchAblegerException if a ableger with the primary key could not be found
	 */
	@Override
	public Ableger findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAblegerException {

		Ableger ableger = fetchByPrimaryKey(primaryKey);

		if (ableger == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAblegerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ableger;
	}

	/**
	 * Returns the ableger with the primary key or throws a <code>NoSuchAblegerException</code> if it could not be found.
	 *
	 * @param ableger_id the primary key of the ableger
	 * @return the ableger
	 * @throws NoSuchAblegerException if a ableger with the primary key could not be found
	 */
	@Override
	public Ableger findByPrimaryKey(long ableger_id)
		throws NoSuchAblegerException {

		return findByPrimaryKey((Serializable)ableger_id);
	}

	/**
	 * Returns the ableger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ableger_id the primary key of the ableger
	 * @return the ableger, or <code>null</code> if a ableger with the primary key could not be found
	 */
	@Override
	public Ableger fetchByPrimaryKey(long ableger_id) {
		return fetchByPrimaryKey((Serializable)ableger_id);
	}

	/**
	 * Returns all the ablegers.
	 *
	 * @return the ablegers
	 */
	@Override
	public List<Ableger> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AblegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @return the range of ablegers
	 */
	@Override
	public List<Ableger> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AblegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ablegers
	 */
	@Override
	public List<Ableger> findAll(
		int start, int end, OrderByComparator<Ableger> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AblegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ablegers
	 */
	@Override
	public List<Ableger> findAll(
		int start, int end, OrderByComparator<Ableger> orderByComparator,
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

		List<Ableger> list = null;

		if (useFinderCache) {
			list = (List<Ableger>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ABLEGER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ABLEGER;

				sql = sql.concat(AblegerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Ableger>)QueryUtil.list(
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
	 * Removes all the ablegers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Ableger ableger : findAll()) {
			remove(ableger);
		}
	}

	/**
	 * Returns the number of ablegers.
	 *
	 * @return the number of ablegers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ABLEGER);

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
		return "ableger_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ABLEGER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AblegerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ableger persistence.
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

		_setAblegerUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAblegerUtilPersistence(null);

		entityCache.removeCache(AblegerImpl.class.getName());
	}

	private void _setAblegerUtilPersistence(
		AblegerPersistence ablegerPersistence) {

		try {
			Field field = AblegerUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, ablegerPersistence);
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

	private static final String _SQL_SELECT_ABLEGER =
		"SELECT ableger FROM Ableger ableger";

	private static final String _SQL_COUNT_ABLEGER =
		"SELECT COUNT(ableger) FROM Ableger ableger";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ableger.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Ableger exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		AblegerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"bienenvolk_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private AblegerModelArgumentsResolver _ablegerModelArgumentsResolver;

}