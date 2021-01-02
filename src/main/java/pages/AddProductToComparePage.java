package pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToComparePage extends PageBase
{

	public AddProductToComparePage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/a")
	WebElement clearListBtn ;
	
	
	//@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table")WebElement   compareTable       ;
	
	@FindBy(tagName = "tr")
	 public java.util.List<WebElement> allRows;
	
	@FindBy(tagName = "td")
	java.util.List<WebElement> allCol;
	
	
	
	
	//@FindBy(linkText = "Apple MacBook Pro 13-inch")public WebElement firstProduct; 
	
	
	//@FindBy(linkText = "Asus N551JK-XO076H Laptop")public WebElement secondProduct; 
	

	
	
	public void ClearCompareList()
	{
		clickButton(clearListBtn);
	}
	 
	public void compareProducts ()
	{
		// get all rows 
		System.out.println(allRows.size());
		
		// get data from all rows 
		for (WebElement row : allRows)
		{
			// \t = tap new line 
			System.out.println(row.getText()+ "\t");
			
			
			for  ( WebElement col : allCol)
			{
				 System.out.println(col.getText()+ "\t");
			}
		}
	}
	
	
	
}
