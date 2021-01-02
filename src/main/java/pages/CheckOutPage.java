package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage  extends PageBase
{

	public CheckOutPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id ="BillingNewAddress_FirstName")
	WebElement firstnameTxt;
	
	@FindBy(id ="BillingNewAddress_LastName")
	WebElement lastnameTxt;
	
	@FindBy(id ="BillingNewAddress_Email")
	WebElement emailTxt;
	
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countryTxt;

	@FindBy(id ="BillingNewAddress_City")
	WebElement cityTxt;

	@FindBy(id ="BillingNewAddress_Address1")
	WebElement addressTxt;

	@FindBy( id ="BillingNewAddress_CountryId")
	WebElement zipTxt;
	
	@FindBy(id ="BillingNewAddress_PhoneNumber")
	WebElement phoneTxt;
	
	@FindBy(css = "input.button-1.new-address-next-step-button")
	WebElement continueBtn;
	
	@FindBy(xpath = "//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label")
	WebElement shippingMethodBtn;
	
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement continu2Btn;
	
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement continu3Btn;
	
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement continu4Btn;
	
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement confirmBtn;
	
	@FindBy(tagName = "h1")
	WebElement thankyou;
	
	@FindBy(linkText = "Click here for order details.")
	WebElement orderdetailsLink;
	
	@FindBy(css = "input.button-1.checkout-as-guest-button")
	WebElement gesutBtn;
	
	 public void RegisterdUserCanCheckOutProduct(String countryName ,
			 String address ,String postalcode ,
			 String  phone  ,String city  ) throws InterruptedException
	 {
		 
		 select = new Select(countryTxt);
		 select.selectByVisibleText(countryName);
		 setTextElementText(cityTxt, city);
		 setTextElementText(addressTxt,address);
		 setTextElementText(zipTxt, postalcode);
		 setTextElementText(phoneTxt, phone);
		 
		 clickButton(continueBtn);
		 clickButton(continu2Btn);
		 clickButton(continu3Btn);
		 Thread.sleep(1000);
		 
		 clickButton(continu4Btn);
		 Thread.sleep(1000);
		 clickButton(confirmBtn);
	
	 }
	
	public void checkoutAsGuset ()
	{
		clickButton(gesutBtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
