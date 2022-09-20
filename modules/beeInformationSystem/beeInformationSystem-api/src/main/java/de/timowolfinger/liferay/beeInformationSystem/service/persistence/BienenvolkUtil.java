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

import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bienenvolk service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.BienenvolkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BienenvolkPersistence
 * @generated
 */
public class BienenvolkUtil {

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
	public static void clearCache(Bienenvolk bienenvolk) {
		getPersistence().clearCache(bienenvolk);
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
	public static Map<Serializable, Bienenvolk> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bienenvolk> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bienenvolk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bienenvolk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bienenvolk> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bienenvolk update(Bienenvolk bienenvolk) {
		return getPersistence().update(bienenvolk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bienenvolk update(
		Bienenvolk bienenvolk, ServiceContext serviceContext) {

		return getPersistence().update(bienenvolk, serviceContext);
	}

	/**
	 * Caches the bienenvolk in the entity cache if it is enabled.
	 *
	 * @param bienenvolk the bienenvolk
	 */
	public static void cacheResult(Bienenvolk bienenvolk) {
		getPersistence().cacheResult(bienenvolk);
	}

	/**
	 * Caches the bienenvolks in the entity cache if it is enabled.
	 *
	 * @param bienenvolks the bienenvolks
	 */
	public static void cacheResult(List<Bienenvolk> bienenvolks) {
		getPersistence().cacheResult(bienenvolks);
	}

	/**
	 * Creates a new bienenvolk with the primary key. Does not add the bienenvolk to the database.
	 *
	 * @param bienenvolk_id the primary key for the new bienenvolk
	 * @return the new bienenvolk
	 */
	public static Bienenvolk create(long bienenvolk_id) {
		return getPersistence().create(bienenvolk_id);
	}

	/**
	 * Removes the bienenvolk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk that was removed
	 * @throws NoSuchBienenvolkException if a bienenvolk with the primary key could not be found
	 */
	public static Bienenvolk remove(long bienenvolk_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBienenvolkException {

		return getPersistence().remove(bienenvolk_id);
	}

	public static Bienenvolk updateImpl(Bienenvolk bienenvolk) {
		return getPersistence().updateImpl(bienenvolk);
	}

	/**
	 * Returns the bienenvolk with the primary key or throws a <code>NoSuchBienenvolkException</code> if it could not be found.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk
	 * @throws NoSuchBienenvolkException if a bienenvolk with the primary key could not be found
	 */
	public static Bienenvolk findByPrimaryKey(long bienenvolk_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBienenvolkException {

		return getPersistence().findByPrimaryKey(bienenvolk_id);
	}

	/**
	 * Returns the bienenvolk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk, or <code>null</code> if a bienenvolk with the primary key could not be found
	 */
	public static Bienenvolk fetchByPrimaryKey(long bienenvolk_id) {
		return getPersistence().fetchByPrimaryKey(bienenvolk_id);
	}

	/**
	 * Returns all the bienenvolks.
	 *
	 * @return the bienenvolks
	 */
	public static List<Bienenvolk> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @return the range of bienenvolks
	 */
	public static List<Bienenvolk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenvolks
	 */
	public static List<Bienenvolk> findAll(
		int start, int end, OrderByComparator<Bienenvolk> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenvolks
	 */
	public static List<Bienenvolk> findAll(
		int start, int end, OrderByComparator<Bienenvolk> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bienenvolks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bienenvolks.
	 *
	 * @return the number of bienenvolks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BienenvolkPersistence getPersistence() {
		return _persistence;
	}

	private static volatile BienenvolkPersistence _persistence;

}