package testcaseswithouttestng;

import pages.OrderHistoryPage;

public class OrderHistroyTest extends BaseTest{

	public void viewOrderHistory() {
		OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
		orderHistoryPage.orderHistory("12");
	}
}
