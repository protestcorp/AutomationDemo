package FunctionalTestSuite.DemoBlaze;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class base {

	WebDriver driver;
	
	public void getScreenshotPath(String testCaseName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		
	}
	

}
