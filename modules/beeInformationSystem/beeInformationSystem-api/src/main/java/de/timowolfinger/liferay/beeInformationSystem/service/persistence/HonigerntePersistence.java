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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchHonigernteException;
import de.timowolfinger.liferay.beeInformationSystem.model.Honigernte;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the honigernte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HonigernteUtil
 * @generated
 */
@ProviderType
public interface HonigerntePersistence extends BasePersistence<Honigernte> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HonigernteUtil} to access the honigernte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the honigernte in the entity cache if it is enabled.
	 *
	 * @param honigernte the honigernte
	 */
	public void cacheResult(Honigernte honigernte);

	/**
	 * Caches the honigerntes in the entity cache if it is enabled.
	 *
	 * @param honigerntes the honigerntes
	 */
	public void cacheResult(java.util.List<Honigernte> honigerntes);

	/**
	 * Creates a new honigernte with the primary key. Does not add the honigernte to the database.
	 *
	 * @param honigernte_id the primary key for the new honigernte
	 * @return the new honigernte
	 */
	public Honigernte create(long honigernte_id);

	/**
	 * Removes the honigernte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte that was removed
	 * @throws NoSuchHonigernteException if a honigernte with the primary key could not be found
	 */
	public Honigernte remove(long honigernte_id)
		throws NoSuchHonigernteException;

	public Honigernte updateImpl(Honigernte honigernte);

	/**
	 * Returns the honigernte with the primary key or throws a <code>NoSuchHonigernteException</code> if it could not be found.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte
	 * @throws NoSuchHonigernteException if a honigernte with the primary key could not be found
	 */
	public Honigernte findByPrimaryKey(long honigernte_id)
		throws NoSuchHonigernteException;

	/**
	 * Returns the honigernte with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte, or <code>null</code> if a honigernte with the primary key could not be found
	 */
	public Honigernte fetchByPrimaryKey(long honigernte_id);

	/**
	 * Returns all the honigerntes.
	 *
	 * @return the honigerntes
	 */
	public java.util.List<Honigernte> findAll();

	/**
	 * Returns a range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @return the range of honigerntes
	 */
	public java.util.List<Honigernte> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of honigerntes
	 */
	public java.util.List<Honigernte> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Honigernte>
			orderByComparator);

	/**
	 * Returns an ordered range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of honigerntes
	 */
	public java.util.List<Honigernte> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Honigernte>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the honigerntes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of honigerntes.
	 *
	 * @return the number of honigerntes
	 */
	public int countAll();

}