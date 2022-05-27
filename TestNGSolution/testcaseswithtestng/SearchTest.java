package testcaseswithtestng;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest extends BaseTest{
	
	@Test
	public void verifySearchProduct() {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct("Iphone-13");
	}
}
