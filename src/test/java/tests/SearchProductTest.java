package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.ProductPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase 

{
	
        String productName = "Apple MacBook Pro 13-inch";
        SearchPage searchObject;
        ProductPage productObject;
        
        
	@Test
	 public void UserCanSearchForProducts()
	 {
		searchObject = new SearchPage(driver);
		productObject = new ProductPage(driver);
		searchObject.productSearch(productName);
		searchObject.openProductDetailsPage();
		Assert.assertTrue(productObject.prouductNameprop.getText().equalsIgnoreCase(productName));
	 }
	
	
	
}
