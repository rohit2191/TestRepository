package ExtentReport;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import TestScript.Genericmethod;



public class CaptureScreenshot {
	
	public static String captureScreenShot(WebDriver driver, String screenShotName)
	{
		try
		{
			System.out.println("in capture screenshot..");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File screenShotFile = new File("ExtentReport/screenshot/"+screenShotName+" "+Genericmethod.GetTimeStampValue()+".png");
			String dest = screenShotFile.getAbsolutePath();
			File destination=new File(dest);
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot Taken");
			return dest;
		}
		
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
			return e.getMessage();	
		}	
	}
}
