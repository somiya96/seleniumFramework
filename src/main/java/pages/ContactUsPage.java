package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage  extends PageBase
{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "FullName")
	WebElement fullNameTxt;
	
	@FindBy(id = "Email")
	WebElement emailTxt;
	
	@FindBy(id = "Enquiry")
	WebElement enquirylTxt;
	
	@FindBy(name = "send-email")
	WebElement submiBtn;
	
	@FindBy(id = "div.result")
	 public WebElement susseccmssege;
	
	public void cotactUs(String fullName , String email, String enquiry)
	{
		setTextElementText(fullNameTxt, fullName);
		setTextElementText(emailTxt, email);
		setTextElementText(enquirylTxt, enquiry);
		clickButton(submiBtn);
		
		
	}
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	

