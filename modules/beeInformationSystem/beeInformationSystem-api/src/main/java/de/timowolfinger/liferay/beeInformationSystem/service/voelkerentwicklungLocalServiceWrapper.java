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
 * Provides a wrapper for {@link voelkerentwicklungLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see voelkerentwicklungLocalService
 * @generated
 */
public class voelkerentwicklungLocalServiceWrapper
	implements ServiceWrapper<voelkerentwicklungLocalService>,
			   voelkerentwicklungLocalService {

	public voelkerentwicklungLocalServiceWrapper() {
		this(null);
	}

	public voelkerentwicklungLocalServiceWrapper(
		voelkerentwicklungLocalService voelkerentwicklungLocalService) {

		_voelkerentwicklungLocalService = voelkerentwicklungLocalService;
	}

	/**
	 * Adds the voelkerentwicklung to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect voelkerentwicklungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param voelkerentwicklung the voelkerentwicklung
	 * @return the voelkerentwicklung that was added
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
			addvoelkerentwicklung(
				de.timowolfinger.liferay.beeInformationSystem.model.
					voelkerentwicklung voelkerentwicklung) {

		return _voelkerentwicklungLocalService.addvoelkerentwicklung(
			voelkerentwicklung);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _voelkerentwicklungLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new voelkerentwicklung with the primary key. Does not add the voelkerentwicklung to the database.
	 *
	 * @param voelkerentwicklung_id the primary key for the new voelkerentwicklung
	 * @return the new voelkerentwicklung
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
			createvoelkerentwicklung(long voelkerentwicklung_id) {

		return _voelkerentwicklungLocalService.createvoelkerentwicklung(
			voelkerentwicklung_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _voelkerentwicklungLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the voelkerentwicklung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect voelkerentwicklungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung that was removed
	 * @throws PortalException if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
				deletevoelkerentwicklung(long voelkerentwicklung_id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _voelkerentwicklungLocalService.deletevoelkerentwicklung(
			voelkerentwicklung_id);
	}

	/**
	 * Deletes the voelkerentwicklung from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect voelkerentwicklungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param voelkerentwicklung the voelkerentwicklung
	 * @return the voelkerentwicklung that was removed
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
			deletevoelkerentwicklung(
				de.timowolfinger.liferay.beeInformationSystem.model.
					voelkerentwicklung voelkerentwicklung) {

		return _voelkerentwicklungLocalService.deletevoelkerentwicklung(
			voelkerentwicklung);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _voelkerentwicklungLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _voelkerentwicklungLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _voelkerentwicklungLocalService.dynamicQuery();
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

		return _voelkerentwicklungLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.voelkerentwicklungModelImpl</code>.
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

		return _voelkerentwicklungLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.voelkerentwicklungModelImpl</code>.
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

		return _voelkerentwicklungLocalService.dynamicQuery(
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

		return _voelkerentwicklungLocalService.dynamicQueryCount(dynamicQuery);
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

		return _voelkerentwicklungLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
			fetchvoelkerentwicklung(long voelkerentwicklung_id) {

		return _voelkerentwicklungLocalService.fetchvoelkerentwicklung(
			voelkerentwicklung_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _voelkerentwicklungLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _voelkerentwicklungLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _voelkerentwicklungLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _voelkerentwicklungLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the voelkerentwicklung with the primary key.
	 *
	 * @param voelkerentwicklung_id the primary key of the voelkerentwicklung
	 * @return the voelkerentwicklung
	 * @throws PortalException if a voelkerentwicklung with the primary key could not be found
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
				getvoelkerentwicklung(long voelkerentwicklung_id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _voelkerentwicklungLocalService.getvoelkerentwicklung(
			voelkerentwicklung_id);
	}

	/**
	 * Returns a range of all the voelkerentwicklungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.voelkerentwicklungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of voelkerentwicklungs
	 * @param end the upper bound of the range of voelkerentwicklungs (not inclusive)
	 * @return the range of voelkerentwicklungs
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung>
			getvoelkerentwicklungs(int start, int end) {

		return _voelkerentwicklungLocalService.getvoelkerentwicklungs(
			start, end);
	}

	/**
	 * Returns the number of voelkerentwicklungs.
	 *
	 * @return the number of voelkerentwicklungs
	 */
	@Override
	public int getvoelkerentwicklungsCount() {
		return _voelkerentwicklungLocalService.getvoelkerentwicklungsCount();
	}

	/**
	 * Updates the voelkerentwicklung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect voelkerentwicklungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param voelkerentwicklung the voelkerentwicklung
	 * @return the voelkerentwicklung that was updated
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung
			updatevoelkerentwicklung(
				de.timowolfinger.liferay.beeInformationSystem.model.
					voelkerentwicklung voelkerentwicklung) {

		return _voelkerentwicklungLocalService.updatevoelkerentwicklung(
			voelkerentwicklung);
	}

	@Override
	public voelkerentwicklungLocalService getWrappedService() {
		return _voelkerentwicklungLocalService;
	}

	@Override
	public void setWrappedService(
		voelkerentwicklungLocalService voelkerentwicklungLocalService) {

		_voelkerentwicklungLocalService = voelkerentwicklungLocalService;
	}

	private voelkerentwicklungLocalService _voelkerentwicklungLocalService;

}