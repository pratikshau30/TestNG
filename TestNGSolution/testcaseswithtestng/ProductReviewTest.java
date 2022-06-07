package testcaseswithtestng;

import pages.ProductReviewPage;

import org.testng.annotations.Test;

public class ProductReviewTest extends BaseTest{
	@Test (priority = 2,groups = {"P2"})
	public void verifyAddingReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview("Good");
	}

	@Test (priority = 2,groups = {"P2"})
	public void verifyEditReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview("Excellent");
	}
}