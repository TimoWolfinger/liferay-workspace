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

import de.timowolfinger.liferay_bis_service.model.futtermittel;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the futtermittel service. This utility wraps <code>de.timowolfinger.liferay_bis_service.service.persistence.impl.futtermittelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see futtermittelPersistence
 * @generated
 */
public class futtermittelUtil {

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
	public static void clearCache(futtermittel futtermittel) {
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
	public static Map<Serializable, futtermittel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<futtermittel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<futtermittel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<futtermittel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<futtermittel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static futtermittel update(futtermittel futtermittel) {
		return getPersistence().update(futtermittel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static futtermittel update(
		futtermittel futtermittel, ServiceContext serviceContext) {

		return getPersistence().update(futtermittel, serviceContext);
	}

	/**
	 * Caches the futtermittel in the entity cache if it is enabled.
	 *
	 * @param futtermittel the futtermittel
	 */
	public static void cacheResult(futtermittel futtermittel) {
		getPersistence().cacheResult(futtermittel);
	}

	/**
	 * Caches the futtermittels in the entity cache if it is enabled.
	 *
	 * @param futtermittels the futtermittels
	 */
	public static void cacheResult(List<futtermittel> futtermittels) {
		getPersistence().cacheResult(futtermittels);
	}

	/**
	 * Creates a new futtermittel with the primary key. Does not add the futtermittel to the database.
	 *
	 * @param id the primary key for the new futtermittel
	 * @return the new futtermittel
	 */
	public static futtermittel create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the futtermittel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the futtermittel
	 * @return the futtermittel that was removed
	 * @throws NoSuchfuttermittelException if a futtermittel with the primary key could not be found
	 */
	public static futtermittel remove(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchfuttermittelException {

		return getPersistence().remove(id);
	}

	public static futtermittel updateImpl(futtermittel futtermittel) {
		return getPersistence().updateImpl(futtermittel);
	}

	/**
	 * Returns the futtermittel with the primary key or throws a <code>NoSuchfuttermittelException</code> if it could not be found.
	 *
	 * @param id the primary key of the futtermittel
	 * @return the futtermittel
	 * @throws NoSuchfuttermittelException if a futtermittel with the primary key could not be found
	 */
	public static futtermittel findByPrimaryKey(long id)
		throws de.timowolfinger.liferay_bis_service.exception.
			NoSuchfuttermittelException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the futtermittel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the futtermittel
	 * @return the futtermittel, or <code>null</code> if a futtermittel with the primary key could not be found
	 */
	public static futtermittel fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the futtermittels.
	 *
	 * @return the futtermittels
	 */
	public static List<futtermittel> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>futtermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @return the range of futtermittels
	 */
	public static List<futtermittel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>futtermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of futtermittels
	 */
	public static List<futtermittel> findAll(
		int start, int end, OrderByComparator<futtermittel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>futtermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of futtermittels
	 */
	public static List<futtermittel> findAll(
		int start, int end, OrderByComparator<futtermittel> orderByComparator,
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

	public static futtermittelPersistence getPersistence() {
		return _persistence;
	}

	private static volatile futtermittelPersistence _persistence;

}