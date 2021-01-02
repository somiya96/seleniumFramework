package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage  extends PageBase

{

	public WishListPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath =  "td.product-name")
	WebElement productCell;
	
	@FindBy(css= "h1")
	WebElement wishlistHeader;
	
	
	@FindBy(name  = "updatecart")
	WebElement updateWishListBtn;
	
	
	@FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[1]")
	WebElement removeFromWishListBtn;
	
	
	@FindBy(css= "div.no-data")
	 public WebElement emptyWishListLbl;
	
	public void RemoveProductfromWishList()
	{
		clickButton(removeFromWishListBtn);
		clickButton(updateWishListBtn);
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
