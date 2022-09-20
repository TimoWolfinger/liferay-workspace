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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchTrachtException;
import de.timowolfinger.liferay.beeInformationSystem.model.Tracht;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tracht service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrachtUtil
 * @generated
 */
@ProviderType
public interface TrachtPersistence extends BasePersistence<Tracht> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TrachtUtil} to access the tracht persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the tracht in the entity cache if it is enabled.
	 *
	 * @param tracht the tracht
	 */
	public void cacheResult(Tracht tracht);

	/**
	 * Caches the trachts in the entity cache if it is enabled.
	 *
	 * @param trachts the trachts
	 */
	public void cacheResult(java.util.List<Tracht> trachts);

	/**
	 * Creates a new tracht with the primary key. Does not add the tracht to the database.
	 *
	 * @param tracht_id the primary key for the new tracht
	 * @return the new tracht
	 */
	public Tracht create(long tracht_id);

	/**
	 * Removes the tracht with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tracht_id the primary key of the tracht
	 * @return the tracht that was removed
	 * @throws NoSuchTrachtException if a tracht with the primary key could not be found
	 */
	public Tracht remove(long tracht_id) throws NoSuchTrachtException;

	public Tracht updateImpl(Tracht tracht);

	/**
	 * Returns the tracht with the primary key or throws a <code>NoSuchTrachtException</code> if it could not be found.
	 *
	 * @param tracht_id the primary key of the tracht
	 * @return the tracht
	 * @throws NoSuchTrachtException if a tracht with the primary key could not be found
	 */
	public Tracht findByPrimaryKey(long tracht_id) throws NoSuchTrachtException;

	/**
	 * Returns the tracht with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tracht_id the primary key of the tracht
	 * @return the tracht, or <code>null</code> if a tracht with the primary key could not be found
	 */
	public Tracht fetchByPrimaryKey(long tracht_id);

	/**
	 * Returns all the trachts.
	 *
	 * @return the trachts
	 */
	public java.util.List<Tracht> findAll();

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
	public java.util.List<Tracht> findAll(int start, int end);

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
	public java.util.List<Tracht> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracht>
			orderByComparator);

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
	public java.util.List<Tracht> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracht>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the trachts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of trachts.
	 *
	 * @return the number of trachts
	 */
	public int countAll();

}