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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchFuetterungException;
import de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fuetterung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FuetterungUtil
 * @generated
 */
@ProviderType
public interface FuetterungPersistence extends BasePersistence<Fuetterung> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FuetterungUtil} to access the fuetterung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the fuetterung in the entity cache if it is enabled.
	 *
	 * @param fuetterung the fuetterung
	 */
	public void cacheResult(Fuetterung fuetterung);

	/**
	 * Caches the fuetterungs in the entity cache if it is enabled.
	 *
	 * @param fuetterungs the fuetterungs
	 */
	public void cacheResult(java.util.List<Fuetterung> fuetterungs);

	/**
	 * Creates a new fuetterung with the primary key. Does not add the fuetterung to the database.
	 *
	 * @param fuetterung_id the primary key for the new fuetterung
	 * @return the new fuetterung
	 */
	public Fuetterung create(long fuetterung_id);

	/**
	 * Removes the fuetterung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung that was removed
	 * @throws NoSuchFuetterungException if a fuetterung with the primary key could not be found
	 */
	public Fuetterung remove(long fuetterung_id)
		throws NoSuchFuetterungException;

	public Fuetterung updateImpl(Fuetterung fuetterung);

	/**
	 * Returns the fuetterung with the primary key or throws a <code>NoSuchFuetterungException</code> if it could not be found.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung
	 * @throws NoSuchFuetterungException if a fuetterung with the primary key could not be found
	 */
	public Fuetterung findByPrimaryKey(long fuetterung_id)
		throws NoSuchFuetterungException;

	/**
	 * Returns the fuetterung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung, or <code>null</code> if a fuetterung with the primary key could not be found
	 */
	public Fuetterung fetchByPrimaryKey(long fuetterung_id);

	/**
	 * Returns all the fuetterungs.
	 *
	 * @return the fuetterungs
	 */
	public java.util.List<Fuetterung> findAll();

	/**
	 * Returns a range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @return the range of fuetterungs
	 */
	public java.util.List<Fuetterung> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fuetterungs
	 */
	public java.util.List<Fuetterung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fuetterung>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fuetterungs
	 */
	public java.util.List<Fuetterung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fuetterung>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fuetterungs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fuetterungs.
	 *
	 * @return the number of fuetterungs
	 */
	public int countAll();

}