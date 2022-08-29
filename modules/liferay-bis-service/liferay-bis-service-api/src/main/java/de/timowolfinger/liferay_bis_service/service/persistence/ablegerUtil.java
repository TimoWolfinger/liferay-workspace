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

import de.timowolfinger.liferay_bis_service.model.ableger;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the ableger service. This utility wraps <code>de.timowolfinger.liferay_bis_service.service.persistence.impl.ablegerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ablegerPersistence
 * @generated
 */
public class ablegerUtil {

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
	public static void clearCache(ableger ableger) {
		getPersistence().clearCache(ableger);
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
	public static Map<Serializable, ableger> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ableger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ableger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ableger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ableger> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ableger update(ableger ableger) {
		return getPersistence().update(ableger);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ableger update(
		ableger ableger, ServiceContext serviceContext) {

		return getPersistence().update(ableger, serviceContext);
	}

	/**
	 * Caches the ableger in the entity cache if it is enabled.
	 *
	 * @param ableger the ableger
	 */
	public static void cacheResult(ableger ableger) {
		getPersistence().cacheResult(ableger);
	}

	/**
	 * Caches the ablegers in the entity cache if it is enabled.
	 *
	 * @param ablegers the ablegers
	 */
	public static void cacheResult(List<ableger> ablegers) {
		getPersistence().cacheResult(ablegers);
	}

	/**
	 * Creates a new ableger with the primary key. Does not add the ableger to the database.
	 *
	 * @param id the primary key for the new ableger
	 * @return the new ableger
	 */
	public static ableger create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the ableger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger that was removed
	 * @throws NoSuchablegerException if a ableger with the primary key could not be found
	 */
	public static ableger remove(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchablegerException {

		return getPersistence().remove(id);
	}

	public static ableger updateImpl(ableger ableger) {
		return getPersistence().updateImpl(ableger);
	}

	/**
	 * Returns the ableger with the primary key or throws a <code>NoSuchablegerException</code> if it could not be found.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger
	 * @throws NoSuchablegerException if a ableger with the primary key could not be found
	 */
	public static ableger findByPrimaryKey(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchablegerException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the ableger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger, or <code>null</code> if a ableger with the primary key could not be found
	 */
	public static ableger fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the ablegers.
	 *
	 * @return the ablegers
	 */
	public static List<ableger> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @return the range of ablegers
	 */
	public static List<ableger> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ablegers
	 */
	public static List<ableger> findAll(
		int start, int end, OrderByComparator<ableger> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ablegers
	 */
	public static List<ableger> findAll(
		int start, int end, OrderByComparator<ableger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ablegers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ablegers.
	 *
	 * @return the number of ablegers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ablegerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ablegerPersistence, ablegerPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ablegerPersistence.class);

		ServiceTracker<ablegerPersistence, ablegerPersistence> serviceTracker =
			new ServiceTracker<ablegerPersistence, ablegerPersistence>(
				bundle.getBundleContext(), ablegerPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}