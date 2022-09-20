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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBienenvolkException;
import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk;
import de.timowolfinger.liferay.beeInformationSystem.model.BienenvolkTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenvolkPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenvolkUtil;
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
 * The persistence implementation for the bienenvolk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {BienenvolkPersistence.class, BasePersistence.class})
public class BienenvolkPersistenceImpl
	extends BasePersistenceImpl<Bienenvolk> implements BienenvolkPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BienenvolkUtil</code> to access the bienenvolk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BienenvolkImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public BienenvolkPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("bienenvolk_id", "muttervolk");

		setDBColumnNames(dbColumnNames);

		setModelClass(Bienenvolk.class);

		setModelImplClass(BienenvolkImpl.class);
		setModelPKClass(long.class);

		setTable(BienenvolkTable.INSTANCE);
	}

	/**
	 * Caches the bienenvolk in the entity cache if it is enabled.
	 *
	 * @param bienenvolk the bienenvolk
	 */
	@Override
	public void cacheResult(Bienenvolk bienenvolk) {
		entityCache.putResult(
			BienenvolkImpl.class, bienenvolk.getPrimaryKey(), bienenvolk);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bienenvolks in the entity cache if it is enabled.
	 *
	 * @param bienenvolks the bienenvolks
	 */
	@Override
	public void cacheResult(List<Bienenvolk> bienenvolks) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bienenvolks.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Bienenvolk bienenvolk : bienenvolks) {
			if (entityCache.getResult(
					BienenvolkImpl.class, bienenvolk.getPrimaryKey()) == null) {

				cacheResult(bienenvolk);
			}
		}
	}

	/**
	 * Clears the cache for all bienenvolks.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BienenvolkImpl.class);

		finderCache.clearCache(BienenvolkImpl.class);
	}

	/**
	 * Clears the cache for the bienenvolk.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bienenvolk bienenvolk) {
		entityCache.removeResult(BienenvolkImpl.class, bienenvolk);
	}

	@Override
	public void clearCache(List<Bienenvolk> bienenvolks) {
		for (Bienenvolk bienenvolk : bienenvolks) {
			entityCache.removeResult(BienenvolkImpl.class, bienenvolk);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BienenvolkImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BienenvolkImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bienenvolk with the primary key. Does not add the bienenvolk to the database.
	 *
	 * @param bienenvolk_id the primary key for the new bienenvolk
	 * @return the new bienenvolk
	 */
	@Override
	public Bienenvolk create(long bienenvolk_id) {
		Bienenvolk bienenvolk = new BienenvolkImpl();

		bienenvolk.setNew(true);
		bienenvolk.setPrimaryKey(bienenvolk_id);

		return bienenvolk;
	}

	/**
	 * Removes the bienenvolk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk that was removed
	 * @throws NoSuchBienenvolkException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public Bienenvolk remove(long bienenvolk_id)
		throws NoSuchBienenvolkException {

		return remove((Serializable)bienenvolk_id);
	}

	/**
	 * Removes the bienenvolk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bienenvolk
	 * @return the bienenvolk that was removed
	 * @throws NoSuchBienenvolkException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public Bienenvolk remove(Serializable primaryKey)
		throws NoSuchBienenvolkException {

		Session session = null;

		try {
			session = openSession();

			Bienenvolk bienenvolk = (Bienenvolk)session.get(
				BienenvolkImpl.class, primaryKey);

			if (bienenvolk == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBienenvolkException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bienenvolk);
		}
		catch (NoSuchBienenvolkException noSuchEntityException) {
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
	protected Bienenvolk removeImpl(Bienenvolk bienenvolk) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bienenvolk)) {
				bienenvolk = (Bienenvolk)session.get(
					BienenvolkImpl.class, bienenvolk.getPrimaryKeyObj());
			}

			if (bienenvolk != null) {
				session.delete(bienenvolk);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bienenvolk != null) {
			clearCache(bienenvolk);
		}

		return bienenvolk;
	}

	@Override
	public Bienenvolk updateImpl(Bienenvolk bienenvolk) {
		boolean isNew = bienenvolk.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bienenvolk);
			}
			else {
				bienenvolk = (Bienenvolk)session.merge(bienenvolk);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(BienenvolkImpl.class, bienenvolk, false, true);

		if (isNew) {
			bienenvolk.setNew(false);
		}

		bienenvolk.resetOriginalValues();

		return bienenvolk;
	}

	/**
	 * Returns the bienenvolk with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bienenvolk
	 * @return the bienenvolk
	 * @throws NoSuchBienenvolkException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public Bienenvolk findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBienenvolkException {

		Bienenvolk bienenvolk = fetchByPrimaryKey(primaryKey);

		if (bienenvolk == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBienenvolkException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bienenvolk;
	}

	/**
	 * Returns the bienenvolk with the primary key or throws a <code>NoSuchBienenvolkException</code> if it could not be found.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk
	 * @throws NoSuchBienenvolkException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public Bienenvolk findByPrimaryKey(long bienenvolk_id)
		throws NoSuchBienenvolkException {

		return findByPrimaryKey((Serializable)bienenvolk_id);
	}

	/**
	 * Returns the bienenvolk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk, or <code>null</code> if a bienenvolk with the primary key could not be found
	 */
	@Override
	public Bienenvolk fetchByPrimaryKey(long bienenvolk_id) {
		return fetchByPrimaryKey((Serializable)bienenvolk_id);
	}

	/**
	 * Returns all the bienenvolks.
	 *
	 * @return the bienenvolks
	 */
	@Override
	public List<Bienenvolk> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @return the range of bienenvolks
	 */
	@Override
	public List<Bienenvolk> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenvolks
	 */
	@Override
	public List<Bienenvolk> findAll(
		int start, int end, OrderByComparator<Bienenvolk> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenvolks
	 */
	@Override
	public List<Bienenvolk> findAll(
		int start, int end, OrderByComparator<Bienenvolk> orderByComparator,
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

		List<Bienenvolk> list = null;

		if (useFinderCache) {
			list = (List<Bienenvolk>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BIENENVOLK);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BIENENVOLK;

				sql = sql.concat(BienenvolkModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Bienenvolk>)QueryUtil.list(
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
	 * Removes all the bienenvolks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Bienenvolk bienenvolk : findAll()) {
			remove(bienenvolk);
		}
	}

	/**
	 * Returns the number of bienenvolks.
	 *
	 * @return the number of bienenvolks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BIENENVOLK);

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
		return "bienenvolk_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BIENENVOLK;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BienenvolkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bienenvolk persistence.
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

		_setBienenvolkUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBienenvolkUtilPersistence(null);

		entityCache.removeCache(BienenvolkImpl.class.getName());
	}

	private void _setBienenvolkUtilPersistence(
		BienenvolkPersistence bienenvolkPersistence) {

		try {
			Field field = BienenvolkUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, bienenvolkPersistence);
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

	private static final String _SQL_SELECT_BIENENVOLK =
		"SELECT bienenvolk FROM Bienenvolk bienenvolk";

	private static final String _SQL_COUNT_BIENENVOLK =
		"SELECT COUNT(bienenvolk) FROM Bienenvolk bienenvolk";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bienenvolk.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Bienenvolk exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		BienenvolkPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"bienenvolk_id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private BienenvolkModelArgumentsResolver _bienenvolkModelArgumentsResolver;

}