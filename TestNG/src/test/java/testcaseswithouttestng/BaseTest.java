package testcaseswithouttestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public void launchBrowser() {
		System.out.println("Launching browser.");
	}
	
	public void openUrl() {
		System.out.println("Opening url.");
	}
	
	public void login() {
		System.out.println("Login into application.");
	}
	
	public void logout() {
		System.out.println("Logout from application.");
	}
	
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	
}
