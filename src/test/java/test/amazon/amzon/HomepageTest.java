package test.amazon.amzon;

import java.sql.DriverManager;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import test.amazon.driver.Driver;
import test.amazon.driver.ManagerDriver;
import test.amazon.testFolder.BaseclassTest;

public final class HomepageTest extends BaseclassTest {

	private HomepageTest()
	{
		
	}
	
	@Test(enabled=false)
	public void test()
	{
		String title = ManagerDriver.getDriver().getTitle();
		Assertions.assertThat(title)
		.isNotEmpty()
		.isNotNull()
		.isNotBlank()
		.contains("Shop Online")
		.doesNotHaveToString("sumit");
		
		
		
		
		
	}
	@Test(enabled=false)
	public void getTitle()
	{
		System.out.println(ManagerDriver.getDriver().getTitle());
		
		
	}
}
