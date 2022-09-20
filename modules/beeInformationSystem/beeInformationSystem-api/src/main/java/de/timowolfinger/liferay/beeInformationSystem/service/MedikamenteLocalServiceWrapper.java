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
 * Provides a wrapper for {@link MedikamenteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedikamenteLocalService
 * @generated
 */
public class MedikamenteLocalServiceWrapper
	implements MedikamenteLocalService,
			   ServiceWrapper<MedikamenteLocalService> {

	public MedikamenteLocalServiceWrapper() {
		this(null);
	}

	public MedikamenteLocalServiceWrapper(
		MedikamenteLocalService medikamenteLocalService) {

		_medikamenteLocalService = medikamenteLocalService;
	}

	/**
	 * Adds the medikamente to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikamente the medikamente
	 * @return the medikamente that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
		addMedikamente(
			de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
				medikamente) {

		return _medikamenteLocalService.addMedikamente(medikamente);
	}

	/**
	 * Creates a new medikamente with the primary key. Does not add the medikamente to the database.
	 *
	 * @param medikamente_id the primary key for the new medikamente
	 * @return the new medikamente
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
		createMedikamente(long medikamente_id) {

		return _medikamenteLocalService.createMedikamente(medikamente_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamenteLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the medikamente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente that was removed
	 * @throws PortalException if a medikamente with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
			deleteMedikamente(long medikamente_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamenteLocalService.deleteMedikamente(medikamente_id);
	}

	/**
	 * Deletes the medikamente from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikamente the medikamente
	 * @return the medikamente that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
		deleteMedikamente(
			de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
				medikamente) {

		return _medikamenteLocalService.deleteMedikamente(medikamente);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamenteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medikamenteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medikamenteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medikamenteLocalService.dynamicQuery();
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

		return _medikamenteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamenteModelImpl</code>.
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

		return _medikamenteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamenteModelImpl</code>.
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

		return _medikamenteLocalService.dynamicQuery(
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

		return _medikamenteLocalService.dynamicQueryCount(dynamicQuery);
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

		return _medikamenteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
		fetchMedikamente(long medikamente_id) {

		return _medikamenteLocalService.fetchMedikamente(medikamente_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medikamenteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medikamenteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medikamente with the primary key.
	 *
	 * @param medikamente_id the primary key of the medikamente
	 * @return the medikamente
	 * @throws PortalException if a medikamente with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
			getMedikamente(long medikamente_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamenteLocalService.getMedikamente(medikamente_id);
	}

	/**
	 * Returns a range of all the medikamentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikamentes
	 * @param end the upper bound of the range of medikamentes (not inclusive)
	 * @return the range of medikamentes
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Medikamente>
			getMedikamentes(int start, int end) {

		return _medikamenteLocalService.getMedikamentes(start, end);
	}

	/**
	 * Returns the number of medikamentes.
	 *
	 * @return the number of medikamentes
	 */
	@Override
	public int getMedikamentesCount() {
		return _medikamenteLocalService.getMedikamentesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medikamenteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamenteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the medikamente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikamente the medikamente
	 * @return the medikamente that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
		updateMedikamente(
			de.timowolfinger.liferay.beeInformationSystem.model.Medikamente
				medikamente) {

		return _medikamenteLocalService.updateMedikamente(medikamente);
	}

	@Override
	public MedikamenteLocalService getWrappedService() {
		return _medikamenteLocalService;
	}

	@Override
	public void setWrappedService(
		MedikamenteLocalService medikamenteLocalService) {

		_medikamenteLocalService = medikamenteLocalService;
	}

	private MedikamenteLocalService _medikamenteLocalService;

}