package testcaseswithouttestng;

import pages.HelpPage;

public class HelpTest extends BaseTest {

	
	public void verifyContactUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("Contact Us");
	}

	public void verifyAboutUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("About Us");
	}

}
