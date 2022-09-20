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
 * Provides a wrapper for {@link TrachtenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TrachtenLocalService
 * @generated
 */
public class TrachtenLocalServiceWrapper
	implements ServiceWrapper<TrachtenLocalService>, TrachtenLocalService {

	public TrachtenLocalServiceWrapper() {
		this(null);
	}

	public TrachtenLocalServiceWrapper(
		TrachtenLocalService trachtenLocalService) {

		_trachtenLocalService = trachtenLocalService;
	}

	/**
	 * Adds the trachten to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TrachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten the trachten
	 * @return the trachten that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
		addTrachten(
			de.timowolfinger.liferay.beeInformationSystem.model.Trachten
				trachten) {

		return _trachtenLocalService.addTrachten(trachten);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _trachtenLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new trachten with the primary key. Does not add the trachten to the database.
	 *
	 * @param trachten_id the primary key for the new trachten
	 * @return the new trachten
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
		createTrachten(long trachten_id) {

		return _trachtenLocalService.createTrachten(trachten_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _trachtenLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the trachten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TrachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten that was removed
	 * @throws PortalException if a trachten with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
			deleteTrachten(long trachten_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _trachtenLocalService.deleteTrachten(trachten_id);
	}

	/**
	 * Deletes the trachten from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TrachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten the trachten
	 * @return the trachten that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
		deleteTrachten(
			de.timowolfinger.liferay.beeInformationSystem.model.Trachten
				trachten) {

		return _trachtenLocalService.deleteTrachten(trachten);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _trachtenLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _trachtenLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trachtenLocalService.dynamicQuery();
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

		return _trachtenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.TrachtenModelImpl</code>.
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

		return _trachtenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.TrachtenModelImpl</code>.
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

		return _trachtenLocalService.dynamicQuery(
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

		return _trachtenLocalService.dynamicQueryCount(dynamicQuery);
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

		return _trachtenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
		fetchTrachten(long trachten_id) {

		return _trachtenLocalService.fetchTrachten(trachten_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _trachtenLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _trachtenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _trachtenLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _trachtenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the trachten with the primary key.
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten
	 * @throws PortalException if a trachten with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
			getTrachten(long trachten_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _trachtenLocalService.getTrachten(trachten_id);
	}

	/**
	 * Returns a range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.TrachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @return the range of trachtens
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Trachten>
			getTrachtens(int start, int end) {

		return _trachtenLocalService.getTrachtens(start, end);
	}

	/**
	 * Returns the number of trachtens.
	 *
	 * @return the number of trachtens
	 */
	@Override
	public int getTrachtensCount() {
		return _trachtenLocalService.getTrachtensCount();
	}

	/**
	 * Updates the trachten in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TrachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten the trachten
	 * @return the trachten that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Trachten
		updateTrachten(
			de.timowolfinger.liferay.beeInformationSystem.model.Trachten
				trachten) {

		return _trachtenLocalService.updateTrachten(trachten);
	}

	@Override
	public TrachtenLocalService getWrappedService() {
		return _trachtenLocalService;
	}

	@Override
	public void setWrappedService(TrachtenLocalService trachtenLocalService) {
		_trachtenLocalService = trachtenLocalService;
	}

	private TrachtenLocalService _trachtenLocalService;

}