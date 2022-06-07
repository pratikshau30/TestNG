package testcaseswithouttestng;

import pages.OrderTrackingPage;

import org.testng.annotations.Test;

public class OrderTrackingTest extends BaseTest{

	public void verifyOrderTracking() {
		OrderTrackingPage orderTrackingPage = new OrderTrackingPage();
		orderTrackingPage.trackOrder("order_987684");
	}
}
