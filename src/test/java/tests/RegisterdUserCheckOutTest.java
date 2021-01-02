package tests;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import pages.UserRegistrationPage;

public class RegisterdUserCheckOutTest  extends TestBase
{

	
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject ;
	ProductPage productObject;
	ShoppingCartPage cartObject;
	CheckOutPage checkoutObject;
	

	

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("Moataz", "Nabil", "floramsm@gmail.com", "mn12345678");
		//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}
	
	@Test (priority = 2)
	public void UserCanSearchWithAutoSuggest() throws InterruptedException
	{
		searchObject = new SearchPage (driver);
		searchObject.ProductSearchUsingQutoSuggest("macb");
		productObject = new ProductPage (driver);
		
	}
	
	
	
	@Test(priority = 3)
	public void UsercanAddProductsToShoppingcart() throws InterruptedException
	 {
		 productObject = new ProductPage(driver);
		 productObject.AddToCart();
		 Thread.sleep(1000);
		 driver.navigate().to("https://demo.nopcommerce.com/cart");
		 //cartObject.UpdateproductQuantity("6");
		 
	 }
	
	@Test (priority = 4)
	public void UserCanChechoutProduct () throws InterruptedException
	{
		checkoutObject = new CheckOutPage(driver);
		cartObject = new ShoppingCartPage(driver);
		cartObject.OpencheckoutPage();
		 checkoutObject.RegisterdUserCanCheckOutProduct
		 ("Egypt", "test", "123456","01065355221", "cairo");                          
		
		
	}
	
	
	@Test (priority = 5)
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
	}
	
	
	
	
	
	
	
	
}
