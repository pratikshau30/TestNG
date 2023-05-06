package testcaseswithouttestng;

import pages.HelpPage;

import org.testng.annotations.Test;

public class HelpTest extends BaseTest {
@Test(priority = 3,groups = {"P3"},dependsOnGroups = {"P2"})
	public void verifyContactUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("Contact Us");
	}
	@Test(priority = 3,groups = {"P3"},dependsOnGroups = {"P2"})
	public void verifyAboutUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("About Us");
	}

}
