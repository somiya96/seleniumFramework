package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductPage;
import pages.SearchPage;
import pages.WishListPage;

public class AddItemToWishListTest extends TestBase

{

	String productName = "Apple MacBook Pro 13-inch";

	SearchPage searchObject;
    ProductPage productObject;
    WishListPage wishlistObject;
    
	
	@Test (priority = 1)
	public void UserCanSearchWithAutoSuggest() throws InterruptedException
	{
		searchObject = new SearchPage (driver);
		searchObject.ProductSearchUsingQutoSuggest("macb");
		productObject = new ProductPage (driver);
		
	}
	
	
		
	
	@Test(priority = 2)
	public void UsercanaddProductToWishlist()
	{
		productObject =new ProductPage(driver);
		productObject.AddProductToWishList();
		driver.navigate().to("https://demo.nopcommerce.com/wishlist");
		wishlistObject = new WishListPage(driver);
		
	
	}
	@Test(priority = 3)
	public void UsercanRemoveProductToWishlist()
	{
		
		wishlistObject = new WishListPage(driver);
		wishlistObject.RemoveProductfromWishList();
		Assert.assertTrue(wishlistObject.emptyWishListLbl.getText().contains("The wishlist is empty!"));
		
	}
	
	
}
