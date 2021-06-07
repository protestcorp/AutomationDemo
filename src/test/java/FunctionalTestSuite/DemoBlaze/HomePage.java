package FunctionalTestSuite.DemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class HomePage {
	ExtentReports extent;
	
	
	@BeforeTest
	@Test
	public void config() {
		//Extent Report Extent Spark Reporter
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";//reports will be saved in project path under reports folder with index name
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
	
	}
	
	
	
	@Test
	public void HomePageValidation() {
		
		extent.createTest("Test Report");
		System.setProperty("webdriver.chrome.driver", "Z:\\Vidhya\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		
		extent.flush();
	}

}
