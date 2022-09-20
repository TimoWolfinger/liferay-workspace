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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchAblegerException;
import de.timowolfinger.liferay.beeInformationSystem.model.Ableger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ableger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AblegerUtil
 * @generated
 */
@ProviderType
public interface AblegerPersistence extends BasePersistence<Ableger> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AblegerUtil} to access the ableger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the ableger in the entity cache if it is enabled.
	 *
	 * @param ableger the ableger
	 */
	public void cacheResult(Ableger ableger);

	/**
	 * Caches the ablegers in the entity cache if it is enabled.
	 *
	 * @param ablegers the ablegers
	 */
	public void cacheResult(java.util.List<Ableger> ablegers);

	/**
	 * Creates a new ableger with the primary key. Does not add the ableger to the database.
	 *
	 * @param ableger_id the primary key for the new ableger
	 * @return the new ableger
	 */
	public Ableger create(long ableger_id);

	/**
	 * Removes the ableger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ableger_id the primary key of the ableger
	 * @return the ableger that was removed
	 * @throws NoSuchAblegerException if a ableger with the primary key could not be found
	 */
	public Ableger remove(long ableger_id) throws NoSuchAblegerException;

	public Ableger updateImpl(Ableger ableger);

	/**
	 * Returns the ableger with the primary key or throws a <code>NoSuchAblegerException</code> if it could not be found.
	 *
	 * @param ableger_id the primary key of the ableger
	 * @return the ableger
	 * @throws NoSuchAblegerException if a ableger with the primary key could not be found
	 */
	public Ableger findByPrimaryKey(long ableger_id)
		throws NoSuchAblegerException;

	/**
	 * Returns the ableger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ableger_id the primary key of the ableger
	 * @return the ableger, or <code>null</code> if a ableger with the primary key could not be found
	 */
	public Ableger fetchByPrimaryKey(long ableger_id);

	/**
	 * Returns all the ablegers.
	 *
	 * @return the ablegers
	 */
	public java.util.List<Ableger> findAll();

	/**
	 * Returns a range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AblegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @return the range of ablegers
	 */
	public java.util.List<Ableger> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AblegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ablegers
	 */
	public java.util.List<Ableger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ableger>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AblegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ablegers
	 */
	public java.util.List<Ableger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ableger>
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