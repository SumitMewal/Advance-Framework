package test.amazon.testFolder;
import org.testng.annotations.Test;
import test.amazon.pageobject.LoginPage;
import test.amazon.reports.ManagerReports;
import test.amazon.reports.Reports;

public final class LoginpageTest extends BaseclassTest {

	private LoginpageTest()
	{

	}
	@Test
	public void userLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName("Admin").enterPassword("admin1234").clickLogin()
		.selectProfile().signOut();
	}
	@Test
	public void invalidLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName("Admin").enterPassword("admin123").clickLogin()
		.selectProfile().signOut();
		



	}
}
