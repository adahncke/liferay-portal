/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.documentlibrary.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DLFileEntry service. Represents a row in the &quot;DLFileEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.documentlibrary.model.impl.DLFileEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.documentlibrary.model.impl.DLFileEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLFileEntry
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryModelImpl
 * @generated
 */
public interface DLFileEntryModel extends BaseModel<DLFileEntry>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a document library file entry model instance should use the {@link DLFileEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this document library file entry.
	 *
	 * @return the primary key of this document library file entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this document library file entry.
	 *
	 * @param primaryKey the primary key of this document library file entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this document library file entry.
	 *
	 * @return the uuid of this document library file entry
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this document library file entry.
	 *
	 * @param uuid the uuid of this document library file entry
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the file entry ID of this document library file entry.
	 *
	 * @return the file entry ID of this document library file entry
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this document library file entry.
	 *
	 * @param fileEntryId the file entry ID of this document library file entry
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the group ID of this document library file entry.
	 *
	 * @return the group ID of this document library file entry
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this document library file entry.
	 *
	 * @param groupId the group ID of this document library file entry
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this document library file entry.
	 *
	 * @return the company ID of this document library file entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this document library file entry.
	 *
	 * @param companyId the company ID of this document library file entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this document library file entry.
	 *
	 * @return the user ID of this document library file entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this document library file entry.
	 *
	 * @param userId the user ID of this document library file entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this document library file entry.
	 *
	 * @return the user uuid of this document library file entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this document library file entry.
	 *
	 * @param userUuid the user uuid of this document library file entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this document library file entry.
	 *
	 * @return the user name of this document library file entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this document library file entry.
	 *
	 * @param userName the user name of this document library file entry
	 */
	public void setUserName(String userName);

	/**
	 * Returns the version user ID of this document library file entry.
	 *
	 * @return the version user ID of this document library file entry
	 */
	public long getVersionUserId();

	/**
	 * Sets the version user ID of this document library file entry.
	 *
	 * @param versionUserId the version user ID of this document library file entry
	 */
	public void setVersionUserId(long versionUserId);

	/**
	 * Returns the version user uuid of this document library file entry.
	 *
	 * @return the version user uuid of this document library file entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getVersionUserUuid() throws SystemException;

	/**
	 * Sets the version user uuid of this document library file entry.
	 *
	 * @param versionUserUuid the version user uuid of this document library file entry
	 */
	public void setVersionUserUuid(String versionUserUuid);

	/**
	 * Returns the version user name of this document library file entry.
	 *
	 * @return the version user name of this document library file entry
	 */
	@AutoEscape
	public String getVersionUserName();

	/**
	 * Sets the version user name of this document library file entry.
	 *
	 * @param versionUserName the version user name of this document library file entry
	 */
	public void setVersionUserName(String versionUserName);

	/**
	 * Returns the create date of this document library file entry.
	 *
	 * @return the create date of this document library file entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this document library file entry.
	 *
	 * @param createDate the create date of this document library file entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this document library file entry.
	 *
	 * @return the modified date of this document library file entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this document library file entry.
	 *
	 * @param modifiedDate the modified date of this document library file entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the repository ID of this document library file entry.
	 *
	 * @return the repository ID of this document library file entry
	 */
	public long getRepositoryId();

	/**
	 * Sets the repository ID of this document library file entry.
	 *
	 * @param repositoryId the repository ID of this document library file entry
	 */
	public void setRepositoryId(long repositoryId);

	/**
	 * Returns the folder ID of this document library file entry.
	 *
	 * @return the folder ID of this document library file entry
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this document library file entry.
	 *
	 * @param folderId the folder ID of this document library file entry
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the name of this document library file entry.
	 *
	 * @return the name of this document library file entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this document library file entry.
	 *
	 * @param name the name of this document library file entry
	 */
	public void setName(String name);

	/**
	 * Returns the extension of this document library file entry.
	 *
	 * @return the extension of this document library file entry
	 */
	@AutoEscape
	public String getExtension();

	/**
	 * Sets the extension of this document library file entry.
	 *
	 * @param extension the extension of this document library file entry
	 */
	public void setExtension(String extension);

	/**
	 * Returns the mime type of this document library file entry.
	 *
	 * @return the mime type of this document library file entry
	 */
	@AutoEscape
	public String getMimeType();

	/**
	 * Sets the mime type of this document library file entry.
	 *
	 * @param mimeType the mime type of this document library file entry
	 */
	public void setMimeType(String mimeType);

	/**
	 * Returns the title of this document library file entry.
	 *
	 * @return the title of this document library file entry
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this document library file entry.
	 *
	 * @param title the title of this document library file entry
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this document library file entry.
	 *
	 * @return the description of this document library file entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this document library file entry.
	 *
	 * @param description the description of this document library file entry
	 */
	public void setDescription(String description);

	/**
	 * Returns the extra settings of this document library file entry.
	 *
	 * @return the extra settings of this document library file entry
	 */
	@AutoEscape
	public String getExtraSettings();

	/**
	 * Sets the extra settings of this document library file entry.
	 *
	 * @param extraSettings the extra settings of this document library file entry
	 */
	public void setExtraSettings(String extraSettings);

	/**
	 * Returns the file entry type ID of this document library file entry.
	 *
	 * @return the file entry type ID of this document library file entry
	 */
	public long getFileEntryTypeId();

	/**
	 * Sets the file entry type ID of this document library file entry.
	 *
	 * @param fileEntryTypeId the file entry type ID of this document library file entry
	 */
	public void setFileEntryTypeId(long fileEntryTypeId);

	/**
	 * Returns the version of this document library file entry.
	 *
	 * @return the version of this document library file entry
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this document library file entry.
	 *
	 * @param version the version of this document library file entry
	 */
	public void setVersion(String version);

	/**
	 * Returns the size of this document library file entry.
	 *
	 * @return the size of this document library file entry
	 */
	public long getSize();

	/**
	 * Sets the size of this document library file entry.
	 *
	 * @param size the size of this document library file entry
	 */
	public void setSize(long size);

	/**
	 * Returns the read count of this document library file entry.
	 *
	 * @return the read count of this document library file entry
	 */
	public int getReadCount();

	/**
	 * Sets the read count of this document library file entry.
	 *
	 * @param readCount the read count of this document library file entry
	 */
	public void setReadCount(int readCount);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(DLFileEntry dlFileEntry);

	public int hashCode();

	public DLFileEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}