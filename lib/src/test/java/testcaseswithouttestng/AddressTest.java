package testcaseswithouttestng;


import pages.AddressPage;

public class AddressTest extends BaseTest{
	
	
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}
	
}
