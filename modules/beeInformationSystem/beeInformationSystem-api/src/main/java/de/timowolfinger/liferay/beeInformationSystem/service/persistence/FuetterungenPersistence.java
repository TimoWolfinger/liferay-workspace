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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchFuetterungenException;
import de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fuetterungen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FuetterungenUtil
 * @generated
 */
@ProviderType
public interface FuetterungenPersistence extends BasePersistence<Fuetterungen> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FuetterungenUtil} to access the fuetterungen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the fuetterungen in the entity cache if it is enabled.
	 *
	 * @param fuetterungen the fuetterungen
	 */
	public void cacheResult(Fuetterungen fuetterungen);

	/**
	 * Caches the fuetterungens in the entity cache if it is enabled.
	 *
	 * @param fuetterungens the fuetterungens
	 */
	public void cacheResult(java.util.List<Fuetterungen> fuetterungens);

	/**
	 * Creates a new fuetterungen with the primary key. Does not add the fuetterungen to the database.
	 *
	 * @param fuetterungen_id the primary key for the new fuetterungen
	 * @return the new fuetterungen
	 */
	public Fuetterungen create(long fuetterungen_id);

	/**
	 * Removes the fuetterungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen that was removed
	 * @throws NoSuchFuetterungenException if a fuetterungen with the primary key could not be found
	 */
	public Fuetterungen remove(long fuetterungen_id)
		throws NoSuchFuetterungenException;

	public Fuetterungen updateImpl(Fuetterungen fuetterungen);

	/**
	 * Returns the fuetterungen with the primary key or throws a <code>NoSuchFuetterungenException</code> if it could not be found.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen
	 * @throws NoSuchFuetterungenException if a fuetterungen with the primary key could not be found
	 */
	public Fuetterungen findByPrimaryKey(long fuetterungen_id)
		throws NoSuchFuetterungenException;

	/**
	 * Returns the fuetterungen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen, or <code>null</code> if a fuetterungen with the primary key could not be found
	 */
	public Fuetterungen fetchByPrimaryKey(long fuetterungen_id);

	/**
	 * Returns all the fuetterungens.
	 *
	 * @return the fuetterungens
	 */
	public java.util.List<Fuetterungen> findAll();

	/**
	 * Returns a range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @return the range of fuetterungens
	 */
	public java.util.List<Fuetterungen> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fuetterungens
	 */
	public java.util.List<Fuetterungen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fuetterungen>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fuetterungens
	 */
	public java.util.List<Fuetterungen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fuetterungen>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fuetterungens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fuetterungens.
	 *
	 * @return the number of fuetterungens
	 */
	public int countAll();

}