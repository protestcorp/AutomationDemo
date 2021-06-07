package FunctionalTestSuite.DemoBlaze;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	void OnTestFailure(ITestResult result) throws IOException
	{
		base b = new base();
		String testMethodName = result.getMethod().getMethodName();
		b.getScreenshotPath(testMethodName);
	}
	
	
	}
