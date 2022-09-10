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

package de.timowolfinger.liferay_bis_service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ablegerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ablegerLocalService
 * @generated
 */
public class ablegerLocalServiceWrapper
	implements ablegerLocalService, ServiceWrapper<ablegerLocalService> {

	public ablegerLocalServiceWrapper(ablegerLocalService ablegerLocalService) {
		_ablegerLocalService = ablegerLocalService;
	}

	/**
	 * Adds the ableger to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ablegerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ableger the ableger
	 * @return the ableger that was added
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger addableger(
		de.timowolfinger.liferay_bis_service.model.ableger ableger) {

		return _ablegerLocalService.addableger(ableger);
	}

	/**
	 * Creates a new ableger with the primary key. Does not add the ableger to the database.
	 *
	 * @param id the primary key for the new ableger
	 * @return the new ableger
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger createableger(
		long id) {

		return _ablegerLocalService.createableger(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ablegerLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ableger from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ablegerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ableger the ableger
	 * @return the ableger that was removed
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger deleteableger(
		de.timowolfinger.liferay_bis_service.model.ableger ableger) {

		return _ablegerLocalService.deleteableger(ableger);
	}

	/**
	 * Deletes the ableger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ablegerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger that was removed
	 * @throws PortalException if a ableger with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger deleteableger(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ablegerLocalService.deleteableger(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ablegerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ablegerLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ablegerLocalService.dynamicQuery();
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

		return _ablegerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.ablegerModelImpl</code>.
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

		return _ablegerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.ablegerModelImpl</code>.
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

		return _ablegerLocalService.dynamicQuery(
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

		return _ablegerLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ablegerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger fetchableger(
		long id) {

		return _ablegerLocalService.fetchableger(id);
	}

	/**
	 * Returns the ableger with the primary key.
	 *
	 * @param id the primary key of the ableger
	 * @return the ableger
	 * @throws PortalException if a ableger with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger getableger(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ablegerLocalService.getableger(id);
	}

	/**
	 * Returns a range of all the ablegers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.ablegerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ablegers
	 * @param end the upper bound of the range of ablegers (not inclusive)
	 * @return the range of ablegers
	 */
	@Override
	public java.util.List<de.timowolfinger.liferay_bis_service.model.ableger>
		getablegers(int start, int end) {

		return _ablegerLocalService.getablegers(start, end);
	}

	/**
	 * Returns the number of ablegers.
	 *
	 * @return the number of ablegers
	 */
	@Override
	public int getablegersCount() {
		return _ablegerLocalService.getablegersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ablegerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ablegerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ablegerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ablegerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ableger in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ablegerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ableger the ableger
	 * @return the ableger that was updated
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.ableger updateableger(
		de.timowolfinger.liferay_bis_service.model.ableger ableger) {

		return _ablegerLocalService.updateableger(ableger);
	}

	@Override
	public ablegerLocalService getWrappedService() {
		return _ablegerLocalService;
	}

	@Override
	public void setWrappedService(ablegerLocalService ablegerLocalService) {
		_ablegerLocalService = ablegerLocalService;
	}

	private ablegerLocalService _ablegerLocalService;

}