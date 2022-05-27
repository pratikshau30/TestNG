package testcaseswithouttestng;

import pages.ProductReviewPage;

import org.testng.annotations.Test;

public class ProductReviewTest extends BaseTest {
	public void verifyAddingReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview("Good");
	}

	public void verifyEditReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview("Excellent");
	}
}
