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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBehandlungException;
import de.timowolfinger.liferay.beeInformationSystem.model.Behandlung;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the behandlung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BehandlungUtil
 * @generated
 */
@ProviderType
public interface BehandlungPersistence extends BasePersistence<Behandlung> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BehandlungUtil} to access the behandlung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the behandlung in the entity cache if it is enabled.
	 *
	 * @param behandlung the behandlung
	 */
	public void cacheResult(Behandlung behandlung);

	/**
	 * Caches the behandlungs in the entity cache if it is enabled.
	 *
	 * @param behandlungs the behandlungs
	 */
	public void cacheResult(java.util.List<Behandlung> behandlungs);

	/**
	 * Creates a new behandlung with the primary key. Does not add the behandlung to the database.
	 *
	 * @param behandlung_id the primary key for the new behandlung
	 * @return the new behandlung
	 */
	public Behandlung create(long behandlung_id);

	/**
	 * Removes the behandlung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung that was removed
	 * @throws NoSuchBehandlungException if a behandlung with the primary key could not be found
	 */
	public Behandlung remove(long behandlung_id)
		throws NoSuchBehandlungException;

	public Behandlung updateImpl(Behandlung behandlung);

	/**
	 * Returns the behandlung with the primary key or throws a <code>NoSuchBehandlungException</code> if it could not be found.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung
	 * @throws NoSuchBehandlungException if a behandlung with the primary key could not be found
	 */
	public Behandlung findByPrimaryKey(long behandlung_id)
		throws NoSuchBehandlungException;

	/**
	 * Returns the behandlung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung, or <code>null</code> if a behandlung with the primary key could not be found
	 */
	public Behandlung fetchByPrimaryKey(long behandlung_id);

	/**
	 * Returns all the behandlungs.
	 *
	 * @return the behandlungs
	 */
	public java.util.List<Behandlung> findAll();

	/**
	 * Returns a range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @return the range of behandlungs
	 */
	public java.util.List<Behandlung> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of behandlungs
	 */
	public java.util.List<Behandlung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Behandlung>
			orderByComparator);

	/**
	 * Returns an ordered range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of behandlungs
	 */
	public java.util.List<Behandlung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Behandlung>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the behandlungs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of behandlungs.
	 *
	 * @return the number of behandlungs
	 */
	public int countAll();

}