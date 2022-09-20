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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Gesundheitszeugnis. This utility wraps
 * <code>de.timowolfinger.liferay.beeInformationSystem.service.impl.GesundheitszeugnisLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see GesundheitszeugnisLocalService
 * @generated
 */
public class GesundheitszeugnisLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>de.timowolfinger.liferay.beeInformationSystem.service.impl.GesundheitszeugnisLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the gesundheitszeugnis to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was added
	 */
	public static Gesundheitszeugnis addGesundheitszeugnis(
		Gesundheitszeugnis gesundheitszeugnis) {

		return getService().addGesundheitszeugnis(gesundheitszeugnis);
	}

	/**
	 * Creates a new gesundheitszeugnis with the primary key. Does not add the gesundheitszeugnis to the database.
	 *
	 * @param gesundheitszeugnis_id the primary key for the new gesundheitszeugnis
	 * @return the new gesundheitszeugnis
	 */
	public static Gesundheitszeugnis createGesundheitszeugnis(
		long gesundheitszeugnis_id) {

		return getService().createGesundheitszeugnis(gesundheitszeugnis_id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the gesundheitszeugnis from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was removed
	 */
	public static Gesundheitszeugnis deleteGesundheitszeugnis(
		Gesundheitszeugnis gesundheitszeugnis) {

		return getService().deleteGesundheitszeugnis(gesundheitszeugnis);
	}

	/**
	 * Deletes the gesundheitszeugnis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis_id the primary key of the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was removed
	 * @throws PortalException if a gesundheitszeugnis with the primary key could not be found
	 */
	public static Gesundheitszeugnis deleteGesundheitszeugnis(
			long gesundheitszeugnis_id)
		throws PortalException {

		return getService().deleteGesundheitszeugnis(gesundheitszeugnis_id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
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
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Gesundheitszeugnis fetchGesundheitszeugnis(
		long gesundheitszeugnis_id) {

		return getService().fetchGesundheitszeugnis(gesundheitszeugnis_id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the gesundheitszeugnis with the primary key.
	 *
	 * @param gesundheitszeugnis_id the primary key of the gesundheitszeugnis
	 * @return the gesundheitszeugnis
	 * @throws PortalException if a gesundheitszeugnis with the primary key could not be found
	 */
	public static Gesundheitszeugnis getGesundheitszeugnis(
			long gesundheitszeugnis_id)
		throws PortalException {

		return getService().getGesundheitszeugnis(gesundheitszeugnis_id);
	}

	/**
	 * Returns a range of all the gesundheitszeugnises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.GesundheitszeugnisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gesundheitszeugnises
	 * @param end the upper bound of the range of gesundheitszeugnises (not inclusive)
	 * @return the range of gesundheitszeugnises
	 */
	public static List<Gesundheitszeugnis> getGesundheitszeugnises(
		int start, int end) {

		return getService().getGesundheitszeugnises(start, end);
	}

	/**
	 * Returns the number of gesundheitszeugnises.
	 *
	 * @return the number of gesundheitszeugnises
	 */
	public static int getGesundheitszeugnisesCount() {
		return getService().getGesundheitszeugnisesCount();
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
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the gesundheitszeugnis in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GesundheitszeugnisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gesundheitszeugnis the gesundheitszeugnis
	 * @return the gesundheitszeugnis that was updated
	 */
	public static Gesundheitszeugnis updateGesundheitszeugnis(
		Gesundheitszeugnis gesundheitszeugnis) {

		return getService().updateGesundheitszeugnis(gesundheitszeugnis);
	}

	public static GesundheitszeugnisLocalService getService() {
		return _service;
	}

	private static volatile GesundheitszeugnisLocalService _service;

}