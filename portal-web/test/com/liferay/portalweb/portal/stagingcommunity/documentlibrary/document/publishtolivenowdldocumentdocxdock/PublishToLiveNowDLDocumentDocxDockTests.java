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

package com.liferay.portalweb.portal.stagingcommunity.documentlibrary.document.publishtolivenowdldocumentdocxdock;

import com.liferay.portalweb.portal.BaseTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class PublishToLiveNowDLDocumentDocxDockTests extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTestSuite(AddCommunityTest.class);
		testSuite.addTestSuite(AddCommunityPublicPageTest.class);
		testSuite.addTestSuite(AddCommunityPublicPagePortletDLTest.class);
		testSuite.addTestSuite(
			ConfigureCommunityStagingTypeLocalLiveDLTest.class);
		testSuite.addTestSuite(AddStageDLDocumentDocxTest.class);
		testSuite.addTestSuite(PublishToLiveNowDLDocumentDocxDockTest.class);
		testSuite.addTestSuite(TearDownCommunityTest.class);

		return testSuite;
	}

}