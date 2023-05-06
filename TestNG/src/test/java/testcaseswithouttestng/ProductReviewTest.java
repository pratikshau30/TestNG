package testcaseswithouttestng;

import pages.ProductReviewPage;

import org.testng.annotations.Test;

public class ProductReviewTest extends BaseTest{
      @Test(priority = 1,description="Verify editing review for purchase product")
	public void verifyAddingReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview("Good");
	}
    @Test(dependsOnMethods =   {"verifyAddingReview"})
	public void verifyEditReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview("Excellent");
	}
}