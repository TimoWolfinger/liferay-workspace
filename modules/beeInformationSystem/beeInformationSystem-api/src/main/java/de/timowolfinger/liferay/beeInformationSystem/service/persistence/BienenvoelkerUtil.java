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

import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bienenvoelker service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.BienenvoelkerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BienenvoelkerPersistence
 * @generated
 */
public class BienenvoelkerUtil {

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
	public static void clearCache(Bienenvoelker bienenvoelker) {
		getPersistence().clearCache(bienenvoelker);
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
	public static Map<Serializable, Bienenvoelker> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bienenvoelker> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bienenvoelker> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bienenvoelker> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bienenvoelker> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bienenvoelker update(Bienenvoelker bienenvoelker) {
		return getPersistence().update(bienenvoelker);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bienenvoelker update(
		Bienenvoelker bienenvoelker, ServiceContext serviceContext) {

		return getPersistence().update(bienenvoelker, serviceContext);
	}

	/**
	 * Caches the bienenvoelker in the entity cache if it is enabled.
	 *
	 * @param bienenvoelker the bienenvoelker
	 */
	public static void cacheResult(Bienenvoelker bienenvoelker) {
		getPersistence().cacheResult(bienenvoelker);
	}

	/**
	 * Caches the bienenvoelkers in the entity cache if it is enabled.
	 *
	 * @param bienenvoelkers the bienenvoelkers
	 */
	public static void cacheResult(List<Bienenvoelker> bienenvoelkers) {
		getPersistence().cacheResult(bienenvoelkers);
	}

	/**
	 * Creates a new bienenvoelker with the primary key. Does not add the bienenvoelker to the database.
	 *
	 * @param bienenvoelker_id the primary key for the new bienenvoelker
	 * @return the new bienenvoelker
	 */
	public static Bienenvoelker create(long bienenvoelker_id) {
		return getPersistence().create(bienenvoelker_id);
	}

	/**
	 * Removes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws NoSuchBienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	public static Bienenvoelker remove(long bienenvoelker_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBienenvoelkerException {

		return getPersistence().remove(bienenvoelker_id);
	}

	public static Bienenvoelker updateImpl(Bienenvoelker bienenvoelker) {
		return getPersistence().updateImpl(bienenvoelker);
	}

	/**
	 * Returns the bienenvoelker with the primary key or throws a <code>NoSuchBienenvoelkerException</code> if it could not be found.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws NoSuchBienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	public static Bienenvoelker findByPrimaryKey(long bienenvoelker_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBienenvoelkerException {

		return getPersistence().findByPrimaryKey(bienenvoelker_id);
	}

	/**
	 * Returns the bienenvoelker with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker, or <code>null</code> if a bienenvoelker with the primary key could not be found
	 */
	public static Bienenvoelker fetchByPrimaryKey(long bienenvoelker_id) {
		return getPersistence().fetchByPrimaryKey(bienenvoelker_id);
	}

	/**
	 * Returns all the bienenvoelkers.
	 *
	 * @return the bienenvoelkers
	 */
	public static List<Bienenvoelker> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @return the range of bienenvoelkers
	 */
	public static List<Bienenvoelker> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenvoelkers
	 */
	public static List<Bienenvoelker> findAll(
		int start, int end,
		OrderByComparator<Bienenvoelker> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenvoelkers
	 */
	public static List<Bienenvoelker> findAll(
		int start, int end, OrderByComparator<Bienenvoelker> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bienenvoelkers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bienenvoelkers.
	 *
	 * @return the number of bienenvoelkers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BienenvoelkerPersistence getPersistence() {
		return _persistence;
	}

	private static volatile BienenvoelkerPersistence _persistence;

}