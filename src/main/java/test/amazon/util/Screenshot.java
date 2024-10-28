  package test.amazon.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import test.amazon.driver.ManagerDriver;

public final class Screenshot {

	private Screenshot()
	{
		
	}
	public void getScreenShot(String test) throws IOException
	{
		File fileDes = new File(System.getProperty("User.dir")+"/Screenshot/"+test+"/"+System.currentTimeMillis()+".png");
	TakesScreenshot screenshot = ((TakesScreenshot)ManagerDriver.getDriver());
	File fileSrc = 	screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fileSrc, fileDes);
	}
}
