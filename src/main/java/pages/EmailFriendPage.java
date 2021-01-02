package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage  extends PageBase

{

	public EmailFriendPage(WebDriver driver) {
		super(driver);


	}
     
	@FindBy(id = "FriendEmail")
	WebElement emailFriendTxt;
	
	@FindBy(id = "PersonalMessage")
	WebElement personalMessageTxt;
	
	@FindBy(name = "send-email")
	WebElement sendEmailBtn;
	
	//@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")
	// public WebElement messageNotification;
	
	public void SendEmailToFreind (String friendEmail , String PersonalMessage )
	{
		setTextElementText(emailFriendTxt, friendEmail);
		setTextElementText(personalMessageTxt, PersonalMessage);
		clickButton(sendEmailBtn);
	}
	
	
	
	
	
	
	
	
	
	
}
