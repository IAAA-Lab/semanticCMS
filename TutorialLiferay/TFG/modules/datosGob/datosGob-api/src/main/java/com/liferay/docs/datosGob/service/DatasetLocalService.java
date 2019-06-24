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

package com.liferay.docs.datosGob.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.datosGob.model.Dataset;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Dataset. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author liferay
 * @see DatasetLocalServiceUtil
 * @see com.liferay.docs.datosGob.service.base.DatasetLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.impl.DatasetLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DatasetLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DatasetLocalServiceUtil} to access the dataset local service. Add custom service methods to {@link com.liferay.docs.datosGob.service.impl.DatasetLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dataset to the database. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Dataset addDataset(Dataset dataset);

	public Dataset addDataset(String datasetId, String homepage,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Creates a new dataset with the primary key. Does not add the dataset to the database.
	*
	* @param datasetId the primary key for the new dataset
	* @return the new dataset
	*/
	@Transactional(enabled = false)
	public Dataset createDataset(String datasetId);

	/**
	* Deletes the dataset from the database. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Dataset deleteDataset(Dataset dataset);

	/**
	* Deletes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset that was removed
	* @throws PortalException if a dataset with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Dataset deleteDataset(String datasetId) throws PortalException;

	public Dataset deleteDataset(String datasetId, ServiceContext serviceContext)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dataset fetchDataset(String datasetId);

	/**
	* Returns the dataset matching the UUID and group.
	*
	* @param uuid the dataset's UUID
	* @param groupId the primary key of the group
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dataset fetchDatasetByUuidAndGroupId(String uuid, long groupId);

	/**
	* Returns the dataset with the primary key.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset
	* @throws PortalException if a dataset with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dataset getDataset(String datasetId) throws PortalException;

	/**
	* Returns the dataset matching the UUID and group.
	*
	* @param uuid the dataset's UUID
	* @param groupId the primary key of the group
	* @return the matching dataset
	* @throws PortalException if a matching dataset could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dataset getDatasetByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the datasets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @return the range of datasets
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dataset> getDatasets(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dataset> getDatasets(long groupId, String coleccionId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dataset> getDatasets(long groupId, String coleccionId,
		int start, int end) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dataset> getDatasets(long groupId, String coleccionId,
		int start, int end, OrderByComparator<Dataset> obc);

	/**
	* Returns the number of datasets.
	*
	* @return the number of datasets
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDatasetsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDatasetsCount(long groupId, String coleccionId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the dataset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Dataset updateDataset(Dataset dataset);
}