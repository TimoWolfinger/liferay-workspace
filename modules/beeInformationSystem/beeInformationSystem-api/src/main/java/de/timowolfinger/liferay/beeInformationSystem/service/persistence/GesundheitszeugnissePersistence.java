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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchGesundheitszeugnisseException;
import de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the gesundheitszeugnisse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GesundheitszeugnisseUtil
 * @generated
 */
@ProviderType
public interface GesundheitszeugnissePersistence
	extends BasePersistence<Gesundheitszeugnisse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GesundheitszeugnisseUtil} to access the gesundheitszeugnisse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the gesundheitszeugnisse in the entity cache if it is enabled.
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 */
	public void cacheResult(Gesundheitszeugnisse gesundheitszeugnisse);

	/**
	 * Caches the gesundheitszeugnisses in the entity cache if it is enabled.
	 *
	 * @param gesundheitszeugnisses the gesundheitszeugnisses
	 */
	public void cacheResult(
		java.util.List<Gesundheitszeugnisse> gesundheitszeugnisses);

	/**
	 * Creates a new gesundheitszeugnisse with the primary key. Does not add the gesundheitszeugnisse to the database.
	 *
	 * @param gesundheitszeugnisse_id the primary key for the new gesundheitszeugnisse
	 * @return the new gesundheitszeugnisse
	 */
	public Gesundheitszeugnisse create(long gesundheitszeugnisse_id);

	/**
	 * Removes the gesundheitszeugnisse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 * @throws NoSuchGesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	public Gesundheitszeugnisse remove(long gesundheitszeugnisse_id)
		throws NoSuchGesundheitszeugnisseException;

	public Gesundheitszeugnisse updateImpl(
		Gesundheitszeugnisse gesundheitszeugnisse);

	/**
	 * Returns the gesundheitszeugnisse with the primary key or throws a <code>NoSuchGesundheitszeugnisseException</code> if it could not be found.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse
	 * @throws NoSuchGesundheitszeugnisseException if a gesundheitszeugnisse with the primary key could not be found
	 */
	public Gesundheitszeugnisse findByPrimaryKey(long gesundheitszeugnisse_id)
		throws NoSuchGesundheitszeugnisseException;

	/**
	 * Returns the gesundheitszeugnisse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse, or <code>null</code> if a gesundheitszeugnisse with the primary key could not be found
	 */
	public Gesundheitszeugnisse fetchByPrimaryKey(long gesundheitszeugnisse_id);

	/**
	 * Returns all the gesundheitszeugnisses.
	 *
	 * @return the gesundheitszeugnisses
	 */
	public java.util.List<Gesundheitszeugnisse> findAll();

	/**
	 * Returns a range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @return the range of gesundheitszeugnisses
	 */
	public java.util.List<Gesundheitszeugnisse> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gesundheitszeugnisses
	 */
	public java.util.List<Gesundheitszeugnisse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Gesundheitszeugnisse>
			orderByComparator);

	/**
	 * Returns an ordered range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gesundheitszeugnisses
	 */
	public java.util.List<Gesundheitszeugnisse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Gesundheitszeugnisse>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the gesundheitszeugnisses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of gesundheitszeugnisses.
	 *
	 * @return the number of gesundheitszeugnisses
	 */
	public int countAll();

}