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

import de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bienenrasse service. This utility wraps <code>de.timowolfinger.liferay.beeInformationSystem.service.persistence.impl.BienenrassePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BienenrassePersistence
 * @generated
 */
public class BienenrasseUtil {

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
	public static void clearCache(Bienenrasse bienenrasse) {
		getPersistence().clearCache(bienenrasse);
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
	public static Map<Serializable, Bienenrasse> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bienenrasse> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bienenrasse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bienenrasse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bienenrasse> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bienenrasse update(Bienenrasse bienenrasse) {
		return getPersistence().update(bienenrasse);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bienenrasse update(
		Bienenrasse bienenrasse, ServiceContext serviceContext) {

		return getPersistence().update(bienenrasse, serviceContext);
	}

	/**
	 * Caches the bienenrasse in the entity cache if it is enabled.
	 *
	 * @param bienenrasse the bienenrasse
	 */
	public static void cacheResult(Bienenrasse bienenrasse) {
		getPersistence().cacheResult(bienenrasse);
	}

	/**
	 * Caches the bienenrasses in the entity cache if it is enabled.
	 *
	 * @param bienenrasses the bienenrasses
	 */
	public static void cacheResult(List<Bienenrasse> bienenrasses) {
		getPersistence().cacheResult(bienenrasses);
	}

	/**
	 * Creates a new bienenrasse with the primary key. Does not add the bienenrasse to the database.
	 *
	 * @param bienenrasse_id the primary key for the new bienenrasse
	 * @return the new bienenrasse
	 */
	public static Bienenrasse create(long bienenrasse_id) {
		return getPersistence().create(bienenrasse_id);
	}

	/**
	 * Removes the bienenrasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse that was removed
	 * @throws NoSuchBienenrasseException if a bienenrasse with the primary key could not be found
	 */
	public static Bienenrasse remove(long bienenrasse_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBienenrasseException {

		return getPersistence().remove(bienenrasse_id);
	}

	public static Bienenrasse updateImpl(Bienenrasse bienenrasse) {
		return getPersistence().updateImpl(bienenrasse);
	}

	/**
	 * Returns the bienenrasse with the primary key or throws a <code>NoSuchBienenrasseException</code> if it could not be found.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse
	 * @throws NoSuchBienenrasseException if a bienenrasse with the primary key could not be found
	 */
	public static Bienenrasse findByPrimaryKey(long bienenrasse_id)
		throws de.timowolfinger.liferay.beeInformationSystem.exception.
			NoSuchBienenrasseException {

		return getPersistence().findByPrimaryKey(bienenrasse_id);
	}

	/**
	 * Returns the bienenrasse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse, or <code>null</code> if a bienenrasse with the primary key could not be found
	 */
	public static Bienenrasse fetchByPrimaryKey(long bienenrasse_id) {
		return getPersistence().fetchByPrimaryKey(bienenrasse_id);
	}

	/**
	 * Returns all the bienenrasses.
	 *
	 * @return the bienenrasses
	 */
	public static List<Bienenrasse> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @return the range of bienenrasses
	 */
	public static List<Bienenrasse> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenrasses
	 */
	public static List<Bienenrasse> findAll(
		int start, int end, OrderByComparator<Bienenrasse> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenrasses
	 */
	public static List<Bienenrasse> findAll(
		int start, int end, OrderByComparator<Bienenrasse> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bienenrasses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bienenrasses.
	 *
	 * @return the number of bienenrasses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BienenrassePersistence getPersistence() {
		return _persistence;
	}

	private static volatile BienenrassePersistence _persistence;

}