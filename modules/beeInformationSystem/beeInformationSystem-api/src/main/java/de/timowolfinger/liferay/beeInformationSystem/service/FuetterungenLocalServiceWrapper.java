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
 * Provides a wrapper for {@link FuetterungenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FuetterungenLocalService
 * @generated
 */
public class FuetterungenLocalServiceWrapper
	implements FuetterungenLocalService,
			   ServiceWrapper<FuetterungenLocalService> {

	public FuetterungenLocalServiceWrapper() {
		this(null);
	}

	public FuetterungenLocalServiceWrapper(
		FuetterungenLocalService fuetterungenLocalService) {

		_fuetterungenLocalService = fuetterungenLocalService;
	}

	/**
	 * Adds the fuetterungen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen the fuetterungen
	 * @return the fuetterungen that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
		addFuetterungen(
			de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
				fuetterungen) {

		return _fuetterungenLocalService.addFuetterungen(fuetterungen);
	}

	/**
	 * Creates a new fuetterungen with the primary key. Does not add the fuetterungen to the database.
	 *
	 * @param fuetterungen_id the primary key for the new fuetterungen
	 * @return the new fuetterungen
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
		createFuetterungen(long fuetterungen_id) {

		return _fuetterungenLocalService.createFuetterungen(fuetterungen_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungenLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the fuetterungen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen the fuetterungen
	 * @return the fuetterungen that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
		deleteFuetterungen(
			de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
				fuetterungen) {

		return _fuetterungenLocalService.deleteFuetterungen(fuetterungen);
	}

	/**
	 * Deletes the fuetterungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen that was removed
	 * @throws PortalException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
			deleteFuetterungen(long fuetterungen_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungenLocalService.deleteFuetterungen(fuetterungen_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungenLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fuetterungenLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fuetterungenLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fuetterungenLocalService.dynamicQuery();
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

		return _fuetterungenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungenModelImpl</code>.
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

		return _fuetterungenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungenModelImpl</code>.
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

		return _fuetterungenLocalService.dynamicQuery(
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

		return _fuetterungenLocalService.dynamicQueryCount(dynamicQuery);
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

		return _fuetterungenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
		fetchFuetterungen(long fuetterungen_id) {

		return _fuetterungenLocalService.fetchFuetterungen(fuetterungen_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fuetterungenLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fuetterungen with the primary key.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen
	 * @throws PortalException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
			getFuetterungen(long fuetterungen_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungenLocalService.getFuetterungen(fuetterungen_id);
	}

	/**
	 * Returns a range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @return the range of fuetterungens
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen>
			getFuetterungens(int start, int end) {

		return _fuetterungenLocalService.getFuetterungens(start, end);
	}

	/**
	 * Returns the number of fuetterungens.
	 *
	 * @return the number of fuetterungens
	 */
	@Override
	public int getFuetterungensCount() {
		return _fuetterungenLocalService.getFuetterungensCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fuetterungenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fuetterungenLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the fuetterungen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen the fuetterungen
	 * @return the fuetterungen that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
		updateFuetterungen(
			de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen
				fuetterungen) {

		return _fuetterungenLocalService.updateFuetterungen(fuetterungen);
	}

	@Override
	public FuetterungenLocalService getWrappedService() {
		return _fuetterungenLocalService;
	}

	@Override
	public void setWrappedService(
		FuetterungenLocalService fuetterungenLocalService) {

		_fuetterungenLocalService = fuetterungenLocalService;
	}

	private FuetterungenLocalService _fuetterungenLocalService;

}