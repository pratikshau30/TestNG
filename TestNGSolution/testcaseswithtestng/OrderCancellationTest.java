package testcaseswithtestng;

import pages.OrderCancellationPage;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest{
	
	@Test (priority = 1,groups = {"P1"})
	public void verifyProductCancellation() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation("order_987684");
	}

	@Test (priority = 1,groups = {"P1"}, dependsOnMethods = "verifyProductCancellation", enabled=false)
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
