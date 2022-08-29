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

import de.timowolfinger.liferay_bis_service.exception.NoSuchfuttermittelException;
import de.timowolfinger.liferay_bis_service.model.futtermittel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the futtermittel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see futtermittelUtil
 * @generated
 */
@ProviderType
public interface futtermittelPersistence extends BasePersistence<futtermittel> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link futtermittelUtil} to access the futtermittel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the futtermittel in the entity cache if it is enabled.
	 *
	 * @param futtermittel the futtermittel
	 */
	public void cacheResult(futtermittel futtermittel);

	/**
	 * Caches the futtermittels in the entity cache if it is enabled.
	 *
	 * @param futtermittels the futtermittels
	 */
	public void cacheResult(java.util.List<futtermittel> futtermittels);

	/**
	 * Creates a new futtermittel with the primary key. Does not add the futtermittel to the database.
	 *
	 * @param id the primary key for the new futtermittel
	 * @return the new futtermittel
	 */
	public futtermittel create(long id);

	/**
	 * Removes the futtermittel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the futtermittel
	 * @return the futtermittel that was removed
	 * @throws NoSuchfuttermittelException if a futtermittel with the primary key could not be found
	 */
	public futtermittel remove(long id) throws NoSuchfuttermittelException;

	public futtermittel updateImpl(futtermittel futtermittel);

	/**
	 * Returns the futtermittel with the primary key or throws a <code>NoSuchfuttermittelException</code> if it could not be found.
	 *
	 * @param id the primary key of the futtermittel
	 * @return the futtermittel
	 * @throws NoSuchfuttermittelException if a futtermittel with the primary key could not be found
	 */
	public futtermittel findByPrimaryKey(long id)
		throws NoSuchfuttermittelException;

	/**
	 * Returns the futtermittel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the futtermittel
	 * @return the futtermittel, or <code>null</code> if a futtermittel with the primary key could not be found
	 */
	public futtermittel fetchByPrimaryKey(long id);

	/**
	 * Returns all the futtermittels.
	 *
	 * @return the futtermittels
	 */
	public java.util.List<futtermittel> findAll();

	/**
	 * Returns a range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>futtermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @return the range of futtermittels
	 */
	public java.util.List<futtermittel> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>futtermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of futtermittels
	 */
	public java.util.List<futtermittel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<futtermittel>
			orderByComparator);

	/**
	 * Returns an ordered range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>futtermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of futtermittels
	 */
	public java.util.List<futtermittel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<futtermittel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the futtermittels from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of futtermittels.
	 *
	 * @return the number of futtermittels
	 */
	public int countAll();

}