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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchMedikamentException;
import de.timowolfinger.liferay.beeInformationSystem.model.Medikament;
import de.timowolfinger.liferay.beeInformationSystem.model.MedikamentTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamentImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamentModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.MedikamentPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.MedikamentUtil;
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
 * The persistence implementation for the medikament service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {MedikamentPersistence.class, BasePersistence.class})
public class MedikamentPersistenceImpl
	extends BasePersistenceImpl<Medikament> implements MedikamentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedikamentUtil</code> to access the medikament persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedikamentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public MedikamentPersistenceImpl() {
		setModelClass(Medikament.class);

		setModelImplClass(MedikamentImpl.class);
		setModelPKClass(long.class);

		setTable(MedikamentTable.INSTANCE);
	}

	/**
	 * Caches the medikament in the entity cache if it is enabled.
	 *
	 * @param medikament the medikament
	 */
	@Override
	public void cacheResult(Medikament medikament) {
		entityCache.putResult(
			MedikamentImpl.class, medikament.getPrimaryKey(), medikament);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medikaments in the entity cache if it is enabled.
	 *
	 * @param medikaments the medikaments
	 */
	@Override
	public void cacheResult(List<Medikament> medikaments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medikaments.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Medikament medikament : medikaments) {
			if (entityCache.getResult(
					MedikamentImpl.class, medikament.getPrimaryKey()) == null) {

				cacheResult(medikament);
			}
		}
	}

	/**
	 * Clears the cache for all medikaments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedikamentImpl.class);

		finderCache.clearCache(MedikamentImpl.class);
	}

	/**
	 * Clears the cache for the medikament.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Medikament medikament) {
		entityCache.removeResult(MedikamentImpl.class, medikament);
	}

	@Override
	public void clearCache(List<Medikament> medikaments) {
		for (Medikament medikament : medikaments) {
			entityCache.removeResult(MedikamentImpl.class, medikament);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedikamentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MedikamentImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new medikament with the primary key. Does not add the medikament to the database.
	 *
	 * @param medikament_id the primary key for the new medikament
	 * @return the new medikament
	 */
	@Override
	public Medikament create(long medikament_id) {
		Medikament medikament = new MedikamentImpl();

		medikament.setNew(true);
		medikament.setPrimaryKey(medikament_id);

		return medikament;
	}

	/**
	 * Removes the medikament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament that was removed
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	@Override
	public Medikament remove(long medikament_id)
		throws NoSuchMedikamentException {

		return remove((Serializable)medikament_id);
	}

	/**
	 * Removes the medikament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medikament
	 * @return the medikament that was removed
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	@Override
	public Medikament remove(Serializable primaryKey)
		throws NoSuchMedikamentException {

		Session session = null;

		try {
			session = openSession();

			Medikament medikament = (Medikament)session.get(
				MedikamentImpl.class, primaryKey);

			if (medikament == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedikamentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medikament);
		}
		catch (NoSuchMedikamentException noSuchEntityException) {
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
	protected Medikament removeImpl(Medikament medikament) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medikament)) {
				medikament = (Medikament)session.get(
					MedikamentImpl.class, medikament.getPrimaryKeyObj());
			}

			if (medikament != null) {
				session.delete(medikament);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medikament != null) {
			clearCache(medikament);
		}

		return medikament;
	}

	@Override
	public Medikament updateImpl(Medikament medikament) {
		boolean isNew = medikament.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medikament);
			}
			else {
				medikament = (Medikament)session.merge(medikament);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(MedikamentImpl.class, medikament, false, true);

		if (isNew) {
			medikament.setNew(false);
		}

		medikament.resetOriginalValues();

		return medikament;
	}

	/**
	 * Returns the medikament with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medikament
	 * @return the medikament
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	@Override
	public Medikament findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedikamentException {

		Medikament medikament = fetchByPrimaryKey(primaryKey);

		if (medikament == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedikamentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medikament;
	}

	/**
	 * Returns the medikament with the primary key or throws a <code>NoSuchMedikamentException</code> if it could not be found.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	@Override
	public Medikament findByPrimaryKey(long medikament_id)
		throws NoSuchMedikamentException {

		return findByPrimaryKey((Serializable)medikament_id);
	}

	/**
	 * Returns the medikament with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament, or <code>null</code> if a medikament with the primary key could not be found
	 */
	@Override
	public Medikament fetchByPrimaryKey(long medikament_id) {
		return fetchByPrimaryKey((Serializable)medikament_id);
	}

	/**
	 * Returns all the medikaments.
	 *
	 * @return the medikaments
	 */
	@Override
	public List<Medikament> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @return the range of medikaments
	 */
	@Override
	public List<Medikament> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medikaments
	 */
	@Override
	public List<Medikament> findAll(
		int start, int end, OrderByComparator<Medikament> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medikaments
	 */
	@Override
	public List<Medikament> findAll(
		int start, int end, OrderByComparator<Medikament> orderByComparator,
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

		List<Medikament> list = null;

		if (useFinderCache) {
			list = (List<Medikament>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDIKAMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDIKAMENT;

				sql = sql.concat(MedikamentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Medikament>)QueryUtil.list(
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
	 * Removes all the medikaments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Medikament medikament : findAll()) {
			remove(medikament);
		}
	}

	/**
	 * Returns the number of medikaments.
	 *
	 * @return the number of medikaments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MEDIKAMENT);

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
		return "medikament_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDIKAMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedikamentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medikament persistence.
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

		_setMedikamentUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setMedikamentUtilPersistence(null);

		entityCache.removeCache(MedikamentImpl.class.getName());
	}

	private void _setMedikamentUtilPersistence(
		MedikamentPersistence medikamentPersistence) {

		try {
			Field field = MedikamentUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, medikamentPersistence);
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

	private static final String _SQL_SELECT_MEDIKAMENT =
		"SELECT medikament FROM Medikament medikament";

	private static final String _SQL_COUNT_MEDIKAMENT =
		"SELECT COUNT(medikament) FROM Medikament medikament";

	private static final String _ORDER_BY_ENTITY_ALIAS = "medikament.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Medikament exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		MedikamentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private MedikamentModelArgumentsResolver _medikamentModelArgumentsResolver;

}