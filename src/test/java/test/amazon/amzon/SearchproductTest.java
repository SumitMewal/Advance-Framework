package test.amazon.amzon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import test.amazon.driver.Driver;
import test.amazon.driver.ManagerDriver;
import test.amazon.testFolder.BaseclassTest;

public final class SearchproductTest extends BaseclassTest {
	
	private SearchproductTest()
	{
		
	}
	@Test(enabled=false)
public void searchProduct()
{
	/*
	 * // Driver.initDriver(); this will create a new instance of driver // Due to
	 * above code we will get an extra chrome window open and will not execute our
	 * 2nd test to remove. // To tackle this we have use if condition and check if
	 * driver is null then assign the chrome instance to that // if driver in not
	 * null then quit() the driver and again assign the null value to the driver for
	 * the next test // now the above code will not hamper our code
	 */
	ManagerDriver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("mac",Keys.ENTER);
}

}
