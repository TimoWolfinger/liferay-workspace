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
 * Provides a wrapper for {@link BehandlungLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BehandlungLocalService
 * @generated
 */
public class BehandlungLocalServiceWrapper
	implements BehandlungLocalService, ServiceWrapper<BehandlungLocalService> {

	public BehandlungLocalServiceWrapper() {
		this(null);
	}

	public BehandlungLocalServiceWrapper(
		BehandlungLocalService behandlungLocalService) {

		_behandlungLocalService = behandlungLocalService;
	}

	/**
	 * Adds the behandlung to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BehandlungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlung the behandlung
	 * @return the behandlung that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
		addBehandlung(
			de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
				behandlung) {

		return _behandlungLocalService.addBehandlung(behandlung);
	}

	/**
	 * Creates a new behandlung with the primary key. Does not add the behandlung to the database.
	 *
	 * @param behandlung_id the primary key for the new behandlung
	 * @return the new behandlung
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
		createBehandlung(long behandlung_id) {

		return _behandlungLocalService.createBehandlung(behandlung_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the behandlung from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BehandlungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlung the behandlung
	 * @return the behandlung that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
		deleteBehandlung(
			de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
				behandlung) {

		return _behandlungLocalService.deleteBehandlung(behandlung);
	}

	/**
	 * Deletes the behandlung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BehandlungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung that was removed
	 * @throws PortalException if a behandlung with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
			deleteBehandlung(long behandlung_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungLocalService.deleteBehandlung(behandlung_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _behandlungLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _behandlungLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _behandlungLocalService.dynamicQuery();
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

		return _behandlungLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungModelImpl</code>.
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

		return _behandlungLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungModelImpl</code>.
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

		return _behandlungLocalService.dynamicQuery(
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

		return _behandlungLocalService.dynamicQueryCount(dynamicQuery);
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

		return _behandlungLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
		fetchBehandlung(long behandlung_id) {

		return _behandlungLocalService.fetchBehandlung(behandlung_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _behandlungLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the behandlung with the primary key.
	 *
	 * @param behandlung_id the primary key of the behandlung
	 * @return the behandlung
	 * @throws PortalException if a behandlung with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
			getBehandlung(long behandlung_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungLocalService.getBehandlung(behandlung_id);
	}

	/**
	 * Returns a range of all the behandlungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungs
	 * @param end the upper bound of the range of behandlungs (not inclusive)
	 * @return the range of behandlungs
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Behandlung>
			getBehandlungs(int start, int end) {

		return _behandlungLocalService.getBehandlungs(start, end);
	}

	/**
	 * Returns the number of behandlungs.
	 *
	 * @return the number of behandlungs
	 */
	@Override
	public int getBehandlungsCount() {
		return _behandlungLocalService.getBehandlungsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _behandlungLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _behandlungLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the behandlung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BehandlungLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlung the behandlung
	 * @return the behandlung that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
		updateBehandlung(
			de.timowolfinger.liferay.beeInformationSystem.model.Behandlung
				behandlung) {

		return _behandlungLocalService.updateBehandlung(behandlung);
	}

	@Override
	public BehandlungLocalService getWrappedService() {
		return _behandlungLocalService;
	}

	@Override
	public void setWrappedService(
		BehandlungLocalService behandlungLocalService) {

		_behandlungLocalService = behandlungLocalService;
	}

	private BehandlungLocalService _behandlungLocalService;

}