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

package de.timowolfinger.liferay.beeInformationSystem.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import de.timowolfinger.liferay.beeInformationSystem.model.Beutemass;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the beutemass service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.BeutemassPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BeutemassPersistence
 * @generated
 */
public class BeutemassUtil {

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
	public static void clearCache(Beutemass beutemass) {
		getPersistence().clearCache(beutemass);
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
	public static Map<Serializable, Beutemass> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Beutemass> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Beutemass> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Beutemass> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Beutemass> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Beutemass update(Beutemass beutemass) {
		return getPersistence().update(beutemass);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Beutemass update(
		Beutemass beutemass, ServiceContext serviceContext) {

		return getPersistence().update(beutemass, serviceContext);
	}

	/**
	 * Caches the beutemass in the entity cache if it is enabled.
	 *
	 * @param beutemass the beutemass
	 */
	public static void cacheResult(Beutemass beutemass) {
		getPersistence().cacheResult(beutemass);
	}

	/**
	 * Caches the beutemasses in the entity cache if it is enabled.
	 *
	 * @param beutemasses the beutemasses
	 */
	public static void cacheResult(List<Beutemass> beutemasses) {
		getPersistence().cacheResult(beutemasses);
	}

	/**
	 * Creates a new beutemass with the primary key. Does not add the beutemass to the database.
	 *
	 * @param beutemass_id the primary key for the new beutemass
	 * @return the new beutemass
	 */
	public static Beutemass create(long beutemass_id) {
		return getPersistence().create(beutemass_id);
	}

	/**
	 * Removes the beutemass with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass that was removed
	 * @throws NoSuchBeutemassException if a beutemass with the primary key could not be found
	 */
	public static Beutemass remove(long beutemass_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBeutemassException {

		return getPersistence().remove(beutemass_id);
	}

	public static Beutemass updateImpl(Beutemass beutemass) {
		return getPersistence().updateImpl(beutemass);
	}

	/**
	 * Returns the beutemass with the primary key or throws a <code>NoSuchBeutemassException</code> if it could not be found.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass
	 * @throws NoSuchBeutemassException if a beutemass with the primary key could not be found
	 */
	public static Beutemass findByPrimaryKey(long beutemass_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBeutemassException {

		return getPersistence().findByPrimaryKey(beutemass_id);
	}

	/**
	 * Returns the beutemass with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass, or <code>null</code> if a beutemass with the primary key could not be found
	 */
	public static Beutemass fetchByPrimaryKey(long beutemass_id) {
		return getPersistence().fetchByPrimaryKey(beutemass_id);
	}

	/**
	 * Returns all the beutemasses.
	 *
	 * @return the beutemasses
	 */
	public static List<Beutemass> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BeutemassModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	public static List<Beutemass> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BeutemassModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of beutemasses
	 */
	public static List<Beutemass> findAll(
		int start, int end, OrderByComparator<Beutemass> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BeutemassModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of beutemasses
	 */
	public static List<Beutemass> findAll(
		int start, int end, OrderByComparator<Beutemass> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the beutemasses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BeutemassPersistence getPersistence() {
		return _persistence;
	}

	private static volatile BeutemassPersistence _persistence;

}