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

package com.liferay.portal.upgrade.v4_3_0.util;

import java.sql.Types;

/**
 * @author	  Brian Wing Shun Chan
 * @generated
 */
public class BlogsCategoryTable {

	public static String TABLE_NAME = "BlogsCategory";

	public static Object[][] TABLE_COLUMNS = {
		{"categoryId", Types.BIGINT},
		{"companyId", Types.BIGINT},
		{"userId", Types.BIGINT},
		{"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"parentCategoryId", Types.BIGINT},
		{"name", Types.VARCHAR},
		{"description", Types.VARCHAR}
	};

	public static String TABLE_SQL_CREATE = "create table BlogsCategory (categoryId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,parentCategoryId LONG,name VARCHAR(75) null,description STRING null)";

	public static String TABLE_SQL_DROP = "drop table BlogsCategory";

	public static final String[] TABLE_SQL_ADD_INDEXES = {
		"create index IX_C49DD10C on BlogsCategory (parentCategoryId)"
	};

}