package test.amazon.pageobject;
import org.openqa.selenium.By;
import test.amazon.driver.ManagerDriver;
import test.amazon.enumpackage.WaitStrategy;
import test.amazon.reports.ReportLogger;
import test.amazon.reports.Reports;
public final class LoginPage extends BasePage  {
	private final By txtUserName = By.name("username");
	private final By txtPassWord = By.name("password");
	private final By btnLogin = By.xpath("//button[text()=' Login ']");
	public String getTitle()
	{
		
		return ManagerDriver.getDriver().getTitle();
	}
	public LoginPage enterUserName(String username) throws InterruptedException
	{
		
		sendKeys(txtUserName, username, WaitStrategy.PRESENT, "username");
		return this;// this statement will be used to refer this class and will be used in method chaining.
	}
	public LoginPage enterPassword(String password)
	{
		
		sendKeys(txtPassWord, password, WaitStrategy.NONE, "password");
		return this;
	}
	public HomePage clickLogin()
	{
		
		click(btnLogin, WaitStrategy.PRESENT, "Login button");
		return new HomePage();// this statement will return the homepage object and will be used to do any validation to the homepage

	}


}
