package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase

{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(className =    "remove-from-cart")
	WebElement removeCheckBtn;
	
	@FindBy(name="updatecart")
	WebElement updateCartBtn;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table/thead/tr/th[7]")
	WebElement totalLbl;
	
	
	@FindBy(id="itemquantity11215")
	WebElement QuantityText;
	
	
	@FindBy(id ="checkout" )
	WebElement checkouttn ;
	
	@FindBy(id ="termsofservice" )
	WebElement agreeCheckBox ;
	
	
	public void  RemoveProductFromCart()
	{
		
		clickButton(removeCheckBtn);
		clickButton(updateCartBtn);
	}
	
	
	public void UpdateproductQuantity(String quantity)
	{
		
		
		//ClearText(QuantityText);
		setTextElementText(QuantityText, quantity);
		clickButton(updateCartBtn);
	}
	
	
	
	public void OpencheckoutPage() {
		
		clickButton(agreeCheckBox);
		clickButton(checkouttn);
	}
	
	
	
}
