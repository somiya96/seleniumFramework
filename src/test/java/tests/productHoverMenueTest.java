package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class productHoverMenueTest extends TestBase
{
      HomePage homeObject ;
      

	@Test
	public void UserCanSelectSubCategoryFromMainMenu()
	{
		
		
		homeObject = new HomePage(driver);
		
		homeObject.selectNoteBookMenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
		
		
	}
	
	
	
	
	
	
}
