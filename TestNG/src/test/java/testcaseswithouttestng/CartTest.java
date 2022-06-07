package testcaseswithouttestng;

import pages.CartPage;

public class CartTest extends BaseTest{
	
	public void verifyMovingPrdToWishList() {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList("IPhone-13");
	}
	
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();
	}
	
}
