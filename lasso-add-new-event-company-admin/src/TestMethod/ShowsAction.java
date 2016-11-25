package TestMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import DataTable.Log;
import DataTable.Xls_Reader;
import TestScript.ObjectRepository;

public class ShowsAction extends Baseclass 
{
	private static WebElement element = null;
	public static int RowNum=2;
	public static Xls_Reader cv = new Xls_Reader("src/config/Shows.xlsx");

	public ShowsAction(WebDriver driver) 
	{
		super(driver);
	}
	
	public static WebElement Show_Basic_Info_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Tab));
	       	Log.info("Basic Info Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Basic Info Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Client_Name_Dropdown(String Clientname) throws Exception
    {
    	try
    	{
	       	Select element =new Select(driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Client_Name_Dropdown)));
	       	Log.info("Client Name Dropdown of Basic Info is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(Clientname);
	    }
    	catch (Exception e)
    	{
    		Log.error("Client Name Dropdown of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Show_Name_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Show_Name_Txt));
	       	Log.info("Show Name Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Show Name Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Location_City_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Location_City_Txt));
	       	Log.info("Location City Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Location City Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Nearest_Major_Airport_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Basic_Info_Nearest_Major_Airport_Txt));
	       	Log.info("Nearest Major Airport Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Nearest Major Airport Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	 
    public static WebElement Show_Basic_Info_Location_State_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Basic_Info_Location_State_Txt));
	       	Log.info("Location State Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Location State Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Load_In_Date_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Basic_Info_Load_In_Date_Txt));
	       	Log.info("Load In Date Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Load In Date Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Load_Out_Date_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Basic_Info_Load_Out_Date_Txt));
	       	Log.info("Load Out Date Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Load Out Date Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Event_Id_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Event_Id_Txt));
	       	Log.info("Event Id Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Event Id Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Basic_Info_Description_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Description_Txt));
	       	Log.info("Description Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Description Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Project_Manager_Dropdown(String ProjectManager) throws Exception
    {
    	try
    	{
	       	Select element =new Select(driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Project_Manager_Dropdown)));
	       	Log.info("Project Manager Dropdown of Basic Info is found on the Company Admin Add Event web page");
	        element.selectByVisibleText(ProjectManager);
	    }
    	catch (Exception e)
    	{
    		Log.error("Project Manager Dropdown of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Duration_Of_Bid_Start_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Basic_Info_Duration_Of_Bid_Start_Txt));
	       	Log.info("Bid Start Date Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Bid Start Date Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Duration_Of_bid_End_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Basic_Info_Duration_Of_bid_End_Txt));
	       	Log.info("Bid End Date Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Bid End Date Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Bid_End_Time_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Bid_End_Time_Txt));
	       	Log.info("Bid End Time Text-field of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Bid End Time Text-field of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Add_Logo_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Add_Logo_Btn));
	       	Log.info("Add Logo Button of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Add Logo Button of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Basic_Info_Logo_Name() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Logo_Name));
	       	Log.info("Logo Name of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Logo Name of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Basic_Info_Save_And_Complete_Later_Btn));
	       	Log.info("Save and Complete Later Button of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save and Complete Later Button of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Basic_Info_Next_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Basic_Info_Next_Btn));
	       	Log.info("Next Button of Basic Info is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Next Button of Basic Info is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Tab));
	       	Log.info("Postion Needs Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Postion Needs Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Txt));
	       	Log.info("Group1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Supervisor_Dropdown(String G1Supervisor) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Supervisor_Dropdown)));
	       	Log.info("Supervisor Dropdown of Group1 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G1Supervisor);
	    }
    	catch (Exception e)
    	{
    		Log.error("Supervisor Dropdown of Group1 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Quantity1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Quantity1_Txt));
	       	Log.info("Group1 Quantity1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Quantity1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Position1_Dropdown(String G1P1) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Position1_Dropdown)));
	       	Log.info("Position1 Dropdown of Group1 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G1P1);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position1 Dropdown of Group1 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Start_Work1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Work1_Txt));
	       	Log.info("Group1 Start Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Work1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Work1_Txt));
	       	Log.info("Group1 End Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group1_Start_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Time1_Dropdown)));
	       	Log.info("Group1 Start Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Time1_Dropdown)));
	       	Log.info("Group1 End Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group1_Notes1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Notes1_Txt));
	       	Log.info("Group1 Notes1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Notes1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group1_Quantity2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Quantity2_Txt));
	       	Log.info("Group1 Quantity2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Quantity2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Position2_Dropdown(String G1P2) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Position2_Dropdown)));
	       	Log.info("Position2 Dropdown of Group1 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G1P2);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position2 Dropdown of Group1 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Start_Work2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Work2_Txt));
	       	Log.info("Group1 Start Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Work2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Work2_Txt));
	       	Log.info("Group1 End Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group1_Start_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Time2_Dropdown)));
	       	Log.info("Group1 Start Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Time2_Dropdown)));
	       	Log.info("Group1 End Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
	
    public static WebElement Show_Position_Needs_Group1_Notes2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Notes2_Txt));
	       	Log.info("Group1 Notes2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Notes2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group1_Quantity3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Quantity3_Txt));
	       	Log.info("Group1 Quantity3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Quantity3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Position3_Dropdown(String G1P3) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Position3_Dropdown)));
	       	Log.info("Position3 Dropdown of Group1 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G1P3);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position3 Dropdown of Group1 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Start_Work3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Work3_Txt));
	       	Log.info("Group1 Start Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Work3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Work3_Txt));
	       	Log.info("Group1 End Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group1_Start_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Time3_Dropdown)));
	       	Log.info("Group1 Start Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Time3_Dropdown)));
	       	Log.info("Group1 End Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Notes3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Notes3_Txt));
	       	Log.info("Group1 Notes3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Notes3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group1_Quantity4_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Quantity4_Txt));
	       	Log.info("Group1 Quantity4 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Quantity4 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Position4_Dropdown(String G1P4) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Position4_Dropdown)));
	       	Log.info("Position4 Dropdown of Group1 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G1P4);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position4 Dropdown of Group1 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Start_Work4_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Work4_Txt));
	       	Log.info("Group1 Start Work Date4 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Work Date4 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Work4_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Work4_Txt));
	       	Log.info("Group1 End Work Date4 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Work Date4 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group1_Start_Time4_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_Start_Time4_Dropdown)));
	       	Log.info("Group1 Start Time4 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Start Time4 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_End_Time4_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group1_End_Time4_Dropdown)));
	       	Log.info("Group1 End Time4 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 End Time4 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Notes4_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Notes4_Txt));
	       	Log.info("Group1 Notes4 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Notes4 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group1_Close2_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Close2_Icon));
	       	Log.info("Group1 Close2 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Close2 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group1_Close3_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Close3_Icon));
	       	Log.info("Group1 Close3 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Close3 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group1_Close4_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Close4_Icon));
	       	Log.info("Group1 Close4 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Close4 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    
    public static WebElement Show_Position_Needs_Group2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Txt));
	       	Log.info("Group2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Supervisor_Dropdown(String G2Supervisor) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Supervisor_Dropdown)));
	       	Log.info("Supervisor Dropdown of Group2 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G2Supervisor);
	    }
    	catch (Exception e)
    	{
    		Log.error("Supervisor Dropdown of Group2 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Quantity1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Quantity1_Txt));
	       	Log.info("Group2 Quantity1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Quantity1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Position1_Dropdown(String G2P1) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Position1_Dropdown)));
	       	Log.info("Position1 Dropdown of Group2 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G2P1);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position1 Dropdown of Group2 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Start_Work1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_Start_Work1_Txt));
	       	Log.info("Group2 Start Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Start Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    
	
    public static WebElement Show_Position_Needs_Group2_End_Work1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_End_Work1_Txt));
	       	Log.info("Group2 End Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 End Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Start_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_Start_Time1_Dropdown)));
	       	Log.info("Group2 Start Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Start Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_End_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_End_Time1_Dropdown)));
	       	Log.info("Group2 End Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 End Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group2_Notes1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Notes1_Txt));
	       	Log.info("Group2 Notes1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Notes1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group2_Quantity2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Quantity2_Txt));
	       	Log.info("Group2 Quantity2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Quantity2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Position2_Dropdown(String G2P2) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Position2_Dropdown)));
	       	Log.info("Position2 Dropdown of Group2 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G2P2);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position2 Dropdown of Group2 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Start_Work2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_Start_Work2_Txt));
	       	Log.info("Group2 Start Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Start Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group2_End_Work2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_End_Work2_Txt));
	       	Log.info("Group2 End Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 End Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Start_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_Start_Time2_Dropdown)));
	       	Log.info("Group2 Start Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Start Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_End_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_End_Time2_Dropdown)));
	       	Log.info("Group2 End Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 End Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group2_Notes2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Notes2_Txt));
	       	Log.info("Group2 Notes2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Notes2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group2_Quantity3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Quantity3_Txt));
	       	Log.info("Group2 Quantity3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Quantity3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Position3_Dropdown(String G2P3) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Position3_Dropdown)));
	       	Log.info("Position2 Dropdown of Group3 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G2P3);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position2 Dropdown of Group3 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Start_Work3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_Start_Work3_Txt));
	       	Log.info("Group2 Start Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Start Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group2_End_Work3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_End_Work3_Txt));
	       	Log.info("Group2 End Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 End Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Start_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_Start_Time3_Dropdown)));
	       	Log.info("Group2 Start Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Start Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_End_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group2_End_Time3_Dropdown)));
	       	Log.info("Group2 End Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 End Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group2_Notes3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Notes3_Txt));
	       	Log.info("Group2 Notes3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Notes3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Close2_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Close2_Icon));
	       	Log.info("Group2 Close2 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Close2 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group2_Close3_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Close3_Icon));
	       	Log.info("Group2 Close3 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Close3 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group2_Group_Close_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Group_Close_Icon));
	       	Log.info("Group2 Group Close Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Group Close Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    
    public static WebElement Show_Position_Needs_Group3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Txt));
	       	Log.info("Group3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Supervisor_Dropdown(String G3Supervisor) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Supervisor_Dropdown)));
	       	Log.info("Supervisor Dropdown of Group3 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G3Supervisor);
	    }
    	catch (Exception e)
    	{
    		Log.error("Supervisor Dropdown of Group3 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Quantity1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Quantity1_Txt));
	       	Log.info("Group3 Quantity1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Quantity1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Position1_Dropdown(String G3P1) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Position1_Dropdown)));
	       	Log.info("Position1 Dropdown of Group3 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G3P1);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position1 Dropdown of Group3 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Start_Work1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_Start_Work1_Txt));
	       	Log.info("Group3 Start Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Start Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group3_End_Work1_Txt() throws Exception
    {
    	try 
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_End_Work1_Txt));
	       	Log.info("Group3 End Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 End Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group3_Start_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_Start_Time1_Dropdown)));
	       	Log.info("Group3 Start Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Start Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_End_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_End_Time1_Dropdown)));
	       	Log.info("Group3 End Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 End Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Notes1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Notes1_Txt));
	       	Log.info("Group3 Notes1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Notes1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group3_Quantity2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Quantity2_Txt));
	       	Log.info("Group3 Quantity2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Quantity2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Position2_Dropdown(String G3P2) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Position2_Dropdown)));
	       	Log.info("Position2 Dropdown of Group3 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G3P2);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position2 Dropdown of Group3 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Start_Work2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_Start_Work2_Txt));
	       	Log.info("Group3 Start Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Start Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group3_End_Work2_Txt() throws Exception
    {
    	try 
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_End_Work2_Txt));
	       	Log.info("Group3 End Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 End Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Start_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_Start_Time2_Dropdown)));
	       	Log.info("Group3 Start Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Start Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_End_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_End_Time2_Dropdown)));
	       	Log.info("Group3 End Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 End Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group3_Notes2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Notes2_Txt));
	       	Log.info("Group3 Notes2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Notes2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group3_Quantity3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Quantity3_Txt));
	       	Log.info("Group3 Quantity3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Quantity3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Position3_Dropdown(String G3P3) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Position3_Dropdown)));
	       	Log.info("Position3 Dropdown of Group3 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G3P3);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position3 Dropdown of Group3 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Start_Work3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_Start_Work3_Txt));
	       	Log.info("Group3 Start Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Start Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group3_End_Work3_Txt() throws Exception
    {
    	try 
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_End_Work3_Txt));
	       	Log.info("Group3 End Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 End Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group3_Start_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_Start_Time3_Dropdown)));
	       	Log.info("Group3 Start Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Start Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_End_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group3_End_Time3_Dropdown)));
	       	Log.info("Group3 End Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 End Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Notes3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Notes3_Txt));
	       	Log.info("Group3 Notes3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Notes3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Close2_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Close2_Icon));
	       	Log.info("Group3 Close2 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Close2 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group3_Close3_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Close3_Icon));
	       	Log.info("Group3 Close3 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Close3 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group3_Group_Close_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Group_Close_Icon));
	       	Log.info("Group3 Group Close Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Group Close Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    
    public static WebElement Show_Position_Needs_Group4_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Txt));
	       	Log.info("Group4 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Supervisor_Dropdown(String G4Supervisor) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Supervisor_Dropdown)));
	       	Log.info("Supervisor Dropdown of Group4 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G4Supervisor);
	    }
    	catch (Exception e)
    	{
    		Log.error("Supervisor Dropdown of Group4 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Quantity1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Quantity1_Txt));
	       	Log.info("Group4 Quantity1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Quantity1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Position1_Dropdown(String G4P1) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Position1_Dropdown)));
	       	Log.info("Position1 Dropdown of Group4 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G4P1);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position1 Dropdown of Group4 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Start_Work1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_Start_Work1_Txt));
	       	Log.info("Group4 Start Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Start Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group4_End_Work1_Txt() throws Exception
    {
    	try 
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_End_Work1_Txt));
	       	Log.info("Group4 End Work Date1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 End Work Date1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group4_Start_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_Start_Time1_Dropdown)));
	       	Log.info("Group4 Start Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Start Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_End_Time1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_End_Time1_Dropdown)));
	       	Log.info("Group4 End Time1 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 End Time1 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Notes1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Notes1_Txt));
	       	Log.info("Group4 Notes1 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Notes1 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group4_Quantity2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Quantity2_Txt));
	       	Log.info("Group4 Quantity2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Quantity2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Position2_Dropdown(String G4P2) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Position2_Dropdown)));
	       	Log.info("Position2 Dropdown of Group4 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G4P2);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position2 Dropdown of Group4 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Start_Work2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_Start_Work2_Txt));
	       	Log.info("Group4 Start Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Start Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group4_End_Work2_Txt() throws Exception
    {
    	try 
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_End_Work2_Txt));
	       	Log.info("Group4 End Work Date2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 End Work Date2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group4_Start_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_Start_Time2_Dropdown)));
	       	Log.info("Group4 Start Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Start Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_End_Time2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_End_Time2_Dropdown)));
	       	Log.info("Group4 End Time2 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 End Time2 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Notes2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Notes2_Txt));
	       	Log.info("Group4 Notes2 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Notes2 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Position_Needs_Group4_Quantity3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Quantity3_Txt));
	       	Log.info("Group4 Quantity3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Quantity3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Position3_Dropdown(String G4P3) throws Exception
    {
    	try
    	{
	       	Select element =new Select (driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Position3_Dropdown)));
	       	Log.info("Position3 Dropdown of Group4 in Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(G4P3);
	    }
    	catch (Exception e)
    	{
    		Log.error("Position3 Dropdown of Group4 in Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Start_Work3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_Start_Work3_Txt));
	       	Log.info("Group4 Start Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Start Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group4_End_Work3_Txt() throws Exception
    {
    	try 
    	{
	       	element = driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_End_Work3_Txt));
	       	Log.info("Group4 End Work Date3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 End Work Date3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Position_Needs_Group4_Start_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_Start_Time3_Dropdown)));
	       	Log.info("Group4 Start Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Start Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_End_Time3_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.id(ObjectRepository.Show_Position_Needs_Group4_End_Time3_Dropdown)));
	       	Log.info("Group4 End Time3 Dropdown of Postion Needs is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 End Time3 Dropdown of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Notes3_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Notes3_Txt));
	       	Log.info("Group4 Notes3 Text-field of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Notes3 Text-field of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Close2_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Close2_Icon));
	       	Log.info("Group4 Close2 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Close2 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group4_Close3_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Close3_Icon));
	       	Log.info("Group4 Close3 Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Close3 Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    public static WebElement Show_Position_Needs_Group4_Close4_Icon() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Group_Close_Icon));
	       	Log.info("Group4 Group Close Icon of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Group Close Icon of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element; 
     }
	
    
    public static WebElement Show_Position_Needs_Group1_Add_Another_Position_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group1_Add_Another_Position_Btn));
	       	Log.info("Group1 Add Another Position Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group1 Add Another Position Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group2_Add_Another_Position_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group2_Add_Another_Position_Btn));
	       	Log.info("Group2 Add Another Position Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group2 Add Another Position Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group3_Add_Another_Position_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group3_Add_Another_Position_Btn));
	       	Log.info("Group3 Add Another Position Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group3 Add Another Position Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Group4_Add_Another_Position_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Group4_Add_Another_Position_Btn));
	       	Log.info("Group4 Add Another Position Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Group4 Add Another Position Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Add_Another_Group_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Add_Another_Group_Btn));
	       	Log.info("Add Another Group Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Add Another Group Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Position_Needs_Save_And_Complete_Later_Btn));
	       	Log.info("Save And Complete Later Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save And Complete Later Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Previous_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Position_Needs_Previous_Btn));
	       	Log.info("Previous Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Previous Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Position_Needs_Next_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Position_Needs_Next_Btn));
	       	Log.info("Next Button of Postion Needs is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Next Button of Postion Needs is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Schedule_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Tab));
	       	Log.info("Schedule Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Schedule Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Schedule_Start_Time1_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time1_Pos1_Dropdown)));
	       	Log.info("Start Time1 Position1 dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time1 Position1 dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time1_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time1_Pos1_Dropdown)));
	       	Log.info("End Time1 Position1 dropdown Text-field of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time1 Position1 dropdown Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours1_Pos1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours1_Pos1_Txt));
	       	Log.info("Hours1 Position1 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours1 Position1 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Start_Time2_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time2_Pos1_Dropdown)));
	       	Log.info("Start Time2 Position1 dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time2 Position1 dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time2_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time2_Pos1_Dropdown)));
	       	Log.info("End Time2 Position1 dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time2 Position1 dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours2_Pos1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours2_Pos1_Txt));
	       	Log.info("Hours2 Position1 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours2 Position1 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Start_Time3_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time3_Pos1_Dropdown)));
	       	Log.info("Start Time3 Position1 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time3 Position1 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time3_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time3_Pos1_Dropdown)));
	       	Log.info("End Time3 Position1 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time3 Position1 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours3_Pos1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours3_Pos1_Txt));
	       	Log.info("Hours3 Position1 of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours3 Position1 of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Start_Time4_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time4_Pos1_Dropdown)));
	       	Log.info("Start Time4 Position1 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time4 Position1 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time4_Pos1_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time4_Pos1_Dropdown)));
	       	Log.info("End Time4 Position1 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time4 Position1 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours4_Pos1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours4_Pos1_Txt));
	       	Log.info("Hours4 Position1 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours4 Position1 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Schedule_Start_Time1_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
	       	Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time1_Pos2_Dropdown)));
	       	Log.info("Start Time1 Position2 dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time1 Position2 dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time1_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time1_Pos2_Dropdown)));
	       	Log.info("End Time1 Position2 dropdown Text-field of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time1 Position2 dropdown Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours1_Pos2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours1_Pos2_Txt));
	       	Log.info("Hours1 Position2 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours1 Position2 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Start_Time2_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time2_Pos2_Dropdown)));
	       	Log.info("Start Time2 Position2 dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time2 Position2 dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time2_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time2_Pos2_Dropdown)));
	       	Log.info("End Time2 Position2 dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time2 Position2 dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours2_Pos2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours2_Pos2_Txt));
	       	Log.info("Hours2 Position2 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours2 Position2 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Start_Time3_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time3_Pos2_Dropdown)));
	       	Log.info("Start Time3 Position2 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time3 Position2 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time3_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time3_Pos2_Dropdown)));
	       	Log.info("End Time3 Position2 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time3 Position2 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours3_Pos2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours3_Pos2_Txt));
	       	Log.info("Hours3 Position2 of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours3 Position2 of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Start_Time4_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Start_Time4_Pos2_Dropdown)));
	       	Log.info("Start Time4 Position2 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("Start Time4 Position2 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_End_Time4_Pos2_Dropdown(String time) throws Exception
    {
    	try
    	{
    		Select element=new Select(driver.findElement(By.xpath(ObjectRepository.Show_Schedule_End_Time4_Pos2_Dropdown)));
	       	Log.info("End Time4 Position2 Dropdown of Schedule is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(time);
	    }
    	catch (Exception e)
    	{
    		Log.error("End Time4 Position2 Dropdown of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Hours4_Pos2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Hours4_Pos2_Txt));
	       	Log.info("Hours4 Position2 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Hours4 Position2 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Override_calculated_hours_by_position_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Override_calculated_hours_by_position_Chk));
	       	Log.info("Override calculated hours by position Checkbox of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Override calculated hours by position Checkbox of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Total_Hours_per_Shift_Pos1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Total_Hours_per_Shift_Pos1_Txt));
	       	Log.info("Total Hours per Shift Text-field Position 1 of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Total Hours per Shift Text-field Position 1 of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Quantity_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Quantity_Txt));
	       	Log.info("Total Hours per Shift Text-field Position 1 of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Total Hours per Shift Text-field Position 1 of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Total_Position_Hours_Pos1_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Total_Position_Hours_Pos1_Txt));
	       	Log.info("Total Position Hours Position1 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Total Position Hours Position1 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Total_Position_Hours_Pos2_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Total_Position_Hours_Pos2_Txt));
	       	Log.info("Total Position Hours Position2 Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Total Position Hours Position2 Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static final WebElement Show_Schedule_Total_Event_Hours_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Total_Event_Hours_Txt));
	       	Log.info("Total Event Hours Text-field of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Total Event Hours Text-field of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Schedule_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Schedule_Save_And_Complete_Later_Btn));
	       	Log.info("Save And Complete Later Button of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save And Complete Later Button of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Schedule_Previous_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Schedule_Previous_Btn));
	       	Log.info("Save And Complete Later Button of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save And Complete Later Button of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Schedule_Next_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Schedule_Next_Btn));
	       	Log.info("Next Button of Schedule is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Next Button of Schedule is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Rate_Options_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Rate_Options_Tab));
	       	Log.info("Show Rate Options Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Show Rate Options Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio));
	       	Log.info("Ask Technicians to submit their rate Radio Button of Show Rate Options is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Ask Technicians to submit their rate Radio Button of Show Rate Options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown(String Rate) throws Exception
    {
    	try
    	{
	       	Select element = new Select (driver.findElement(By.xpath(ObjectRepository.Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown)));
	       	Log.info("Display the lowest submitted Rate to the technicians Dropdown of Show Rate Options is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(Rate);
	    }
    	catch (Exception e)
    	{
    		Log.error("Display the lowest submitted Rate to the technicians Dropdown of Show Rate Options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    
	
    public static WebElement Show_Publish_Crew_to_Invite_Dropdown(String Rate) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.xpath(ObjectRepository.Show_Publish_Crew_to_Invite_Dropdown)));
	       	int Rate1=Integer.parseInt(Rate);
	       	Log.info("Crew to invite Dropdown of Publish is found on the Company Admin Add Event web page");
	       	element.selectByIndex(Rate1);
	    }
    	catch (Exception e)
    	{
    		Log.error("Crew to invite Dropdown of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Positions_Dropdown(String Rate) throws Exception
    {
    	try
    	{
	       	Select element = new Select(driver.findElement(By.xpath(ObjectRepository.Show_Publish_Positions_Dropdown)));
	       	Log.info("Positions Dropdown of Publish is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(Rate);
	    }
    	catch (Exception e)
    	{
    		Log.error("Positions Dropdown of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown(String Rate) throws Exception
    {
    	try
    	{
	       	Select element = new Select (driver.findElement(By.xpath(ObjectRepository.Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown)));
	       	Log.info("Display the default rate to the technicians Dropdown of Show Rate Options is found on the Company Admin Add Event web page");
	       	element.selectByVisibleText(Rate);
	    }
    	catch (Exception e)
    	{
    		Log.error("Display the default rate to the technicians of Show Rate Options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Rate_Options_Use_the_technicians_default_rates_Radio() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Rate_Options_Use_the_technicians_default_rates_Radio));
	       	Log.info("Use the technicians default rates Radio Button of Show Rate Options is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Use the technicians default rates Radio Button of Show Rate Options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
   
    public static WebElement Show_Rate_Options_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Rate_Options_Save_And_Complete_Later_Btn));
	       	Log.info("Save And Complete Later Button of Show rate options is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save And Complete Later Button of Show rate options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Rate_Options_Previous_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Rate_Options_Previous_Btn));
	       	Log.info("Previous Button of Show rate options is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Previous Button of Show rate options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Preview_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Preview_Save_And_Complete_Later_Btn));
	       	Log.info("Save and complete Later Button of Preview is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save and complete Later Button of Preview is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Publish_Save_And_Complete_Later_Btn));
	       	Log.info("Save and complete Later Button of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save and complete Later Button of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Publish_Btn_Cancel_Btn_Of_Alert() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Publish_Publish_Btn_Cancel_Btn_Of_Alert));
	       	Log.info("Cancel Button Alert of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Cancel Button Alert of Publish of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    
    public static WebElement Show_Rate_Options_Next_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Rate_Options_Next_Btn));
	       	Log.info("Next Button of Show Rate Options is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Next Button of Show Rate Options is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Preview_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Tab));
	       	Log.info("Preview Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Preview Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Preview_Event_Name() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Event_Name));
	       	Log.info("Event Name is found on the Company Admin Add Event Preview web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Event Name is not found on the Company Admin Add Event Preview web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Preview_Work_Dates() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Work_Dates));
	       	Log.info("Work Dates is found on the Company Admin Add Event Preview web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Work Dates is not found on the Company Admin Add Event Preview web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Preview_Event_Logo() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Event_Logo));
	       	Log.info("Event Logo is found on the Company Admin Add Event Preview web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Event Logo is not found on the Company Admin Add Event Preview web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Preview_Event_Location() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Event_Location));
	       	Log.info("Event Location is found on the Company Admin Add Event Preview web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Event Location is not found on the Company Admin Add Event Preview web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Preview_Event_Position() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Event_Position));
	       	Log.info("Event Position is found on the Company Admin Add Event Preview web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Event Position is not found on the Company Admin Add Event Preview web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Preview_Response_Deadline() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Response_Deadline));
	       	Log.info("Response Deadline is found on the Company Admin Add Event Preview web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Response Deadline is not found on the Company Admin Add Event Preview web page");
     		throw(e);
        }
        return element;
     }

    public static WebElement Show_Preview_Next_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Preview_Next_Btn));
	       	Log.info("Next Button of Preview is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Next Button of Preview is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Tab));
	       	Log.info("Publish Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Publish Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Narrow_By_Local_Crew_Only_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Narrow_By_Local_Crew_Only_Chk));
	       	Log.info("Narrow By Local Crew Only Check Box of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Narrow By Local Crew Only Check Box of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk));
	       	Log.info("Narrow By Crew with an Average Rating of Including unrated tech or rated higher Check Box of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Narrow By Crew with an Average Rating of Including unrated tech or rated higher Check Box of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk));
	       	Log.info("Narrow By Crew with Valid Passport Check Box of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Narrow By Crew with Valid Passport Check Box of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Publish_Include_W2_Full_Time_Crew_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Include_W2_Full_Time_Crew_Chk));
	       	Log.info("W2 Full Time Crew Checkbox of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("W2 Full Time Crew Check Box of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Publish_Include_W2_Part_Time_Crew_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Include_W2_Part_Time_Crew_Chk));
	       	Log.info("W2 Part Time Crew Passport Check Box of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("W2 Part Time Crew Passport Check Box of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Publish_Include_1099_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Include_1099_Chk));
	       	Log.info("Include 1099 Check Box of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Include 1099 Check Box of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Publish_Create_Roster_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Create_Roster_Btn));
	       	Log.info("Create Roster Button of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Create Roster Button of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Publish_Btn_Publish_Btn_Of_Alert() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert));
	       	Log.info("Publih Button Alert of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Publih Button Alert of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Publish_Now_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Publish_Now_Btn));
	       	Log.info("Publish Now Button of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Publish Now Button of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Publish_Search_Techs_Txt() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Search_Techs_Txt));
	       	Log.info("Search Text-field of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Search Text-field of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Publish_Search_Tech1() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Search_Techs1));
	       	Log.info("Search Text1 of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Search Text1 of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     } 
    
    public static final WebElement Show_Publish_Show_Position1_Link() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Show_Position1_Link));
	       	Log.info("Show Position1 Link of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Show Position1 Link of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    
    public static final WebElement Show_Publish_Show_Position1_Crew_Member1_Chk() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Publish_Show_Position1_Crew_Member1_Chk));
	       	Log.info("Show Position1 Crew Member1 Checkbox of Publish is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Show Position1 Crew Member1 Checkbox of Publish is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Documents_Tab() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Documents_Tab));
	       	Log.info("Documents Tab is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Documents Tab is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Documents_Add_Document_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Documents_Add_Document_Btn));
	       	Log.info("Add Document Button of Documents is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Add Document Button of Documents is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
   
    public static WebElement Show_Documents_Save_And_Complete_Later_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Documents_Save_And_Complete_Later_Btn));
	       	Log.info("Save And Complete Later Button of Documents is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Save And Complete Later Button of Documents is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Documents_Previous_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.linkText(ObjectRepository.Show_Documents_Previous_Btn));
	       	Log.info("Previous Button of Documents is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Previous Button of Documents is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
	
    public static WebElement Show_Documents_Next_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Documents_Next_Btn));
	       	Log.info("Next Button of Documents is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Next Button of Documents is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
    public static WebElement Show_Documents_Delete_Btn() throws Exception
    {
    	try
    	{
	       	element = driver.findElement(By.xpath(ObjectRepository.Show_Documents_Delete_Btn));
	       	Log.info("Delete Button of Documents is found on the Company Admin Add Event web page");
	    }
    	catch (Exception e)
    	{
    		Log.error("Delete Button of Documents is not found on the Company Admin Add Event web page");
     		throw(e);
        }
        return element;
     }
    
}
