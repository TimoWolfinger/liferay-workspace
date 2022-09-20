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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchHonigerntenException;
import de.timowolfinger.liferay.beeInformationSystem.model.Honigernten;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the honigernten service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HonigerntenUtil
 * @generated
 */
@ProviderType
public interface HonigerntenPersistence extends BasePersistence<Honigernten> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HonigerntenUtil} to access the honigernten persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the honigernten in the entity cache if it is enabled.
	 *
	 * @param honigernten the honigernten
	 */
	public void cacheResult(Honigernten honigernten);

	/**
	 * Caches the honigerntens in the entity cache if it is enabled.
	 *
	 * @param honigerntens the honigerntens
	 */
	public void cacheResult(java.util.List<Honigernten> honigerntens);

	/**
	 * Creates a new honigernten with the primary key. Does not add the honigernten to the database.
	 *
	 * @param honigernten_id the primary key for the new honigernten
	 * @return the new honigernten
	 */
	public Honigernten create(long honigernten_id);

	/**
	 * Removes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws NoSuchHonigerntenException if a honigernten with the primary key could not be found
	 */
	public Honigernten remove(long honigernten_id)
		throws NoSuchHonigerntenException;

	public Honigernten updateImpl(Honigernten honigernten);

	/**
	 * Returns the honigernten with the primary key or throws a <code>NoSuchHonigerntenException</code> if it could not be found.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten
	 * @throws NoSuchHonigerntenException if a honigernten with the primary key could not be found
	 */
	public Honigernten findByPrimaryKey(long honigernten_id)
		throws NoSuchHonigerntenException;

	/**
	 * Returns the honigernten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten, or <code>null</code> if a honigernten with the primary key could not be found
	 */
	public Honigernten fetchByPrimaryKey(long honigernten_id);

	/**
	 * Returns all the honigerntens.
	 *
	 * @return the honigerntens
	 */
	public java.util.List<Honigernten> findAll();

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
	public java.util.List<Honigernten> findAll(int start, int end);

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
	public java.util.List<Honigernten> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Honigernten>
			orderByComparator);

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
	public java.util.List<Honigernten> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Honigernten>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the honigerntens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of honigerntens.
	 *
	 * @return the number of honigerntens
	 */
	public int countAll();

}