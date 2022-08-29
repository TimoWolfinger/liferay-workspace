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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for bienenvoelker. This utility wraps
 * <code>de.timowolfinger.liferay_bis_service.service.impl.bienenvoelkerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see bienenvoelkerLocalService
 * @generated
 */
public class bienenvoelkerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>de.timowolfinger.liferay_bis_service.service.impl.bienenvoelkerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the bienenvoelker to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker the bienenvoelker
	 * @return the bienenvoelker that was added
	 */
	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
		addbienenvoelker(
			de.timowolfinger.liferay_bis_service.model.bienenvoelker
				bienenvoelker) {

		return getService().addbienenvoelker(bienenvoelker);
	}

	/**
	 * Creates a new bienenvoelker with the primary key. Does not add the bienenvoelker to the database.
	 *
	 * @param id the primary key for the new bienenvoelker
	 * @return the new bienenvoelker
	 */
	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
		createbienenvoelker(long id) {

		return getService().createbienenvoelker(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bienenvoelker from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker the bienenvoelker
	 * @return the bienenvoelker that was removed
	 */
	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
		deletebienenvoelker(
			de.timowolfinger.liferay_bis_service.model.bienenvoelker
				bienenvoelker) {

		return getService().deletebienenvoelker(bienenvoelker);
	}

	/**
	 * Deletes the bienenvoelker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the bienenvoelker
	 * @return the bienenvoelker that was removed
	 * @throws PortalException if a bienenvoelker with the primary key could not be found
	 */
	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
			deletebienenvoelker(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletebienenvoelker(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return getService().dslQuery(dslQuery);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
		fetchbienenvoelker(long id) {

		return getService().fetchbienenvoelker(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the bienenvoelker with the primary key.
	 *
	 * @param id the primary key of the bienenvoelker
	 * @return the bienenvoelker
	 * @throws PortalException if a bienenvoelker with the primary key could not be found
	 */
	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
			getbienenvoelker(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getbienenvoelker(id);
	}

	/**
	 * Returns a range of all the bienenvoelkers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.bienenvoelkerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvoelkers
	 * @param end the upper bound of the range of bienenvoelkers (not inclusive)
	 * @return the range of bienenvoelkers
	 */
	public static java.util.List
		<de.timowolfinger.liferay_bis_service.model.bienenvoelker>
			getbienenvoelkers(int start, int end) {

		return getService().getbienenvoelkers(start, end);
	}

	/**
	 * Returns the number of bienenvoelkers.
	 *
	 * @return the number of bienenvoelkers
	 */
	public static int getbienenvoelkersCount() {
		return getService().getbienenvoelkersCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bienenvoelker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenvoelkerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvoelker the bienenvoelker
	 * @return the bienenvoelker that was updated
	 */
	public static de.timowolfinger.liferay_bis_service.model.bienenvoelker
		updatebienenvoelker(
			de.timowolfinger.liferay_bis_service.model.bienenvoelker
				bienenvoelker) {

		return getService().updatebienenvoelker(bienenvoelker);
	}

	public static bienenvoelkerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<bienenvoelkerLocalService, bienenvoelkerLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			bienenvoelkerLocalService.class);

		ServiceTracker<bienenvoelkerLocalService, bienenvoelkerLocalService>
			serviceTracker =
				new ServiceTracker
					<bienenvoelkerLocalService, bienenvoelkerLocalService>(
						bundle.getBundleContext(),
						bienenvoelkerLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}