package testcaseswithouttestng;

import pages.LoginPage;

public class LoginTest extends BaseTest{

	
	public void verifyValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
	
	public void verifyInValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin123");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
}
