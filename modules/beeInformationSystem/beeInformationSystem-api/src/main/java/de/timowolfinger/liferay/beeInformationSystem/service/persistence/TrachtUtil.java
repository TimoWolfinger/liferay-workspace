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

import de.timowolfinger.liferay.beeInformationSystem.model.Tracht;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tracht service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.TrachtPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrachtPersistence
 * @generated
 */
public class TrachtUtil {

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
	public static void clearCache(Tracht tracht) {
		getPersistence().clearCache(tracht);
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
	public static Map<Serializable, Tracht> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tracht> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tracht> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tracht> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Tracht> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tracht update(Tracht tracht) {
		return getPersistence().update(tracht);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tracht update(Tracht tracht, ServiceContext serviceContext) {
		return getPersistence().update(tracht, serviceContext);
	}

	/**
	 * Caches the tracht in the entity cache if it is enabled.
	 *
	 * @param tracht the tracht
	 */
	public static void cacheResult(Tracht tracht) {
		getPersistence().cacheResult(tracht);
	}

	/**
	 * Caches the trachts in the entity cache if it is enabled.
	 *
	 * @param trachts the trachts
	 */
	public static void cacheResult(List<Tracht> trachts) {
		getPersistence().cacheResult(trachts);
	}

	/**
	 * Creates a new tracht with the primary key. Does not add the tracht to the database.
	 *
	 * @param tracht_id the primary key for the new tracht
	 * @return the new tracht
	 */
	public static Tracht create(long tracht_id) {
		return getPersistence().create(tracht_id);
	}

	/**
	 * Removes the tracht with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tracht_id the primary key of the tracht
	 * @return the tracht that was removed
	 * @throws NoSuchTrachtException if a tracht with the primary key could not be found
	 */
	public static Tracht remove(long tracht_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchTrachtException {

		return getPersistence().remove(tracht_id);
	}

	public static Tracht updateImpl(Tracht tracht) {
		return getPersistence().updateImpl(tracht);
	}

	/**
	 * Returns the tracht with the primary key or throws a <code>NoSuchTrachtException</code> if it could not be found.
	 *
	 * @param tracht_id the primary key of the tracht
	 * @return the tracht
	 * @throws NoSuchTrachtException if a tracht with the primary key could not be found
	 */
	public static Tracht findByPrimaryKey(long tracht_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchTrachtException {

		return getPersistence().findByPrimaryKey(tracht_id);
	}

	/**
	 * Returns the tracht with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tracht_id the primary key of the tracht
	 * @return the tracht, or <code>null</code> if a tracht with the primary key could not be found
	 */
	public static Tracht fetchByPrimaryKey(long tracht_id) {
		return getPersistence().fetchByPrimaryKey(tracht_id);
	}

	/**
	 * Returns all the trachts.
	 *
	 * @return the trachts
	 */
	public static List<Tracht> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the trachts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TrachtModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachts
	 * @param end the upper bound of the range of trachts (not inclusive)
	 * @return the range of trachts
	 */
	public static List<Tracht> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the trachts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TrachtModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachts
	 * @param end the upper bound of the range of trachts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trachts
	 */
	public static List<Tracht> findAll(
		int start, int end, OrderByComparator<Tracht> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the trachts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TrachtModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachts
	 * @param end the upper bound of the range of trachts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of trachts
	 */
	public static List<Tracht> findAll(
		int start, int end, OrderByComparator<Tracht> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the trachts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of trachts.
	 *
	 * @return the number of trachts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TrachtPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TrachtPersistence _persistence;

}