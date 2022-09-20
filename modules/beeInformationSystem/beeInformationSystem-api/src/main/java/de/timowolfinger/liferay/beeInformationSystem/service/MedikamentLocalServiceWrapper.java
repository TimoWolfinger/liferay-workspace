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
 * Provides a wrapper for {@link MedikamentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedikamentLocalService
 * @generated
 */
public class MedikamentLocalServiceWrapper
	implements MedikamentLocalService, ServiceWrapper<MedikamentLocalService> {

	public MedikamentLocalServiceWrapper() {
		this(null);
	}

	public MedikamentLocalServiceWrapper(
		MedikamentLocalService medikamentLocalService) {

		_medikamentLocalService = medikamentLocalService;
	}

	/**
	 * Adds the medikament to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikament the medikament
	 * @return the medikament that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
		addMedikament(
			de.timowolfinger.liferay.beeInformationSystem.model.Medikament
				medikament) {

		return _medikamentLocalService.addMedikament(medikament);
	}

	/**
	 * Creates a new medikament with the primary key. Does not add the medikament to the database.
	 *
	 * @param medikament_id the primary key for the new medikament
	 * @return the new medikament
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
		createMedikament(long medikament_id) {

		return _medikamentLocalService.createMedikament(medikament_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the medikament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament that was removed
	 * @throws PortalException if a medikament with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
			deleteMedikament(long medikament_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamentLocalService.deleteMedikament(medikament_id);
	}

	/**
	 * Deletes the medikament from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikament the medikament
	 * @return the medikament that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
		deleteMedikament(
			de.timowolfinger.liferay.beeInformationSystem.model.Medikament
				medikament) {

		return _medikamentLocalService.deleteMedikament(medikament);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medikamentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medikamentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medikamentLocalService.dynamicQuery();
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

		return _medikamentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamentModelImpl</code>.
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

		return _medikamentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamentModelImpl</code>.
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

		return _medikamentLocalService.dynamicQuery(
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

		return _medikamentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _medikamentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
		fetchMedikament(long medikament_id) {

		return _medikamentLocalService.fetchMedikament(medikament_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medikamentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medikamentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medikament with the primary key.
	 *
	 * @param medikament_id the primary key of the medikament
	 * @return the medikament
	 * @throws PortalException if a medikament with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
			getMedikament(long medikament_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamentLocalService.getMedikament(medikament_id);
	}

	/**
	 * Returns a range of all the medikaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.MedikamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medikaments
	 * @param end the upper bound of the range of medikaments (not inclusive)
	 * @return the range of medikaments
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Medikament>
			getMedikaments(int start, int end) {

		return _medikamentLocalService.getMedikaments(start, end);
	}

	/**
	 * Returns the number of medikaments.
	 *
	 * @return the number of medikaments
	 */
	@Override
	public int getMedikamentsCount() {
		return _medikamentLocalService.getMedikamentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medikamentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medikamentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the medikament in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedikamentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medikament the medikament
	 * @return the medikament that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Medikament
		updateMedikament(
			de.timowolfinger.liferay.beeInformationSystem.model.Medikament
				medikament) {

		return _medikamentLocalService.updateMedikament(medikament);
	}

	@Override
	public MedikamentLocalService getWrappedService() {
		return _medikamentLocalService;
	}

	@Override
	public void setWrappedService(
		MedikamentLocalService medikamentLocalService) {

		_medikamentLocalService = medikamentLocalService;
	}

	private MedikamentLocalService _medikamentLocalService;

}