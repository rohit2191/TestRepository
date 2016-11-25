package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import DataTable.Log;

public class Genericmethod 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait;
    boolean acceptNextAlert = true;
    
    

    
  
//	This method is used to select Nearest Airport of Technician Registration Step 3 
    public static void Airport_selectOptionWithText(String textToSelect) {
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
    
    
//	This method is used to select State of Technician Registration Step 3 
    public static void State_selectOptionWithText(String textToSelect) {
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-2"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
    
    public boolean isElementPresent(By by) 
    {
        try 
        {
          driver.findElement(by);
          return true;
        } 
        catch (NoSuchElementException e) 
        {
          return false;
        }
    }

    
   
    public boolean isAlertPresent() 
    {
        try 
        {
          driver.switchTo().alert();
          return true;
        }
        catch (NoAlertPresentException e) 
        {
          return false;
        }
    }

   
    public String closeAlertAndGetItsText() 
    {
        try 
        {
          Alert alert = driver.switchTo().alert();
          String alertText = alert.getText();
          if (acceptNextAlert) 
          {
            alert.accept();
          }
          else 
          {
            alert.dismiss();
          }
          return alertText;
        } 
        finally 
        {
          acceptNextAlert = true;
        }
    }
        
   
    public static void takeScreenshot(WebDriver driver, String ss) throws Exception
	{
    	try
    	{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(ObjectRepository.Path_ScreenShot + ss +" "+GetTimeStampValue()+".jpg"));	
		}
    	catch (Exception e)
		{
		    Log.error("Class Genericmethod | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			throw new Exception();
		}
	}
    

    
    public static String GetTimeStampValue() throws IOException
    {
    	Calendar cal = Calendar.getInstance();       
        Date time=cal.getTime();
        String timestamp=time.toString();
        String systime=timestamp.replace(":", "-");
        return systime;
    }
    
   
    public static WebDriver OpenBrowser(Properties CONFIG) throws Exception
    {
		String sBrowserName;
		String url;
		
		try
		{
			sBrowserName = CONFIG.getProperty("BrowserType");
			url = CONFIG.getProperty("TestURL");
			
			if(sBrowserName.equals("Mozilla"))
			{
				driver = new FirefoxDriver();
				Log.info("<===========================================================================>");
				Log.info("<======================== Execution of New TestCase ========================>");
				Log.info("<===========================================================================>");
				Log.info("New driver instantiated");
				Log.info(url+"==> is used for performing testing" );
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			    driver.get(CONFIG.getProperty("TestURL"));
			    Log.info("Web application launched successfully");
			}
			else if(sBrowserName.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
				Log.info("<===========================================================================>");
				Log.info("<======================== Execution of New TestCase ========================>");
				Log.info("<===========================================================================>");
				Log.info("New driver instantiated");
				Log.info(url+"==> is used for performing testing" );
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get(CONFIG.getProperty("TestURL"));
				Log.info("Web application launched successfully");
			}
			else if(sBrowserName.equals("IE"))
			{
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				System.setProperty("webdriver.ie.driver","IEDriverServer.exe");				
				driver = new InternetExplorerDriver(capabilities);
				Log.info("<===========================================================================>");
				Log.info("<======================== Execution of New TestCase ========================>");
				Log.info("<===========================================================================>");
				Log.info("New driver instantiated");
				Log.info(url+"==> is used for performing testing" );
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get(CONFIG.getProperty("TestURL"));
				Log.info("Web application launched successfully");
			}
		}
		catch (Exception e)
		{
			Log.error("Class Genericmethod | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
	}
    
   
	public static WebElement waitForElement(WebElement element)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 return wait.until(ExpectedConditions.elementToBeClickable(element));
	}	
	
}