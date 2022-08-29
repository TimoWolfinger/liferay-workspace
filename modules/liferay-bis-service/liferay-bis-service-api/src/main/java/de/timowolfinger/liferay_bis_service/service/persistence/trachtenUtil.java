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

package de.timowolfinger.liferay_bis_service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import de.timowolfinger.liferay_bis_service.model.trachten;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the trachten service. This utility wraps <code>de.timowolfinger.liferay_bis_service.service.persistence.impl.trachtenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see trachtenPersistence
 * @generated
 */
public class trachtenUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(trachten trachten) {
		getPersistence().clearCache(trachten);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, trachten> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<trachten> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<trachten> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<trachten> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<trachten> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static trachten update(trachten trachten) {
		return getPersistence().update(trachten);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static trachten update(
		trachten trachten, ServiceContext serviceContext) {

		return getPersistence().update(trachten, serviceContext);
	}

	/**
	 * Caches the trachten in the entity cache if it is enabled.
	 *
	 * @param trachten the trachten
	 */
	public static void cacheResult(trachten trachten) {
		getPersistence().cacheResult(trachten);
	}

	/**
	 * Caches the trachtens in the entity cache if it is enabled.
	 *
	 * @param trachtens the trachtens
	 */
	public static void cacheResult(List<trachten> trachtens) {
		getPersistence().cacheResult(trachtens);
	}

	/**
	 * Creates a new trachten with the primary key. Does not add the trachten to the database.
	 *
	 * @param id the primary key for the new trachten
	 * @return the new trachten
	 */
	public static trachten create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the trachten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the trachten
	 * @return the trachten that was removed
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	public static trachten remove(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchtrachtenException {

		return getPersistence().remove(id);
	}

	public static trachten updateImpl(trachten trachten) {
		return getPersistence().updateImpl(trachten);
	}

	/**
	 * Returns the trachten with the primary key or throws a <code>NoSuchtrachtenException</code> if it could not be found.
	 *
	 * @param id the primary key of the trachten
	 * @return the trachten
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	public static trachten findByPrimaryKey(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchtrachtenException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the trachten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the trachten
	 * @return the trachten, or <code>null</code> if a trachten with the primary key could not be found
	 */
	public static trachten fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the trachtens.
	 *
	 * @return the trachtens
	 */
	public static List<trachten> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @return the range of trachtens
	 */
	public static List<trachten> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trachtens
	 */
	public static List<trachten> findAll(
		int start, int end, OrderByComparator<trachten> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of trachtens
	 */
	public static List<trachten> findAll(
		int start, int end, OrderByComparator<trachten> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the trachtens from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of trachtens.
	 *
	 * @return the number of trachtens
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static trachtenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<trachtenPersistence, trachtenPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(trachtenPersistence.class);

		ServiceTracker<trachtenPersistence, trachtenPersistence>
			serviceTracker =
				new ServiceTracker<trachtenPersistence, trachtenPersistence>(
					bundle.getBundleContext(), trachtenPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}