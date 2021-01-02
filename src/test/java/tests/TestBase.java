package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBase extends AbstractTestNGCucumberTests
{

	public static WebDriver driver;

	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional ("chrome") String browserName )
	{   
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",  
					"C:\\Users\\SOMIYA\\Desktop\\chrome\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",  
					"C:\\Users\\SOMIYA\\Desktop\\fire\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
		//driver.manage().window().maximize();
       //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.navigate().to("https://demo.nopcommerce.com/");
	}

	//@AfterSuite
	//public void stopDriver()
	//{driver.quit();}
	
	@AfterMethod
	public void screenshootOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			System.out.println("failed.. taking screen shoot ....");
			Helper.captureScreenshoot(driver, result.getName());
			
		}
		
		
		
	}
	
	
	
	
	
	
	

}
