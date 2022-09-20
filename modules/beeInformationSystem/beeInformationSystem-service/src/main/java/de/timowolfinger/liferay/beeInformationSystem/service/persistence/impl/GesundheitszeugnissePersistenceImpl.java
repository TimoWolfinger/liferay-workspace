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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchGesundheitszeugnisseException;
import de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse;
import de.timowolfinger.liferay.beeInformationSystem.model.GesundheitszeugnisseTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisseImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisseModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.GesundheitszeugnissePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.GesundheitszeugnisseUtil;
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
 * The persistence implementation for the gesundheitszeugnisse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {GesundheitszeugnissePersistence.class, BasePersistence.class}
)
public class GesundheitszeugnissePersistenceImpl
	extends BasePersistenceImpl<Gesundheitszeugnisse>
	implements GesundheitszeugnissePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GesundheitszeugnisseUtil</code> to access the gesundheitszeugnisse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GesundheitszeugnisseImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public GesundheitszeugnissePersistenceImpl() {
		setModelClass(Gesundheitszeugnisse.class);

		setModelImplClass(GesundheitszeugnisseImpl.class);
		setModelPKClass(long.class);

		setTable(GesundheitszeugnisseTable.INSTANCE);
	}

	/**
	 * Caches the gesundheitszeugnisse in the entity cache if it is enabled.
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 */
	@Override
	public void cacheResult(Gesundheitszeugnisse gesundheitszeugnisse) {
		entityCache.putResult(
			GesundheitszeugnisseImpl.class,
			gesundheitszeugnisse.getPrimaryKey(), gesundheitszeugnisse);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the gesundheitszeugnisses in the entity cache if it is enabled.
	 *
	 * @param gesundheitszeugnisses the gesundheitszeugnisses
	 */
	@Override
	public void cacheResult(List<Gesundheitszeugnisse> gesundheitszeugnisses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (gesundheitszeugnisses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Gesundheitszeugnisse gesundheitszeugnisse :
				gesundheitszeugnisses) {

			if (entityCache.getResult(
					GesundheitszeugnisseImpl.class,
					gesundheitszeugnisse.getPrimaryKey()) == null) {

				cacheResult(gesundheitszeugnisse);
			}
		}
	}

	/**
	 * Clears the cache for all gesundheitszeugnisses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GesundheitszeugnisseImpl.class);

		finderCache.clearCache(GesundheitszeugnisseImpl.class);
	}

	/**
	 * Clears the cache for the gesundheitszeugnisse.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Gesundheitszeugnisse gesundheitszeugnisse) {
		entityCache.removeResult(
			GesundheitszeugnisseImpl.class, gesundheitszeugnisse);
	}

	@Override
	public void clearCache(List<Gesundheitszeugnisse> gesundheitszeugnisses) {
		for (Gesundheitszeugnisse gesundheitszeugnisse :
				gesundheitszeugnisses) {

			entityCache.removeResult(
				GesundheitszeugnisseImpl.class, gesundheitszeugnisse);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GesundheitszeugnisseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				GesundheitszeugnisseImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new gesundheitszeugnisse with the primary key. Does not add the gesundheitszeugnisse to the database.
	 *
	 * @param gesundheitszeugnisse_id the primary key for the new gesundheitszeugnisse
	 * @return the new gesundheitszeugnisse
	 */
	@Override
	public Gesundheitszeugnisse create(long gesundheitszeugnisse_id) {
		Gesundheitszeugnisse gesundheitszeugnisse =
			new GesundheitszeugnisseImpl();

		gesundheitszeugnisse.setNew(true);
		gesundheitszeugnisse.setPrimaryKey(gesundheitszeugnisse_id);

		return gesundheitszeugnisse;
	}

	/**
	 * Removes the gesundheitszeugnisse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 * @throws NoSuchGesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public Gesundheitszeugnisse remove(long gesundheitszeugnisse_id)
		throws NoSuchGesundheitszeugnisseException {

		return remove((Serializable)gesundheitszeugnisse_id);
	}

	/**
	 * Removes the gesundheitszeugnisse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 * @throws NoSuchGesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public Gesundheitszeugnisse remove(Serializable primaryKey)
		throws NoSuchGesundheitszeugnisseException {

		Session session = null;

		try {
			session = openSession();

			Gesundheitszeugnisse gesundheitszeugnisse =
				(Gesundheitszeugnisse)session.get(
					GesundheitszeugnisseImpl.class, primaryKey);

			if (gesundheitszeugnisse == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGesundheitszeugnisseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(gesundheitszeugnisse);
		}
		catch (NoSuchGesundheitszeugnisseException noSuchEntityException) {
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
	protected Gesundheitszeugnisse removeImpl(
		Gesundheitszeugnisse gesundheitszeugnisse) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(gesundheitszeugnisse)) {
				gesundheitszeugnisse = (Gesundheitszeugnisse)session.get(
					GesundheitszeugnisseImpl.class,
					gesundheitszeugnisse.getPrimaryKeyObj());
			}

			if (gesundheitszeugnisse != null) {
				session.delete(gesundheitszeugnisse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (gesundheitszeugnisse != null) {
			clearCache(gesundheitszeugnisse);
		}

		return gesundheitszeugnisse;
	}

	@Override
	public Gesundheitszeugnisse updateImpl(
		Gesundheitszeugnisse gesundheitszeugnisse) {

		boolean isNew = gesundheitszeugnisse.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(gesundheitszeugnisse);
			}
			else {
				gesundheitszeugnisse = (Gesundheitszeugnisse)session.merge(
					gesundheitszeugnisse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			GesundheitszeugnisseImpl.class, gesundheitszeugnisse, false, true);

		if (isNew) {
			gesundheitszeugnisse.setNew(false);
		}

		gesundheitszeugnisse.resetOriginalValues();

		return gesundheitszeugnisse;
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse
	 * @throws NoSuchGesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public Gesundheitszeugnisse findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGesundheitszeugnisseException {

		Gesundheitszeugnisse gesundheitszeugnisse = fetchByPrimaryKey(
			primaryKey);

		if (gesundheitszeugnisse == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGesundheitszeugnisseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return gesundheitszeugnisse;
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key or throws a <code>NoSuchGesundheitszeugnisseException</code> if it could not be found.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse
	 * @throws NoSuchGesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public Gesundheitszeugnisse findByPrimaryKey(long gesundheitszeugnisse_id)
		throws NoSuchGesundheitszeugnisseException {

		return findByPrimaryKey((Serializable)gesundheitszeugnisse_id);
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse, or <code>null</code> if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public Gesundheitszeugnisse fetchByPrimaryKey(
		long gesundheitszeugnisse_id) {

		return fetchByPrimaryKey((Serializable)gesundheitszeugnisse_id);
	}

	/**
	 * Returns all the gesundheitszeugnisses.
	 *
	 * @return the gesundheitszeugnisses
	 */
	@Override
	public List<Gesundheitszeugnisse> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @return the range of gesundheitszeugnisses
	 */
	@Override
	public List<Gesundheitszeugnisse> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gesundheitszeugnisses
	 */
	@Override
	public List<Gesundheitszeugnisse> findAll(
		int start, int end,
		OrderByComparator<Gesundheitszeugnisse> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gesundheitszeugnisses
	 */
	@Override
	public List<Gesundheitszeugnisse> findAll(
		int start, int end,
		OrderByComparator<Gesundheitszeugnisse> orderByComparator,
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

		List<Gesundheitszeugnisse> list = null;

		if (useFinderCache) {
			list = (List<Gesundheitszeugnisse>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GESUNDHEITSZEUGNISSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GESUNDHEITSZEUGNISSE;

				sql = sql.concat(GesundheitszeugnisseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Gesundheitszeugnisse>)QueryUtil.list(
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
	 * Removes all the gesundheitszeugnisses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Gesundheitszeugnisse gesundheitszeugnisse : findAll()) {
			remove(gesundheitszeugnisse);
		}
	}

	/**
	 * Returns the number of gesundheitszeugnisses.
	 *
	 * @return the number of gesundheitszeugnisses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_GESUNDHEITSZEUGNISSE);

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
		return "gesundheitszeugnisse_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GESUNDHEITSZEUGNISSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GesundheitszeugnisseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the gesundheitszeugnisse persistence.
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

		_setGesundheitszeugnisseUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setGesundheitszeugnisseUtilPersistence(null);

		entityCache.removeCache(GesundheitszeugnisseImpl.class.getName());
	}

	private void _setGesundheitszeugnisseUtilPersistence(
		GesundheitszeugnissePersistence gesundheitszeugnissePersistence) {

		try {
			Field field = GesundheitszeugnisseUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, gesundheitszeugnissePersistence);
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

	private static final String _SQL_SELECT_GESUNDHEITSZEUGNISSE =
		"SELECT gesundheitszeugnisse FROM Gesundheitszeugnisse gesundheitszeugnisse";

	private static final String _SQL_COUNT_GESUNDHEITSZEUGNISSE =
		"SELECT COUNT(gesundheitszeugnisse) FROM Gesundheitszeugnisse gesundheitszeugnisse";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"gesundheitszeugnisse.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Gesundheitszeugnisse exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		GesundheitszeugnissePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private GesundheitszeugnisseModelArgumentsResolver
		_gesundheitszeugnisseModelArgumentsResolver;

}