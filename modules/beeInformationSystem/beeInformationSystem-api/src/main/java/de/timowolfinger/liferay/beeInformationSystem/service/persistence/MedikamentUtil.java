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

import de.timowolfinger.liferay.beeInformationSystem.model.Medikament;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medikament service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.MedikamentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedikamentPersistence
 * @generated
 */
public class MedikamentUtil {

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
	public static void clearCache(Medikament medikament) {
		getPersistence().clearCache(medikament);
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
	public static Map<Serializable, Medikament> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Medikament> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Medikament> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Medikament> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Medikament> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Medikament update(Medikament medikament) {
		return getPersistence().update(medikament);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Medikament update(
		Medikament medikament, ServiceContext serviceContext) {

		return getPersistence().update(medikament, serviceContext);
	}

	/**
	 * Caches the medikament in the entity cache if it is enabled.
	 *
	 * @param medikament the medikament
	 */
	public static void cacheResult(Medikament medikament) {
		getPersistence().cacheResult(medikament);
	}

	/**
	 * Caches the medikaments in the entity cache if it is enabled.
	 *
	 * @param medikaments the medikaments
	 */
	public static void cacheResult(List<Medikament> medikaments) {
		getPersistence().cacheResult(medikaments);
	}

	/**
	 * Creates a new medikament with the primary key. Does not add the medikament to the database.
	 *
	 * @param medikament_id the primary key for the new medikament
	 * @return the new medikament
	 */
	public static Medikament create(long medikament_id) {
		return getPersistence().create(medikament_id);
	}

	/**
	 * Removes the medikament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament that was removed
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	public static Medikament remove(long medikament_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchMedikamentException {

		return getPersistence().remove(medikament_id);
	}

	public static Medikament updateImpl(Medikament medikament) {
		return getPersistence().updateImpl(medikament);
	}

	/**
	 * Returns the medikament with the primary key or throws a <code>NoSuchMedikamentException</code> if it could not be found.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	public static Medikament findByPrimaryKey(long medikament_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchMedikamentException {

		return getPersistence().findByPrimaryKey(medikament_id);
	}

	/**
	 * Returns the medikament with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament, or <code>null</code> if a medikament with the primary key could not be found
	 */
	public static Medikament fetchByPrimaryKey(long medikament_id) {
		return getPersistence().fetchByPrimaryKey(medikament_id);
	}

	/**
	 * Returns all the medikaments.
	 *
	 * @return the medikaments
	 */
	public static List<Medikament> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @return the range of medikaments
	 */
	public static List<Medikament> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medikaments
	 */
	public static List<Medikament> findAll(
		int start, int end, OrderByComparator<Medikament> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medikaments
	 */
	public static List<Medikament> findAll(
		int start, int end, OrderByComparator<Medikament> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medikaments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medikaments.
	 *
	 * @return the number of medikaments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedikamentPersistence getPersistence() {
		return _persistence;
	}

	private static volatile MedikamentPersistence _persistence;

}