package test.amazon.Listners;
import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;

import test.amazon.reports.ReportLogger;
import test.amazon.reports.Reports;

public class ListnerClass implements ITestListener,ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		
		Reports.reportInit();	
	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			Reports.reportFlush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reports.createTest(result.getMethod().getMethodName());
		// To create the test at the runtime using the result variable
			}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ReportLogger.pass(result.getMethod().getMethodName()+" is passed !!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ReportLogger.fail(result.getMethod().getMethodName()+" is Failed !!");
		
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ReportLogger.skip(result.getMethod().getMethodName()+" is Skipped !!");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
}
