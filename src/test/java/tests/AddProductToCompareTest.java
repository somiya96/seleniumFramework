package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.AddProductToComparePage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class AddProductToCompareTest extends TestBase
{

	
	
	String firstProductName = "Apple MacBook Pro 13-inch";
	String SecondproductName = "Asus N551JK-XO076H Laptop";
	
	ProductPage prdoductObject;
	HomePage homeObject;
	AddProductToComparePage compareObject;
	SearchPage searchObject;
	
	
	@Test(priority = 1)
	public void UserCanCompareProducts() throws InterruptedException
	{
		searchObject = new SearchPage(driver);
		prdoductObject = new ProductPage(driver);
		compareObject = new AddProductToComparePage(driver);
		homeObject = new HomePage(driver);
		
		searchObject.ProductSearchUsingQutoSuggest("macb");
		Assert.assertTrue(prdoductObject.prouductNameprop.getText().contains(firstProductName));
		prdoductObject.AddCompareProductsPage();
		
		
		searchObject.ProductSearchUsingQutoSuggest("Asus");
		Assert.assertTrue(prdoductObject.prouductNameprop.getText().contains(SecondproductName));
		prdoductObject.AddCompareProductsPage();
		Thread.sleep(1000);
		
		driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
	//	Assert.assertTrue(compareObject.firstProduct.getText().equals(firstProductName));
		//Assert.assertTrue(compareObject.secondProduct.getText().equals(SecondproductName));
		
		compareObject.compareProducts();
		
	}
	
	
	@Test(priority = 2)
	public void UserCanClearCompareList ()
	{
		compareObject.ClearCompareList();
	}
	
}
