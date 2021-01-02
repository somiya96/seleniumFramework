package tests;




import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTandJSON extends TestBase
{
		
	
	
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() throws FileNotFoundException, IOException, ParseException 
	{   
		JsonDataReader jsonreader = new JsonDataReader();
		jsonreader.JsonReader();
		
		
		
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(jsonreader.firstname, jsonreader.lastname, jsonreader.email, jsonreader.password);
		//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.userLogout();
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(jsonreader.email, jsonreader.password);
		registerObject.userLogout();
		
	}
	
	
	
}
