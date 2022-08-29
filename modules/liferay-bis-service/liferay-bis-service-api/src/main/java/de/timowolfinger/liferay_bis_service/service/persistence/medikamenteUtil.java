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

import de.timowolfinger.liferay_bis_service.model.medikamente;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the medikamente service. This utility wraps <code>de.timowolfinger.liferay_bis_service.service.persistence.impl.medikamentePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see medikamentePersistence
 * @generated
 */
public class medikamenteUtil {

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
	public static void clearCache(medikamente medikamente) {
		getPersistence().clearCache(medikamente);
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
	public static Map<Serializable, medikamente> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<medikamente> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<medikamente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<medikamente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<medikamente> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static medikamente update(medikamente medikamente) {
		return getPersistence().update(medikamente);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static medikamente update(
		medikamente medikamente, ServiceContext serviceContext) {

		return getPersistence().update(medikamente, serviceContext);
	}

	/**
	 * Caches the medikamente in the entity cache if it is enabled.
	 *
	 * @param medikamente the medikamente
	 */
	public static void cacheResult(medikamente medikamente) {
		getPersistence().cacheResult(medikamente);
	}

	/**
	 * Caches the medikamentes in the entity cache if it is enabled.
	 *
	 * @param medikamentes the medikamentes
	 */
	public static void cacheResult(List<medikamente> medikamentes) {
		getPersistence().cacheResult(medikamentes);
	}

	/**
	 * Creates a new medikamente with the primary key. Does not add the medikamente to the database.
	 *
	 * @param id the primary key for the new medikamente
	 * @return the new medikamente
	 */
	public static medikamente create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the medikamente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the medikamente
	 * @return the medikamente that was removed
	 * @throws NoSuchmedikamenteException if a medikamente with the primary key could not be found
	 */
	public static medikamente remove(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchmedikamenteException {

		return getPersistence().remove(id);
	}

	public static medikamente updateImpl(medikamente medikamente) {
		return getPersistence().updateImpl(medikamente);
	}

	/**
	 * Returns the medikamente with the primary key or throws a <code>NoSuchmedikamenteException</code> if it could not be found.
	 *
	 * @param id the primary key of the medikamente
	 * @return the medikamente
	 * @throws NoSuchmedikamenteException if a medikamente with the primary key could not be found
	 */
	public static medikamente findByPrimaryKey(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchmedikamenteException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the medikamente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the medikamente
	 * @return the medikamente, or <code>null</code> if a medikamente with the primary key could not be found
	 */
	public static medikamente fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the medikamentes.
	 *
	 * @return the medikamentes
	 */
	public static List<medikamente> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>medikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @return the range of medikamentes
	 */
	public static List<medikamente> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>medikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medikamentes
	 */
	public static List<medikamente> findAll(
		int start, int end, OrderByComparator<medikamente> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>medikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medikamentes
	 */
	public static List<medikamente> findAll(
		int start, int end, OrderByComparator<medikamente> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medikamentes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medikamentes.
	 *
	 * @return the number of medikamentes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static medikamentePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<medikamentePersistence, medikamentePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(medikamentePersistence.class);

		ServiceTracker<medikamentePersistence, medikamentePersistence>
			serviceTracker =
				new ServiceTracker
					<medikamentePersistence, medikamentePersistence>(
						bundle.getBundleContext(), medikamentePersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}