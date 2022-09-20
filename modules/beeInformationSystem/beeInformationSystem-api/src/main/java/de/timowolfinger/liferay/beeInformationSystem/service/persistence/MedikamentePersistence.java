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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchMedikamenteException;
import de.timowolfinger.liferay.beeInformationSystem.model.Medikamente;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medikamente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedikamenteUtil
 * @generated
 */
@ProviderType
public interface MedikamentePersistence extends BasePersistence<Medikamente> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedikamenteUtil} to access the medikamente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the medikamente in the entity cache if it is enabled.
	 *
	 * @param medikamente the medikamente
	 */
	public void cacheResult(Medikamente medikamente);

	/**
	 * Caches the medikamentes in the entity cache if it is enabled.
	 *
	 * @param medikamentes the medikamentes
	 */
	public void cacheResult(java.util.List<Medikamente> medikamentes);

	/**
	 * Creates a new medikamente with the primary key. Does not add the medikamente to the database.
	 *
	 * @param medikamente_id the primary key for the new medikamente
	 * @return the new medikamente
	 */
	public Medikamente create(long medikamente_id);

	/**
	 * Removes the medikamente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente that was removed
	 * @throws NoSuchMedikamenteException if a medikamente with the primary key could not be found
	 */
	public Medikamente remove(long medikamente_id)
		throws NoSuchMedikamenteException;

	public Medikamente updateImpl(Medikamente medikamente);

	/**
	 * Returns the medikamente with the primary key or throws a <code>NoSuchMedikamenteException</code> if it could not be found.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente
	 * @throws NoSuchMedikamenteException if a medikamente with the primary key could not be found
	 */
	public Medikamente findByPrimaryKey(long medikamente_id)
		throws NoSuchMedikamenteException;

	/**
	 * Returns the medikamente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente, or <code>null</code> if a medikamente with the primary key could not be found
	 */
	public Medikamente fetchByPrimaryKey(long medikamente_id);

	/**
	 * Returns all the medikamentes.
	 *
	 * @return the medikamentes
	 */
	public java.util.List<Medikamente> findAll();

	/**
	 * Returns a range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @return the range of medikamentes
	 */
	public java.util.List<Medikamente> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medikamentes
	 */
	public java.util.List<Medikamente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Medikamente>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medikamentes
	 */
	public java.util.List<Medikamente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Medikamente>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medikamentes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medikamentes.
	 *
	 * @return the number of medikamentes
	 */
	public int countAll();

}