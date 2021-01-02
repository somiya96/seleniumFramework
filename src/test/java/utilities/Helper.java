package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	// method to take screen shoot when the test case fail 

	public static void captureScreenshoot(WebDriver driver , String screenshootname )
	{

		Path destination = Paths.get("./screenshoot",screenshootname+".png");
		try {
			Files.createDirectories(destination.getParent());
			FileOutputStream out = new FileOutputStream(destination.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();



		} catch (IOException e) {

			System.out.println("exception while taking screenshoot"+ e.getMessage());

			e.printStackTrace();
		}
	}



}
