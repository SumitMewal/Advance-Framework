package test.amazon.driver;

import java.sql.DriverManager;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.amazon.enumpackage.PropertiesEnum;
import test.amazon.util.PropertiesUtil;

public final class Driver {

	private Driver()
	{
		
	}
	
	
	// private static WebDriver driver ;
	/* If we use above line for comparision in the below function
	 * this will not exeucte the third test in the project 
	 * for that we need to always compare with the local variable
	 */
	public static void initDriver() throws Exception
	{
		if (Objects.isNull(ManagerDriver.getDriver()))
		{
		WebDriver driver = new ChromeDriver();
		ManagerDriver.setDriver(driver);
		ManagerDriver.getDriver().manage().window().maximize();
		// We have removed static url value from here and fetched the url from the properties file
		ManagerDriver.getDriver().get(PropertiesUtil.getValue(PropertiesEnum.URL.toString().toLowerCase()));
		}
	}
	public static void quitDriver()
	{
		if (Objects.nonNull(ManagerDriver.getDriver())) {
			
			ManagerDriver.getDriver().quit();
			ManagerDriver.unLoad();
		}
		
		
	}
	
	
}
