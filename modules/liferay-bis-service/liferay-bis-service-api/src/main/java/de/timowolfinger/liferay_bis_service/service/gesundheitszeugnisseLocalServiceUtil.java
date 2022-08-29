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
 * Provides the local service utility for gesundheitszeugnisse. This utility wraps
 * <code>de.timowolfinger.liferay_bis_service.service.impl.gesundheitszeugnisseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see gesundheitszeugnisseLocalService
 * @generated
 */
public class gesundheitszeugnisseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>de.timowolfinger.liferay_bis_service.service.impl.gesundheitszeugnisseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the gesundheitszeugnisse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect gesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was added
	 */
	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
			addgesundheitszeugnisse(
				de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
					gesundheitszeugnisse) {

		return getService().addgesundheitszeugnisse(gesundheitszeugnisse);
	}

	/**
	 * Creates a new gesundheitszeugnisse with the primary key. Does not add the gesundheitszeugnisse to the database.
	 *
	 * @param id the primary key for the new gesundheitszeugnisse
	 * @return the new gesundheitszeugnisse
	 */
	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
			creategesundheitszeugnisse(long id) {

		return getService().creategesundheitszeugnisse(id);
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
	 * Deletes the gesundheitszeugnisse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect gesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 */
	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
			deletegesundheitszeugnisse(
				de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
					gesundheitszeugnisse) {

		return getService().deletegesundheitszeugnisse(gesundheitszeugnisse);
	}

	/**
	 * Deletes the gesundheitszeugnisse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect gesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was removed
	 * @throws PortalException if a gesundheitszeugnisse with the primary key could not be found
	 */
	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
				deletegesundheitszeugnisse(long id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletegesundheitszeugnisse(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.gesundheitszeugnisseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.gesundheitszeugnisseModelImpl</code>.
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

	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
			fetchgesundheitszeugnisse(long id) {

		return getService().fetchgesundheitszeugnisse(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the gesundheitszeugnisse with the primary key.
	 *
	 * @param id the primary key of the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse
	 * @throws PortalException if a gesundheitszeugnisse with the primary key could not be found
	 */
	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
				getgesundheitszeugnisse(long id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getgesundheitszeugnisse(id);
	}

	/**
	 * Returns a range of all the gesundheitszeugnisses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay_bis_service.model.impl.gesundheitszeugnisseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnisses
	 * @param end the upper bound of the range of gesundheitszeugnisses (not inclusive)
	 * @return the range of gesundheitszeugnisses
	 */
	public static java.util.List
		<de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse>
			getgesundheitszeugnisses(int start, int end) {

		return getService().getgesundheitszeugnisses(start, end);
	}

	/**
	 * Returns the number of gesundheitszeugnisses.
	 *
	 * @return the number of gesundheitszeugnisses
	 */
	public static int getgesundheitszeugnissesCount() {
		return getService().getgesundheitszeugnissesCount();
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
	 * Updates the gesundheitszeugnisse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect gesundheitszeugnisseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnisse the gesundheitszeugnisse
	 * @return the gesundheitszeugnisse that was updated
	 */
	public static
		de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
			updategesundheitszeugnisse(
				de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse
					gesundheitszeugnisse) {

		return getService().updategesundheitszeugnisse(gesundheitszeugnisse);
	}

	public static gesundheitszeugnisseLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<gesundheitszeugnisseLocalService, gesundheitszeugnisseLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			gesundheitszeugnisseLocalService.class);

		ServiceTracker
			<gesundheitszeugnisseLocalService, gesundheitszeugnisseLocalService>
				serviceTracker =
					new ServiceTracker
						<gesundheitszeugnisseLocalService,
						 gesundheitszeugnisseLocalService>(
							 bundle.getBundleContext(),
							 gesundheitszeugnisseLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}