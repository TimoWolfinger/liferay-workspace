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

import de.timowolfinger.liferay.beeInformationSystem.exception.NoSuchBienenrasseException;
import de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bienenrasse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BienenrasseUtil
 * @generated
 */
@ProviderType
public interface BienenrassePersistence extends BasePersistence<Bienenrasse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BienenrasseUtil} to access the bienenrasse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the bienenrasse in the entity cache if it is enabled.
	 *
	 * @param bienenrasse the bienenrasse
	 */
	public void cacheResult(Bienenrasse bienenrasse);

	/**
	 * Caches the bienenrasses in the entity cache if it is enabled.
	 *
	 * @param bienenrasses the bienenrasses
	 */
	public void cacheResult(java.util.List<Bienenrasse> bienenrasses);

	/**
	 * Creates a new bienenrasse with the primary key. Does not add the bienenrasse to the database.
	 *
	 * @param bienenrasse_id the primary key for the new bienenrasse
	 * @return the new bienenrasse
	 */
	public Bienenrasse create(long bienenrasse_id);

	/**
	 * Removes the bienenrasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse that was removed
	 * @throws NoSuchBienenrasseException if a bienenrasse with the primary key could not be found
	 */
	public Bienenrasse remove(long bienenrasse_id)
		throws NoSuchBienenrasseException;

	public Bienenrasse updateImpl(Bienenrasse bienenrasse);

	/**
	 * Returns the bienenrasse with the primary key or throws a <code>NoSuchBienenrasseException</code> if it could not be found.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse
	 * @throws NoSuchBienenrasseException if a bienenrasse with the primary key could not be found
	 */
	public Bienenrasse findByPrimaryKey(long bienenrasse_id)
		throws NoSuchBienenrasseException;

	/**
	 * Returns the bienenrasse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse, or <code>null</code> if a bienenrasse with the primary key could not be found
	 */
	public Bienenrasse fetchByPrimaryKey(long bienenrasse_id);

	/**
	 * Returns all the bienenrasses.
	 *
	 * @return the bienenrasses
	 */
	public java.util.List<Bienenrasse> findAll();

	/**
	 * Returns a range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @return the range of bienenrasses
	 */
	public java.util.List<Bienenrasse> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bienenrasses
	 */
	public java.util.List<Bienenrasse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bienenrasse>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bienenrasses
	 */
	public java.util.List<Bienenrasse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bienenrasse>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bienenrasses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bienenrasses.
	 *
	 * @return the number of bienenrasses
	 */
	public int countAll();

}