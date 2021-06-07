package FunctionalTestSuite.DemoBlaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.SignUp;

public class SignUpTest {
	
	@Test
	public void signUpValidation() {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Vidhya\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		SignUp su = new SignUp(driver);
		su.signUpLink().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		su.signupUsername().sendKeys("Test123");
		su.signUpPassword().sendKeys("Test123");
		su.signUpBtn().click();
	}

}
