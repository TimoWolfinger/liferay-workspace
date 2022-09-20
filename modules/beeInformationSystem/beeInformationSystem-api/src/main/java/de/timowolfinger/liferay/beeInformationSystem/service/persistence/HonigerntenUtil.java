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

import de.timowolfinger.liferay.beeInformationSystem.model.Honigernten;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the honigernten service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.HonigerntenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HonigerntenPersistence
 * @generated
 */
public class HonigerntenUtil {

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
	public static void clearCache(Honigernten honigernten) {
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
	public static Map<Serializable, Honigernten> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Honigernten> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Honigernten> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Honigernten> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Honigernten> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Honigernten update(Honigernten honigernten) {
		return getPersistence().update(honigernten);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Honigernten update(
		Honigernten honigernten, ServiceContext serviceContext) {

		return getPersistence().update(honigernten, serviceContext);
	}

	/**
	 * Caches the honigernten in the entity cache if it is enabled.
	 *
	 * @param honigernten the honigernten
	 */
	public static void cacheResult(Honigernten honigernten) {
		getPersistence().cacheResult(honigernten);
	}

	/**
	 * Caches the honigerntens in the entity cache if it is enabled.
	 *
	 * @param honigerntens the honigerntens
	 */
	public static void cacheResult(List<Honigernten> honigerntens) {
		getPersistence().cacheResult(honigerntens);
	}

	/**
	 * Creates a new honigernten with the primary key. Does not add the honigernten to the database.
	 *
	 * @param honigernten_id the primary key for the new honigernten
	 * @return the new honigernten
	 */
	public static Honigernten create(long honigernten_id) {
		return getPersistence().create(honigernten_id);
	}

	/**
	 * Removes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws NoSuchHonigerntenException if a honigernten with the primary key could not be found
	 */
	public static Honigernten remove(long honigernten_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchHonigerntenException {

		return getPersistence().remove(honigernten_id);
	}

	public static Honigernten updateImpl(Honigernten honigernten) {
		return getPersistence().updateImpl(honigernten);
	}

	/**
	 * Returns the honigernten with the primary key or throws a <code>NoSuchHonigerntenException</code> if it could not be found.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten
	 * @throws NoSuchHonigerntenException if a honigernten with the primary key could not be found
	 */
	public static Honigernten findByPrimaryKey(long honigernten_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchHonigerntenException {

		return getPersistence().findByPrimaryKey(honigernten_id);
	}

	/**
	 * Returns the honigernten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten, or <code>null</code> if a honigernten with the primary key could not be found
	 */
	public static Honigernten fetchByPrimaryKey(long honigernten_id) {
		return getPersistence().fetchByPrimaryKey(honigernten_id);
	}

	/**
	 * Returns all the honigerntens.
	 *
	 * @return the honigerntens
	 */
	public static List<Honigernten> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @return the range of honigerntens
	 */
	public static List<Honigernten> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of honigerntens
	 */
	public static List<Honigernten> findAll(
		int start, int end, OrderByComparator<Honigernten> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of honigerntens
	 */
	public static List<Honigernten> findAll(
		int start, int end, OrderByComparator<Honigernten> orderByComparator,
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

	public static HonigerntenPersistence getPersistence() {
		return _persistence;
	}

	private static volatile HonigerntenPersistence _persistence;

}