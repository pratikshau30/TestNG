package testcaseswithouttestng;

import pages.SearchPage;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	public void verifySearchProduct() {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct("Iphone-13");
	}
}
