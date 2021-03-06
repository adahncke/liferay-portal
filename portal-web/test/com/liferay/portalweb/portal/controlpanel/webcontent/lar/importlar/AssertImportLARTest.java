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

package com.liferay.portalweb.portal.controlpanel.webcontent.lar.importlar;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AssertImportLARTest extends BaseTestCase {
	public void testAssertImportLAR() throws Exception {
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
		selenium.clickAt("link=Control Panel", RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("Web Content"),
			selenium.getText("//div[2]/div[2]/div[2]/ul/li[3]/a"));
		selenium.clickAt("//div[2]/div[2]/div[2]/ul/li[3]/a",
			RuntimeVariables.replace("Web Content"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertTrue(selenium.isElementPresent("//td[2]/a"));
		assertEquals(RuntimeVariables.replace("Test Web Content Article"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("Approved"),
			selenium.getText("//td[4]/a"));
		assertTrue(selenium.isElementPresent("//td[5]/a"));
		assertTrue(selenium.isElementPresent("//td[6]/a"));
		assertEquals(RuntimeVariables.replace("Joe Bloggs"),
			selenium.getText("//td[7]/a"));
		assertTrue(selenium.isElementPresent("//tr[4]/td[2]/a"));
		assertEquals(RuntimeVariables.replace("Test Web Content Article 2"),
			selenium.getText("//tr[4]/td[3]/a"));
		assertEquals(RuntimeVariables.replace("Approved"),
			selenium.getText("//tr[4]/td[4]/a"));
		assertTrue(selenium.isElementPresent("//tr[4]/td[5]/a"));
		assertTrue(selenium.isElementPresent("//tr[4]/td[6]/a"));
		assertEquals(RuntimeVariables.replace("Joe Bloggs"),
			selenium.getText("//tr[4]/td[7]/a"));
		selenium.clickAt("link=Structures", RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("TEST"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace(
				"Test Web Content Structure\nThis is a test web content structure!"),
			selenium.getText("//td[3]/a"));
		selenium.clickAt("link=Templates", RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("TEST"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace(
				"Test Web Content Template\n This is a test web content template!"),
			selenium.getText("//td[3]/a"));
	}
}