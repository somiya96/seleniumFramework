package pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);


	}

	@FindBy(id = "small-searchterms")
	WebElement searchTextBox;
	
	@FindBy(css = "input.button-1.search-box-button")
	WebElement searchBtn ;
	
	@FindBy(id = "ui-id-1")
	java.util.List<WebElement> ProductList;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement productTitle;
	
	
	public void productSearch(String productName)
	{
		setTextElementText(searchTextBox, productName);
		clickButton(searchBtn);
	}
	
	public void OpenProductDetailePage()
	
	{
		
		clickButton(productTitle);
	}
	
	public void ProductSearchUsingQutoSuggest(String searchTxt) throws InterruptedException
	{
		setTextElementText(searchTextBox, searchTxt);
		Thread.sleep(3000);
		ProductList.get(0).click();
	}
	
	
	
	public void openProductDetailsPage () 
	{
		clickButton(productTitle);
		
		
		
	}
	
}

