package org.jtalks.tests.jcommune.testlink.branch;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.jtalks.tests.jcommune.assertion.Existance.assertElementExistsBySelector;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.clickOnRandomBranch;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.driver;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.mainPage;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.sectionPage;

/**
 * @author masyan
 */
public class JC55BreadCrumbsToBranch {

	@BeforeMethod(alwaysRun = true)
	@Parameters({"app-url"})
	public void setupCase(String appUrl) {
		driver.get(appUrl);
	}

	@Test
	public void BreadCrumbsToBranchTest() {

		clickOnRandomBranch();

		//check breadcrumbs
		assertElementExistsBySelector(driver, mainPage.breadCrumbsForumLinkSel);
		assertElementExistsBySelector(driver, sectionPage.breadCrumbsSectionLinkSel);

	}
}