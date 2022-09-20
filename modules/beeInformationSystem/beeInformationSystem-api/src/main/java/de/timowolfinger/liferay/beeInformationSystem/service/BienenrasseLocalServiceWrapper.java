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
 * Provides a wrapper for {@link BienenrasseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BienenrasseLocalService
 * @generated
 */
public class BienenrasseLocalServiceWrapper
	implements BienenrasseLocalService,
			   ServiceWrapper<BienenrasseLocalService> {

	public BienenrasseLocalServiceWrapper() {
		this(null);
	}

	public BienenrasseLocalServiceWrapper(
		BienenrasseLocalService bienenrasseLocalService) {

		_bienenrasseLocalService = bienenrasseLocalService;
	}

	/**
	 * Adds the bienenrasse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrasse the bienenrasse
	 * @return the bienenrasse that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
		addBienenrasse(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
				bienenrasse) {

		return _bienenrasseLocalService.addBienenrasse(bienenrasse);
	}

	/**
	 * Creates a new bienenrasse with the primary key. Does not add the bienenrasse to the database.
	 *
	 * @param bienenrasse_id the primary key for the new bienenrasse
	 * @return the new bienenrasse
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
		createBienenrasse(long bienenrasse_id) {

		return _bienenrasseLocalService.createBienenrasse(bienenrasse_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrasseLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bienenrasse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrasse the bienenrasse
	 * @return the bienenrasse that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
		deleteBienenrasse(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
				bienenrasse) {

		return _bienenrasseLocalService.deleteBienenrasse(bienenrasse);
	}

	/**
	 * Deletes the bienenrasse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse that was removed
	 * @throws PortalException if a bienenrasse with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
			deleteBienenrasse(long bienenrasse_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrasseLocalService.deleteBienenrasse(bienenrasse_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrasseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bienenrasseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bienenrasseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bienenrasseLocalService.dynamicQuery();
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

		return _bienenrasseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenrasseModelImpl</code>.
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

		return _bienenrasseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenrasseModelImpl</code>.
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

		return _bienenrasseLocalService.dynamicQuery(
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

		return _bienenrasseLocalService.dynamicQueryCount(dynamicQuery);
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

		return _bienenrasseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
		fetchBienenrasse(long bienenrasse_id) {

		return _bienenrasseLocalService.fetchBienenrasse(bienenrasse_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bienenrasseLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bienenrasse with the primary key.
	 *
	 * @param bienenrasse_id the primary key of the bienenrasse
	 * @return the bienenrasse
	 * @throws PortalException if a bienenrasse with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
			getBienenrasse(long bienenrasse_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrasseLocalService.getBienenrasse(bienenrasse_id);
	}

	/**
	 * Returns a range of all the bienenrasses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenrasseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrasses
	 * @param end the upper bound of the range of bienenrasses (not inclusive)
	 * @return the range of bienenrasses
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse>
			getBienenrasses(int start, int end) {

		return _bienenrasseLocalService.getBienenrasses(start, end);
	}

	/**
	 * Returns the number of bienenrasses.
	 *
	 * @return the number of bienenrasses
	 */
	@Override
	public int getBienenrassesCount() {
		return _bienenrasseLocalService.getBienenrassesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bienenrasseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bienenrasseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrasseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bienenrasse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrasseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrasse the bienenrasse
	 * @return the bienenrasse that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
		updateBienenrasse(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse
				bienenrasse) {

		return _bienenrasseLocalService.updateBienenrasse(bienenrasse);
	}

	@Override
	public BienenrasseLocalService getWrappedService() {
		return _bienenrasseLocalService;
	}

	@Override
	public void setWrappedService(
		BienenrasseLocalService bienenrasseLocalService) {

		_bienenrasseLocalService = bienenrasseLocalService;
	}

	private BienenrasseLocalService _bienenrasseLocalService;

}