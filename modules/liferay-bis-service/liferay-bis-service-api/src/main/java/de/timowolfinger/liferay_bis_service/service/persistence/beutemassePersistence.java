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

package de.timowolfinger.liferay_bis_service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import de.timowolfinger.liferay_bis_service.exception.NoSuchbeutemasseException;
import de.timowolfinger.liferay_bis_service.model.beutemasse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the beutemasse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see beutemasseUtil
 * @generated
 */
@ProviderType
public interface beutemassePersistence extends BasePersistence<beutemasse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link beutemasseUtil} to access the beutemasse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the beutemasse in the entity cache if it is enabled.
	 *
	 * @param beutemasse the beutemasse
	 */
	public void cacheResult(beutemasse beutemasse);

	/**
	 * Caches the beutemasses in the entity cache if it is enabled.
	 *
	 * @param beutemasses the beutemasses
	 */
	public void cacheResult(java.util.List<beutemasse> beutemasses);

	/**
	 * Creates a new beutemasse with the primary key. Does not add the beutemasse to the database.
	 *
	 * @param id the primary key for the new beutemasse
	 * @return the new beutemasse
	 */
	public beutemasse create(long id);

	/**
	 * Removes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws NoSuchbeutemasseException if a beutemasse with the primary key could not be found
	 */
	public beutemasse remove(long id) throws NoSuchbeutemasseException;

	public beutemasse updateImpl(beutemasse beutemasse);

	/**
	 * Returns the beutemasse with the primary key or throws a <code>NoSuchbeutemasseException</code> if it could not be found.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws NoSuchbeutemasseException if a beutemasse with the primary key could not be found
	 */
	public beutemasse findByPrimaryKey(long id)
		throws NoSuchbeutemasseException;

	/**
	 * Returns the beutemasse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse, or <code>null</code> if a beutemasse with the primary key could not be found
	 */
	public beutemasse fetchByPrimaryKey(long id);

	/**
	 * Returns all the beutemasses.
	 *
	 * @return the beutemasses
	 */
	public java.util.List<beutemasse> findAll();

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	public java.util.List<beutemasse> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of beutemasses
	 */
	public java.util.List<beutemasse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<beutemasse>
			orderByComparator);

	/**
	 * Returns an ordered range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of beutemasses
	 */
	public java.util.List<beutemasse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<beutemasse>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the beutemasses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	public int countAll();

}