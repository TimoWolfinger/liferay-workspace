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

package de.timowolfinger.liferay.beeInformationSystem.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BienenvoelkerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BienenvoelkerLocalService
 * @generated
 */
public class BienenvoelkerLocalServiceWrapper
	implements BienenvoelkerLocalService,
			   ServiceWrapper<BienenvoelkerLocalService> {

	public BienenvoelkerLocalServiceWrapper() {
		this(null);
	}

	public BienenvoelkerLocalServiceWrapper(
		BienenvoelkerLocalService bienenvoelkerLocalService) {

		_bienenvoelkerLocalService = bienenvoelkerLocalService;
	}

	/**
	 * Adds the bienenvoelker to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker the bienenvoelker
	 * @return the bienenvoelker that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
		addBienenvoelker(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
				bienenvoelker) {

		return _bienenvoelkerLocalService.addBienenvoelker(bienenvoelker);
	}

	/**
	 * Creates a new bienenvoelker with the primary key. Does not add the bienenvoelker to the database.
	 *
	 * @param bienenvoelker_id the primary key for the new bienenvoelker
	 * @return the new bienenvoelker
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
		createBienenvoelker(long bienenvoelker_id) {

		return _bienenvoelkerLocalService.createBienenvoelker(bienenvoelker_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvoelkerLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bienenvoelker from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker the bienenvoelker
	 * @return the bienenvoelker that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
		deleteBienenvoelker(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
				bienenvoelker) {

		return _bienenvoelkerLocalService.deleteBienenvoelker(bienenvoelker);
	}

	/**
	 * Deletes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws PortalException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
			deleteBienenvoelker(long bienenvoelker_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvoelkerLocalService.deleteBienenvoelker(bienenvoelker_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvoelkerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bienenvoelkerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bienenvoelkerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bienenvoelkerLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bienenvoelkerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _bienenvoelkerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _bienenvoelkerLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bienenvoelkerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _bienenvoelkerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
		fetchBienenvoelker(long bienenvoelker_id) {

		return _bienenvoelkerLocalService.fetchBienenvoelker(bienenvoelker_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bienenvoelkerLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bienenvoelker with the primary key.
	 *
	 * @param bienenvoelker_id the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws PortalException if a bienenvoelker with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
			getBienenvoelker(long bienenvoelker_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvoelkerLocalService.getBienenvoelker(bienenvoelker_id);
	}

	/**
	 * Returns a range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @return the range of bienenvoelkers
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker>
			getBienenvoelkers(int start, int end) {

		return _bienenvoelkerLocalService.getBienenvoelkers(start, end);
	}

	/**
	 * Returns the number of bienenvoelkers.
	 *
	 * @return the number of bienenvoelkers
	 */
	@Override
	public int getBienenvoelkersCount() {
		return _bienenvoelkerLocalService.getBienenvoelkersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bienenvoelkerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bienenvoelkerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvoelkerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bienenvoelker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker the bienenvoelker
	 * @return the bienenvoelker that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
		updateBienenvoelker(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker
				bienenvoelker) {

		return _bienenvoelkerLocalService.updateBienenvoelker(bienenvoelker);
	}

	@Override
	public BienenvoelkerLocalService getWrappedService() {
		return _bienenvoelkerLocalService;
	}

	@Override
	public void setWrappedService(
		BienenvoelkerLocalService bienenvoelkerLocalService) {

		_bienenvoelkerLocalService = bienenvoelkerLocalService;
	}

	private BienenvoelkerLocalService _bienenvoelkerLocalService;

}