package test.amazon.factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.amazon.driver.ManagerDriver;
import test.amazon.enumpackage.WaitStrategy;

public class ExplicitWaitStrategy {

	public static WebElement explicitWaitForElement(By bylocator,WaitStrategy waitType)
	{
		WebElement element = null;
		if (waitType== WaitStrategy.CLICKABLE)
		{
			WebDriverWait wait = new WebDriverWait(ManagerDriver.getDriver(),Duration.ofSeconds(10000));
			element  = wait.until(ExpectedConditions.elementToBeClickable(bylocator))	;

		}
		else if (waitType== WaitStrategy.PRESENT)
		{
			WebDriverWait wait = new WebDriverWait(ManagerDriver.getDriver(),Duration.ofSeconds(10000));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(bylocator))	;
		}
		else if (waitType== WaitStrategy.NONE)
		{
			element = 	ManagerDriver.getDriver().findElement(bylocator);
		}
		else if (waitType== WaitStrategy.VISIBLE)
			{WebDriverWait wait = new WebDriverWait(ManagerDriver.getDriver(),Duration.ofSeconds(10000));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(bylocator))	;
		}
		return element;
	}

}
