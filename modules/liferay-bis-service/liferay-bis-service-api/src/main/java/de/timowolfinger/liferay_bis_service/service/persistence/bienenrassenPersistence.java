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

import de.timowolfinger.liferay_bis_service.exception.NoSuchbienenrassenException;
import de.timowolfinger.liferay_bis_service.model.bienenrassen;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bienenrassen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bienenrassenUtil
 * @generated
 */
@ProviderType
public interface bienenrassenPersistence extends BasePersistence<bienenrassen> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bienenrassenUtil} to access the bienenrassen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the bienenrassen in the entity cache if it is enabled.
	 *
	 * @param bienenrassen the bienenrassen
	 */
	public void cacheResult(bienenrassen bienenrassen);

	/**
	 * Caches the bienenrassens in the entity cache if it is enabled.
	 *
	 * @param bienenrassens the bienenrassens
	 */
	public void cacheResult(java.util.List<bienenrassen> bienenrassens);

	/**
	 * Creates a new bienenrassen with the primary key. Does not add the bienenrassen to the database.
	 *
	 * @param id the primary key for the new bienenrassen
	 * @return the new bienenrassen
	 */
	public bienenrassen create(long id);

	/**
	 * Removes the bienenrassen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bienenrassen
	 * @return the bienenrassen that was removed
	 * @throws NoSuchbienenrassenException if a bienenrassen with the primary key could not be found
	 */
	public bienenrassen remove(long id) throws NoSuchbienenrassenException;

	public bienenrassen updateImpl(bienenrassen bienenrassen);

	/**
	 * Returns the bienenrassen with the primary key or throws a <code>NoSuchbienenrassenException</code> if it could not be found.
	 *
	 * @param id the primary key of the bienenrassen
	 * @return the bienenrassen
	 * @throws NoSuchbienenrassenException if a bienenrassen with the primary key could not be found
	 */
	public bienenrassen findByPrimaryKey(long id)
		throws NoSuchbienenrassenException;

	/**
	 * Returns the bienenrassen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bienenrassen
	 * @return the bienenrassen, or <code>null</code> if a bienenrassen with the primary key could not be found
	 */
	public bienenrassen fetchByPrimaryKey(long id);

	/**
	 * Returns all the bienenrassens.
	 *
	 * @return the bienenrassens
	 */
	public java.util.List<bienenrassen> findAll();

	/**
	 * Returns a range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @return the range of bienenrassens
	 */
	public java.util.List<bienenrassen> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenrassens
	 */
	public java.util.List<bienenrassen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bienenrassen>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenrassens
	 */
	public java.util.List<bienenrassen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bienenrassen>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bienenrassens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bienenrassens.
	 *
	 * @return the number of bienenrassens
	 */
	public int countAll();

}