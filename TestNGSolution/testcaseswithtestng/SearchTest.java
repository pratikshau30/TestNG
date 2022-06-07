package testcaseswithtestng;

import pages.SearchPage;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	@Test (priority = 2,groups = {"P2"})
	public void verifySearchProduct() {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct("Iphone-13");
	}
}
