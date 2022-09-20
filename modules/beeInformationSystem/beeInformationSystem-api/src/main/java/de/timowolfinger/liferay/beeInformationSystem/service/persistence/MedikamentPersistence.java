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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchMedikamentException;
import de.timowolfinger.liferay.beeInformationSystem.model.Medikament;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medikament service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedikamentUtil
 * @generated
 */
@ProviderType
public interface MedikamentPersistence extends BasePersistence<Medikament> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedikamentUtil} to access the medikament persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the medikament in the entity cache if it is enabled.
	 *
	 * @param medikament the medikament
	 */
	public void cacheResult(Medikament medikament);

	/**
	 * Caches the medikaments in the entity cache if it is enabled.
	 *
	 * @param medikaments the medikaments
	 */
	public void cacheResult(java.util.List<Medikament> medikaments);

	/**
	 * Creates a new medikament with the primary key. Does not add the medikament to the database.
	 *
	 * @param medikament_id the primary key for the new medikament
	 * @return the new medikament
	 */
	public Medikament create(long medikament_id);

	/**
	 * Removes the medikament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament that was removed
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	public Medikament remove(long medikament_id)
		throws NoSuchMedikamentException;

	public Medikament updateImpl(Medikament medikament);

	/**
	 * Returns the medikament with the primary key or throws a <code>NoSuchMedikamentException</code> if it could not be found.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament
	 * @throws NoSuchMedikamentException if a medikament with the primary key could not be found
	 */
	public Medikament findByPrimaryKey(long medikament_id)
		throws NoSuchMedikamentException;

	/**
	 * Returns the medikament with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament, or <code>null</code> if a medikament with the primary key could not be found
	 */
	public Medikament fetchByPrimaryKey(long medikament_id);

	/**
	 * Returns all the medikaments.
	 *
	 * @return the medikaments
	 */
	public java.util.List<Medikament> findAll();

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
	public java.util.List<Medikament> findAll(int start, int end);

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
	public java.util.List<Medikament> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Medikament>
			orderByComparator);

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
	public java.util.List<Medikament> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Medikament>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medikaments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medikaments.
	 *
	 * @return the number of medikaments
	 */
	public int countAll();

}