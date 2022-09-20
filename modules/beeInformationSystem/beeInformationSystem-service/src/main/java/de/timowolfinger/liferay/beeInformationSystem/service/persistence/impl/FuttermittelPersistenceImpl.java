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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchFuttermittelException;
import de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel;
import de.timowolfinger.liferay.beeInformationSystem.model.FuttermittelTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.FuttermittelImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.FuttermittelModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuttermittelPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuttermittelUtil;
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
 * The persistence implementation for the futtermittel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FuttermittelPersistence.class, BasePersistence.class})
public class FuttermittelPersistenceImpl
	extends BasePersistenceImpl<Futtermittel>
	implements FuttermittelPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FuttermittelUtil</code> to access the futtermittel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FuttermittelImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public FuttermittelPersistenceImpl() {
		setModelClass(Futtermittel.class);

		setModelImplClass(FuttermittelImpl.class);
		setModelPKClass(long.class);

		setTable(FuttermittelTable.INSTANCE);
	}

	/**
	 * Caches the futtermittel in the entity cache if it is enabled.
	 *
	 * @param futtermittel the futtermittel
	 */
	@Override
	public void cacheResult(Futtermittel futtermittel) {
		entityCache.putResult(
			FuttermittelImpl.class, futtermittel.getPrimaryKey(), futtermittel);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the futtermittels in the entity cache if it is enabled.
	 *
	 * @param futtermittels the futtermittels
	 */
	@Override
	public void cacheResult(List<Futtermittel> futtermittels) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (futtermittels.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Futtermittel futtermittel : futtermittels) {
			if (entityCache.getResult(
					FuttermittelImpl.class, futtermittel.getPrimaryKey()) ==
						null) {

				cacheResult(futtermittel);
			}
		}
	}

	/**
	 * Clears the cache for all futtermittels.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FuttermittelImpl.class);

		finderCache.clearCache(FuttermittelImpl.class);
	}

	/**
	 * Clears the cache for the futtermittel.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Futtermittel futtermittel) {
		entityCache.removeResult(FuttermittelImpl.class, futtermittel);
	}

	@Override
	public void clearCache(List<Futtermittel> futtermittels) {
		for (Futtermittel futtermittel : futtermittels) {
			entityCache.removeResult(FuttermittelImpl.class, futtermittel);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FuttermittelImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FuttermittelImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new futtermittel with the primary key. Does not add the futtermittel to the database.
	 *
	 * @param futtermittel_id the primary key for the new futtermittel
	 * @return the new futtermittel
	 */
	@Override
	public Futtermittel create(long futtermittel_id) {
		Futtermittel futtermittel = new FuttermittelImpl();

		futtermittel.setNew(true);
		futtermittel.setPrimaryKey(futtermittel_id);

		return futtermittel;
	}

	/**
	 * Removes the futtermittel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel that was removed
	 * @throws NoSuchFuttermittelException if a futtermittel with the primary key could not be found
	 */
	@Override
	public Futtermittel remove(long futtermittel_id)
		throws NoSuchFuttermittelException {

		return remove((Serializable)futtermittel_id);
	}

	/**
	 * Removes the futtermittel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the futtermittel
	 * @return the futtermittel that was removed
	 * @throws NoSuchFuttermittelException if a futtermittel with the primary key could not be found
	 */
	@Override
	public Futtermittel remove(Serializable primaryKey)
		throws NoSuchFuttermittelException {

		Session session = null;

		try {
			session = openSession();

			Futtermittel futtermittel = (Futtermittel)session.get(
				FuttermittelImpl.class, primaryKey);

			if (futtermittel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuttermittelException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(futtermittel);
		}
		catch (NoSuchFuttermittelException noSuchEntityException) {
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
	protected Futtermittel removeImpl(Futtermittel futtermittel) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(futtermittel)) {
				futtermittel = (Futtermittel)session.get(
					FuttermittelImpl.class, futtermittel.getPrimaryKeyObj());
			}

			if (futtermittel != null) {
				session.delete(futtermittel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (futtermittel != null) {
			clearCache(futtermittel);
		}

		return futtermittel;
	}

	@Override
	public Futtermittel updateImpl(Futtermittel futtermittel) {
		boolean isNew = futtermittel.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(futtermittel);
			}
			else {
				futtermittel = (Futtermittel)session.merge(futtermittel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FuttermittelImpl.class, futtermittel, false, true);

		if (isNew) {
			futtermittel.setNew(false);
		}

		futtermittel.resetOriginalValues();

		return futtermittel;
	}

	/**
	 * Returns the futtermittel with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the futtermittel
	 * @return the futtermittel
	 * @throws NoSuchFuttermittelException if a futtermittel with the primary key could not be found
	 */
	@Override
	public Futtermittel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuttermittelException {

		Futtermittel futtermittel = fetchByPrimaryKey(primaryKey);

		if (futtermittel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuttermittelException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return futtermittel;
	}

	/**
	 * Returns the futtermittel with the primary key or throws a <code>NoSuchFuttermittelException</code> if it could not be found.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel
	 * @throws NoSuchFuttermittelException if a futtermittel with the primary key could not be found
	 */
	@Override
	public Futtermittel findByPrimaryKey(long futtermittel_id)
		throws NoSuchFuttermittelException {

		return findByPrimaryKey((Serializable)futtermittel_id);
	}

	/**
	 * Returns the futtermittel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel, or <code>null</code> if a futtermittel with the primary key could not be found
	 */
	@Override
	public Futtermittel fetchByPrimaryKey(long futtermittel_id) {
		return fetchByPrimaryKey((Serializable)futtermittel_id);
	}

	/**
	 * Returns all the futtermittels.
	 *
	 * @return the futtermittels
	 */
	@Override
	public List<Futtermittel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @return the range of futtermittels
	 */
	@Override
	public List<Futtermittel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of futtermittels
	 */
	@Override
	public List<Futtermittel> findAll(
		int start, int end, OrderByComparator<Futtermittel> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of futtermittels
	 */
	@Override
	public List<Futtermittel> findAll(
		int start, int end, OrderByComparator<Futtermittel> orderByComparator,
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

		List<Futtermittel> list = null;

		if (useFinderCache) {
			list = (List<Futtermittel>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FUTTERMITTEL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FUTTERMITTEL;

				sql = sql.concat(FuttermittelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Futtermittel>)QueryUtil.list(
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
	 * Removes all the futtermittels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Futtermittel futtermittel : findAll()) {
			remove(futtermittel);
		}
	}

	/**
	 * Returns the number of futtermittels.
	 *
	 * @return the number of futtermittels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FUTTERMITTEL);

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
		return "futtermittel_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FUTTERMITTEL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FuttermittelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the futtermittel persistence.
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

		_setFuttermittelUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFuttermittelUtilPersistence(null);

		entityCache.removeCache(FuttermittelImpl.class.getName());
	}

	private void _setFuttermittelUtilPersistence(
		FuttermittelPersistence futtermittelPersistence) {

		try {
			Field field = FuttermittelUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, futtermittelPersistence);
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

	private static final String _SQL_SELECT_FUTTERMITTEL =
		"SELECT futtermittel FROM Futtermittel futtermittel";

	private static final String _SQL_COUNT_FUTTERMITTEL =
		"SELECT COUNT(futtermittel) FROM Futtermittel futtermittel";

	private static final String _ORDER_BY_ENTITY_ALIAS = "futtermittel.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Futtermittel exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		FuttermittelPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FuttermittelModelArgumentsResolver
		_futtermittelModelArgumentsResolver;

}