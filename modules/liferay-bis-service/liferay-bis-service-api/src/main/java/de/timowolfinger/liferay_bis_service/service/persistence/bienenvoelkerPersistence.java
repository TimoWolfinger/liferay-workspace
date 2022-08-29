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

import de.timowolfinger.liferay_bis_service.exception.NoSuchbienenvoelkerException;
import de.timowolfinger.liferay_bis_service.model.bienenvoelker;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bienenvoelker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bienenvoelkerUtil
 * @generated
 */
@ProviderType
public interface bienenvoelkerPersistence
	extends BasePersistence<bienenvoelker> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bienenvoelkerUtil} to access the bienenvoelker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the bienenvoelker in the entity cache if it is enabled.
	 *
	 * @param bienenvoelker the bienenvoelker
	 */
	public void cacheResult(bienenvoelker bienenvoelker);

	/**
	 * Caches the bienenvoelkers in the entity cache if it is enabled.
	 *
	 * @param bienenvoelkers the bienenvoelkers
	 */
	public void cacheResult(java.util.List<bienenvoelker> bienenvoelkers);

	/**
	 * Creates a new bienenvoelker with the primary key. Does not add the bienenvoelker to the database.
	 *
	 * @param id the primary key for the new bienenvoelker
	 * @return the new bienenvoelker
	 */
	public bienenvoelker create(long id);

	/**
	 * Removes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws NoSuchbienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	public bienenvoelker remove(long id) throws NoSuchbienenvoelkerException;

	public bienenvoelker updateImpl(bienenvoelker bienenvoelker);

	/**
	 * Returns the bienenvoelker with the primary key or throws a <code>NoSuchbienenvoelkerException</code> if it could not be found.
	 *
	 * @param id the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws NoSuchbienenvoelkerException if a bienenvoelker with the primary key could not be found
	 */
	public bienenvoelker findByPrimaryKey(long id)
		throws NoSuchbienenvoelkerException;

	/**
	 * Returns the bienenvoelker with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bienenvoelker
	 * @return the bienenvoelker, or <code>null</code> if a bienenvoelker with the primary key could not be found
	 */
	public bienenvoelker fetchByPrimaryKey(long id);

	/**
	 * Returns all the bienenvoelkers.
	 *
	 * @return the bienenvoelkers
	 */
	public java.util.List<bienenvoelker> findAll();

	/**
	 * Returns a range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @return the range of bienenvoelkers
	 */
	public java.util.List<bienenvoelker> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenvoelkers
	 */
	public java.util.List<bienenvoelker> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bienenvoelker>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenvoelkers
	 */
	public java.util.List<bienenvoelker> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bienenvoelker>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bienenvoelkers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bienenvoelkers.
	 *
	 * @return the number of bienenvoelkers
	 */
	public int countAll();

}