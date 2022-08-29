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

import de.timowolfinger.liferay_bis_service.exception.NoSuchablegerException;
import de.timowolfinger.liferay_bis_service.model.ableger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ableger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ablegerUtil
 * @generated
 */
@ProviderType
public interface ablegerPersistence extends BasePersistence<ableger> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ablegerUtil} to access the ableger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the ableger in the entity cache if it is enabled.
	 *
	 * @param ableger the ableger
	 */
	public void cacheResult(ableger ableger);

	/**
	 * Caches the ablegers in the entity cache if it is enabled.
	 *
	 * @param ablegers the ablegers
	 */
	public void cacheResult(java.util.List<ableger> ablegers);

	/**
	 * Creates a new ableger with the primary key. Does not add the ableger to the database.
	 *
	 * @param id the primary key for the new ableger
	 * @return the new ableger
	 */
	public ableger create(long id);

	/**
	 * Removes the ableger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger that was removed
	 * @throws NoSuchablegerException if a ableger with the primary key could not be found
	 */
	public ableger remove(long id) throws NoSuchablegerException;

	public ableger updateImpl(ableger ableger);

	/**
	 * Returns the ableger with the primary key or throws a <code>NoSuchablegerException</code> if it could not be found.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger
	 * @throws NoSuchablegerException if a ableger with the primary key could not be found
	 */
	public ableger findByPrimaryKey(long id) throws NoSuchablegerException;

	/**
	 * Returns the ableger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger, or <code>null</code> if a ableger with the primary key could not be found
	 */
	public ableger fetchByPrimaryKey(long id);

	/**
	 * Returns all the ablegers.
	 *
	 * @return the ablegers
	 */
	public java.util.List<ableger> findAll();

	/**
	 * Returns a range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @return the range of ablegers
	 */
	public java.util.List<ableger> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ablegers
	 */
	public java.util.List<ableger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ableger>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ablegers
	 */
	public java.util.List<ableger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ableger>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ablegers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ablegers.
	 *
	 * @return the number of ablegers
	 */
	public int countAll();

}