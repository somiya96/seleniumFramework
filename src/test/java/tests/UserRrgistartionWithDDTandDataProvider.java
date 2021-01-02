package tests;

//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRrgistartionWithDDTandDataProvider extends TestBase
{

	
	
	
	@DataProvider(name = "testData" )
	public static Object []  [] userData()
	{
		
		return new Object []  [] {
			{"ali", "mahmod" ,"llppvali@test.com" , "123456"} ,
			
			{"ahmed", "taha", "ovahmeed@test.com","123456789"}     
			};
		
	}
	

	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 

	@Test(priority=1,alwaysRun=true ,dataProvider = "testData")
	public void UserCanRegisterSuccssfully(String fname ,String lname, String Email , String Password ) 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(fname , lname , Email , Password);
		//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.userLogout();
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(Email, Password);
		registerObject.userLogout();
	}
	
	
}


