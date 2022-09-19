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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchtrachtenException;
import de.timowolfinger.liferay.beeInformationSystem.model.trachten;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the trachten service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see trachtenUtil
 * @generated
 */
@ProviderType
public interface trachtenPersistence extends BasePersistence<trachten> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link trachtenUtil} to access the trachten persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the trachten in the entity cache if it is enabled.
	 *
	 * @param trachten the trachten
	 */
	public void cacheResult(trachten trachten);

	/**
	 * Caches the trachtens in the entity cache if it is enabled.
	 *
	 * @param trachtens the trachtens
	 */
	public void cacheResult(java.util.List<trachten> trachtens);

	/**
	 * Creates a new trachten with the primary key. Does not add the trachten to the database.
	 *
	 * @param trachten_id the primary key for the new trachten
	 * @return the new trachten
	 */
	public trachten create(long trachten_id);

	/**
	 * Removes the trachten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten that was removed
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	public trachten remove(long trachten_id) throws NoSuchtrachtenException;

	public trachten updateImpl(trachten trachten);

	/**
	 * Returns the trachten with the primary key or throws a <code>NoSuchtrachtenException</code> if it could not be found.
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten
	 * @throws NoSuchtrachtenException if a trachten with the primary key could not be found
	 */
	public trachten findByPrimaryKey(long trachten_id)
		throws NoSuchtrachtenException;

	/**
	 * Returns the trachten with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten, or <code>null</code> if a trachten with the primary key could not be found
	 */
	public trachten fetchByPrimaryKey(long trachten_id);

	/**
	 * Returns all the trachtens.
	 *
	 * @return the trachtens
	 */
	public java.util.List<trachten> findAll();

	/**
	 * Returns a range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @return the range of trachtens
	 */
	public java.util.List<trachten> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trachtens
	 */
	public java.util.List<trachten> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trachten>
			orderByComparator);

	/**
	 * Returns an ordered range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of trachtens
	 */
	public java.util.List<trachten> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trachten>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the trachtens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of trachtens.
	 *
	 * @return the number of trachtens
	 */
	public int countAll();

}