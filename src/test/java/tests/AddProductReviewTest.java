package tests;

import org.testng.annotations.Test;

import pages.EmailFriendPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ProductReviewPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class AddProductReviewTest  extends TestBase

{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
    ProductPage productObject;
    ProductReviewPage reviewObject;

    

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("Moataz", "Nabil", "start5@gmail.com", "mn12345678");
		//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}
	

	@Test (priority = 2)
	public void UserCanSearchWithAutoSuggest() throws InterruptedException 
	{
		searchObject = new SearchPage (driver);
		
			searchObject.ProductSearchUsingQutoSuggest("macb");
		productObject = new ProductPage (driver);
		
	}
	
	@Test (priority = 3)
	public void RegisterdUserCanReviewProducts()
	{
		productObject.OpenaddReviewPage();
		reviewObject = new ProductReviewPage(driver);
		reviewObject.AddProductReview("review", "nice one <3");
		
	}
	
	
	
	@Test(priority = 4)
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
	}
	
	
	
	
	
	

}
