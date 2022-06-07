package testcaseswithtestng;

import pages.AddressPage;

import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	
	@Test (priority = 1,groups = {"P1"})
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}
	
	@Test (priority = 2,groups = {"P2"})
	public void verifyEditingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.editAddress("Mumbai");
	}
	
}