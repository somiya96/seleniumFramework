package tests;

import org.testng.annotations.Test;

import pages.ProductPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AddProductsToShoppingCartTest  extends TestBase

{

	SearchPage searchObject ;
	ProductPage productObject;
	ShoppingCartPage cartObject;
	String ProductName ="Apple MacBook Pro 13-inch";
	
	
	@Test(priority = 1)
	public void UserCanSearchWithAutoSuggest() throws InterruptedException
	{
		searchObject = new SearchPage (driver);
		searchObject.ProductSearchUsingQutoSuggest("macb");
		productObject = new ProductPage (driver);
		
	}

	
	 @Test(priority = 2)
	 public void UsercanAddProductsToShoppingcart() throws InterruptedException
	 {
		 productObject = new ProductPage(driver);
		 productObject.AddToCart();
		 Thread.sleep(1000);
		 driver.navigate().to("https://demo.nopcommerce.com/cart");
		 //cartObject.UpdateproductQuantity("6");
		 
	 }
	
	@Test(priority = 3)
	public void UsercanRemoveProductsFromCart ()
	{
		cartObject = new ShoppingCartPage(driver);
		cartObject.RemoveProductFromCart();
	}
	
	
}
