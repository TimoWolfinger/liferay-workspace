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

package de.timowolfinger.liferay.beeInformationSystem.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk;
import de.timowolfinger.liferay.beeInformationSystem.service.BienenvolkLocalService;
import de.timowolfinger.liferay.beeInformationSystem.service.BienenvolkLocalServiceUtil;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.AblegerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BehandlungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BeutemassPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenrassePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenvolkPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuetterungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuttermittelPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.GesundheitszeugnisPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HerstellerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HonigerntePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.MedikamentPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.TrachtPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.VoelkerentwicklungPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the bienenvolk local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.BienenvolkLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.BienenvolkLocalServiceImpl
 * @generated
 */
public abstract class BienenvolkLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, BienenvolkLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>BienenvolkLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>BienenvolkLocalServiceUtil</code>.
	 */

	/**
	 * Adds the bienenvolk to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk the bienenvolk
	 * @return the bienenvolk that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Bienenvolk addBienenvolk(Bienenvolk bienenvolk) {
		bienenvolk.setNew(true);

		return bienenvolkPersistence.update(bienenvolk);
	}

	/**
	 * Creates a new bienenvolk with the primary key. Does not add the bienenvolk to the database.
	 *
	 * @param bienenvolk_id the primary key for the new bienenvolk
	 * @return the new bienenvolk
	 */
	@Override
	@Transactional(enabled = false)
	public Bienenvolk createBienenvolk(long bienenvolk_id) {
		return bienenvolkPersistence.create(bienenvolk_id);
	}

	/**
	 * Deletes the bienenvolk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk that was removed
	 * @throws PortalException if a bienenvolk with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Bienenvolk deleteBienenvolk(long bienenvolk_id)
		throws PortalException {

		return bienenvolkPersistence.remove(bienenvolk_id);
	}

	/**
	 * Deletes the bienenvolk from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk the bienenvolk
	 * @return the bienenvolk that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Bienenvolk deleteBienenvolk(Bienenvolk bienenvolk) {
		return bienenvolkPersistence.remove(bienenvolk);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return bienenvolkPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Bienenvolk.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return bienenvolkPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return bienenvolkPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return bienenvolkPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return bienenvolkPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return bienenvolkPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Bienenvolk fetchBienenvolk(long bienenvolk_id) {
		return bienenvolkPersistence.fetchByPrimaryKey(bienenvolk_id);
	}

	/**
	 * Returns the bienenvolk with the primary key.
	 *
	 * @param bienenvolk_id the primary key of the bienenvolk
	 * @return the bienenvolk
	 * @throws PortalException if a bienenvolk with the primary key could not be found
	 */
	@Override
	public Bienenvolk getBienenvolk(long bienenvolk_id) throws PortalException {
		return bienenvolkPersistence.findByPrimaryKey(bienenvolk_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(bienenvolkLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Bienenvolk.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("bienenvolk_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			bienenvolkLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Bienenvolk.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"bienenvolk_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(bienenvolkLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Bienenvolk.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("bienenvolk_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return bienenvolkPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return bienenvolkLocalService.deleteBienenvolk(
			(Bienenvolk)persistedModel);
	}

	@Override
	public BasePersistence<Bienenvolk> getBasePersistence() {
		return bienenvolkPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return bienenvolkPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the bienenvolks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenvolks
	 * @param end the upper bound of the range of bienenvolks (not inclusive)
	 * @return the range of bienenvolks
	 */
	@Override
	public List<Bienenvolk> getBienenvolks(int start, int end) {
		return bienenvolkPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of bienenvolks.
	 *
	 * @return the number of bienenvolks
	 */
	@Override
	public int getBienenvolksCount() {
		return bienenvolkPersistence.countAll();
	}

	/**
	 * Updates the bienenvolk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BienenvolkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenvolk the bienenvolk
	 * @return the bienenvolk that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Bienenvolk updateBienenvolk(Bienenvolk bienenvolk) {
		return bienenvolkPersistence.update(bienenvolk);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			BienenvolkLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		bienenvolkLocalService = (BienenvolkLocalService)aopProxy;

		_setLocalServiceUtilService(bienenvolkLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return BienenvolkLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Bienenvolk.class;
	}

	protected String getModelClassName() {
		return Bienenvolk.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = bienenvolkPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		BienenvolkLocalService bienenvolkLocalService) {

		try {
			Field field = BienenvolkLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, bienenvolkLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected AblegerPersistence ablegerPersistence;

	@Reference
	protected BehandlungPersistence behandlungPersistence;

	@Reference
	protected BeutemassPersistence beutemassPersistence;

	@Reference
	protected BienenrassePersistence bienenrassePersistence;

	protected BienenvolkLocalService bienenvolkLocalService;

	@Reference
	protected BienenvolkPersistence bienenvolkPersistence;

	@Reference
	protected FuetterungPersistence fuetterungPersistence;

	@Reference
	protected FuttermittelPersistence futtermittelPersistence;

	@Reference
	protected GesundheitszeugnisPersistence gesundheitszeugnisPersistence;

	@Reference
	protected HerstellerPersistence herstellerPersistence;

	@Reference
	protected HonigerntePersistence honigerntePersistence;

	@Reference
	protected MedikamentPersistence medikamentPersistence;

	@Reference
	protected TrachtPersistence trachtPersistence;

	@Reference
	protected VoelkerentwicklungPersistence voelkerentwicklungPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}