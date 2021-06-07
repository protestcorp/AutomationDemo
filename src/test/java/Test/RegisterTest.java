package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import FunctionalTestSuite.DemoBlaze.LoginTest;

public class RegisterTest {
	private static final Logger logger = LogManager.getLogger(LoginTest.class.getName());
	
	@Test
	public void Register() {
		System.out.println("User is registered");
		logger.error("Unable to register");
	
	}

}
