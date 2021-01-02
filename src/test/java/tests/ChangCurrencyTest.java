package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class ChangCurrencyTest extends TestBase

{

	HomePage homeObject;
	ProductPage productObject;
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
   
	
	
	
	@Test(priority = 1)
	public void userCanChangeCurrency()
	{
		homeObject = new HomePage(driver);
		homeObject.changeCurrency();
		
		
	}
	
	@Test (priority = 2)
	public void UserCanSearchWithAutoSuggest() throws InterruptedException
	{
		searchObject = new SearchPage (driver);
		searchObject.ProductSearchUsingQutoSuggest("macb");
		productObject = new ProductPage (driver);
		Assert.assertTrue(productObject.productPriceLbl.getText().contains("€"));
		System.out.println(productObject.productPriceLbl.getText());
	}
	
	
	
	
	
	
}
