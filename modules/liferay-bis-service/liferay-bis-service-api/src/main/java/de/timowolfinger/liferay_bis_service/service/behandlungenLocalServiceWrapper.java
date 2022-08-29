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
 * Provides a wrapper for {@link behandlungenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see behandlungenLocalService
 * @generated
 */
public class behandlungenLocalServiceWrapper
	implements behandlungenLocalService,
			   ServiceWrapper<behandlungenLocalService> {

	public behandlungenLocalServiceWrapper(
		behandlungenLocalService behandlungenLocalService) {

		_behandlungenLocalService = behandlungenLocalService;
	}

	/**
	 * Adds the behandlungen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect behandlungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlungen the behandlungen
	 * @return the behandlungen that was added
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
		addbehandlungen(
			de.timowolfinger.liferay_bis_service.model.behandlungen
				behandlungen) {

		return _behandlungenLocalService.addbehandlungen(behandlungen);
	}

	/**
	 * Creates a new behandlungen with the primary key. Does not add the behandlungen to the database.
	 *
	 * @param id the primary key for the new behandlungen
	 * @return the new behandlungen
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
		createbehandlungen(long id) {

		return _behandlungenLocalService.createbehandlungen(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungenLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the behandlungen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect behandlungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlungen the behandlungen
	 * @return the behandlungen that was removed
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
		deletebehandlungen(
			de.timowolfinger.liferay_bis_service.model.behandlungen
				behandlungen) {

		return _behandlungenLocalService.deletebehandlungen(behandlungen);
	}

	/**
	 * Deletes the behandlungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect behandlungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the behandlungen
	 * @return the behandlungen that was removed
	 * @throws PortalException if a behandlungen with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
			deletebehandlungen(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungenLocalService.deletebehandlungen(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungenLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _behandlungenLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _behandlungenLocalService.dynamicQuery();
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

		return _behandlungenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.behandlungenModelImpl</code>.
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

		return _behandlungenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.behandlungenModelImpl</code>.
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

		return _behandlungenLocalService.dynamicQuery(
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

		return _behandlungenLocalService.dynamicQueryCount(dynamicQuery);
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

		return _behandlungenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
		fetchbehandlungen(long id) {

		return _behandlungenLocalService.fetchbehandlungen(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _behandlungenLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the behandlungen with the primary key.
	 *
	 * @param id the primary key of the behandlungen
	 * @return the behandlungen
	 * @throws PortalException if a behandlungen with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
			getbehandlungen(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungenLocalService.getbehandlungen(id);
	}

	/**
	 * Returns a range of all the behandlungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.behandlungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of behandlungens
	 * @param end the upper bound of the range of behandlungens (not inclusive)
	 * @return the range of behandlungens
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay_bis_service.model.behandlungen>
			getbehandlungens(int start, int end) {

		return _behandlungenLocalService.getbehandlungens(start, end);
	}

	/**
	 * Returns the number of behandlungens.
	 *
	 * @return the number of behandlungens
	 */
	@Override
	public int getbehandlungensCount() {
		return _behandlungenLocalService.getbehandlungensCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _behandlungenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _behandlungenLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _behandlungenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the behandlungen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect behandlungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param behandlungen the behandlungen
	 * @return the behandlungen that was updated
	 */
	@Override
	public de.timowolfinger.liferay_bis_service.model.behandlungen
		updatebehandlungen(
			de.timowolfinger.liferay_bis_service.model.behandlungen
				behandlungen) {

		return _behandlungenLocalService.updatebehandlungen(behandlungen);
	}

	@Override
	public behandlungenLocalService getWrappedService() {
		return _behandlungenLocalService;
	}

	@Override
	public void setWrappedService(
		behandlungenLocalService behandlungenLocalService) {

		_behandlungenLocalService = behandlungenLocalService;
	}

	private behandlungenLocalService _behandlungenLocalService;
	
	@Override 
	public int dslQueryCount(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return dslQuery.as("table").getColumns().size();
	}
}