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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchVoelkerentwicklungException;
import de.timowolfinger.liferay.beeInformationSystem.model.Voelkerentwicklung;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the voelkerentwicklung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VoelkerentwicklungUtil
 * @generated
 */
@ProviderType
public interface VoelkerentwicklungPersistence
	extends BasePersistence<Voelkerentwicklung> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VoelkerentwicklungUtil} to access the voelkerentwicklung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the voelkerentwicklung in the entity cache if it is enabled.
	 *
	 * @param voelkerentwicklung the voelkerentwicklung
	 */
	public void cacheResult(Voelkerentwicklung voelkerentwicklung);

	/**
	 * Caches the voelkerentwicklungs in the entity cache if it is enabled.
	 *
	 * @param voelkerentwicklungs the voelkerentwicklungs
	 */
	public void cacheResult(
		java.util.List<Voelkerentwicklung> voelkerentwicklungs);

	/**
	 * Creates a new voelkerentwicklung with the primary key. Does not add the voelkerentwicklung to the database.
	 *
	 * @param voelkerentwicklung_id the primary key for the new voelkerentwicklung
	 * @return the new voelkerentwicklung
	 */
	public Voelkerentwicklung create(long voelkerentwicklung_id);

	/**
	 * Removes the voelkerentwicklung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung that was removed
	 * @throws NoSuchVoelkerentwicklungException if a voelkerentwicklung with the primary key could not be found
	 */
	public Voelkerentwicklung remove(long voelkerentwicklung_id)
		throws NoSuchVoelkerentwicklungException;

	public Voelkerentwicklung updateImpl(Voelkerentwicklung voelkerentwicklung);

	/**
	 * Returns the voelkerentwicklung with the primary key or throws a <code>NoSuchVoelkerentwicklungException</code> if it could not be found.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung
	 * @throws NoSuchVoelkerentwicklungException if a voelkerentwicklung with the primary key could not be found
	 */
	public Voelkerentwicklung findByPrimaryKey(long voelkerentwicklung_id)
		throws NoSuchVoelkerentwicklungException;

	/**
	 * Returns the voelkerentwicklung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung, or <code>null</code> if a voelkerentwicklung with the primary key could not be found
	 */
	public Voelkerentwicklung fetchByPrimaryKey(long voelkerentwicklung_id);

	/**
	 * Returns all the voelkerentwicklungs.
	 *
	 * @return the voelkerentwicklungs
	 */
	public java.util.List<Voelkerentwicklung> findAll();

	/**
	 * Returns a range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VoelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @return the range of voelkerentwicklungs
	 */
	public java.util.List<Voelkerentwicklung> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VoelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of voelkerentwicklungs
	 */
	public java.util.List<Voelkerentwicklung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Voelkerentwicklung>
			orderByComparator);

	/**
	 * Returns an ordered range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VoelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of voelkerentwicklungs
	 */
	public java.util.List<Voelkerentwicklung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Voelkerentwicklung>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the voelkerentwicklungs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of voelkerentwicklungs.
	 *
	 * @return the number of voelkerentwicklungs
	 */
	public int countAll();

}