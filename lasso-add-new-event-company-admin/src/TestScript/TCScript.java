package TestScript;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ExtentReport.CaptureScreenshot;
import ExtentReport.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DataTable.Log;
import TestMethod.Baseclass;
import TestScript.Genericmethod;


public class TCScript
{
	public WebDriver driver;
	public StringBuffer verificationErrors = new StringBuffer();
	public static Properties CONFIG; 
	
	// For Extent Report
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	
	@BeforeSuite
	public void InitializeSuite() throws Exception
	{	
		// For Extent Report		
		/** This method will read the config.properties file and load all the values over the object fs.*/
    	FileInputStream fs = new FileInputStream("src/config/config.properties");
    	CONFIG= new Properties();
    	CONFIG.load(fs);
    	String Environment = CONFIG.getProperty("Environment");
    	Log.Environmentdetails(Environment);
    	Log.startTestCase();
    	Log.info("Retriving the values from config.properties file" );
    	SetupEnvironment.SetdataSheet();
    }
	
	@BeforeMethod
	public void setUp() throws Exception 
	{		
		/** This step will invoke the driver whose value has been passed as browser name in config.properties file*/
		driver = Genericmethod.OpenBrowser(CONFIG);
        String sBrowserName = CONFIG.getProperty("BrowserType");
        Log.info(sBrowserName+" Browser have been initiated for testing");
		new Baseclass(driver);
	}
	
	/*----------------------------Your test cases goes here---------------------------------------------*/	
	
	@Test(testName = "CA_AE_01", enabled = false )
	public void CA_AE_01() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_01, "Adding new event from Company Admin by filling all the fields of Basic Info.");
		Log.info("--------- Execution of Test Case ID - CA_AE_01 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_01(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_01, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_01, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_01);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_02", enabled = false )
	public void CA_AE_02() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_02, "Adding new Event from Company Admin by filling Mandatory fields of Basic Info.");
		Log.info("--------- Execution of Test Case ID - CA_AE_02 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_02(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_02, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_02, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_02);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_03", enabled = false )
	public void CA_AE_03() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_03, "Adding new Event from Company Admin by filling Mandatory fields of Basic Info and clicking on Save and Complete later button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_03 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_03(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_03, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_03, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_03);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_04", enabled = false )
	public void CA_AE_04() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_04, "Adding new Event from Company Admin by filling Mandatory fields of Basic Info with validations checks for all field blank.");
		Log.info("--------- Execution of Test Case ID - CA_AE_04 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_04(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_04, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_04, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_04);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_05", enabled = false )
	public void CA_AE_05() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_05, "Adding new Event from Company Admin with all validation checks for Airport.");
		Log.info("--------- Execution of Test Case ID - CA_AE_05 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_05(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_05, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_05, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_05);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_06", enabled = false )
	public void CA_AE_06() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_06, "Adding new Event from Company Admin by filling Mandatory fields of Basic Info with validations checks for Logo for invalid size and file format.");
		Log.info("--------- Execution of Test Case ID - CA_AE_06 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_06(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_06, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_06, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_06);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_07", enabled = false )
	public void CA_AE_07() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_07, " Adding new Event from Company Admin by filling Mandatory fields of Basic Info with duplicate Event ID checks for validation.");
		Log.info("--------- Execution of Test Case ID - CA_AE_07 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_07(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_07, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_07, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_07);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_08", enabled = false )
	public void CA_AE_08() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_08, " Adding new Event from Company Admin by filling all fields of Position Needs and adding multiple groups with multiple positions.");
		Log.info("--------- Execution of Test Case ID - CA_AE_08 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_08(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_08, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_08, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_08);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_09", enabled = false )
	public void CA_AE_09() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_09, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs and adding multiple positions in the group 1.");
		Log.info("--------- Execution of Test Case ID - CA_AE_09 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_09(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_09, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_09, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_09);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_10", enabled = false )
	public void CA_AE_10() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_10, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs and adding 1 group and 1 position.");
		Log.info("--------- Execution of Test Case ID - CA_AE_10 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_10(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_10, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_10, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_10);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	
	@Test(testName = "CA_AE_11", enabled = false )
	public void CA_AE_11() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_11, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs and clicking on Previous button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_11 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_11(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_11, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_11, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_11);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_12", enabled = false )
	public void CA_AE_12() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_12, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs and clicking on Save and complete later.");
		Log.info("--------- Execution of Test Case ID - CA_AE_12 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_12(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_12, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_12, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_12);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_13", enabled = false )
	public void CA_AE_13() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_13, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs with validations checks for all field blank.");
		Log.info("--------- Execution of Test Case ID - CA_AE_13 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_13(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_13, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_13, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_13);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_14", enabled = false )
	public void CA_AE_14() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_14, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs with validations checks for Quantity.");
		Log.info("--------- Execution of Test Case ID - CA_AE_14 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_14(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_14, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_14, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_14);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_15", enabled = false )
	public void CA_AE_15() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_15, "Adding new Event from Company Admin by filling Mandatory fields of Position Needs with validations checks for Bid Start date and End date.");
		Log.info("--------- Execution of Test Case ID - CA_AE_15 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_15(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_15, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_15, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_15);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_16", enabled = false )
	public void CA_AE_16() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_16, "Adding new event from Company Admin by selecting Start and End Date and clicking on Next button of Schedule.");
		Log.info("--------- Execution of Test Case ID - CA_AE_16 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_16(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_16, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_16, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_16);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_17", enabled = false )
	public void CA_AE_17() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_17, "Adding new Event from Company Admin by selecting Start and End Time and clicking on Previous button of Schedule.");
		Log.info("--------- Execution of Test Case ID - CA_AE_17 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_17(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_17, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_17, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_17);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_18", enabled = false )
	public void CA_AE_18() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_18, "Adding new Event from Company Admin by Start and End Time and clicking on Save and Complete button of Schedule.");
		Log.info("--------- Execution of Test Case ID - CA_AE_18 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_18(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_18, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_18, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_18);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_19", enabled = false )
	public void CA_AE_19() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_19, "Adding new Event from Company Admin by changing hours.");
		Log.info("--------- Execution of Test Case ID - CA_AE_19 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_19(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_19, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_19, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_19);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_20", enabled = false )
	public void CA_AE_20() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_20, "Adding new Event from Company Admin by filling  fields of Schedule with validations checks for Total Hours.");
		Log.info("--------- Execution of Test Case ID - CA_AE_20 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_20(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_20, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_20, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_20);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_21", enabled = false )
	public void CA_AE_21() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_21, "Adding new Event from Company Admin by adding a new Document.");
		Log.info("--------- Execution of Test Case ID - CA_AE_21 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_21(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_21, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_21, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_21);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
		
	@Test(testName = "CA_AE_22", enabled = false )
	public void CA_AE_22() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_22, "Adding new Event from Company Admin by adding a new Document and deleting it and clicking on Save and complete later. ");
		Log.info("--------- Execution of Test Case ID - CA_AE_22 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_22(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_22, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_22, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_22);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
			
			
	@Test(testName = "CA_AE_23", enabled = false )
	public void CA_AE_23() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_23, "Adding new Event from Company Admin by adding a new Document and clicking on Previous button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_23 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_23(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_23, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_23, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_23);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
			
	@Test(testName = "CA_AE_24", enabled = false )
	public void CA_AE_24() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_24, "Adding new Event from Company Admin by adding a existing Document.");
		Log.info("--------- Execution of Test Case ID - CA_AE_24 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_24(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_24, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_24, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_24);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_25", enabled = false )
	public void CA_AE_25() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_25, "Adding new event from Company Admin by filling mandatory fields upto Rate Options and clicking on Next button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_25 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_25(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_25, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_25, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_25);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_26", enabled = false )
	public void CA_AE_26() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_26, "Adding new event from Company Admin by filling mandatory fields upto Rate Options and clicking on Previous button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_26 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_26(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_26, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_26, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_26);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_27", enabled = false )
	public void CA_AE_27() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_27, "Adding new event from Company Admin by filling mandatory fields upto Rate Options and clicking on Save and Complete later button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_27 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_27(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_27, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_27, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_27);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_28", enabled = false )
	public void CA_AE_28() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_28, "Adding new event from Company Adminby filling mandatory fields upto  Rate Options and select Ask crew members to submit their rate: Display Rate-Yes.");
		Log.info("--------- Execution of Test Case ID - CA_AE_28 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_28(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_28, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_28, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_28);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_29", enabled = false )
	public void CA_AE_29() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_29, "Adding new event from Company Admin by filling mandatory fields upto Rate Options and select Ask crew members to submit their rate: Display Rate-No.");
		Log.info("--------- Execution of Test Case ID - CA_AE_29 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_29(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_29, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_29, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_29);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_30", enabled = false )
	public void CA_AE_30() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_30, "Adding new event from Company Admin by filling mandatory fields upto Rate Options and select  Use the crew member's default rates: Display Rate-Yes.");
		Log.info("--------- Execution of Test Case ID - CA_AE_30 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_30(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_30, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_30, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_30);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_31", enabled = false )
	public void CA_AE_31() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_31, "Adding new event from Company Admin by filling mandatory fields upto Rate Options and select  Use the crew member's default rates: Display Rate-No.");
		Log.info("--------- Execution of Test Case ID - CA_AE_31 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_31(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_31, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_31, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_31);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_32", enabled = false )
	public void CA_AE_32() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_32, "Adding new event from Company Admin by filling mandatory fields upto Preview and clicking on Next button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_32 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_32(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_32, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_32, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_32);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_33", enabled = false )
	public void CA_AE_33() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_33, "Adding new event from Company Admin by filling mandatory fields upto Preview and clicking on Save and Complete later button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_33 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_33(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_33, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_33, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_33);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_34", enabled = false )
	public void CA_AE_34() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_34, "Adding new event from Company Admin by filling mandatory fields upto Preview and validate Work dates.");
		Log.info("--------- Execution of Test Case ID - CA_AE_34 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_34(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_34, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_34, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_34);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_35", enabled = false )
	public void CA_AE_35() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_35, "Adding new event from Company Admin by filling mandatory fields upto Preview and validate Event Name.");
		Log.info("--------- Execution of Test Case ID - CA_AE_35 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_35(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_35, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_35, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_35);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_36", enabled = false )
	public void CA_AE_36() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_36, "Adding new event from Company Admin by filling mandatory fields upto Preview and validate Position Name.");
		Log.info("--------- Execution of Test Case ID - CA_AE_36 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_36(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_36, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_36, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_36);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_37", enabled = false )
	public void CA_AE_37() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_37, "Adding new event from Company Admin by filling mandatory fields upto Preview and validate Response Deadline.");
		Log.info("--------- Execution of Test Case ID - CA_AE_37 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_37(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_37, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_37, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_37);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_38", enabled = false )
	public void CA_AE_38() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_38, "Adding new event from Company Admin by filling mandatory fields upto Preview and validate event logo.");
		Log.info("--------- Execution of Test Case ID - CA_AE_38 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_38(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_38, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_38, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_38);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_39", enabled = false )
	public void CA_AE_39() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_39, "Adding new event from Company Admin by filling mandatory fields  and clicking on Publish button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_39 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_39(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_39, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_39, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_39);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_40", enabled = false )
	public void CA_AE_40() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_40, "Adding new event from Company Admin by filling mandatory fields  and clicking on Publish button and then on Cancel button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_40 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_40(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_40, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_40, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_40);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_41", enabled = false )
	public void CA_AE_41() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_41, "Adding new event from Company Admin by filling mandatory fields  and clicking on Save and Complete later button.");
		Log.info("--------- Execution of Test Case ID - CA_AE_41 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_41(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_41, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_41, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_41);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_42", enabled = false )
	public void CA_AE_42() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_42, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting All Qualified/Available crew and checking Local Crew Only.");
		Log.info("--------- Execution of Test Case ID - CA_AE_42 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_42(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_42, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_42, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_42);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_43", enabled = false )
	public void CA_AE_43() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_43, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting All Qualified/Available crew and checking  Crew with an Average Rating.");
		Log.info("--------- Execution of Test Case ID - CA_AE_43 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_43(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_43, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_43, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_43);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_44", enabled = false )
	public void CA_AE_44() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_44, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting All Qualified/Available crew and checking  Crew with a Valid Passport.");
		Log.info("--------- Execution of Test Case ID - CA_AE_44 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_44(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_44, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_44, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_44);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_45", enabled = false )
	public void CA_AE_45() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_45, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting All Qualified/Available crew and checking  W-2 Full-Time Crew,W-2 Part-Time ,1099.");
		Log.info("--------- Execution of Test Case ID - CA_AE_45 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_45(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_45, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_45, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_45);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_46", enabled = false )
	public void CA_AE_46() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_46, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting All Qualified/Available crew and uncheck a crew member.");
		Log.info("--------- Execution of Test Case ID - CA_AE_46 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_46(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_46, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_46, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_46);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_47", enabled = false )
	public void CA_AE_47() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_47, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting Specified crew, Search Technician and Publish now.");
		Log.info("--------- Execution of Test Case ID - CA_AE_47 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_47(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_47, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_47, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_47);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_48", enabled = false )
	public void CA_AE_48() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_48, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting Specified crew, Search Technician and click on Save and Complete later.");
		Log.info("--------- Execution of Test Case ID - CA_AE_48 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_48(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_48, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_48, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_48);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_49", enabled = false )
	public void CA_AE_49() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_49, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting Create Roster manually and click on Create Roster.");
		Log.info("--------- Execution of Test Case ID - CA_AE_49 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_49(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_49, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_49, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_49);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_50", enabled = false )
	public void CA_AE_50() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_50, "Adding new event from Company Admin by filling mandatory fields upto Publish and selecting Create Roster manually and click on Save and Complete later.");
		Log.info("--------- Execution of Test Case ID - CA_AE_50 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_50(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_50, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_50, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_50);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_51", enabled = false )
	public void CA_AE_51() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_51, "Adding new Event from Company Admin by filling  fields of Schedule with validations checks for Total Position Hours.");
		Log.info("--------- Execution of Test Case ID - CA_AE_51 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_51(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_51, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_51, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_51);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	@Test(testName = "CA_AE_52", enabled = false )
	public void CA_AE_52() throws Exception
	{
		test=report.startTest(ObjectRepository.Add_Event_Test_Case_52, "Adding new Event from Company Admin by filling  fields of Schedule with validations checks for Total Event Hours.");
		Log.info("--------- Execution of Test Case ID - CA_AE_52 -  started -----------");
		try
		{
			BusinessUnit.Add_Event_52(CONFIG);
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_PASS, ObjectRepository.Add_Event_Test_Case_52, "Shows");
			test.log(LogStatus.PASS, "Script succesfully executed");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			SetupEnvironment.createXLSReport(ObjectRepository.KEYWORD_FAIL, ObjectRepository.Add_Event_Test_Case_52, "Shows");
			String screenshot=CaptureScreenshot.captureScreenShot(driver, ObjectRepository.Add_Event_Test_Case_52);
			if(ObjectRepository.KEYWORD_FAIL.equals("FAIL"))
			{
				String image=test.addScreenCapture(screenshot);
			    test.log(LogStatus.FAIL, "Test Test script failed", image);
			}
			throw (e);
		}
	}
	
	
	
	
	
	/*----------------------------Your test cases ends here---------------------------------------------*/
	
    @AfterMethod
    public void tearDown() throws Exception 
	{
    	
		driver.quit();
		String sBrowserName = CONFIG.getProperty("BrowserType");
        Log.info(sBrowserName+" Browser have been Closed.");
		
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) 
	    {
	    	fail(verificationErrorString);
	    }
//	    for extent report
	    Log.endTestCase();
	    report.endTest(test);
	    report.flush();

	}
    
    @AfterSuite
    public Void CloseSuite() throws Exception
    {
		return null;
    }

}