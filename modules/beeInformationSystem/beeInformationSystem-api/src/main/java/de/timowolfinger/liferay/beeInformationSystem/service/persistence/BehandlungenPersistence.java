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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBehandlungenException;
import de.timowolfinger.liferay.beeInformationSystem.model.Behandlungen;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the behandlungen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BehandlungenUtil
 * @generated
 */
@ProviderType
public interface BehandlungenPersistence extends BasePersistence<Behandlungen> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BehandlungenUtil} to access the behandlungen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the behandlungen in the entity cache if it is enabled.
	 *
	 * @param behandlungen the behandlungen
	 */
	public void cacheResult(Behandlungen behandlungen);

	/**
	 * Caches the behandlungens in the entity cache if it is enabled.
	 *
	 * @param behandlungens the behandlungens
	 */
	public void cacheResult(java.util.List<Behandlungen> behandlungens);

	/**
	 * Creates a new behandlungen with the primary key. Does not add the behandlungen to the database.
	 *
	 * @param behandlungen_id the primary key for the new behandlungen
	 * @return the new behandlungen
	 */
	public Behandlungen create(long behandlungen_id);

	/**
	 * Removes the behandlungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param behandlungen_id the primary key of the behandlungen
	 * @return the behandlungen that was removed
	 * @throws NoSuchBehandlungenException if a behandlungen with the primary key could not be found
	 */
	public Behandlungen remove(long behandlungen_id)
		throws NoSuchBehandlungenException;

	public Behandlungen updateImpl(Behandlungen behandlungen);

	/**
	 * Returns the behandlungen with the primary key or throws a <code>NoSuchBehandlungenException</code> if it could not be found.
	 *
	 * @param behandlungen_id the primary key of the behandlungen
	 * @return the behandlungen
	 * @throws NoSuchBehandlungenException if a behandlungen with the primary key could not be found
	 */
	public Behandlungen findByPrimaryKey(long behandlungen_id)
		throws NoSuchBehandlungenException;

	/**
	 * Returns the behandlungen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param behandlungen_id the primary key of the behandlungen
	 * @return the behandlungen, or <code>null</code> if a behandlungen with the primary key could not be found
	 */
	public Behandlungen fetchByPrimaryKey(long behandlungen_id);

	/**
	 * Returns all the behandlungens.
	 *
	 * @return the behandlungens
	 */
	public java.util.List<Behandlungen> findAll();

	/**
	 * Returns a range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @return the range of behandlungens
	 */
	public java.util.List<Behandlungen> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of behandlungens
	 */
	public java.util.List<Behandlungen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Behandlungen>
			orderByComparator);

	/**
	 * Returns an ordered range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BehandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of behandlungens
	 */
	public java.util.List<Behandlungen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Behandlungen>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the behandlungens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of behandlungens.
	 *
	 * @return the number of behandlungens
	 */
	public int countAll();

}