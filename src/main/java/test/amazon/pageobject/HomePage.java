package test.amazon.pageobject;
import org.openqa.selenium.By;

import com.aventstack.extentreports.model.Report;

import test.amazon.enumpackage.WaitStrategy;
import test.amazon.reports.ManagerReports;
import test.amazon.reports.ReportLogger;
import test.amazon.reports.Reports;
public final class HomePage extends BasePage{
	private final By linkDropDown = By.cssSelector("li[class='oxd-userdropdown']");
	private final By lnkLogOut = By.xpath("//a[text()='Logout']");
	public HomePage selectProfile() throws InterruptedException
	{
		// here we have problem if anyone gives the blank string then this will not work 
		// second any other tester can give any string instead of clickable like click onclick so for that we are using enum
		click(linkDropDown, WaitStrategy.CLICKABLE, "Profile button");
		return this;
	}
	public LoginPage signOut()
	{
		click(lnkLogOut, WaitStrategy.PRESENT, "Signout button");
		return new LoginPage();
	}
}