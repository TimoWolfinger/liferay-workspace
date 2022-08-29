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
 * Provides a wrapper for {@link beutemasseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see beutemasseLocalService
 * @generated
 */
public class beutemasseLocalServiceWrapper
	implements beutemasseLocalService, ServiceWrapper<beutemasseLocalService> {

	public beutemasseLocalServiceWrapper(
		beutemasseLocalService beutemasseLocalService) {

		_beutemasseLocalService = beutemasseLocalService;
	}

	/**
	 * Adds the beutemasse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect beutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse the beutemasse
	 * @return the beutemasse that was added
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse addbeutemasse(
		de.timowolfinger.liferay_bis_service.model.beutemasse beutemasse) {

		return _beutemasseLocalService.addbeutemasse(beutemasse);
	}

	/**
	 * Creates a new beutemasse with the primary key. Does not add the beutemasse to the database.
	 *
	 * @param id the primary key for the new beutemasse
	 * @return the new beutemasse
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse
		createbeutemasse(long id) {

		return _beutemasseLocalService.createbeutemasse(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the beutemasse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect beutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse the beutemasse
	 * @return the beutemasse that was removed
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse
		deletebeutemasse(
			de.timowolfinger.liferay_bis_service.model.beutemasse beutemasse) {

		return _beutemasseLocalService.deletebeutemasse(beutemasse);
	}

	/**
	 * Deletes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect beutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws PortalException if a beutemasse with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse
			deletebeutemasse(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.deletebeutemasse(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _beutemasseLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _beutemasseLocalService.dynamicQuery();
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

		return _beutemasseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.beutemasseModelImpl</code>.
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

		return _beutemasseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.beutemasseModelImpl</code>.
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

		return _beutemasseLocalService.dynamicQuery(
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

		return _beutemasseLocalService.dynamicQueryCount(dynamicQuery);
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

		return _beutemasseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse
		fetchbeutemasse(long id) {

		return _beutemasseLocalService.fetchbeutemasse(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _beutemasseLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the beutemasse with the primary key.
	 *
	 * @param id the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws PortalException if a beutemasse with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse getbeutemasse(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.getbeutemasse(id);
	}

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.beutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	@Override
	public java.util.List<de.timowolfinger.liferay_bis_service.model.beutemasse>
		getbeutemasses(int start, int end) {

		return _beutemasseLocalService.getbeutemasses(start, end);
	}

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	@Override
	public int getbeutemassesCount() {
		return _beutemasseLocalService.getbeutemassesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _beutemasseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _beutemasseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the beutemasse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect beutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse the beutemasse
	 * @return the beutemasse that was updated
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.beutemasse
		updatebeutemasse(
			de.timowolfinger.liferay_bis_service.model.beutemasse beutemasse) {

		return _beutemasseLocalService.updatebeutemasse(beutemasse);
	}

	@Override
	public beutemasseLocalService getWrappedService() {
		return _beutemasseLocalService;
	}

	@Override
	public void setWrappedService(
		beutemasseLocalService beutemasseLocalService) {

		_beutemasseLocalService = beutemasseLocalService;
	}

	private beutemasseLocalService _beutemasseLocalService;

	@Override 
	public int dslQueryCount(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return dslQuery.as("table").getColumns().size();
	}
}