package testcaseswithouttestng;


import pages.AddressPage;

import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	@Test (priority = 1,groups = {"P1"})
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}
	@Test(description = "verify editing existing delivery address functionality")
	public void verifyEditingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.editAddress("Mumbai");
	}
	
}