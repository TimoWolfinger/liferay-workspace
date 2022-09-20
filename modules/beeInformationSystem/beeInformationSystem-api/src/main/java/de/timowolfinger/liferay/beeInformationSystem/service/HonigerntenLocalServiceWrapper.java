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
 * Provides a wrapper for {@link HonigerntenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HonigerntenLocalService
 * @generated
 */
public class HonigerntenLocalServiceWrapper
	implements HonigerntenLocalService,
			   ServiceWrapper<HonigerntenLocalService> {

	public HonigerntenLocalServiceWrapper() {
		this(null);
	}

	public HonigerntenLocalServiceWrapper(
		HonigerntenLocalService honigerntenLocalService) {

		_honigerntenLocalService = honigerntenLocalService;
	}

	/**
	 * Adds the honigernten to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten the honigernten
	 * @return the honigernten that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
		addHonigernten(
			de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
				honigernten) {

		return _honigerntenLocalService.addHonigernten(honigernten);
	}

	/**
	 * Creates a new honigernten with the primary key. Does not add the honigernten to the database.
	 *
	 * @param honigernten_id the primary key for the new honigernten
	 * @return the new honigernten
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
		createHonigernten(long honigernten_id) {

		return _honigerntenLocalService.createHonigernten(honigernten_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the honigernten from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten the honigernten
	 * @return the honigernten that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
		deleteHonigernten(
			de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
				honigernten) {

		return _honigerntenLocalService.deleteHonigernten(honigernten);
	}

	/**
	 * Deletes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws PortalException if a honigernten with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
			deleteHonigernten(long honigernten_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.deleteHonigernten(honigernten_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _honigerntenLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _honigerntenLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _honigerntenLocalService.dynamicQuery();
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

		return _honigerntenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigerntenModelImpl</code>.
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

		return _honigerntenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigerntenModelImpl</code>.
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

		return _honigerntenLocalService.dynamicQuery(
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

		return _honigerntenLocalService.dynamicQueryCount(dynamicQuery);
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

		return _honigerntenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
		fetchHonigernten(long honigernten_id) {

		return _honigerntenLocalService.fetchHonigernten(honigernten_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _honigerntenLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the honigernten with the primary key.
	 *
	 * @param honigernten_id the primary key of the honigernten
	 * @return the honigernten
	 * @throws PortalException if a honigernten with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
			getHonigernten(long honigernten_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.getHonigernten(honigernten_id);
	}

	/**
	 * Returns a range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @return the range of honigerntens
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Honigernten>
			getHonigerntens(int start, int end) {

		return _honigerntenLocalService.getHonigerntens(start, end);
	}

	/**
	 * Returns the number of honigerntens.
	 *
	 * @return the number of honigerntens
	 */
	@Override
	public int getHonigerntensCount() {
		return _honigerntenLocalService.getHonigerntensCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _honigerntenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _honigerntenLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the honigernten in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten the honigernten
	 * @return the honigernten that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
		updateHonigernten(
			de.timowolfinger.liferay.beeInformationSystem.model.Honigernten
				honigernten) {

		return _honigerntenLocalService.updateHonigernten(honigernten);
	}

	@Override
	public HonigerntenLocalService getWrappedService() {
		return _honigerntenLocalService;
	}

	@Override
	public void setWrappedService(
		HonigerntenLocalService honigerntenLocalService) {

		_honigerntenLocalService = honigerntenLocalService;
	}

	private HonigerntenLocalService _honigerntenLocalService;

}