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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import de.timowolfinger.liferay_bis_service.exception.NoSuchherstellerException;
import de.timowolfinger.liferay_bis_service.model.hersteller;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hersteller service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see herstellerUtil
 * @generated
 */
@ProviderType
public interface herstellerPersistence extends BasePersistence<hersteller> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link herstellerUtil} to access the hersteller persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the hersteller in the entity cache if it is enabled.
	 *
	 * @param hersteller the hersteller
	 */
	public void cacheResult(hersteller hersteller);

	/**
	 * Caches the herstellers in the entity cache if it is enabled.
	 *
	 * @param herstellers the herstellers
	 */
	public void cacheResult(java.util.List<hersteller> herstellers);

	/**
	 * Creates a new hersteller with the primary key. Does not add the hersteller to the database.
	 *
	 * @param id the primary key for the new hersteller
	 * @return the new hersteller
	 */
	public hersteller create(long id);

	/**
	 * Removes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws NoSuchherstellerException if a hersteller with the primary key could not be found
	 */
	public hersteller remove(long id) throws NoSuchherstellerException;

	public hersteller updateImpl(hersteller hersteller);

	/**
	 * Returns the hersteller with the primary key or throws a <code>NoSuchherstellerException</code> if it could not be found.
	 *
	 * @param id the primary key of the hersteller
	 * @return the hersteller
	 * @throws NoSuchherstellerException if a hersteller with the primary key could not be found
	 */
	public hersteller findByPrimaryKey(long id)
		throws NoSuchherstellerException;

	/**
	 * Returns the hersteller with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the hersteller
	 * @return the hersteller, or <code>null</code> if a hersteller with the primary key could not be found
	 */
	public hersteller fetchByPrimaryKey(long id);

	/**
	 * Returns all the herstellers.
	 *
	 * @return the herstellers
	 */
	public java.util.List<hersteller> findAll();

	/**
	 * Returns a range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>herstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @return the range of herstellers
	 */
	public java.util.List<hersteller> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>herstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of herstellers
	 */
	public java.util.List<hersteller> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<hersteller>
			orderByComparator);

	/**
	 * Returns an ordered range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>herstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of herstellers
	 */
	public java.util.List<hersteller> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<hersteller>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the herstellers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of herstellers.
	 *
	 * @return the number of herstellers
	 */
	public int countAll();

}