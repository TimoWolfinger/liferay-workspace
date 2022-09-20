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
 * Provides a wrapper for {@link GesundheitszeugnisseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GesundheitszeugnisseLocalService
 * @generated
 */
public class GesundheitszeugnisseLocalServiceWrapper
	implements GesundheitszeugnisseLocalService,
			   ServiceWrapper<GesundheitszeugnisseLocalService> {

	public GesundheitszeugnisseLocalServiceWrapper() {
		this(null);
	}

	public GesundheitszeugnisseLocalServiceWrapper(
		GesundheitszeugnisseLocalService gesundheitszeugnisseLocalService) {

		_gesundheitszeugnisseLocalService = gesundheitszeugnisseLocalService;
	}

	/**
	 * Adds the gesundheitszeugnisse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was added
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
			addGesundheitszeugnisse(
				de.timowolfinger.liferay.beeInformationSystem.model.
					Gesundheitszeugnisse gesundheitszeugnisse) {

		return _gesundheitszeugnisseLocalService.addGesundheitszeugnisse(
			gesundheitszeugnisse);
	}

	/**
	 * Creates a new gesundheitszeugnisse with the primary key. Does not add the gesundheitszeugnisse to the database.
	 *
	 * @param gesundheitszeugnisse_id the primary key for the new gesundheitszeugnisse
	 * @return the new gesundheitszeugnisse
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
			createGesundheitszeugnisse(long gesundheitszeugnisse_id) {

		return _gesundheitszeugnisseLocalService.createGesundheitszeugnisse(
			gesundheitszeugnisse_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the gesundheitszeugnisse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
			deleteGesundheitszeugnisse(
				de.timowolfinger.liferay.beeInformationSystem.model.
					Gesundheitszeugnisse gesundheitszeugnisse) {

		return _gesundheitszeugnisseLocalService.deleteGesundheitszeugnisse(
			gesundheitszeugnisse);
	}

	/**
	 * Deletes the gesundheitszeugnisse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 * @throws PortalException if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
				deleteGesundheitszeugnisse(long gesundheitszeugnisse_id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisseLocalService.deleteGesundheitszeugnisse(
			gesundheitszeugnisse_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _gesundheitszeugnisseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _gesundheitszeugnisseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gesundheitszeugnisseLocalService.dynamicQuery();
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

		return _gesundheitszeugnisseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisseModelImpl</code>.
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

		return _gesundheitszeugnisseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisseModelImpl</code>.
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

		return _gesundheitszeugnisseLocalService.dynamicQuery(
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

		return _gesundheitszeugnisseLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _gesundheitszeugnisseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
			fetchGesundheitszeugnisse(long gesundheitszeugnisse_id) {

		return _gesundheitszeugnisseLocalService.fetchGesundheitszeugnisse(
			gesundheitszeugnisse_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _gesundheitszeugnisseLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key.
	 *
	 * @param gesundheitszeugnisse_id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse
	 * @throws PortalException if a gesundheitszeugnisse with the primary key could not be found
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
				getGesundheitszeugnisse(long gesundheitszeugnisse_id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisseLocalService.getGesundheitszeugnisse(
			gesundheitszeugnisse_id);
	}

	/**
	 * Returns a range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @return the range of gesundheitszeugnisses
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.
			Gesundheitszeugnisse> getGesundheitszeugnisses(int start, int end) {

		return _gesundheitszeugnisseLocalService.getGesundheitszeugnisses(
			start, end);
	}

	/**
	 * Returns the number of gesundheitszeugnisses.
	 *
	 * @return the number of gesundheitszeugnisses
	 */
	@Override
	public int getGesundheitszeugnissesCount() {
		return _gesundheitszeugnisseLocalService.
			getGesundheitszeugnissesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _gesundheitszeugnisseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gesundheitszeugnisseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gesundheitszeugnisseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the gesundheitszeugnisse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was updated
	 */
	@Override
	public
		de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnisse
			updateGesundheitszeugnisse(
				de.timowolfinger.liferay.beeInformationSystem.model.
					Gesundheitszeugnisse gesundheitszeugnisse) {

		return _gesundheitszeugnisseLocalService.updateGesundheitszeugnisse(
			gesundheitszeugnisse);
	}

	@Override
	public GesundheitszeugnisseLocalService getWrappedService() {
		return _gesundheitszeugnisseLocalService;
	}

	@Override
	public void setWrappedService(
		GesundheitszeugnisseLocalService gesundheitszeugnisseLocalService) {

		_gesundheitszeugnisseLocalService = gesundheitszeugnisseLocalService;
	}

	private GesundheitszeugnisseLocalService _gesundheitszeugnisseLocalService;

}