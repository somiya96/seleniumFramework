package tests;




import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadPropertiestest;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTandProperitiesFile extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ;
	String firstName=
			LoadPropertiestest.userdata.getProperty("firstName");
	String lastName = 
			LoadPropertiestest.userdata.getProperty("lastName");
	String email=
			LoadPropertiestest.userdata.getProperty("email");
	String password =
			LoadPropertiestest.userdata.getProperty("password");		

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstName, lastName, email, password);
		//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(priority = 2)
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
	}

	@Test(priority = 3)
	public void RegisteredUserCanLogin() 
	{
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(email, password);
		Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}
}
