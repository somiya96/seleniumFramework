package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductReviewPage  extends PageBase

{

	public ProductReviewPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = "//*[@id=\"AddProductReview_Title\"]")
	WebElement reviewTitleTxt;
	
	@FindBy(xpath = "//*[@id=\"AddProductReview_ReviewText\"]")
	WebElement reviewTxt;
	
	@FindBy(id = "addproductrating_1")
	WebElement ratingRadioBtn;
	
	@FindBy(name = "add-review")
	 public WebElement submitReviewtn;
	
	public void AddProductReview(String  reviewTitle   , String  reviewMessage)
	
	{
		setTextElementText(reviewTitleTxt, reviewTitle);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		setTextElementText(reviewTxt, reviewMessage);
		//clickButton(ratingRadioBtn);
		clickButton(submitReviewtn);
	}
	
	
	
	
	

}
