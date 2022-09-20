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
 * Provides a wrapper for {@link BienenvolkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BienenvolkLocalService
 * @generated
 */
public class BienenvolkLocalServiceWrapper
	implements BienenvolkLocalService, ServiceWrapper<BienenvolkLocalService> {

	public BienenvolkLocalServiceWrapper() {
		this(null);
	}

	public BienenvolkLocalServiceWrapper(
		BienenvolkLocalService bienenvolkLocalService) {

		_bienenvolkLocalService = bienenvolkLocalService;
	}

	/**
	 * Adds the bienenvolk to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk the bienenvolk
	 * @return the bienenvolk that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
		addBienenvolk(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
				bienenvolk) {

		return _bienenvolkLocalService.addBienenvolk(bienenvolk);
	}

	/**
	 * Creates a new bienenvolk with the primary key. Does not add the bienenvolk to the database.
	 *
	 * @param bienenvolk_id the primary key for the new bienenvolk
	 * @return the new bienenvolk
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
		createBienenvolk(long bienenvolk_id) {

		return _bienenvolkLocalService.createBienenvolk(bienenvolk_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvolkLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bienenvolk from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk the bienenvolk
	 * @return the bienenvolk that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
		deleteBienenvolk(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
				bienenvolk) {

		return _bienenvolkLocalService.deleteBienenvolk(bienenvolk);
	}

	/**
	 * Deletes the bienenvolk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk that was removed
	 * @throws PortalException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
			deleteBienenvolk(long bienenvolk_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvolkLocalService.deleteBienenvolk(bienenvolk_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvolkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bienenvolkLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bienenvolkLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bienenvolkLocalService.dynamicQuery();
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

		return _bienenvolkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code>.
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

		return _bienenvolkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code>.
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

		return _bienenvolkLocalService.dynamicQuery(
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

		return _bienenvolkLocalService.dynamicQueryCount(dynamicQuery);
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

		return _bienenvolkLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
		fetchBienenvolk(long bienenvolk_id) {

		return _bienenvolkLocalService.fetchBienenvolk(bienenvolk_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bienenvolkLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bienenvolk with the primary key.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk
	 * @throws PortalException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
			getBienenvolk(long bienenvolk_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvolkLocalService.getBienenvolk(bienenvolk_id);
	}

	/**
	 * Returns a range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @return the range of bienenvolks
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk>
			getBienenvolks(int start, int end) {

		return _bienenvolkLocalService.getBienenvolks(start, end);
	}

	/**
	 * Returns the number of bienenvolks.
	 *
	 * @return the number of bienenvolks
	 */
	@Override
	public int getBienenvolksCount() {
		return _bienenvolkLocalService.getBienenvolksCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bienenvolkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bienenvolkLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenvolkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bienenvolk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk the bienenvolk
	 * @return the bienenvolk that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
		updateBienenvolk(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk
				bienenvolk) {

		return _bienenvolkLocalService.updateBienenvolk(bienenvolk);
	}

	@Override
	public BienenvolkLocalService getWrappedService() {
		return _bienenvolkLocalService;
	}

	@Override
	public void setWrappedService(
		BienenvolkLocalService bienenvolkLocalService) {

		_bienenvolkLocalService = bienenvolkLocalService;
	}

	private BienenvolkLocalService _bienenvolkLocalService;

}