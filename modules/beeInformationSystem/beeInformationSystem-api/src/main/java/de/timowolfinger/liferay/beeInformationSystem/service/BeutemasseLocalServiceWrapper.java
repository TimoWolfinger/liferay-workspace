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
 * Provides a wrapper for {@link BeutemasseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BeutemasseLocalService
 * @generated
 */
public class BeutemasseLocalServiceWrapper
	implements BeutemasseLocalService, ServiceWrapper<BeutemasseLocalService> {

	public BeutemasseLocalServiceWrapper() {
		this(null);
	}

	public BeutemasseLocalServiceWrapper(
		BeutemasseLocalService beutemasseLocalService) {

		_beutemasseLocalService = beutemasseLocalService;
	}

	/**
	 * Adds the beutemasse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BeutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse the beutemasse
	 * @return the beutemasse that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
		addBeutemasse(
			de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
				beutemasse) {

		return _beutemasseLocalService.addBeutemasse(beutemasse);
	}

	/**
	 * Creates a new beutemasse with the primary key. Does not add the beutemasse to the database.
	 *
	 * @param beutemasse_id the primary key for the new beutemasse
	 * @return the new beutemasse
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
		createBeutemasse(long beutemasse_id) {

		return _beutemasseLocalService.createBeutemasse(beutemasse_id);
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
	 * <strong>Important:</strong> Inspect BeutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse the beutemasse
	 * @return the beutemasse that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
		deleteBeutemasse(
			de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
				beutemasse) {

		return _beutemasseLocalService.deleteBeutemasse(beutemasse);
	}

	/**
	 * Deletes the beutemasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BeutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse_id the primary key of the beutemasse
	 * @return the beutemasse that was removed
	 * @throws PortalException if a beutemasse with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
			deleteBeutemasse(long beutemasse_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.deleteBeutemasse(beutemasse_id);
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
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _beutemasseLocalService.dslQueryCount(dslQuery);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseModelImpl</code>.
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
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
		fetchBeutemasse(long beutemasse_id) {

		return _beutemasseLocalService.fetchBeutemasse(beutemasse_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _beutemasseLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the beutemasse with the primary key.
	 *
	 * @param beutemasse_id the primary key of the beutemasse
	 * @return the beutemasse
	 * @throws PortalException if a beutemasse with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
			getBeutemasse(long beutemasse_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _beutemasseLocalService.getBeutemasse(beutemasse_id);
	}

	/**
	 * Returns a range of all the beutemasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of beutemasses
	 * @param end the upper bound of the range of beutemasses (not inclusive)
	 * @return the range of beutemasses
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse>
			getBeutemasses(int start, int end) {

		return _beutemasseLocalService.getBeutemasses(start, end);
	}

	/**
	 * Returns the number of beutemasses.
	 *
	 * @return the number of beutemasses
	 */
	@Override
	public int getBeutemassesCount() {
		return _beutemasseLocalService.getBeutemassesCount();
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
	 * <strong>Important:</strong> Inspect BeutemasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param beutemasse the beutemasse
	 * @return the beutemasse that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
		updateBeutemasse(
			de.timowolfinger.liferay.beeInformationSystem.model.Beutemasse
				beutemasse) {

		return _beutemasseLocalService.updateBeutemasse(beutemasse);
	}

	@Override
	public BeutemasseLocalService getWrappedService() {
		return _beutemasseLocalService;
	}

	@Override
	public void setWrappedService(
		BeutemasseLocalService beutemasseLocalService) {

		_beutemasseLocalService = beutemasseLocalService;
	}

	private BeutemasseLocalService _beutemasseLocalService;

}