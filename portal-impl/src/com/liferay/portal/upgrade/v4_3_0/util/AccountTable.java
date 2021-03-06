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
public class AccountTable {

	public static String TABLE_NAME = "Account_";

	public static Object[][] TABLE_COLUMNS = {
		{"accountId", Types.BIGINT},
		{"companyId", Types.BIGINT},
		{"userId", Types.BIGINT},
		{"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"parentAccountId", Types.BIGINT},
		{"name", Types.VARCHAR},
		{"legalName", Types.VARCHAR},
		{"legalId", Types.VARCHAR},
		{"legalType", Types.VARCHAR},
		{"sicCode", Types.VARCHAR},
		{"tickerSymbol", Types.VARCHAR},
		{"industry", Types.VARCHAR},
		{"type_", Types.VARCHAR},
		{"size_", Types.VARCHAR}
	};

	public static String TABLE_SQL_CREATE = "create table Account_ (accountId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,parentAccountId LONG,name VARCHAR(75) null,legalName VARCHAR(75) null,legalId VARCHAR(75) null,legalType VARCHAR(75) null,sicCode VARCHAR(75) null,tickerSymbol VARCHAR(75) null,industry VARCHAR(75) null,type_ VARCHAR(75) null,size_ VARCHAR(75) null)";

	public static String TABLE_SQL_DROP = "drop table Account_";

	public static final String[] TABLE_SQL_ADD_INDEXES = {
	};

}