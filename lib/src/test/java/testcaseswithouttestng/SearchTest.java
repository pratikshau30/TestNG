package testcaseswithouttestng;

import pages.SearchPage;

public class SearchTest extends BaseTest{
	
	public void verifySearchProduct() {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct("Iphone-13");
	}
}
