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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchVoelkerentwicklungException;
import de.timowolfinger.liferay.beeInformationSystem.model.Voelkerentwicklung;
import de.timowolfinger.liferay.beeInformationSystem.model.VoelkerentwicklungTable;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.VoelkerentwicklungImpl;
import de.timowolfinger.liferay.beeInformationSystem.model.impl.VoelkerentwicklungModelImpl;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.VoelkerentwicklungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.VoelkerentwicklungUtil;
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
 * The persistence implementation for the voelkerentwicklung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {VoelkerentwicklungPersistence.class, BasePersistence.class}
)
public class VoelkerentwicklungPersistenceImpl
	extends BasePersistenceImpl<Voelkerentwicklung>
	implements VoelkerentwicklungPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VoelkerentwicklungUtil</code> to access the voelkerentwicklung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VoelkerentwicklungImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public VoelkerentwicklungPersistenceImpl() {
		setModelClass(Voelkerentwicklung.class);

		setModelImplClass(VoelkerentwicklungImpl.class);
		setModelPKClass(long.class);

		setTable(VoelkerentwicklungTable.INSTANCE);
	}

	/**
	 * Caches the voelkerentwicklung in the entity cache if it is enabled.
	 *
	 * @param voelkerentwicklung the voelkerentwicklung
	 */
	@Override
	public void cacheResult(Voelkerentwicklung voelkerentwicklung) {
		entityCache.putResult(
			VoelkerentwicklungImpl.class, voelkerentwicklung.getPrimaryKey(),
			voelkerentwicklung);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the voelkerentwicklungs in the entity cache if it is enabled.
	 *
	 * @param voelkerentwicklungs the voelkerentwicklungs
	 */
	@Override
	public void cacheResult(List<Voelkerentwicklung> voelkerentwicklungs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (voelkerentwicklungs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Voelkerentwicklung voelkerentwicklung : voelkerentwicklungs) {
			if (entityCache.getResult(
					VoelkerentwicklungImpl.class,
					voelkerentwicklung.getPrimaryKey()) == null) {

				cacheResult(voelkerentwicklung);
			}
		}
	}

	/**
	 * Clears the cache for all voelkerentwicklungs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VoelkerentwicklungImpl.class);

		finderCache.clearCache(VoelkerentwicklungImpl.class);
	}

	/**
	 * Clears the cache for the voelkerentwicklung.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Voelkerentwicklung voelkerentwicklung) {
		entityCache.removeResult(
			VoelkerentwicklungImpl.class, voelkerentwicklung);
	}

	@Override
	public void clearCache(List<Voelkerentwicklung> voelkerentwicklungs) {
		for (Voelkerentwicklung voelkerentwicklung : voelkerentwicklungs) {
			entityCache.removeResult(
				VoelkerentwicklungImpl.class, voelkerentwicklung);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(VoelkerentwicklungImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(VoelkerentwicklungImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new voelkerentwicklung with the primary key. Does not add the voelkerentwicklung to the database.
	 *
	 * @param voelkerentwicklung_id the primary key for the new voelkerentwicklung
	 * @return the new voelkerentwicklung
	 */
	@Override
	public Voelkerentwicklung create(long voelkerentwicklung_id) {
		Voelkerentwicklung voelkerentwicklung = new VoelkerentwicklungImpl();

		voelkerentwicklung.setNew(true);
		voelkerentwicklung.setPrimaryKey(voelkerentwicklung_id);

		return voelkerentwicklung;
	}

	/**
	 * Removes the voelkerentwicklung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung that was removed
	 * @throws NoSuchVoelkerentwicklungException if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public Voelkerentwicklung remove(long voelkerentwicklung_id)
		throws NoSuchVoelkerentwicklungException {

		return remove((Serializable)voelkerentwicklung_id);
	}

	/**
	 * Removes the voelkerentwicklung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung that was removed
	 * @throws NoSuchVoelkerentwicklungException if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public Voelkerentwicklung remove(Serializable primaryKey)
		throws NoSuchVoelkerentwicklungException {

		Session session = null;

		try {
			session = openSession();

			Voelkerentwicklung voelkerentwicklung =
				(Voelkerentwicklung)session.get(
					VoelkerentwicklungImpl.class, primaryKey);

			if (voelkerentwicklung == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVoelkerentwicklungException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(voelkerentwicklung);
		}
		catch (NoSuchVoelkerentwicklungException noSuchEntityException) {
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
	protected Voelkerentwicklung removeImpl(
		Voelkerentwicklung voelkerentwicklung) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(voelkerentwicklung)) {
				voelkerentwicklung = (Voelkerentwicklung)session.get(
					VoelkerentwicklungImpl.class,
					voelkerentwicklung.getPrimaryKeyObj());
			}

			if (voelkerentwicklung != null) {
				session.delete(voelkerentwicklung);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (voelkerentwicklung != null) {
			clearCache(voelkerentwicklung);
		}

		return voelkerentwicklung;
	}

	@Override
	public Voelkerentwicklung updateImpl(
		Voelkerentwicklung voelkerentwicklung) {

		boolean isNew = voelkerentwicklung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(voelkerentwicklung);
			}
			else {
				voelkerentwicklung = (Voelkerentwicklung)session.merge(
					voelkerentwicklung);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			VoelkerentwicklungImpl.class, voelkerentwicklung, false, true);

		if (isNew) {
			voelkerentwicklung.setNew(false);
		}

		voelkerentwicklung.resetOriginalValues();

		return voelkerentwicklung;
	}

	/**
	 * Returns the voelkerentwicklung with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung
	 * @throws NoSuchVoelkerentwicklungException if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public Voelkerentwicklung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVoelkerentwicklungException {

		Voelkerentwicklung voelkerentwicklung = fetchByPrimaryKey(primaryKey);

		if (voelkerentwicklung == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVoelkerentwicklungException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return voelkerentwicklung;
	}

	/**
	 * Returns the voelkerentwicklung with the primary key or throws a <code>NoSuchVoelkerentwicklungException</code> if it could not be found.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung
	 * @throws NoSuchVoelkerentwicklungException if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public Voelkerentwicklung findByPrimaryKey(long voelkerentwicklung_id)
		throws NoSuchVoelkerentwicklungException {

		return findByPrimaryKey((Serializable)voelkerentwicklung_id);
	}

	/**
	 * Returns the voelkerentwicklung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung, or <code>null</code> if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public Voelkerentwicklung fetchByPrimaryKey(long voelkerentwicklung_id) {
		return fetchByPrimaryKey((Serializable)voelkerentwicklung_id);
	}

	/**
	 * Returns all the voelkerentwicklungs.
	 *
	 * @return the voelkerentwicklungs
	 */
	@Override
	public List<Voelkerentwicklung> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VoelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @return the range of voelkerentwicklungs
	 */
	@Override
	public List<Voelkerentwicklung> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VoelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of voelkerentwicklungs
	 */
	@Override
	public List<Voelkerentwicklung> findAll(
		int start, int end,
		OrderByComparator<Voelkerentwicklung> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VoelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of voelkerentwicklungs
	 */
	@Override
	public List<Voelkerentwicklung> findAll(
		int start, int end,
		OrderByComparator<Voelkerentwicklung> orderByComparator,
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

		List<Voelkerentwicklung> list = null;

		if (useFinderCache) {
			list = (List<Voelkerentwicklung>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VOELKERENTWICKLUNG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VOELKERENTWICKLUNG;

				sql = sql.concat(VoelkerentwicklungModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Voelkerentwicklung>)QueryUtil.list(
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
	 * Removes all the voelkerentwicklungs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Voelkerentwicklung voelkerentwicklung : findAll()) {
			remove(voelkerentwicklung);
		}
	}

	/**
	 * Returns the number of voelkerentwicklungs.
	 *
	 * @return the number of voelkerentwicklungs
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
					_SQL_COUNT_VOELKERENTWICKLUNG);

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
		return "voelkerentwicklung_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VOELKERENTWICKLUNG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VoelkerentwicklungModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the voelkerentwicklung persistence.
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

		_setVoelkerentwicklungUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setVoelkerentwicklungUtilPersistence(null);

		entityCache.removeCache(VoelkerentwicklungImpl.class.getName());
	}

	private void _setVoelkerentwicklungUtilPersistence(
		VoelkerentwicklungPersistence voelkerentwicklungPersistence) {

		try {
			Field field = VoelkerentwicklungUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, voelkerentwicklungPersistence);
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

	private static final String _SQL_SELECT_VOELKERENTWICKLUNG =
		"SELECT voelkerentwicklung FROM Voelkerentwicklung voelkerentwicklung";

	private static final String _SQL_COUNT_VOELKERENTWICKLUNG =
		"SELECT COUNT(voelkerentwicklung) FROM Voelkerentwicklung voelkerentwicklung";

	private static final String _ORDER_BY_ENTITY_ALIAS = "voelkerentwicklung.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Voelkerentwicklung exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		VoelkerentwicklungPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private VoelkerentwicklungModelArgumentsResolver
		_voelkerentwicklungModelArgumentsResolver;

}