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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBeutemasseException;
import de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse;
import de.timowolfinger.liferay.beeInformationSystem.model.BeutemasseTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BeutemassePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BeutemasseUtil;
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
 * The persistence implementation for the beutemasse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {BeutemassePersistence.class, BasePersistence.class})
public class BeutemassePersistenceImpl
	extends BasePersistenceImpl<Beutemasse> implements BeutemassePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BeutemasseUtil</code> to access the beutemasse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BeutemasseImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public BeutemassePersistenceImpl() {
		setModelClass(Beutemasse.class);

		setModelImplClass(BeutemasseImpl.class);
		setModelPKClass(long.class);

		setTable(BeutemasseTable.INSTANCE);
	}

	/**
	 * Caches the beutemasse in the entity cache if it is enabled.
	 *
	 * @param beutemasse the beutemasse
	 */
	@Override
	public void cacheResult(Beutemasse beutemasse) {
		entityCache.putResult(
			BeutemasseImpl.class, beutemasse.getPrimaryKey(), beutemasse);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the beutemasses in the entity cache if it is enabled.
	 *
	 * @param beutemasses the beutemasses
	 */
	@Override
	public void cacheResult(List<Beutemasse> beutemasses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (beutemasses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Beutemasse beutemasse : beutemasses) {
			if (entityCache.getResult(
					BeutemasseImpl.class, beutemasse.getPrimaryKey()) == null) {

				cacheResult(beutemasse);
			}
		}
	}

	/**
	 * Clears the cache for all beutemasses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BeutemasseImpl.class);

		finderCache.clearCache(BeutemasseImpl.class);
	}

	/**
	 * Clears the cache for the beutemasse.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Beutemasse beutemasse) {
		entityCache.removeResult(BeutemasseImpl.class, beutemasse);
	}

	@Override
	public void clearCache(List<Beutemasse> beutemasses) {
		for (Beutemasse beutemasse : beutemasses) {
			entityCache.removeResult(BeutemasseImpl.class, beutemasse);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BeutemasseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BeutemasseImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new beutemasse with the primary key. Does not add the beutemasse to the database.
	 *
	 * @param beutemasse_id the primary key for the new beutemasse
	 * @return the new beutemasse
	 */
	@Override
	public Beutemasse create(long beutemasse_id) {
		Beutemasse beutemasse = new BeutemasseImpl();

		beutemasse.setNew(true);
		beutemasse.setPrimaryKey(beutemasse_id);

		return beutemasse;
	}

	/**
	 * Removes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param beutemasse_id the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws NoSuchBeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public Beutemasse remove(long beutemasse_id)
		throws NoSuchBeutemasseException {

		return remove((Serializable)beutemasse_id);
	}

	/**
	 * Removes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws NoSuchBeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public Beutemasse remove(Serializable primaryKey)
		throws NoSuchBeutemasseException {

		Session session = null;

		try {
			session = openSession();

			Beutemasse beutemasse = (Beutemasse)session.get(
				BeutemasseImpl.class, primaryKey);

			if (beutemasse == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBeutemasseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(beutemasse);
		}
		catch (NoSuchBeutemasseException noSuchEntityException) {
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
	protected Beutemasse removeImpl(Beutemasse beutemasse) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(beutemasse)) {
				beutemasse = (Beutemasse)session.get(
					BeutemasseImpl.class, beutemasse.getPrimaryKeyObj());
			}

			if (beutemasse != null) {
				session.delete(beutemasse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (beutemasse != null) {
			clearCache(beutemasse);
		}

		return beutemasse;
	}

	@Override
	public Beutemasse updateImpl(Beutemasse beutemasse) {
		boolean isNew = beutemasse.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(beutemasse);
			}
			else {
				beutemasse = (Beutemasse)session.merge(beutemasse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(BeutemasseImpl.class, beutemasse, false, true);

		if (isNew) {
			beutemasse.setNew(false);
		}

		beutemasse.resetOriginalValues();

		return beutemasse;
	}

	/**
	 * Returns the beutemasse with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws NoSuchBeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public Beutemasse findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBeutemasseException {

		Beutemasse beutemasse = fetchByPrimaryKey(primaryKey);

		if (beutemasse == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBeutemasseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return beutemasse;
	}

	/**
	 * Returns the beutemasse with the primary key or throws a <code>NoSuchBeutemasseException</code> if it could not be found.
	 *
	 * @param beutemasse_id the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws NoSuchBeutemasseException if a beutemasse with the primary key could not be found
	 */
	@Override
	public Beutemasse findByPrimaryKey(long beutemasse_id)
		throws NoSuchBeutemasseException {

		return findByPrimaryKey((Serializable)beutemasse_id);
	}

	/**
	 * Returns the beutemasse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param beutemasse_id the primary key of the beutemasse
	 * @return the beutemasse, or <code>null</code> if a beutemasse with the primary key could not be found
	 */
	@Override
	public Beutemasse fetchByPrimaryKey(long beutemasse_id) {
		return fetchByPrimaryKey((Serializable)beutemasse_id);
	}

	/**
	 * Returns all the beutemasses.
	 *
	 * @return the beutemasses
	 */
	@Override
	public List<Beutemasse> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BeutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	@Override
	public List<Beutemasse> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BeutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of beutemasses
	 */
	@Override
	public List<Beutemasse> findAll(
		int start, int end, OrderByComparator<Beutemasse> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BeutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of beutemasses
	 */
	@Override
	public List<Beutemasse> findAll(
		int start, int end, OrderByComparator<Beutemasse> orderByComparator,
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

		List<Beutemasse> list = null;

		if (useFinderCache) {
			list = (List<Beutemasse>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BEUTEMASSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BEUTEMASSE;

				sql = sql.concat(BeutemasseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Beutemasse>)QueryUtil.list(
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
	 * Removes all the beutemasses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Beutemasse beutemasse : findAll()) {
			remove(beutemasse);
		}
	}

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BEUTEMASSE);

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
		return "beutemasse_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BEUTEMASSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BeutemasseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the beutemasse persistence.
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

		_setBeutemasseUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBeutemasseUtilPersistence(null);

		entityCache.removeCache(BeutemasseImpl.class.getName());
	}

	private void _setBeutemasseUtilPersistence(
		BeutemassePersistence beutemassePersistence) {

		try {
			Field field = BeutemasseUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, beutemassePersistence);
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

	private static final String _SQL_SELECT_BEUTEMASSE =
		"SELECT beutemasse FROM Beutemasse beutemasse";

	private static final String _SQL_COUNT_BEUTEMASSE =
		"SELECT COUNT(beutemasse) FROM Beutemasse beutemasse";

	private static final String _ORDER_BY_ENTITY_ALIAS = "beutemasse.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Beutemasse exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		BeutemassePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private BeutemasseModelArgumentsResolver _beutemasseModelArgumentsResolver;

}