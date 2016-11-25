package TestMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import DataTable.Log;
import DataTable.Xls_Reader;
import TestScript.ObjectRepository;

public class CommonAction extends Baseclass {
	
	private static WebElement element = null;
	public static int RowNum=2;
	public static Xls_Reader cv = new Xls_Reader("src/config/CommonUtil.xlsx");
				
	public CommonAction(WebDriver driver) 
	{
		super(driver);
	}
	
	public static WebElement Company_Admin_Login_Email_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Login_Email_Txt));
	       	Log.info("Email Text Field is found on the Company Admin login web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Email Text Field is not found on the Company Admin login web page");
     		throw(e);
        }
        return element;
     }
	
	public static WebElement Company_Admin_Login_Password_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Login_Password_Txt));
	       	Log.info("Password Text Field is found on the Company Admin login web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Password Text Field is not found on the Company Admin login web page");
     		throw(e);
        }
        return element;
     }
	

    public static WebElement Company_Admin_Login_Sign_In_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Login_Sign_In_Btn));
	       	Log.info("Sign In Button is found on the Company Admin login web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Sign In Button is not found on the Company Admin login web page");
     		throw(e);
        }
        return element;
     }
	

    public static WebElement Company_Admin_Login_Remember_Me_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.cssSelector(ObjectRepository.Company_Admin_Login_Remember_Me_Chk));
	       	Log.info("Remember Me Check Box is found on the Company Admin login web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Remember Me Check Box is not found on the Company Admin login web page");
     		throw(e);
        }
        return element;
     }
	

    public static WebElement Company_Admin_Login_Forgot_Password_Link() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Login_Forgot_Password_Link));
	       	Log.info("Forgot Password  Link is found on the Company Admin login web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Forgot Password  Link is not found on the Company Admin login web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Dashbord_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Dashboard_Dashbord_Tab));
	       	Log.info("Dashboard  Tab is found on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Dashboard  Tab is not found on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Dashboard_Crew_Tab));
	       	Log.info("Crew  Tab is found on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Crew  Tab is not found on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Shows_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Dashboard_Shows_Tab));
	       	Log.info("Shows  Tab is found on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Shows  Tab is not found on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Applications_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Dashboard_Applications_Tab));
	       	Log.info("Application  Tab is found on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Application  Tab is not found on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Administration_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Dashboard_Administration_Tab));
	       	Log.info("Administration  Tab is found on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Administration  Tab is not found on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_Schedule_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_Schedule_Option));
	       	Log.info("Schedule  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Schedule  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_All_Crew_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_All_Crew_Option));
	       	Log.info("All Crew  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("All Crew  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_Approved_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_Approved_Option));
	       	Log.info("Approved  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Approved  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_Pending_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_Pending_Option));
	       	Log.info("Pending  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Pending  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_Tabled_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_Tabled_Option));
	       	Log.info("Tabled  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Tabled  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_Not_Approved_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_Not_Approved_Option));
	       	Log.info("Not Approved  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Not Approved  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Crew_New_Tech_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Crew_New_Tech_Option));
	       	Log.info("New Tech  Option is found into the dropdown of Crew on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("New Tech  Option is not found into the dropdown of Crew on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Shows_Unpublished_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Shows_Unpublished_Option));
	       	Log.info("Unpublished  Option is found into the dropdown of Shows on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Unpublished  Option is not found into the dropdown of Shows on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Shows_Published_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Shows_Published_Option));
	       	Log.info("Published  Option is found into the dropdown of Shows on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Published  Option is not found into the dropdown of Shows on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Shows_Completed_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Shows_Completed_Option));
	       	Log.info("Completed  Option is found into the dropdown of Shows on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Completed  Option is not found into the dropdown of Shows on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Shows_Add_New_Show_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Shows_Add_New_Show_Option));
	       	Log.info("Add New Show  Option is found into the dropdown of Shows on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Add New Show  Option is not found into the dropdown of Shows on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Administration_Company_Configuration_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Administration_Company_Configuration_Option));
	       	Log.info("Company Configuration  Option is found into the dropdown of Administration on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Company Configuration  Option is not found into the dropdown of Administration on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Administration_Users_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Administration_Users_Option));
	       	Log.info("Users  Option is found into the dropdown of Administration on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Users  Option is not found into the dropdown of Administration on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Administration_Clients_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Administration_Clients_Option));
	       	Log.info("Clients  Option is found into the dropdown of Administration on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Clients  Option is not found into the dropdown of Administration on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Administration_Positions_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Administration_Positions_Option));
	       	Log.info("Positions  Option is found into the dropdown of Administration on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Positions  Option is not found into the dropdown of Administration on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Dashboard_Administration_Email_Templates_Option() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Company_Admin_Dashboard_Administration_Email_Templates_Option));
	       	Log.info("Email Templates  Option is found into the dropdown of Administration on the Company Admin Dashboard web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Email Templates  Option is not found into the dropdown of Administration on the Company Admin Dashboard web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Company_Configuration_Default_Settings_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Company_Configuration_Default_Settings_Tab));
	       	Log.info("Default Settings Tab is found into the dropdown of Administration on the Company Admin Company Administration web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Default Settings Tab is not found into the dropdown of Administration on the Company Admin Company Administration web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Company_Configuration_Default_Settings_Required_References_Dropdown() throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.xpath(ObjectRepository.Company_Admin_Company_Configuration_Default_Settings_Required_References)));
	       	Log.info("Required References Dropdown is found on the Company Admin Company Configuration web page");
	       	element.selectByIndex(4);
	    }
    	catch (Exception e)
    	{
    		Log.error("Required References Dropdown is not found on the Company Admin Company Configuration web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Company_Admin_Company_Configuration_Default_Settings_Save_Button() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Company_Admin_Company_Configuration_Default_Settings_Save_btn));
		    Log.info("Save Button is found in Company Admin Company Configuration on Default and Settings web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save Button is not found in Company Admin Company Configuration on Default and Settings web page");
     		throw(e);
        }
        return element;
     }

}
