package test.amazon.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.amazon.driver.ManagerDriver;
import test.amazon.enumpackage.WaitStrategy;
import test.amazon.factories.ExplicitWaitStrategy;
import test.amazon.reports.ManagerReports;
import test.amazon.reports.ReportLogger;

public class BasePage {



protected static void click(By bylocator, WaitStrategy wait, String elementName)
{
	WebElement element =  ExplicitWaitStrategy.explicitWaitForElement(bylocator, wait);
	element.click();
	ReportLogger.pass(elementName +" is clicked");
	
}

protected static void sendKeys(By bylocator, String value, WaitStrategy wait, String elementName)
{
	WebElement element = ExplicitWaitStrategy.explicitWaitForElement(bylocator, wait);
	element.sendKeys(value);
	ReportLogger.pass(value+" is entered in "+elementName);
	
}
}