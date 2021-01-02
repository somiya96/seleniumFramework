package tests;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase
{

	HomePage home;
	ContactUsPage contactPage;
	
	String email = "mmmmmmmmmmmtest@test.com";
	String fullNmame = "somiya";
	String enquiry = " we can do it ";
	
	
	@Test
	public void UserCanContactUs ()
	
	{
		home = new HomePage(driver);
		home.openContactUsPage();
		contactPage = new ContactUsPage(driver);
		contactPage.cotactUs(fullNmame , email, enquiry);
		
	}
			
			
	
	
	
	
	
	
	
	
	
}
