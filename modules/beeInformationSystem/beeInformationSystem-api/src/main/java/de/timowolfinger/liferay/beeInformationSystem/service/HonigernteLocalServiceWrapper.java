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
 * Provides a wrapper for {@link HonigernteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HonigernteLocalService
 * @generated
 */
public class HonigernteLocalServiceWrapper
	implements HonigernteLocalService, ServiceWrapper<HonigernteLocalService> {

	public HonigernteLocalServiceWrapper() {
		this(null);
	}

	public HonigernteLocalServiceWrapper(
		HonigernteLocalService honigernteLocalService) {

		_honigernteLocalService = honigernteLocalService;
	}

	/**
	 * Adds the honigernte to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte the honigernte
	 * @return the honigernte that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
		addHonigernte(
			de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
				honigernte) {

		return _honigernteLocalService.addHonigernte(honigernte);
	}

	/**
	 * Creates a new honigernte with the primary key. Does not add the honigernte to the database.
	 *
	 * @param honigernte_id the primary key for the new honigernte
	 * @return the new honigernte
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
		createHonigernte(long honigernte_id) {

		return _honigernteLocalService.createHonigernte(honigernte_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigernteLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the honigernte from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte the honigernte
	 * @return the honigernte that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
		deleteHonigernte(
			de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
				honigernte) {

		return _honigernteLocalService.deleteHonigernte(honigernte);
	}

	/**
	 * Deletes the honigernte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte that was removed
	 * @throws PortalException if a honigernte with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
			deleteHonigernte(long honigernte_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigernteLocalService.deleteHonigernte(honigernte_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigernteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _honigernteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _honigernteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _honigernteLocalService.dynamicQuery();
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

		return _honigernteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl</code>.
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

		return _honigernteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl</code>.
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

		return _honigernteLocalService.dynamicQuery(
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

		return _honigernteLocalService.dynamicQueryCount(dynamicQuery);
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

		return _honigernteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
		fetchHonigernte(long honigernte_id) {

		return _honigernteLocalService.fetchHonigernte(honigernte_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _honigernteLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the honigernte with the primary key.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte
	 * @throws PortalException if a honigernte with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
			getHonigernte(long honigernte_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigernteLocalService.getHonigernte(honigernte_id);
	}

	/**
	 * Returns a range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @return the range of honigerntes
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Honigernte>
			getHonigerntes(int start, int end) {

		return _honigernteLocalService.getHonigerntes(start, end);
	}

	/**
	 * Returns the number of honigerntes.
	 *
	 * @return the number of honigerntes
	 */
	@Override
	public int getHonigerntesCount() {
		return _honigernteLocalService.getHonigerntesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _honigernteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _honigernteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigernteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the honigernte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte the honigernte
	 * @return the honigernte that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
		updateHonigernte(
			de.timowolfinger.liferay.beeInformationSystem.model.Honigernte
				honigernte) {

		return _honigernteLocalService.updateHonigernte(honigernte);
	}

	@Override
	public HonigernteLocalService getWrappedService() {
		return _honigernteLocalService;
	}

	@Override
	public void setWrappedService(
		HonigernteLocalService honigernteLocalService) {

		_honigernteLocalService = honigernteLocalService;
	}

	private HonigernteLocalService _honigernteLocalService;

}