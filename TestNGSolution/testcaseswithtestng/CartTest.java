package testcaseswithtestng;

import pages.CartPage;

import org.testng.annotations.Test;

public class CartTest extends BaseTest{
	
	@Test (priority = 2,groups = {"P2"})
	public void verifyMovingPrdToWishList() {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList("IPhone-13");
	}
	
	@Test (priority = 1,groups = {"P1"})
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();
	}
	
}
