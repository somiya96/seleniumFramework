package tests;

import org.testng.annotations.Test;

import pages.ProductPage;
import pages.SearchPage;

public class SearchusingAutoSuggest extends TestBase



{
	String productName = "Apple MacBook Pro 13-inch";

	SearchPage searchObject;
    ProductPage productObject;
	
	@Test 
	public void UserCanSearchWithAutoSuggest() throws InterruptedException
	{
		searchObject = new SearchPage (driver);
		searchObject.ProductSearchUsingQutoSuggest("macb");
		productObject = new ProductPage (driver);
		
	}
	
}
