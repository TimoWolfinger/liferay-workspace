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
 * Provides a wrapper for {@link honigerntenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see honigerntenLocalService
 * @generated
 */
public class honigerntenLocalServiceWrapper
	implements honigerntenLocalService,
			   ServiceWrapper<honigerntenLocalService> {

	public honigerntenLocalServiceWrapper(
		honigerntenLocalService honigerntenLocalService) {

		_honigerntenLocalService = honigerntenLocalService;
	}

	/**
	 * Adds the honigernten to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect honigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten the honigernten
	 * @return the honigernten that was added
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.honigernten
		addhonigernten(
			de.timowolfinger.liferay_bis_service.model.honigernten
				honigernten) {

		return _honigerntenLocalService.addhonigernten(honigernten);
	}

	/**
	 * Creates a new honigernten with the primary key. Does not add the honigernten to the database.
	 *
	 * @param id the primary key for the new honigernten
	 * @return the new honigernten
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.honigernten
		createhonigernten(long id) {

		return _honigerntenLocalService.createhonigernten(id);
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
	 * <strong>Important:</strong> Inspect honigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten the honigernten
	 * @return the honigernten that was removed
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.honigernten
		deletehonigernten(
			de.timowolfinger.liferay_bis_service.model.honigernten
				honigernten) {

		return _honigerntenLocalService.deletehonigernten(honigernten);
	}

	/**
	 * Deletes the honigernten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect honigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten that was removed
	 * @throws PortalException if a honigernten with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.honigernten
			deletehonigernten(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.deletehonigernten(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.honigerntenModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.honigerntenModelImpl</code>.
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
	public de.timowolfinger.liferay_bis_service.model.honigernten
		fetchhonigernten(long id) {

		return _honigerntenLocalService.fetchhonigernten(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _honigerntenLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the honigernten with the primary key.
	 *
	 * @param id the primary key of the honigernten
	 * @return the honigernten
	 * @throws PortalException if a honigernten with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.honigernten
			gethonigernten(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _honigerntenLocalService.gethonigernten(id);
	}

	/**
	 * Returns a range of all the honigerntens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.honigerntenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntens
	 * @param end the upper bound of the range of honigerntens (not inclusive)
	 * @return the range of honigerntens
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay_bis_service.model.honigernten>
			gethonigerntens(int start, int end) {

		return _honigerntenLocalService.gethonigerntens(start, end);
	}

	/**
	 * Returns the number of honigerntens.
	 *
	 * @return the number of honigerntens
	 */
	@Override
	public int gethonigerntensCount() {
		return _honigerntenLocalService.gethonigerntensCount();
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
	 * <strong>Important:</strong> Inspect honigerntenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernten the honigernten
	 * @return the honigernten that was updated
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.honigernten
		updatehonigernten(
			de.timowolfinger.liferay_bis_service.model.honigernten
				honigernten) {

		return _honigerntenLocalService.updatehonigernten(honigernten);
	}

	@Override
	public honigerntenLocalService getWrappedService() {
		return _honigerntenLocalService;
	}

	@Override
	public void setWrappedService(
		honigerntenLocalService honigerntenLocalService) {

		_honigerntenLocalService = honigerntenLocalService;
	}

	private honigerntenLocalService _honigerntenLocalService;

}