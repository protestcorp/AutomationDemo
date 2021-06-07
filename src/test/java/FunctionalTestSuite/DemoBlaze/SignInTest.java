package FunctionalTestSuite.DemoBlaze;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest {
	private static final Logger logger = LogManager.getLogger(LoginTest.class.getName());
	@Test
	public void SignInValidation() {
		Assert.assertTrue(true);
		System.out.println("SignIn Test");
		logger.error("This is an Error");
		
		logger.trace("This is for trace");
		
		}
	
}
