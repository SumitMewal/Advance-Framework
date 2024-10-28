package test.amazon.testFolder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import test.amazon.driver.Driver;

public class BaseclassTest {

	protected BaseclassTest()
	{
		// why this is protected bcz it is showiing error when we are extending basepage in homepage

	}

	@BeforeMethod()
	public void setUp() throws Exception{
		Driver.initDriver();
	}
	@AfterMethod()
	public void tearDown()
	{
		Driver.quitDriver();
	}



}
