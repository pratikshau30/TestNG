package testcaseswithouttestng;


import pages.AddressPage;

import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}
	
	public void verifyEditingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.editAddress("Mumbai");
	}
	
}