package tests;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTandExelFile extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 
	
	@DataProvider(name = "ExcelData")
	public Object [ ] [ ] userRegistrationData() throws IOException
	
	{
		ExelReader ER = new ExelReader();
		return ER.getExcelData();
		
	}
	
	@Test(priority=1,alwaysRun=true,dataProvider = "ExcelData")
	public void UserCanRegisterSuccssfully
	(String firstname , String lastname , String email, String Password ) 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstname, lastname,email, Password);
		//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.userLogout();
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(email, Password);
		registerObject.userLogout();
		
	}
	
	
	
	
}
