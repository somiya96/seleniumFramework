package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase
{

	public MyAccountPage(WebDriver driver) {
		super(driver);


	}
	
	@FindBy(partialLinkText = "Change password")
	WebElement changePasswordLink;
	
	@FindBy(id = "OldPassword")
	WebElement oldPasswordtxt;
	
	
	@FindBy(id = "NewPassword")
	WebElement newPasswordtxt;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement confirmNewPasswordTxt;
	
	@FindBy(css = "input.button-1.change-password-button")
	WebElement changePasswordBtn;
	
	//@FindBy(css = "div.result")
	//public WebElement resultLbl;
	
	public void openChangePasswordLink()
	{
		clickButton(changePasswordLink);
	}
	
	public void ChangePassword(String oldpassword , String newpassword)
	{
		setTextElementText(oldPasswordtxt, oldpassword);
		setTextElementText(newPasswordtxt, newpassword);
		clickButton(changePasswordBtn);
	}
	
	
	
	

}
