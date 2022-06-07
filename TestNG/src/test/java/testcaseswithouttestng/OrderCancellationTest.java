package testcaseswithouttestng;



import pages.OrderCancellationPage;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest{
	
	public void verifyProductCancellation() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation("order_987684");
	}

	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
