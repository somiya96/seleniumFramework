package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase
{

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
    
	@FindBy(partialLinkText = "Apple MacBook Pro 13-inch")
	public WebElement prouductNameprop;
	
	@FindBy(css = "input.button-2.email-a-friend-button")
	WebElement emailFreindBtn;
	
	@FindBy(id = "price-value-4")
	 public WebElement productPriceLbl;
	
	@FindBy(linkText = "Add your review")
	WebElement addReviewLink;
	
	@FindBy(id = "add-to-wishlist-button-4")
	WebElement wishListBtn;
	
	//@FindBy(className = "button-2.add-to-compare-list-button")WebElement addTOCartbtn;
	
	@FindBy(id = "add-to-cart-button-4")
	 public WebElement addToCartBtn; 
	
	
	
	
	public void openSendEmailPage()
	{
		clickButton(emailFreindBtn);
	}
	
	
	public void OpenaddReviewPage()
	{
		clickButton(addReviewLink);
	}
	
	public void AddProductToWishList()
	{
		clickButton(wishListBtn);
	}
	
	
	//public void AddCompareProductsPage(){clickButton(addTOComarebtn);}
	
	
	public void AddToCart()
	{
		
		
		clickButton(addToCartBtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
