package test.amazon.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class Reports {

	public static ExtentTest testReport;
	private static ExtentReports extents;
	 public static void reportInit()
	{
		 if (Objects.isNull(extents)) {
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		extents =  new ExtentReports();
		extents.attachReporter(spark);
		spark.config().setDocumentTitle("Advance Framework");
		spark.config().setReportName("sumit singh");
		 }
  	}
	public static void reportFlush() throws IOException
	{if (Objects.nonNull(extents)) {
		extents.flush();
	}
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}
	 public static void createTest(String testCaseName)
	{

	 testReport = extents.createTest(testCaseName);
	  ManagerReports.setExtReport(testReport);
	}
	
}
