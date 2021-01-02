package tests;


import org.testng.annotations.Test;

import pages.EmailFriendPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class EmailFriendTest extends TestBase


{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
    ProductPage productObject;
    EmailFriendPage emailObject;
    

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("Moataz", "Nabil", "mnnnlarin775@gmail.com", "mn12345678");
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
	public void RegisterdUserCanSendprouductsToFreind()
	{
		productObject.openSendEmailPage();
		emailObject = new EmailFriendPage(driver);
		emailObject.SendEmailToFreind("sewa@test.com", "check that awesome product pro..!");
		//Assert.assertTrue(emailObject.messageNotification.getText().contains("Your message has been sent "));
	}
	
	
	
	@Test(priority = 4)
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
	}
	
	
	
	
	
	
	
	
}
