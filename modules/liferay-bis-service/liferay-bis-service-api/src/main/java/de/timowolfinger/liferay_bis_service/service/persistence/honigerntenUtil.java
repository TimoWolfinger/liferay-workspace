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

import de.timowolfinger.liferay_bis_service.model.honigernten;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the honigernten service. This utility wraps <code>de.timowolfinger.liferay_bis_service.service.persistence.impl.honigerntenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see honigerntenPersistence
 * @generated
 */
public class honigerntenUtil {

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
	public static void clearCache(honigernten honigernten) {
		getPersistence().clearCache(honigernten);
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
	public static Map<Serializable, honigernten> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<honigernten> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<honigernten> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<honigernten> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<honigernten> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static honigernten update(honigernten honigernten) {
		return getPersistence().update(honigernten);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static honigernten update(
		honigernten honigernten, ServiceContext serviceContext) {

		return getPersistence().update(honigernten, serviceContext);
	}

	/**
	 * Caches the honigernten in the entity cache if it is enabled.
	 *
	 * @param honigernten the honigernten
	 */
	public static void cacheResult(honigernten honigernten) {
		getPersistence().cacheResult(honigernten);
	}

	/**
	 * Caches the honigerntens in the entity cache if it is enabled.
	 *
	 * @param honigerntens the honigerntens
	 */
	public static void cacheResult(List<honigernten> honigerntens) {
		getPersistence().cacheResult(honigerntens);
	}

	/**
	 * Creates a new honigernten with the primary key. Does not add the honigernten to the database.
	 *
	 * @param id the primary key for the new honigernten
	 * @return the new honigernten
	 */
	public static honigernten create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws NoSuchhonigerntenException if a honigernten with the primary key could not be found
	 */
	public static honigernten remove(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchhonigerntenException {

		return getPersistence().remove(id);
	}

	public static honigernten updateImpl(honigernten honigernten) {
		return getPersistence().updateImpl(honigernten);
	}

	/**
	 * Returns the honigernten with the primary key or throws a <code>NoSuchhonigerntenException</code> if it could not be found.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten
	 * @throws NoSuchhonigerntenException if a honigernten with the primary key could not be found
	 */
	public static honigernten findByPrimaryKey(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchhonigerntenException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the honigernten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten, or <code>null</code> if a honigernten with the primary key could not be found
	 */
	public static honigernten fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the honigerntens.
	 *
	 * @return the honigerntens
	 */
	public static List<honigernten> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @return the range of honigerntens
	 */
	public static List<honigernten> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of honigerntens
	 */
	public static List<honigernten> findAll(
		int start, int end, OrderByComparator<honigernten> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of honigerntens
	 */
	public static List<honigernten> findAll(
		int start, int end, OrderByComparator<honigernten> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the honigerntens from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of honigerntens.
	 *
	 * @return the number of honigerntens
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static honigerntenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<honigerntenPersistence, honigerntenPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(honigerntenPersistence.class);

		ServiceTracker<honigerntenPersistence, honigerntenPersistence>
			serviceTracker =
				new ServiceTracker
					<honigerntenPersistence, honigerntenPersistence>(
						bundle.getBundleContext(), honigerntenPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}