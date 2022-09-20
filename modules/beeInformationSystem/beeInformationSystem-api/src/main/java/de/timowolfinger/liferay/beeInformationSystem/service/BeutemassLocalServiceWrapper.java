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
 * Provides a wrapper for {@link BeutemassLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BeutemassLocalService
 * @generated
 */
public class BeutemassLocalServiceWrapper
	implements BeutemassLocalService, ServiceWrapper<BeutemassLocalService> {

	public BeutemassLocalServiceWrapper() {
		this(null);
	}

	public BeutemassLocalServiceWrapper(
		BeutemassLocalService beutemassLocalService) {

		_beutemassLocalService = beutemassLocalService;
	}

	/**
	 * Adds the beutemass to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BeutemassLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemass the beutemass
	 * @return the beutemass that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
		addBeutemass(
			de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
				beutemass) {

		return _beutemassLocalService.addBeutemass(beutemass);
	}

	/**
	 * Creates a new beutemass with the primary key. Does not add the beutemass to the database.
	 *
	 * @param beutemass_id the primary key for the new beutemass
	 * @return the new beutemass
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
		createBeutemass(long beutemass_id) {

		return _beutemassLocalService.createBeutemass(beutemass_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemassLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the beutemass from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BeutemassLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemass the beutemass
	 * @return the beutemass that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
		deleteBeutemass(
			de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
				beutemass) {

		return _beutemassLocalService.deleteBeutemass(beutemass);
	}

	/**
	 * Deletes the beutemass with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BeutemassLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass that was removed
	 * @throws PortalException if a beutemass with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
			deleteBeutemass(long beutemass_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemassLocalService.deleteBeutemass(beutemass_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemassLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _beutemassLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _beutemassLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _beutemassLocalService.dynamicQuery();
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

		return _beutemassLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemassModelImpl</code>.
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

		return _beutemassLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemassModelImpl</code>.
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

		return _beutemassLocalService.dynamicQuery(
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

		return _beutemassLocalService.dynamicQueryCount(dynamicQuery);
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

		return _beutemassLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
		fetchBeutemass(long beutemass_id) {

		return _beutemassLocalService.fetchBeutemass(beutemass_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _beutemassLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the beutemass with the primary key.
	 *
	 * @param beutemass_id the primary key of the beutemass
	 * @return the beutemass
	 * @throws PortalException if a beutemass with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
			getBeutemass(long beutemass_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemassLocalService.getBeutemass(beutemass_id);
	}

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemassModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Beutemass>
			getBeutemasses(int start, int end) {

		return _beutemassLocalService.getBeutemasses(start, end);
	}

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	@Override
	public int getBeutemassesCount() {
		return _beutemassLocalService.getBeutemassesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _beutemassLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _beutemassLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemassLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the beutemass in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BeutemassLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemass the beutemass
	 * @return the beutemass that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
		updateBeutemass(
			de.timowolfinger.liferay.beeInformationSystem.model.Beutemass
				beutemass) {

		return _beutemassLocalService.updateBeutemass(beutemass);
	}

	@Override
	public BeutemassLocalService getWrappedService() {
		return _beutemassLocalService;
	}

	@Override
	public void setWrappedService(BeutemassLocalService beutemassLocalService) {
		_beutemassLocalService = beutemassLocalService;
	}

	private BeutemassLocalService _beutemassLocalService;

}