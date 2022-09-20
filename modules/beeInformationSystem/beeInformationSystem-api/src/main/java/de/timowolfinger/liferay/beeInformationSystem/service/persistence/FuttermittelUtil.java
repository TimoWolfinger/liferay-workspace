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

import de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the futtermittel service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.FuttermittelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FuttermittelPersistence
 * @generated
 */
public class FuttermittelUtil {

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
	public static void clearCache(Futtermittel futtermittel) {
		getPersistence().clearCache(futtermittel);
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
	public static Map<Serializable, Futtermittel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Futtermittel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Futtermittel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Futtermittel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Futtermittel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Futtermittel update(Futtermittel futtermittel) {
		return getPersistence().update(futtermittel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Futtermittel update(
		Futtermittel futtermittel, ServiceContext serviceContext) {

		return getPersistence().update(futtermittel, serviceContext);
	}

	/**
	 * Caches the futtermittel in the entity cache if it is enabled.
	 *
	 * @param futtermittel the futtermittel
	 */
	public static void cacheResult(Futtermittel futtermittel) {
		getPersistence().cacheResult(futtermittel);
	}

	/**
	 * Caches the futtermittels in the entity cache if it is enabled.
	 *
	 * @param futtermittels the futtermittels
	 */
	public static void cacheResult(List<Futtermittel> futtermittels) {
		getPersistence().cacheResult(futtermittels);
	}

	/**
	 * Creates a new futtermittel with the primary key. Does not add the futtermittel to the database.
	 *
	 * @param futtermittel_id the primary key for the new futtermittel
	 * @return the new futtermittel
	 */
	public static Futtermittel create(long futtermittel_id) {
		return getPersistence().create(futtermittel_id);
	}

	/**
	 * Removes the futtermittel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel that was removed
	 * @throws NoSuchFuttermittelException if a futtermittel with the primary key could not be found
	 */
	public static Futtermittel remove(long futtermittel_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchFuttermittelException {

		return getPersistence().remove(futtermittel_id);
	}

	public static Futtermittel updateImpl(Futtermittel futtermittel) {
		return getPersistence().updateImpl(futtermittel);
	}

	/**
	 * Returns the futtermittel with the primary key or throws a <code>NoSuchFuttermittelException</code> if it could not be found.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel
	 * @throws NoSuchFuttermittelException if a futtermittel with the primary key could not be found
	 */
	public static Futtermittel findByPrimaryKey(long futtermittel_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchFuttermittelException {

		return getPersistence().findByPrimaryKey(futtermittel_id);
	}

	/**
	 * Returns the futtermittel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel, or <code>null</code> if a futtermittel with the primary key could not be found
	 */
	public static Futtermittel fetchByPrimaryKey(long futtermittel_id) {
		return getPersistence().fetchByPrimaryKey(futtermittel_id);
	}

	/**
	 * Returns all the futtermittels.
	 *
	 * @return the futtermittels
	 */
	public static List<Futtermittel> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @return the range of futtermittels
	 */
	public static List<Futtermittel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of futtermittels
	 */
	public static List<Futtermittel> findAll(
		int start, int end, OrderByComparator<Futtermittel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of futtermittels
	 */
	public static List<Futtermittel> findAll(
		int start, int end, OrderByComparator<Futtermittel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the futtermittels from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of futtermittels.
	 *
	 * @return the number of futtermittels
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FuttermittelPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FuttermittelPersistence _persistence;

}