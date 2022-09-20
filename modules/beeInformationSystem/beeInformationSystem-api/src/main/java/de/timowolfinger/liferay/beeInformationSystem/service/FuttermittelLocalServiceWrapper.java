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
 * Provides a wrapper for {@link FuttermittelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FuttermittelLocalService
 * @generated
 */
public class FuttermittelLocalServiceWrapper
	implements FuttermittelLocalService,
			   ServiceWrapper<FuttermittelLocalService> {

	public FuttermittelLocalServiceWrapper() {
		this(null);
	}

	public FuttermittelLocalServiceWrapper(
		FuttermittelLocalService futtermittelLocalService) {

		_futtermittelLocalService = futtermittelLocalService;
	}

	/**
	 * Adds the futtermittel to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuttermittelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param futtermittel the futtermittel
	 * @return the futtermittel that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
		addFuttermittel(
			de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
				futtermittel) {

		return _futtermittelLocalService.addFuttermittel(futtermittel);
	}

	/**
	 * Creates a new futtermittel with the primary key. Does not add the futtermittel to the database.
	 *
	 * @param futtermittel_id the primary key for the new futtermittel
	 * @return the new futtermittel
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
		createFuttermittel(long futtermittel_id) {

		return _futtermittelLocalService.createFuttermittel(futtermittel_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _futtermittelLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the futtermittel from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuttermittelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param futtermittel the futtermittel
	 * @return the futtermittel that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
		deleteFuttermittel(
			de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
				futtermittel) {

		return _futtermittelLocalService.deleteFuttermittel(futtermittel);
	}

	/**
	 * Deletes the futtermittel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuttermittelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel that was removed
	 * @throws PortalException if a futtermittel with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
			deleteFuttermittel(long futtermittel_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _futtermittelLocalService.deleteFuttermittel(futtermittel_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _futtermittelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _futtermittelLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _futtermittelLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _futtermittelLocalService.dynamicQuery();
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

		return _futtermittelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuttermittelModelImpl</code>.
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

		return _futtermittelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuttermittelModelImpl</code>.
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

		return _futtermittelLocalService.dynamicQuery(
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

		return _futtermittelLocalService.dynamicQueryCount(dynamicQuery);
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

		return _futtermittelLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
		fetchFuttermittel(long futtermittel_id) {

		return _futtermittelLocalService.fetchFuttermittel(futtermittel_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _futtermittelLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the futtermittel with the primary key.
	 *
	 * @param futtermittel_id the primary key of the futtermittel
	 * @return the futtermittel
	 * @throws PortalException if a futtermittel with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
			getFuttermittel(long futtermittel_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _futtermittelLocalService.getFuttermittel(futtermittel_id);
	}

	/**
	 * Returns a range of all the futtermittels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuttermittelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of futtermittels
	 * @param end the upper bound of the range of futtermittels (not inclusive)
	 * @return the range of futtermittels
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel>
			getFuttermittels(int start, int end) {

		return _futtermittelLocalService.getFuttermittels(start, end);
	}

	/**
	 * Returns the number of futtermittels.
	 *
	 * @return the number of futtermittels
	 */
	@Override
	public int getFuttermittelsCount() {
		return _futtermittelLocalService.getFuttermittelsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _futtermittelLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _futtermittelLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _futtermittelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the futtermittel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FuttermittelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param futtermittel the futtermittel
	 * @return the futtermittel that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
		updateFuttermittel(
			de.timowolfinger.liferay.beeInformationSystem.model.Futtermittel
				futtermittel) {

		return _futtermittelLocalService.updateFuttermittel(futtermittel);
	}

	@Override
	public FuttermittelLocalService getWrappedService() {
		return _futtermittelLocalService;
	}

	@Override
	public void setWrappedService(
		FuttermittelLocalService futtermittelLocalService) {

		_futtermittelLocalService = futtermittelLocalService;
	}

	private FuttermittelLocalService _futtermittelLocalService;

}