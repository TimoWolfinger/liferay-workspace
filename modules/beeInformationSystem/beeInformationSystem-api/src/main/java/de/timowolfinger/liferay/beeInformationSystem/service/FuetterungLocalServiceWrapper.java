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
 * Provides a wrapper for {@link FuetterungLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FuetterungLocalService
 * @generated
 */
public class FuetterungLocalServiceWrapper
	implements FuetterungLocalService, ServiceWrapper<FuetterungLocalService> {

	public FuetterungLocalServiceWrapper() {
		this(null);
	}

	public FuetterungLocalServiceWrapper(
		FuetterungLocalService fuetterungLocalService) {

		_fuetterungLocalService = fuetterungLocalService;
	}

	/**
	 * Adds the fuetterung to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterung the fuetterung
	 * @return the fuetterung that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
		addFuetterung(
			de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
				fuetterung) {

		return _fuetterungLocalService.addFuetterung(fuetterung);
	}

	/**
	 * Creates a new fuetterung with the primary key. Does not add the fuetterung to the database.
	 *
	 * @param fuetterung_id the primary key for the new fuetterung
	 * @return the new fuetterung
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
		createFuetterung(long fuetterung_id) {

		return _fuetterungLocalService.createFuetterung(fuetterung_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the fuetterung from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterung the fuetterung
	 * @return the fuetterung that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
		deleteFuetterung(
			de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
				fuetterung) {

		return _fuetterungLocalService.deleteFuetterung(fuetterung);
	}

	/**
	 * Deletes the fuetterung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung that was removed
	 * @throws PortalException if a fuetterung with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
			deleteFuetterung(long fuetterung_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungLocalService.deleteFuetterung(fuetterung_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fuetterungLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fuetterungLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fuetterungLocalService.dynamicQuery();
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

		return _fuetterungLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungModelImpl</code>.
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

		return _fuetterungLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungModelImpl</code>.
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

		return _fuetterungLocalService.dynamicQuery(
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

		return _fuetterungLocalService.dynamicQueryCount(dynamicQuery);
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

		return _fuetterungLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
		fetchFuetterung(long fuetterung_id) {

		return _fuetterungLocalService.fetchFuetterung(fuetterung_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fuetterungLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fuetterung with the primary key.
	 *
	 * @param fuetterung_id the primary key of the fuetterung
	 * @return the fuetterung
	 * @throws PortalException if a fuetterung with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
			getFuetterung(long fuetterung_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungLocalService.getFuetterung(fuetterung_id);
	}

	/**
	 * Returns a range of all the fuetterungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungs
	 * @param end the upper bound of the range of fuetterungs (not inclusive)
	 * @return the range of fuetterungs
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung>
			getFuetterungs(int start, int end) {

		return _fuetterungLocalService.getFuetterungs(start, end);
	}

	/**
	 * Returns the number of fuetterungs.
	 *
	 * @return the number of fuetterungs
	 */
	@Override
	public int getFuetterungsCount() {
		return _fuetterungLocalService.getFuetterungsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fuetterungLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fuetterungLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fuetterungLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the fuetterung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuetterungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterung the fuetterung
	 * @return the fuetterung that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
		updateFuetterung(
			de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung
				fuetterung) {

		return _fuetterungLocalService.updateFuetterung(fuetterung);
	}

	@Override
	public FuetterungLocalService getWrappedService() {
		return _fuetterungLocalService;
	}

	@Override
	public void setWrappedService(
		FuetterungLocalService fuetterungLocalService) {

		_fuetterungLocalService = fuetterungLocalService;
	}

	private FuetterungLocalService _fuetterungLocalService;

}