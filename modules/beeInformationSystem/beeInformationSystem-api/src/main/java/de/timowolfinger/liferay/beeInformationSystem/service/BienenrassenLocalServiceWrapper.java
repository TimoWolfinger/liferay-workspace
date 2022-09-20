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
 * Provides a wrapper for {@link BienenrassenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BienenrassenLocalService
 * @generated
 */
public class BienenrassenLocalServiceWrapper
	implements BienenrassenLocalService,
			   ServiceWrapper<BienenrassenLocalService> {

	public BienenrassenLocalServiceWrapper() {
		this(null);
	}

	public BienenrassenLocalServiceWrapper(
		BienenrassenLocalService bienenrassenLocalService) {

		_bienenrassenLocalService = bienenrassenLocalService;
	}

	/**
	 * Adds the bienenrassen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen the bienenrassen
	 * @return the bienenrassen that was added
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
		addBienenrassen(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
				bienenrassen) {

		return _bienenrassenLocalService.addBienenrassen(bienenrassen);
	}

	/**
	 * Creates a new bienenrassen with the primary key. Does not add the bienenrassen to the database.
	 *
	 * @param bienenrassen_id the primary key for the new bienenrassen
	 * @return the new bienenrassen
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
		createBienenrassen(long bienenrassen_id) {

		return _bienenrassenLocalService.createBienenrassen(bienenrassen_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrassenLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bienenrassen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen the bienenrassen
	 * @return the bienenrassen that was removed
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
		deleteBienenrassen(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
				bienenrassen) {

		return _bienenrassenLocalService.deleteBienenrassen(bienenrassen);
	}

	/**
	 * Deletes the bienenrassen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen that was removed
	 * @throws PortalException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
			deleteBienenrassen(long bienenrassen_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrassenLocalService.deleteBienenrassen(bienenrassen_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrassenLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bienenrassenLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bienenrassenLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bienenrassenLocalService.dynamicQuery();
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

		return _bienenrassenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenrassenModelImpl</code>.
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

		return _bienenrassenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenrassenModelImpl</code>.
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

		return _bienenrassenLocalService.dynamicQuery(
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

		return _bienenrassenLocalService.dynamicQueryCount(dynamicQuery);
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

		return _bienenrassenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
		fetchBienenrassen(long bienenrassen_id) {

		return _bienenrassenLocalService.fetchBienenrassen(bienenrassen_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bienenrassenLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bienenrassen with the primary key.
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen
	 * @throws PortalException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
			getBienenrassen(long bienenrassen_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrassenLocalService.getBienenrassen(bienenrassen_id);
	}

	/**
	 * Returns a range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @return the range of bienenrassens
	 */
	@Override
	public java.util.List
		<de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen>
			getBienenrassens(int start, int end) {

		return _bienenrassenLocalService.getBienenrassens(start, end);
	}

	/**
	 * Returns the number of bienenrassens.
	 *
	 * @return the number of bienenrassens
	 */
	@Override
	public int getBienenrassensCount() {
		return _bienenrassenLocalService.getBienenrassensCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bienenrassenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bienenrassenLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bienenrassenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bienenrassen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen the bienenrassen
	 * @return the bienenrassen that was updated
	 */
	@Override
	public de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
		updateBienenrassen(
			de.timowolfinger.liferay.beeInformationSystem.model.Bienenrassen
				bienenrassen) {

		return _bienenrassenLocalService.updateBienenrassen(bienenrassen);
	}

	@Override
	public BienenrassenLocalService getWrappedService() {
		return _bienenrassenLocalService;
	}

	@Override
	public void setWrappedService(
		BienenrassenLocalService bienenrassenLocalService) {

		_bienenrassenLocalService = bienenrassenLocalService;
	}

	private BienenrassenLocalService _bienenrassenLocalService;

}