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

import de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the gesundheitszeugnisse service. This utility wraps <code>de.timowolfinger.liferay_bis_service.service.persistence.impl.gesundheitszeugnissePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gesundheitszeugnissePersistence
 * @generated
 */
public class gesundheitszeugnisseUtil {

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
	public static void clearCache(gesundheitszeugnisse gesundheitszeugnisse) {
		getPersistence().clearCache(gesundheitszeugnisse);
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
	public static Map<Serializable, gesundheitszeugnisse> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<gesundheitszeugnisse> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<gesundheitszeugnisse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<gesundheitszeugnisse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<gesundheitszeugnisse> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static gesundheitszeugnisse update(
		gesundheitszeugnisse gesundheitszeugnisse) {

		return getPersistence().update(gesundheitszeugnisse);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static gesundheitszeugnisse update(
		gesundheitszeugnisse gesundheitszeugnisse,
		ServiceContext serviceContext) {

		return getPersistence().update(gesundheitszeugnisse, serviceContext);
	}

	/**
	 * Caches the gesundheitszeugnisse in the entity cache if it is enabled.
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 */
	public static void cacheResult(gesundheitszeugnisse gesundheitszeugnisse) {
		getPersistence().cacheResult(gesundheitszeugnisse);
	}

	/**
	 * Caches the gesundheitszeugnisses in the entity cache if it is enabled.
	 *
	 * @param gesundheitszeugnisses the gesundheitszeugnisses
	 */
	public static void cacheResult(
		List<gesundheitszeugnisse> gesundheitszeugnisses) {

		getPersistence().cacheResult(gesundheitszeugnisses);
	}

	/**
	 * Creates a new gesundheitszeugnisse with the primary key. Does not add the gesundheitszeugnisse to the database.
	 *
	 * @param id the primary key for the new gesundheitszeugnisse
	 * @return the new gesundheitszeugnisse
	 */
	public static gesundheitszeugnisse create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the gesundheitszeugnisse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 * @throws NoSuchgesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	public static gesundheitszeugnisse remove(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchgesundheitszeugnisseException {

		return getPersistence().remove(id);
	}

	public static gesundheitszeugnisse updateImpl(
		gesundheitszeugnisse gesundheitszeugnisse) {

		return getPersistence().updateImpl(gesundheitszeugnisse);
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key or throws a <code>NoSuchgesundheitszeugnisseException</code> if it could not be found.
	 *
	 * @param id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse
	 * @throws NoSuchgesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	public static gesundheitszeugnisse findByPrimaryKey(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchgesundheitszeugnisseException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse, or <code>null</code> if a gesundheitszeugnisse with the primary key could not be found
	 */
	public static gesundheitszeugnisse fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the gesundheitszeugnisses.
	 *
	 * @return the gesundheitszeugnisses
	 */
	public static List<gesundheitszeugnisse> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>gesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @return the range of gesundheitszeugnisses
	 */
	public static List<gesundheitszeugnisse> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>gesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gesundheitszeugnisses
	 */
	public static List<gesundheitszeugnisse> findAll(
		int start, int end,
		OrderByComparator<gesundheitszeugnisse> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>gesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gesundheitszeugnisses
	 */
	public static List<gesundheitszeugnisse> findAll(
		int start, int end,
		OrderByComparator<gesundheitszeugnisse> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the gesundheitszeugnisses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of gesundheitszeugnisses.
	 *
	 * @return the number of gesundheitszeugnisses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static gesundheitszeugnissePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<gesundheitszeugnissePersistence, gesundheitszeugnissePersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			gesundheitszeugnissePersistence.class);

		ServiceTracker
			<gesundheitszeugnissePersistence, gesundheitszeugnissePersistence>
				serviceTracker =
					new ServiceTracker
						<gesundheitszeugnissePersistence,
						 gesundheitszeugnissePersistence>(
							 bundle.getBundleContext(),
							 gesundheitszeugnissePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}