package test.amazon.reports;

public final class ReportLogger {

	private ReportLogger()
	{

	}

	public static void pass(String msg)
	{
		ManagerReports.getExtReport().pass(msg);
	}
	public static void fail(String msg)
	{
		ManagerReports.getExtReport().fail(msg);
	}
	public static void skip(String msg)
	{
		ManagerReports.getExtReport().skip(msg);
	}
}
