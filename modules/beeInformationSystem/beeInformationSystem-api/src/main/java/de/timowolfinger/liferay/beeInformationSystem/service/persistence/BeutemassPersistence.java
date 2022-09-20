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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBeutemassException;
import de.timowolfinger.liferay.beeInformationSystem.model.Beutemass;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the beutemass service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BeutemassUtil
 * @generated
 */
@ProviderType
public interface BeutemassPersistence extends BasePersistence<Beutemass> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BeutemassUtil} to access the beutemass persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the beutemass in the entity cache if it is enabled.
	 *
	 * @param beutemass the beutemass
	 */
	public void cacheResult(Beutemass beutemass);

	/**
	 * Caches the beutemasses in the entity cache if it is enabled.
	 *
	 * @param beutemasses the beutemasses
	 */
	public void cacheResult(java.util.List<Beutemass> beutemasses);

	/**
	 * Creates a new beutemass with the primary key. Does not add the beutemass to the database.
	 *
	 * @param beutemass_id the primary key for the new beutemass
	 * @return the new beutemass
	 */
	public Beutemass create(long beutemass_id);

	/**
	 * Removes the beutemass with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass that was removed
	 * @throws NoSuchBeutemassException if a beutemass with the primary key could not be found
	 */
	public Beutemass remove(long beutemass_id) throws NoSuchBeutemassException;

	public Beutemass updateImpl(Beutemass beutemass);

	/**
	 * Returns the beutemass with the primary key or throws a <code>NoSuchBeutemassException</code> if it could not be found.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass
	 * @throws NoSuchBeutemassException if a beutemass with the primary key could not be found
	 */
	public Beutemass findByPrimaryKey(long beutemass_id)
		throws NoSuchBeutemassException;

	/**
	 * Returns the beutemass with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass, or <code>null</code> if a beutemass with the primary key could not be found
	 */
	public Beutemass fetchByPrimaryKey(long beutemass_id);

	/**
	 * Returns all the beutemasses.
	 *
	 * @return the beutemasses
	 */
	public java.util.List<Beutemass> findAll();

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
	public java.util.List<Beutemass> findAll(int start, int end);

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
	public java.util.List<Beutemass> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Beutemass>
			orderByComparator);

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
	public java.util.List<Beutemass> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Beutemass>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the beutemasses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	public int countAll();

}