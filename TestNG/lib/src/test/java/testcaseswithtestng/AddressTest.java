package testcaseswithtestng;


import org.testng.annotations.Test;

import pages.AddressPage;

public class AddressTest extends BaseTest{
	
	@Test
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
		System.out.println("Test");
	}
	
}
