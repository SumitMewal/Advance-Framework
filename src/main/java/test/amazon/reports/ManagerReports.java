package test.amazon.reports;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ManagerReports {

	// In parallel execution all the details are attatched to the 2nd test instead of both the test 
	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();
	 static ExtentTest getExtReport()
	{
		return extTest.get();

	}
	 static void setExtReport(ExtentTest test)
	{ 
		extTest.set(test);

	}
	 static void unLoad()
	{
		extTest.remove();
	}
}
