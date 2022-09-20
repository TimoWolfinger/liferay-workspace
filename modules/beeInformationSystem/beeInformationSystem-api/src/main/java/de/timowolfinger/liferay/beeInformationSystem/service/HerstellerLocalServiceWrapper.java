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
 * Provides a wrapper for {@link HerstellerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HerstellerLocalService
 * @generated
 */
public class HerstellerLocalServiceWrapper
	implements HerstellerLocalService, ServiceWrapper<HerstellerLocalService> {

	public HerstellerLocalServiceWrapper() {
		this(null);
	}

	public HerstellerLocalServiceWrapper(
		HerstellerLocalService herstellerLocalService) {

		_herstellerLocalService = herstellerLocalService;
	}

	/**
	 * Adds the hersteller to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller the hersteller
	 * @return the hersteller that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
		addHersteller(
			de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
				hersteller) {

		return _herstellerLocalService.addHersteller(hersteller);
	}

	/**
	 * Creates a new hersteller with the primary key. Does not add the hersteller to the database.
	 *
	 * @param hersteller_id the primary key for the new hersteller
	 * @return the new hersteller
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
		createHersteller(long hersteller_id) {

		return _herstellerLocalService.createHersteller(hersteller_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _herstellerLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the hersteller from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller the hersteller
	 * @return the hersteller that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
		deleteHersteller(
			de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
				hersteller) {

		return _herstellerLocalService.deleteHersteller(hersteller);
	}

	/**
	 * Deletes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws PortalException if a hersteller with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
			deleteHersteller(long hersteller_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _herstellerLocalService.deleteHersteller(hersteller_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _herstellerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _herstellerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _herstellerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _herstellerLocalService.dynamicQuery();
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

		return _herstellerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl</code>.
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

		return _herstellerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl</code>.
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

		return _herstellerLocalService.dynamicQuery(
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

		return _herstellerLocalService.dynamicQueryCount(dynamicQuery);
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

		return _herstellerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
		fetchHersteller(long hersteller_id) {

		return _herstellerLocalService.fetchHersteller(hersteller_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _herstellerLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the hersteller with the primary key.
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller
	 * @throws PortalException if a hersteller with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
			getHersteller(long hersteller_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _herstellerLocalService.getHersteller(hersteller_id);
	}

	/**
	 * Returns a range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @return the range of herstellers
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Hersteller>
			getHerstellers(int start, int end) {

		return _herstellerLocalService.getHerstellers(start, end);
	}

	/**
	 * Returns the number of herstellers.
	 *
	 * @return the number of herstellers
	 */
	@Override
	public int getHerstellersCount() {
		return _herstellerLocalService.getHerstellersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _herstellerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _herstellerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _herstellerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the hersteller in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller the hersteller
	 * @return the hersteller that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
		updateHersteller(
			de.timowolfinger.liferay.beeInformationSystem.model.Hersteller
				hersteller) {

		return _herstellerLocalService.updateHersteller(hersteller);
	}

	@Override
	public HerstellerLocalService getWrappedService() {
		return _herstellerLocalService;
	}

	@Override
	public void setWrappedService(
		HerstellerLocalService herstellerLocalService) {

		_herstellerLocalService = herstellerLocalService;
	}

	private HerstellerLocalService _herstellerLocalService;

}