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
 * Provides a wrapper for {@link GesundheitszeugnisLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GesundheitszeugnisLocalService
 * @generated
 */
public class GesundheitszeugnisLocalServiceWrapper
	implements GesundheitszeugnisLocalService,
			   ServiceWrapper<GesundheitszeugnisLocalService> {

	public GesundheitszeugnisLocalServiceWrapper() {
		this(null);
	}

	public GesundheitszeugnisLocalServiceWrapper(
		GesundheitszeugnisLocalService gesundheitszeugnisLocalService) {

		_gesundheitszeugnisLocalService = gesundheitszeugnisLocalService;
	}

	/**
	 * Adds the gesundheitszeugnis to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was added
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
			addGesundheitszeugnis(
				de.timowolfinger.liferay.beeInformationSystem.model.
					Gesundheitszeugnis gesundheitszeugnis) {

		return _gesundheitszeugnisLocalService.addGesundheitszeugnis(
			gesundheitszeugnis);
	}

	/**
	 * Creates a new gesundheitszeugnis with the primary key. Does not add the gesundheitszeugnis to the database.
	 *
	 * @param gesundheitszeugnis_id the primary key for the new gesundheitszeugnis
	 * @return the new gesundheitszeugnis
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
			createGesundheitszeugnis(long gesundheitszeugnis_id) {

		return _gesundheitszeugnisLocalService.createGesundheitszeugnis(
			gesundheitszeugnis_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the gesundheitszeugnis from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was removed
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
			deleteGesundheitszeugnis(
				de.timowolfinger.liferay.beeInformationSystem.model.
					Gesundheitszeugnis gesundheitszeugnis) {

		return _gesundheitszeugnisLocalService.deleteGesundheitszeugnis(
			gesundheitszeugnis);
	}

	/**
	 * Deletes the gesundheitszeugnis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis_id the primary key of the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was removed
	 * @throws PortalException if a gesundheitszeugnis with the primary key could not be found
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
				deleteGesundheitszeugnis(long gesundheitszeugnis_id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisLocalService.deleteGesundheitszeugnis(
			gesundheitszeugnis_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _gesundheitszeugnisLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _gesundheitszeugnisLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gesundheitszeugnisLocalService.dynamicQuery();
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

		return _gesundheitszeugnisLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisModelImpl</code>.
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

		return _gesundheitszeugnisLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisModelImpl</code>.
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

		return _gesundheitszeugnisLocalService.dynamicQuery(
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

		return _gesundheitszeugnisLocalService.dynamicQueryCount(dynamicQuery);
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

		return _gesundheitszeugnisLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
			fetchGesundheitszeugnis(long gesundheitszeugnis_id) {

		return _gesundheitszeugnisLocalService.fetchGesundheitszeugnis(
			gesundheitszeugnis_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _gesundheitszeugnisLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the gesundheitszeugnis with the primary key.
	 *
	 * @param gesundheitszeugnis_id the primary key of the gesundheitszeugnis
	 * @return the gesundheitszeugnis
	 * @throws PortalException if a gesundheitszeugnis with the primary key could not be found
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
				getGesundheitszeugnis(long gesundheitszeugnis_id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisLocalService.getGesundheitszeugnis(
			gesundheitszeugnis_id);
	}

	/**
	 * Returns a range of all the gesundheitszeugnises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnises
	 * @param end the upper bound of the range of gesundheitszeugnises (not inclusive)
	 * @return the range of gesundheitszeugnises
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis>
			getGesundheitszeugnises(int start, int end) {

		return _gesundheitszeugnisLocalService.getGesundheitszeugnises(
			start, end);
	}

	/**
	 * Returns the number of gesundheitszeugnises.
	 *
	 * @return the number of gesundheitszeugnises
	 */
	@Override
	public int getGesundheitszeugnisesCount() {
		return _gesundheitszeugnisLocalService.getGesundheitszeugnisesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _gesundheitszeugnisLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gesundheitszeugnisLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the gesundheitszeugnis in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was updated
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis
			updateGesundheitszeugnis(
				de.timowolfinger.liferay.beeInformationSystem.model.
					Gesundheitszeugnis gesundheitszeugnis) {

		return _gesundheitszeugnisLocalService.updateGesundheitszeugnis(
			gesundheitszeugnis);
	}

	@Override
	public GesundheitszeugnisLocalService getWrappedService() {
		return _gesundheitszeugnisLocalService;
	}

	@Override
	public void setWrappedService(
		GesundheitszeugnisLocalService gesundheitszeugnisLocalService) {

		_gesundheitszeugnisLocalService = gesundheitszeugnisLocalService;
	}

	private GesundheitszeugnisLocalService _gesundheitszeugnisLocalService;

}