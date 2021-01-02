package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest  extends TestBase{
	

        HomePage homeObject ; 
		UserRegistrationPage registerObject ; 
		LoginPage loginObject ; 
		MyAccountPage myaccountobject;
		String oldPassword = "kkkcxxcmd3456789" ;
		String newPassword = "cmd654321" ;
		String email =" csxxo@test.com";
		String firstName = "somiys";
		String lastName = "omar";
		
		
		
		@Test(priority=1)
		public void UserCanRegisterSuccssfully() 
		{
			homeObject = new HomePage(driver); 
			homeObject.openRegistrationPage();
			registerObject = new UserRegistrationPage(driver); 
			registerObject.userRegistration(firstName, lastName, email, oldPassword);
			//Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		}
		
		
		@Test(priority = 2)
		public void RegisterdUserCanChangePassword ()
		{
			myaccountobject = new MyAccountPage(driver);
			registerObject.openMyAccountPage();
			myaccountobject.openChangePasswordLink();
			myaccountobject.ChangePassword(oldPassword, newPassword);
			//Assert.assertTrue(myaccountobject.resultLbl.getText().contains("Password was changed"));
		}
		
		@Test(priority =3 )
		public void RegisteredUserCanLogout() 
		{
			registerObject.userLogout();
		}
		
		@Test(priority = 4 )
		public void RegisteredUserCanLogin() 
		{
			homeObject.openLoginPage();
			loginObject = new LoginPage(driver); 
			loginObject.UserLogin(email,  newPassword);
			//Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
		}
		

}
