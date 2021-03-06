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

package com.liferay.portalweb.portal.ldap;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AssertLDAPUsersPresentTest extends BaseTestCase {
	public void testAssertLDAPUsersPresent() throws Exception {
		selenium.open("/web/guest/home/");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Control Panel")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		selenium.click(RuntimeVariables.replace("link=Users"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		selenium.type("//input[@id='_125_toggle_id_enterprise_admin_user_searchkeywords']",
			RuntimeVariables.replace("jane"));
		selenium.saveScreenShotAndSource();
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("Jane"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace("Smith"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("janesmith"),
			selenium.getText("//td[4]/a"));
		assertFalse(selenium.isTextPresent("No users were found."));
		selenium.type("//input[@id='_125_toggle_id_enterprise_admin_user_searchkeywords']",
			RuntimeVariables.replace("luke"));
		selenium.saveScreenShotAndSource();
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("Luke"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace("Skywalker"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("lukeskywalker"),
			selenium.getText("//td[4]/a"));
		assertFalse(selenium.isTextPresent("No users were found."));
		selenium.type("//input[@id='_125_toggle_id_enterprise_admin_user_searchkeywords']",
			RuntimeVariables.replace("martin"));
		selenium.saveScreenShotAndSource();
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("Martin"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace("Luther"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("martinluther"),
			selenium.getText("//td[4]/a"));
		assertFalse(selenium.isTextPresent("No users were found."));
		System.out.println("LDAP Users have been imported into Liferay.");
	}
}