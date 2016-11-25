package AppModule;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataTable.Log;
import DataTable.Xls_Reader;
import TestMethod.Baseclass;
import TestMethod.ShowsAction;
import TestScript.Genericmethod;
import TestScript.ObjectRepository;

public class ShowsUtility extends Baseclass {
	
	public static int TestCaseRow=2;
	public static Xls_Reader cellval = new Xls_Reader("src/config/Shows.xlsx"); 
	public static int currentTestCaseID;
	public static WebDriverWait wait=null;
	public static String checked="Checked";	
	public static String selected="Selected";
	public static JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public ShowsUtility(WebDriver driver) 
	{
		super(driver);		
	}
	
//	This method is used for selecting airport from auto-text-field
	public static void selectOptionWithText(String textToSelect) {
		try {
			wait=new WebDriverWait(driver, 5);
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        
		        	System.out.println(option.getText());
		        	System.out.println("Trying to select: "+textToSelect);
		        	option.click();
		            break;
		        }
		    }			
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println("No");
			System.out.println(e.getStackTrace());
		}
	}

	
//	This method is used for selecting states from auto-text-field
	public static void state_selectOptionWithText(String textToSelect) {
		try {
			wait=new WebDriverWait(driver, 5);
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
	
//	This method is used for selecting Technician from auto-text-field
	/*public static void technician_selectOptionWithText(String textToSelect) {
		try {
			wait=new WebDriverWait(driver, 5);
			WebElement autoOptions = driver.findElement(By.id("ui-id-3"));
			//wait.until(ExpectedConditions.visibilityOf(autoOptions));
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			 for(int i = 0; i < optionsToSelect.size(); i++) {
				 System.out.println("ab");
		            System.out.println(optionsToSelect.get(i).toString());
		        }
			for(WebElement options : optionsToSelect){
				System.out.println(options.getText());
		        if(options.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		        	options.click();
		            break;
		        }
		    }			
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println("No");
			System.out.println(e.getStackTrace());
		}
	}*/
	
	public static void selectOptionWithIndex(int indexToSelect) {
		
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-3"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		        if(indexToSelect<=optionsToSelect.size()) {
		        	System.out.println("Trying to select based on index: "+indexToSelect);
		           optionsToSelect.get(indexToSelect).click();
		        }
		} 		
		catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void Add_Event_01() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Event_Id=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Event_Id_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Event_Id_Txt().sendKeys(Basic_Info_Event_Id);
		Log.info(Basic_Info_Event_Id+" is entered in Event Id Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Description=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Description_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Description_Txt().sendKeys(Basic_Info_Description);
		Log.info(Basic_Info_Description+" is entered in Description Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Project_Manager=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Project_Manager_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Project_Manager_Dropdown(Basic_Info_Project_Manager);
		Log.info(Basic_Info_Project_Manager+" is selected in Project Manager dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		//Bid end time or response deadline
		String Basic_Info_Response_Deadline=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Response_Deadline, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('bidEndTime').setAttribute('value','"+Basic_Info_Response_Deadline+"');");
		Thread.sleep(1000);
		
		String Basic_Info_Add_Logo=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_01, ObjectRepository.Excel_Show_Basic_Info_Add_Logo_Btn, TestCaseRow);
		ShowsAction.Show_Basic_Info_Add_Logo_Btn().sendKeys(Basic_Info_Add_Logo);
		Log.info(Basic_Info_Add_Logo+" is uploaded using Add Logo Button on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
		
		Thread.sleep(1000);
	}

	public static void Add_Event_02() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_02, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	}


	public static void Add_Event_03() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_03, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Save_And_Complete_Later_Btn().click();
		Log.info("Save And Complete Later Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	}
	
	public static void Add_Event_04() throws Exception
	{
		for(int RowNum = 2; RowNum<=cellval.getRowCount(ObjectRepository.Add_Event_Test_Case_04) ; RowNum++)
		{
			Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
			
			String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, RowNum);
			ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
			Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Show_Name_Txt().clear();
			ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name+" ");
			Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Location_City_Txt().clear();
			ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City+" ");
			Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().clear();
			ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
			selectOptionWithText(Basic_Info_Airport);
			Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Location_State_Txt().clear();
			ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
			state_selectOptionWithText(Basic_Info_State);
			Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').value='';");
			Thread.sleep(1000);
			ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
			Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').value='';");
			Thread.sleep(1000);
			ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
			Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').value='';");
			Thread.sleep(1000);
			ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
			Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_04, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').value='';");
			Thread.sleep(1000);
			ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
			Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
			
			Thread.sleep(2000);
		
			ShowsAction.Show_Basic_Info_Next_Btn().click();
			Log.info("Next Button is clicked in Basic Info on Add Event web page");
			
			Thread.sleep(1000);
			
			CommonUtility.Add_New_Event_Navigation();
		}
    }
	
	public static void Add_Event_05() throws Exception
	{
		for(int RowNum = 2; RowNum<=cellval.getRowCount(ObjectRepository.Add_Event_Test_Case_05) ; RowNum++)
		{
			Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
			
			String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, RowNum);
			ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
			Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
			Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
			Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
			selectOptionWithText(Basic_Info_Airport);
			Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, RowNum);
			ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
			state_selectOptionWithText(Basic_Info_State);
			Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
			ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
			ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
			Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
			ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
			ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
			Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
			ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
			ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
			Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_05, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, RowNum);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
			ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
			ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
			Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
			
			Thread.sleep(1000);
		
			ShowsAction.Show_Basic_Info_Next_Btn().click();
			Log.info("Next Button is clicked in Basic Info on Add Event web page");

			Thread.sleep(1000);
		}
    }
	
	public static void Add_Event_06() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Add_Logo=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_06, ObjectRepository.Excel_Show_Basic_Info_Add_Logo_Btn, TestCaseRow);
		ShowsAction.Show_Basic_Info_Add_Logo_Btn().sendKeys(Basic_Info_Add_Logo);
		Log.info(Basic_Info_Add_Logo+" is uploaded using Add Logo Button on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
		
		Thread.sleep(1000);
	
	}
	
	public static void Add_Event_07() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Event_Id=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Event_Id_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Event_Id_Txt().sendKeys(Basic_Info_Event_Id);
		Log.info(Basic_Info_Event_Id+" is entered in Event Id Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_07, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	}
	
	public static void Add_Event_08() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Txt());
		
		String Position_Needs_Group1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Txt().sendKeys(Position_Needs_Group1);
		Log.info(Position_Needs_Group1+" is entered in Group1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1supervisor=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Supervisor_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Supervisor_Dropdown(Position_Needs_G1supervisor);
		Log.info(Position_Needs_G1supervisor+" is selected in Group1 Supervisor Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt().sendKeys(Position_Needs_G1Start_Work1);
		Log.info(Position_Needs_G1Start_Work1+" is entered in Start Work date Text Field for Postion1 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt().sendKeys(Position_Needs_G1End_Work1);
		Log.info(Position_Needs_G1End_Work1+" is entered in End Work date Text Field for Postion1 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Start_Time1_Dropdown(Position_Needs_G1Start_Time1);
		Log.info(Position_Needs_G1Start_Time1+" is selected in Group1 Position1 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_End_Time1_Dropdown(Position_Needs_G1End_Time1);
		Log.info(Position_Needs_G1End_Time1+" is selected in Group1 Position1 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1N1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Notes1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Notes1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Notes1_Txt().sendKeys(Position_Needs_G1N1);
		Log.info(Position_Needs_G1N1+" is entered in Notes Text-field for Position1 in Group1 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add another position Button of Group1 is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().sendKeys(Position_Needs_G1Qty2);
		Log.info(Position_Needs_G1Qty2+" is entered in Group1 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position2_Dropdown(Position_Needs_G1P2);
		Log.info(Position_Needs_G1P2+" is selected in Group1 Position2 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_Start_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group1_Start_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_Start_Work2_Txt().sendKeys(Position_Needs_G1Start_Work2);
		Log.info(Position_Needs_G1Start_Work2+" is entered in Start Work date Text Field for Postion2 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_Start_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_End_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group1_End_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_End_Work2_Txt().sendKeys(Position_Needs_G1End_Work2);
		Log.info(Position_Needs_G1End_Work2+" is entered in End Work date Text Field for Postion2 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_End_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Start_Time2_Dropdown(Position_Needs_G1Start_Time2);
		Log.info(Position_Needs_G1Start_Time2+" is selected in Group1 Position2 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_End_Time2_Dropdown(Position_Needs_G1End_Time2);
		Log.info(Position_Needs_G1End_Time2+" is selected in Group1 Position2 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1N2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Notes2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Notes2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Notes2_Txt().sendKeys(Position_Needs_G1N2);
		Log.info(Position_Needs_G1N2+" is entered in Notes Text-field for Position2 in Group1 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add another position Button of Group1 is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity3_Txt().sendKeys(Position_Needs_G1Qty3);
		Log.info(Position_Needs_G1Qty3+" is entered in Group1 Quantity3 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Position3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position3_Dropdown(Position_Needs_G1P3);
		Log.info(Position_Needs_G1P3+" is selected in Group1 Position3 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_Start_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group1_Start_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_Start_Work3_Txt().sendKeys(Position_Needs_G1Start_Work3);
		Log.info(Position_Needs_G1Start_Work3+" is entered in Start Work date Text Field for Postion3 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_Start_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_End_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group1_End_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_End_Work3_Txt().sendKeys(Position_Needs_G1End_Work3);
		Log.info(Position_Needs_G1End_Work3+" is entered in End Work date Text Field for Postion3 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_End_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Start_Time3_Dropdown(Position_Needs_G1Start_Time3);
		Log.info(Position_Needs_G1Start_Time3+" is selected in Group1 Position3 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_End_Time3_Dropdown(Position_Needs_G1End_Time3);
		Log.info(Position_Needs_G1End_Time3+" is selected in Group1 Position3 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1N3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Notes3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Notes3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Notes3_Txt().sendKeys(Position_Needs_G1N3);
		Log.info(Position_Needs_G1N3+" is entered in Notes Text-field for Position3 in Group1 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add another position Button of Group1 is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity4_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity4_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity4_Txt().sendKeys(Position_Needs_G1Qty4);
		Log.info(Position_Needs_G1Qty4+" is entered in Group1 Quantity4 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Position4_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position4_Dropdown(Position_Needs_G1P4);
		Log.info(Position_Needs_G1P4+" is selected in Group1 Position4 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Work4=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Work4_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_Start_Work4_Txt());
		ShowsAction.Show_Position_Needs_Group1_Start_Work4_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_Start_Work4_Txt().sendKeys(Position_Needs_G1Start_Work4);
		Log.info(Position_Needs_G1Start_Work4+" is entered in Start Work date Text Field for Postion4 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_Start_Work4_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Work4=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Work4_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_End_Work4_Txt());
		ShowsAction.Show_Position_Needs_Group1_End_Work4_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_End_Work4_Txt().sendKeys(Position_Needs_G1End_Work4);
		Log.info(Position_Needs_G1End_Work4+" is entered in End Work date Text Field for Postion4 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_End_Work4_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Time4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Time4_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Start_Time4_Dropdown(Position_Needs_G1Start_Time4);
		Log.info(Position_Needs_G1Start_Time4+" is selected in Group1 Position4 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Time4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Time4_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_End_Time4_Dropdown(Position_Needs_G1End_Time4);
		Log.info(Position_Needs_G1End_Time4+" is selected in Group1 Position4 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1N4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group1_Notes4_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Notes4_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Notes4_Txt().sendKeys(Position_Needs_G1N4);
		Log.info(Position_Needs_G1N4+" is entered in Notes Text-field for Position4 in Group1 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Add_Another_Group_Btn().click();
		Log.info("Add another Group Button is clicked on Add Event web page");
		
		String Position_Needs_Group2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Txt().sendKeys(Position_Needs_Group2);
		Log.info(Position_Needs_Group2+" is entered in Group2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2supervisor=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Supervisor_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Supervisor_Dropdown(Position_Needs_G2supervisor);
		Log.info(Position_Needs_G2supervisor+" is selected in Group2 Supervisor Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Quantity1_Txt().sendKeys(Position_Needs_G2Qty1);
		Log.info(Position_Needs_G2Qty1+" is entered in Group2 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Position1_Dropdown(Position_Needs_G2P1);
		Log.info(Position_Needs_G2P1+" is selected in Group2 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Start_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Start_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group2_Start_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group2_Start_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group2_Start_Work1_Txt().sendKeys(Position_Needs_G2Start_Work1);
		Log.info(Position_Needs_G2Start_Work1+" is entered in Start Work date Text Field for Postion1 in Group2 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group2_Start_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G2End_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_End_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group2_End_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group2_End_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group2_End_Work1_Txt().sendKeys(Position_Needs_G2End_Work1);
		Log.info(Position_Needs_G2End_Work1+" is entered in End Work date Text Field for Postion1 in Group2 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group2_End_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Start_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Start_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Start_Time1_Dropdown(Position_Needs_G2Start_Time1);
		Log.info(Position_Needs_G2Start_Time1+" is selected in Group2 Position1 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2End_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_End_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_End_Time1_Dropdown(Position_Needs_G2End_Time1);
		Log.info(Position_Needs_G2End_Time1+" is selected in Group2 Position1 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2N1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Notes1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Notes1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Notes1_Txt().sendKeys(Position_Needs_G2N1);
		Log.info(Position_Needs_G2N1+" is entered in Notes Text-field for Position1 in Group2 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group2_Add_Another_Position_Btn().click();
		Log.info("Add another Postion Button is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Quantity2_Txt().sendKeys(Position_Needs_G2Qty2);
		Log.info(Position_Needs_G2Qty2+" is entered in Group2 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Position2_Dropdown(Position_Needs_G2P2);
		Log.info(Position_Needs_G2P2+" is selected in Group2 Position2 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Start_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Start_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group2_Start_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group2_Start_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group2_Start_Work2_Txt().sendKeys(Position_Needs_G2Start_Work2);
		Log.info(Position_Needs_G2Start_Work2+" is entered in Start Work date Text Field for Postion2 in Group2 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group2_Start_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G2End_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_End_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group2_End_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group2_End_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group2_End_Work2_Txt().sendKeys(Position_Needs_G2End_Work2);
		Log.info(Position_Needs_G2End_Work2+" is entered in End Work date Text Field for Postion2 in Group2 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group2_End_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Start_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Start_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Start_Time2_Dropdown(Position_Needs_G2Start_Time2);
		Log.info(Position_Needs_G2Start_Time2+" is selected in Group2 Position2 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2End_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_End_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_End_Time2_Dropdown(Position_Needs_G2End_Time2);
		Log.info(Position_Needs_G2End_Time2+" is selected in Group2 Position2 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2N2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Notes2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Notes2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Notes2_Txt().sendKeys(Position_Needs_G2N2);
		Log.info(Position_Needs_G2N2+" is entered in Notes Text-field for Position2 in Group2 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group2_Add_Another_Position_Btn().click();
		Log.info("Add another Postion Button is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Qty3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Quantity3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Quantity3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Quantity3_Txt().sendKeys(Position_Needs_G2Qty3);
		Log.info(Position_Needs_G2Qty3+" is entered in Group2 Quantity3 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2P3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Position3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Position3_Dropdown(Position_Needs_G2P3);
		Log.info(Position_Needs_G2P3+" is selected in Group2 Position3 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Start_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Start_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group2_Start_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group2_Start_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group2_Start_Work3_Txt().sendKeys(Position_Needs_G2Start_Work3);
		Log.info(Position_Needs_G2Start_Work3+" is entered in Start Work date Text Field for Postion3 in Group2 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group2_Start_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G2End_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_End_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group2_End_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group2_End_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group2_End_Work3_Txt().sendKeys(Position_Needs_G2End_Work3);
		Log.info(Position_Needs_G2End_Work3+" is entered in End Work date Text Field for Postion3 in Group2 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group2_End_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G2Start_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Start_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Start_Time3_Dropdown(Position_Needs_G2Start_Time3);
		Log.info(Position_Needs_G2Start_Time3+" is selected in Group2 Position3 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2End_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_End_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_End_Time3_Dropdown(Position_Needs_G2End_Time3);
		Log.info(Position_Needs_G2End_Time3+" is selected in Group2 Position3 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G2N3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group2_Notes3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group2_Notes3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group2_Notes3_Txt().sendKeys(Position_Needs_G2N3);
		Log.info(Position_Needs_G2N3+" is entered in Notes Text-field for Position3 in Group2 on Add Event web page");
		
		Thread.sleep(1000);
		
		//3rd group
		ShowsAction.Show_Position_Needs_Add_Another_Group_Btn().click();
		Log.info("Add another Group Button is clicked on Add Event web page");
		
		String Position_Needs_Group3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Txt().sendKeys(Position_Needs_Group3);
		Log.info(Position_Needs_Group3+" is entered in Group3 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3supervisor=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Supervisor_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Supervisor_Dropdown(Position_Needs_G3supervisor);
		Log.info(Position_Needs_G3supervisor+" is selected in Group3 Supervisor Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Quantity1_Txt().sendKeys(Position_Needs_G3Qty1);
		Log.info(Position_Needs_G3Qty1+" is entered in Group3 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Position1_Dropdown(Position_Needs_G3P1);
		Log.info(Position_Needs_G3P1+" is selected in Group3 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Start_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Start_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group3_Start_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group3_Start_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group3_Start_Work1_Txt().sendKeys(Position_Needs_G3Start_Work1);
		Log.info(Position_Needs_G3Start_Work1+" is entered in Start Work date Text Field for Postion1 in Group3 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group3_Start_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G3End_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_End_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group3_End_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group3_End_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group3_End_Work1_Txt().sendKeys(Position_Needs_G3End_Work1);
		Log.info(Position_Needs_G3End_Work1+" is entered in End Work date Text Field for Postion1 in Group3 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group3_End_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Start_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Start_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Start_Time1_Dropdown(Position_Needs_G3Start_Time1);
		Log.info(Position_Needs_G3Start_Time1+" is selected in Group3 Position1 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3End_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_End_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_End_Time1_Dropdown(Position_Needs_G3End_Time1);
		Log.info(Position_Needs_G3End_Time1+" is selected in Group3 Position1 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3N1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Notes1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Notes1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Notes1_Txt().sendKeys(Position_Needs_G3N1);
		Log.info(Position_Needs_G3N1+" is entered in Notes Text-field for Position1 in Group3 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group3_Add_Another_Position_Btn().click();
		Log.info("Add another Postion Button is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Quantity2_Txt().sendKeys(Position_Needs_G3Qty2);
		Log.info(Position_Needs_G3Qty2+" is entered in Group3 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Position2_Dropdown(Position_Needs_G3P2);
		Log.info(Position_Needs_G3P2+" is selected in Group3 Position2 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Start_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Start_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group3_Start_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group3_Start_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group3_Start_Work2_Txt().sendKeys(Position_Needs_G3Start_Work2);
		Log.info(Position_Needs_G3Start_Work2+" is entered in Start Work date Text Field for Postion2 in Group3 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group3_Start_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G3End_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_End_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group3_End_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group3_End_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group3_End_Work2_Txt().sendKeys(Position_Needs_G3End_Work2);
		Log.info(Position_Needs_G3End_Work2+" is entered in End Work date Text Field for Postion2 in Group3 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group3_End_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Start_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Start_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Start_Time2_Dropdown(Position_Needs_G3Start_Time2);
		Log.info(Position_Needs_G3Start_Time2+" is selected in Group3 Position2 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3End_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_End_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_End_Time2_Dropdown(Position_Needs_G3End_Time2);
		Log.info(Position_Needs_G3End_Time2+" is selected in Group3 Position2 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3N2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Notes2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Notes2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Notes2_Txt().sendKeys(Position_Needs_G3N2);
		Log.info(Position_Needs_G3N2+" is entered in Notes Text-field for Position2 in Group3 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group3_Add_Another_Position_Btn().click();
		Log.info("Add another Postion Button is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Qty3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Quantity3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Quantity3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Quantity3_Txt().sendKeys(Position_Needs_G3Qty3);
		Log.info(Position_Needs_G3Qty3+" is entered in Group3 Quantity3 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3P3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Position3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Position3_Dropdown(Position_Needs_G3P3);
		Log.info(Position_Needs_G3P3+" is selected in Group3 Position3 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Start_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Start_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group3_Start_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group3_Start_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group3_Start_Work3_Txt().sendKeys(Position_Needs_G3Start_Work3);
		Log.info(Position_Needs_G3Start_Work3+" is entered in Start Work date Text Field for Postion3 in Group3 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group3_Start_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G3End_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_End_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group3_End_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group3_End_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group3_End_Work3_Txt().sendKeys(Position_Needs_G3End_Work3);
		Log.info(Position_Needs_G3End_Work3+" is entered in End Work date Text Field for Postion3 in Group3 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group3_End_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G3Start_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Start_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Start_Time3_Dropdown(Position_Needs_G3Start_Time3);
		Log.info(Position_Needs_G3Start_Time3+" is selected in Group3 Position3 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3End_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_End_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_End_Time3_Dropdown(Position_Needs_G3End_Time3);
		Log.info(Position_Needs_G3End_Time3+" is selected in Group3 Position3 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G3N3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group3_Notes3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group3_Notes3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group3_Notes3_Txt().sendKeys(Position_Needs_G3N3);
		Log.info(Position_Needs_G3N3+" is entered in Notes Text-field for Position3 in Group3 on Add Event web page");
		
		Thread.sleep(1000);
		
		//group4
		ShowsAction.Show_Position_Needs_Add_Another_Group_Btn().click();
		Log.info("Add another Group Button is clicked on Add Event web page");
		
		String Position_Needs_Group4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Txt().sendKeys(Position_Needs_Group4);
		Log.info(Position_Needs_Group4+" is entered in Group4 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4supervisor=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Supervisor_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Supervisor_Dropdown(Position_Needs_G4supervisor);
		Log.info(Position_Needs_G4supervisor+" is selected in Group4 Supervisor Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Quantity1_Txt().sendKeys(Position_Needs_G4Qty1);
		Log.info(Position_Needs_G4Qty1+" is entered in Group4 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Position1_Dropdown(Position_Needs_G4P1);
		Log.info(Position_Needs_G4P1+" is selected in Group4 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Start_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Start_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group4_Start_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group4_Start_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group4_Start_Work1_Txt().sendKeys(Position_Needs_G4Start_Work1);
		Log.info(Position_Needs_G4Start_Work1+" is entered in Start Work date Text Field for Postion1 in Group4 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group4_Start_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G4End_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_End_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group4_End_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group4_End_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group4_End_Work1_Txt().sendKeys(Position_Needs_G4End_Work1);
		Log.info(Position_Needs_G4End_Work1+" is entered in End Work date Text Field for Postion1 in Group4 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group4_End_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Start_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Start_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Start_Time1_Dropdown(Position_Needs_G4Start_Time1);
		Log.info(Position_Needs_G4Start_Time1+" is selected in Group4 Position1 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4End_Time1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_End_Time1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_End_Time1_Dropdown(Position_Needs_G4End_Time1);
		Log.info(Position_Needs_G4End_Time1+" is selected in Group4 Position1 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4N1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Notes1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Notes1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Notes1_Txt().sendKeys(Position_Needs_G4N1);
		Log.info(Position_Needs_G4N1+" is entered in Notes Text-field for Position1 in Group4 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group4_Add_Another_Position_Btn().click();
		Log.info("Add another Postion Button is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Quantity2_Txt().sendKeys(Position_Needs_G4Qty2);
		Log.info(Position_Needs_G4Qty2+" is entered in Group4 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Position2_Dropdown(Position_Needs_G4P2);
		Log.info(Position_Needs_G4P2+" is selected in Group4 Position2 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Start_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Start_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group4_Start_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group4_Start_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group4_Start_Work2_Txt().sendKeys(Position_Needs_G4Start_Work2);
		Log.info(Position_Needs_G4Start_Work2+" is entered in Start Work date Text Field for Postion2 in Group4 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group4_Start_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G4End_Work2=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_End_Work2_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group4_End_Work2_Txt());
		ShowsAction.Show_Position_Needs_Group4_End_Work2_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group4_End_Work2_Txt().sendKeys(Position_Needs_G4End_Work2);
		Log.info(Position_Needs_G4End_Work2+" is entered in End Work date Text Field for Postion2 in Group4 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group4_End_Work2_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Start_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Start_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Start_Time1_Dropdown(Position_Needs_G4Start_Time2);
		Log.info(Position_Needs_G4Start_Time2+" is selected in Group4 Position2 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4End_Time2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_End_Time2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_End_Time1_Dropdown(Position_Needs_G4End_Time2);
		Log.info(Position_Needs_G4End_Time2+" is selected in Group4 Position2 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4N2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Notes2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Notes2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Notes2_Txt().sendKeys(Position_Needs_G4N2);
		Log.info(Position_Needs_G4N2+" is entered in Notes Text-field for Position2 in Group4 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group4_Add_Another_Position_Btn().click();
		Log.info("Add another Postion Button is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Qty3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Quantity3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Quantity3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Quantity3_Txt().sendKeys(Position_Needs_G4Qty3);
		Log.info(Position_Needs_G4Qty3+" is entered in Group4 Quantity3 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4P3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Position3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Position3_Dropdown(Position_Needs_G4P3);
		Log.info(Position_Needs_G4P3+" is selected in Group4 Position3 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Start_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Start_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group4_Start_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group4_Start_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group4_Start_Work3_Txt().sendKeys(Position_Needs_G4Start_Work3);
		Log.info(Position_Needs_G4Start_Work3+" is entered in Start Work date Text Field for Postion3 in Group4 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group4_Start_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G4End_Work3=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_End_Work3_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group4_End_Work3_Txt());
		ShowsAction.Show_Position_Needs_Group4_End_Work3_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group4_End_Work3_Txt().sendKeys(Position_Needs_G4End_Work3);
		Log.info(Position_Needs_G4End_Work3+" is entered in End Work date Text Field for Postion3 in Group4 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group4_End_Work3_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G4Start_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Start_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Start_Time3_Dropdown(Position_Needs_G4Start_Time3);
		Log.info(Position_Needs_G4Start_Time3+" is selected in Group4 Position3 Start Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4End_Time3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_End_Time3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_End_Time3_Dropdown(Position_Needs_G4End_Time3);
		Log.info(Position_Needs_G4End_Time3+" is selected in Group4 Position3 End Time Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G4N3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_08, ObjectRepository.Excel_Show_Position_Needs_Group4_Notes3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group4_Notes3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group4_Notes3_Txt().sendKeys(Position_Needs_G4N3);
		Log.info(Position_Needs_G4N3+" is entered in Notes Text-field for Position3 in Group4 on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next Button is clicked in Position Needs on Add Event web page");
		
	}
	
	public static void Add_Event_09() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add another position Button of Group1 is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().sendKeys(Position_Needs_G1Qty2);
		Log.info(Position_Needs_G1Qty2+" is entered in Group1 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position2_Dropdown(Position_Needs_G1P2);
		Log.info(Position_Needs_G1P2+" is selected in Group1 Position2 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add another position Button of Group1 is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity3_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity3_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity3_Txt().sendKeys(Position_Needs_G1Qty3);
		Log.info(Position_Needs_G1Qty3+" is entered in Group1 Quantity3 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P3=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Position3_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position3_Dropdown(Position_Needs_G1P3);
		Log.info(Position_Needs_G1P3+" is selected in Group1 Position3 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add another position Button of Group1 is clicked on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity4_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity4_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity4_Txt().sendKeys(Position_Needs_G1Qty4);
		Log.info(Position_Needs_G1Qty4+" is entered in Group1 Quantity4 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P4=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_09, ObjectRepository.Excel_Show_Position_Needs_Group1_Position4_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position4_Dropdown(Position_Needs_G1P4);
		Log.info(Position_Needs_G1P4+" is selected in Group1 Position4 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next Button is clicked in Position Needs on Add Event web page");
		
	}
	
	public static void Add_Event_10() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_10, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next Button is clicked in Position Needs on Add Event web page");
		
	}
	
	public static void Add_Event_11() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_11, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Previous_Btn().click();
		Log.info("Previous button is clicked in Position Needs on Add Event web page");
		
	}
	
	public static void Add_Event_12() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_12, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Save_And_Complete_Later_Btn().click();
		Log.info("Save and complete later is clicked in Position Needs on Add Event web page");
	}
	
	public static void Add_Event_13() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		for(int RowNum = 2; RowNum<=cellval.getRowCount(ObjectRepository.Add_Event_Test_Case_13) ; RowNum++)
		{
			Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
			
			String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, RowNum);
			ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
			ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
			Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_13, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, RowNum);
			ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
			Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
			
			Thread.sleep(1000);
		
			ShowsAction.Show_Position_Needs_Next_Btn().click();
			Log.info("Next button is clicked in Position Needs on Add Event web page");
		}
	}
	
	public static void Add_Event_14() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		for(int RowNum = 2; RowNum<=cellval.getRowCount(ObjectRepository.Add_Event_Test_Case_14) ; RowNum++)
		{
			Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
			
			String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, RowNum);
			ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
			ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
			Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
			
			Thread.sleep(1000);
			
			String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_14, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, RowNum);
			ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
			Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
			
			Thread.sleep(1000);
		
			ShowsAction.Show_Position_Needs_Next_Btn().click();
			Log.info("Next button is clicked in Position Needs on Add Event web page");
		}
	}
	
	public static void Add_Event_15() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
			
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Start_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Position_Needs_Group1_Start_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt().sendKeys(Position_Needs_G1Start_Work1);
		Log.info(Position_Needs_G1Start_Work1+" is entered in Start Work date Text Field for Postion1 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_Start_Work1_Txt());
		
		Thread.sleep(1000);
		
		String Position_Needs_G1End_Work1=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_15, ObjectRepository.Excel_Show_Position_Needs_Group1_End_Work1_Txt, TestCaseRow);
		js.executeScript("arguments[0].removeAttribute('disabled');",ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt());
		ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt().clear();
		Thread.sleep(1000);
		ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt().sendKeys(Position_Needs_G1End_Work1);
		Log.info(Position_Needs_G1End_Work1+" is entered in End Work date Text Field for Postion1 in Group1 on Add Event web page");
		Thread.sleep(500);
		js.executeScript("arguments[0].setAttribute('disabled', '');",ShowsAction.Show_Position_Needs_Group1_End_Work1_Txt());
		
		Thread.sleep(2000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
	}
	
	public static void Add_Event_16() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		String Schedule_Start_Time1_Pos1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Schedule_Start_Time1_Pos1_Dropdown, TestCaseRow);
		ShowsAction.Show_Schedule_Start_Time1_Pos1_Dropdown(Schedule_Start_Time1_Pos1);
		Log.info(Schedule_Start_Time1_Pos1+" is selected in Start Time1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_End_Time1_Pos1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_16, ObjectRepository.Excel_Show_Schedule_End_Time1_Pos1_Dropdown, TestCaseRow);
		ShowsAction.Show_Schedule_End_Time1_Pos1_Dropdown(Schedule_End_Time1_Pos1);
		Log.info(Schedule_End_Time1_Pos1+" is selected in End Time1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(2000);
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
	}
	
	public static void Add_Event_17() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		String Schedule_Start_Time1_Pos1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Schedule_Start_Time1_Pos1_Dropdown, TestCaseRow);
		ShowsAction.Show_Schedule_Start_Time1_Pos1_Dropdown(Schedule_Start_Time1_Pos1);
		Log.info(Schedule_Start_Time1_Pos1+" is selected in Start Time1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_End_Time1_Pos1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_17, ObjectRepository.Excel_Show_Schedule_End_Time1_Pos1_Dropdown, TestCaseRow);
		ShowsAction.Show_Schedule_End_Time1_Pos1_Dropdown(Schedule_End_Time1_Pos1);
		Log.info(Schedule_End_Time1_Pos1+" is selected in End Time1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(2000);
		
		ShowsAction.Show_Schedule_Previous_Btn().click();
		Log.info("Previous button is clicked in Schedule on Add Event web page");
		
	}
	
	public static void Add_Event_18() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		String Schedule_Start_Time1_Pos1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Schedule_Start_Time1_Pos1_Dropdown, TestCaseRow);
		ShowsAction.Show_Schedule_Start_Time1_Pos1_Dropdown(Schedule_Start_Time1_Pos1);
		Log.info(Schedule_Start_Time1_Pos1+" is selected in Start Time1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_End_Time1_Pos1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_18, ObjectRepository.Excel_Show_Schedule_End_Time1_Pos1_Dropdown, TestCaseRow);
		ShowsAction.Show_Schedule_End_Time1_Pos1_Dropdown(Schedule_End_Time1_Pos1);
		Log.info(Schedule_End_Time1_Pos1+" is selected in End Time1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(2000);
		
		ShowsAction.Show_Schedule_Save_And_Complete_Later_Btn().click();
		Log.info("Save and Complete Later button is clicked in Schedule on Add Event web page");
		
	}
	
	public static void Add_Event_19() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add Another Position Button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().sendKeys(Position_Needs_G1Qty2);
		Log.info(Position_Needs_G1Qty2+" is entered in Group1 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Position_Needs_Group1_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position2_Dropdown(Position_Needs_G1P2);
		Log.info(Position_Needs_G1P2+" is selected in Group1 Position2 Dropdown on Add Event web page");
	
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		String Show_Schedule_Override_calculated_hours_by_position_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Schedule_Override_calculated_hours_by_position_Chk, TestCaseRow);
		if(!ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().isSelected())
		{
			if(Show_Schedule_Override_calculated_hours_by_position_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().click();
				Log.info("Override calculated hours by position Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Override calculated hours by position Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Override calculated hours by position Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(2000);
		
		String Schedule_Hours1_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Schedule_Hours1_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours1_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours1_Pos1_Txt().sendKeys(Schedule_Hours1_Pos1);
		Log.info(Schedule_Hours1_Pos1+" is selected in Hours1 Position1 Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_Hours2_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Schedule_Hours2_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours2_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours2_Pos1_Txt().sendKeys(Schedule_Hours2_Pos1);
		Log.info(Schedule_Hours2_Pos1+" is selected in Hours2 Position1 Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_Hours3_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Schedule_Hours3_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours3_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours3_Pos1_Txt().sendKeys(Schedule_Hours3_Pos1);
		Log.info(Schedule_Hours3_Pos1+" is selected in Hours3 Position1 Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_Hours4_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_19, ObjectRepository.Excel_Show_Schedule_Hours4_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours4_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours4_Pos1_Txt().sendKeys(Schedule_Hours4_Pos1);
		Log.info(Schedule_Hours4_Pos1+" is selected in Hours4 Position1 Text Field on Add Event web page");
		
		Thread.sleep(2000);
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
	}
	
	public static void Add_Event_20() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add Another Position Button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().sendKeys(Position_Needs_G1Qty2);
		Log.info(Position_Needs_G1Qty2+" is entered in Group1 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Position_Needs_Group1_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position2_Dropdown(Position_Needs_G1P2);
		Log.info(Position_Needs_G1P2+" is selected in Group1 Position2 Dropdown on Add Event web page");
	
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(2000);
		
		String Show_Schedule_Override_calculated_hours_by_position_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_20, ObjectRepository.Excel_Show_Schedule_Override_calculated_hours_by_position_Chk, TestCaseRow);
		if(!ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().isSelected())
		{
			if(Show_Schedule_Override_calculated_hours_by_position_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().click();
				Log.info("Override calculated hours by position Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Override calculated hours by position Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Override calculated hours by position Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(2000);
		
		Double Hour1=Double.parseDouble(ShowsAction.Show_Schedule_Hours1_Pos1_Txt().getAttribute("value"));
		Double Hour2=Double.parseDouble(ShowsAction.Show_Schedule_Hours2_Pos1_Txt().getAttribute("value"));
		Double Hour3=Double.parseDouble(ShowsAction.Show_Schedule_Hours3_Pos1_Txt().getAttribute("value"));
		Double Hour4=Double.parseDouble(ShowsAction.Show_Schedule_Hours4_Pos1_Txt().getAttribute("value"));
		Double Result=Hour1+Hour2+Hour3+Hour4;
		Double Total_Hours_per_Shift=Double.parseDouble(ShowsAction.Show_Schedule_Total_Hours_per_Shift_Pos1_Txt().getAttribute("value"));
		String Hours=Result.toString();
		String Total=Total_Hours_per_Shift.toString();
		if(Hours.equals(Total))
		{
			System.out.println("Total Hours is Validated");
		}
		else
		{
			System.out.println("Total Hours is incorrect");
		}
		Thread.sleep(2000);
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
	}
	
	
	
	public static void Add_Event_21() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_21,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
	}
	
	public static void Add_Event_22() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_22,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		Runtime.getRuntime().exec("D:\\up.exe");
		
//		ShowsAction.Show_Documents_Next_Btn().click();
//		Log.info("Next button is clicked in Documents on Add Event web page");
	}
	
		
	public static void Add_Event_23() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1ty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1ty1);
		Log.info(Position_Needs_G1ty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Thread.sleep(1000);
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_23,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		ShowsAction.Show_Documents_Previous_Btn().click();
		Log.info("Previous button is clicked in Documents on Add Event web page");
	}
	
	public static void Add_Event_24() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Thread.sleep(1000);
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_24,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
	}
	
	public static void Add_Event_25() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_25, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_26() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_26, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Previous_Btn());
		
		ShowsAction.Show_Rate_Options_Previous_Btn().click();
		Log.info("Previous button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_27() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_27, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Save_And_Complete_Later_Btn());
		
		ShowsAction.Show_Rate_Options_Save_And_Complete_Later_Btn().click();
		Log.info("Save and Complete later button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_28() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		String Ask_technicians_to_submit_their_rate_Radio=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio, TestCaseRow);
		if(!ShowsAction.Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio().isSelected())
		{
			if(Ask_technicians_to_submit_their_rate_Radio.equals(selected))	
			{
			((JavascriptExecutor)driver).executeScript ("document.getElementById('techRate').setAttribute('checked', 'true');");
			Log.info("Ask technicians to submit their rate Radio is selected on Add Event Rate Options web page"); 
		}
		else
		{
			Log.info("Ask technicians to_submit_their_rate_Radio is unselected on Add Event Rate Options web page"); 
		}
		}
		else
		{ 
			Log.error("Ask technicians_to_submit_their_rate_Radio is already selected on Add Event Rate Options web page"); 
		}
		
		Thread.sleep(1500);
		
		String Display_the_lowest_submitted_rate_to_the_technicians_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown, TestCaseRow);
		ShowsAction.Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown(Display_the_lowest_submitted_rate_to_the_technicians_Dropdown);
		Log.info(Display_the_lowest_submitted_rate_to_the_technicians_Dropdown+" is selected on Add Event Rate Options web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_29() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Thread.sleep(1000);
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_29,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		String Ask_technicians_to_submit_their_rate_Radio=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio, TestCaseRow);
		if(!ShowsAction.Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio().isSelected())
		{
			if(Ask_technicians_to_submit_their_rate_Radio.equals(selected))	
			{
			((JavascriptExecutor)driver).executeScript ("document.getElementById('techRate').setAttribute('checked', 'true');");
			Log.info("Ask technicians to submit their rate Radio is selected on Add Event Rate Options web page"); 
		}
		else
		{
			Log.info("Ask technicians to_submit_their_rate_Radio is unselected on Add Event Rate Options web page"); 
		}
		}
		else
		  { 
			Log.error("Ask technicians_to_submit_their_rate_Radio is already selected on Add Event Rate Options web page"); 
		  }
		
		Thread.sleep(1500);
		
		String Display_the_lowest_submitted_rate_to_the_technicians_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_28, ObjectRepository.Excel_Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown, TestCaseRow);
		ShowsAction.Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown(Display_the_lowest_submitted_rate_to_the_technicians_Dropdown);
		Log.info(Display_the_lowest_submitted_rate_to_the_technicians_Dropdown+" is selected on Add Event Rate Options web page");
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_30() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Thread.sleep(1000);
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		String Use_the_technicians_default_rates_Radio=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Rate_Options_Use_the_technicians_default_rates_Radio, TestCaseRow);
		if(!ShowsAction.Show_Rate_Options_Use_the_technicians_default_rates_Radio().isSelected())
		{
			if(Use_the_technicians_default_rates_Radio.equals(selected))	
			{
			((JavascriptExecutor)driver).executeScript ("document.getElementById('techRate2').setAttribute('checked', 'true');");
			Log.info("Use the technicians default rates Radio is selected on Add Event Rate Options web page"); 
		}
		else
		{
			Log.info("Use the technicians default rates Radio is unselected on Add Event Rate Options web page"); 
		}
		}
		else
		  { 
			Log.error("Use the technicians default rates Radio is already selected on Add Event Rate Options web page"); 
		  }
		
		Thread.sleep(1500);
		
		String Display_the_default_rate_to_the_technicians_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_30, ObjectRepository.Excel_Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown, TestCaseRow);
		ShowsAction.Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown(Display_the_default_rate_to_the_technicians_Dropdown);
		Log.info(Display_the_default_rate_to_the_technicians_Dropdown+" is selected on Add Event Rate Options web page");
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_31() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Thread.sleep(1000);
		
		String Add_Document=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31,ObjectRepository.Excel_Show_Documents_Add_Document_Btn,TestCaseRow);
		ShowsAction.Show_Documents_Add_Document_Btn().sendKeys(Add_Document);
		Log.info(Add_Document+" is uploaded using Add Document Button on Add Event web page");
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		String Use_the_technicians_default_rates_Radio=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Rate_Options_Use_the_technicians_default_rates_Radio, TestCaseRow);
		if(!ShowsAction.Show_Rate_Options_Use_the_technicians_default_rates_Radio().isSelected())
		{
			if(Use_the_technicians_default_rates_Radio.equals(selected))	
			{
			((JavascriptExecutor)driver).executeScript ("document.getElementById('techRate2').setAttribute('checked', 'true');");
			Log.info("Use the technicians default rates Radio is selected on Add Event Rate Options web page"); 
		}
		else
		{
			Log.info("Use the technicians default rates Radio is unselected on Add Event Rate Options web page"); 
		}
		}
		else
		  { 
			Log.error("Use the technicians default rates Radio is already selected on Add Event Rate Options web page"); 
		  }
		
		Thread.sleep(1500);
		
		String Display_the_default_rate_to_the_technicians_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_31, ObjectRepository.Excel_Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown, TestCaseRow);
		ShowsAction.Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown(Display_the_default_rate_to_the_technicians_Dropdown);
		Log.info(Display_the_default_rate_to_the_technicians_Dropdown+" is selected on Add Event Rate Options web page");
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
	}
	
	public static void Add_Event_32() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_32, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Thread.sleep(1000);
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked in Preview on Add Event Preview web page");
	}
	
	public static void Add_Event_33() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_33, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Save_And_Complete_Later_Btn());
		
		ShowsAction.Show_Preview_Save_And_Complete_Later_Btn().click();
		Log.info("Next button is clicked in Save and Complete Later on Add Event Preview web page");
	}
	
	public static void Add_Event_34() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_34, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Work_Dates());
		
	    String Loading_Dates=Basic_Info_Load_In_Date+Basic_Info_Load_Out_Date;
	    String Work=ShowsAction.Show_Preview_Work_Dates().getText().toString().replace("\n", "");
	    if(Loading_Dates.equals(Work))
	    {
	    	Log.info("Work dates are matched on Add Event web page");
	    }
	    else
	    {
	    	Log.info("Work dates are not matched on Add Event web page");
	    }
		
	    Thread.sleep(1000);
	    
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
	}
	
	public static void Add_Event_35() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_35, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Event_Name());
		
	    String Event_Name=ShowsAction.Show_Preview_Event_Name().getText().toString();
	    if(Basic_Info_Show_Name.equals(Event_Name))
	    {
	    	Log.info("Event Name is found matched on Add Event web page");
	    }
	    else
	    {
	    	Log.info("Event Name is not matched on Add Event web page");
	    }
		
	    Thread.sleep(1000);
	    
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
	}
	
	public static void Add_Event_36() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_36, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Event_Position());
		
	    String Event_Position=ShowsAction.Show_Preview_Event_Position().getText().toString();
	    
	    if(Position_Needs_G1P1.equals(Event_Position))
	    {
	    	Log.info("Event Position is found matched on Add Event web page");
	    }
	    else
	    {
	    	Log.info("Event Position is not matched on Add Event web page");
	    }
		
	    Thread.sleep(1000);
	    
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
	}
	
	public static void Add_Event_37() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Response_Deadline=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Basic_Info_Response_Deadline, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('bidEndTime').setAttribute('value','"+Basic_Info_Response_Deadline+"');");
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_37, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Response_Deadline());
		
		String Bid_End_Time=Basic_Info_Bid_End+" "+Basic_Info_Response_Deadline;
		String Bid_End_Time1=Bid_End_Time.replaceAll(":", "").replaceAll("\\s+","");
	    String Response_Deadline=ShowsAction.Show_Preview_Response_Deadline().getText().replaceAll(":", "").replaceAll("\\s+","");
	    if(Bid_End_Time1.equals(Response_Deadline))
	    {
	    	Log.info("Response Deadline is matched on Add Event web page");
	    }
	    else
	    {
	    	Log.info("Response Deadline is not matched on Add Event web page");
	    }
		
	    Thread.sleep(1000);
	    
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
	}
	
	public static void Add_Event_38() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Add_Logo=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Basic_Info_Add_Logo_Btn, TestCaseRow);
		ShowsAction.Show_Basic_Info_Add_Logo_Btn().sendKeys(Basic_Info_Add_Logo);
		Log.info(Basic_Info_Add_Logo+" is uploaded using Add Logo Button on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_38, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Event_Logo());
	
	    String Event_Logo=ShowsAction.Show_Preview_Event_Logo().getAttribute("src");
	    String Add_Logo=ShowsAction.Show_Basic_Info_Logo_Name().getAttribute("src");
	    if(Add_Logo.equals(Event_Logo))
	    {
	    	Log.info("Event Logo is found matched on Add Event web page");
	    }
	    else
	    {
	    	Log.info("Event Logo is not matched on Add Event web page");
	    }
		
	    Thread.sleep(1000);
	    
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
	}
	
	public static void Add_Event_39() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_39, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Publish_Publish_Now_Btn());
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");
	}
	
	public static void Add_Event_40() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_40, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Publish_Publish_Now_Btn());
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Publish web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Cancel_Btn_Of_Alert().click();
		Log.info("Cancel button is clicked on Publish Now Alert Of Add Event Publish web page");
	}
	
	public static void Add_Event_41() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_41, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Publish_Save_And_Complete_Later_Btn());
		
		ShowsAction.Show_Publish_Save_And_Complete_Later_Btn().click();
		Log.info("Save and Complete Later button is clicked on Add Event Publish web page");
	}
	
	public static void Add_Event_42() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(2000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		String Local_Crew_only_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_42, ObjectRepository.Excel_Show_Publish_Narrow_By_Local_Crew_Only_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Narrow_By_Local_Crew_Only_Chk().isSelected())
		{
			if(Local_Crew_only_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Publish_Narrow_By_Local_Crew_Only_Chk().click();
				Log.info("Local Crew only Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Local Crew only Checkbox is unselected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Local Crew only Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Publish web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");
	}
	
	public static void Add_Event_43() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(2000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		String Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_43, ObjectRepository.Excel_Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk().isSelected())
		{
			if(Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk().click();
				Log.info("Crew with an Average Rating of Including unrated tech or rated higher Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Crew with an Average Rating of Including unrated tech or rated higher Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Crew with an Average Rating of Including unrated tech or rated higher Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Publish web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");;
	}
	
	public static void Add_Event_44() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(2000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		String Crew_with_Valid_Passport_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_44, ObjectRepository.Excel_Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk().isSelected())
		{
			if(Crew_with_Valid_Passport_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk().click();
				Log.info("Crew with Valid Passport Checkbox is selected on Add Event Rate Options web page"); 
			}
			else
			{
				Log.info("Crew with Valid Passport Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Crew with Valid Passport Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");;
	}
	
	public static void Add_Event_45() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(2000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Show_Position1_Link().click();
		Log.info("Show Position1 link is clicked on Add Event Publish web page");
		
		Thread.sleep(1000);
		
		String Publish_Show_Position1_Crew_Member1_Chk=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_45, ObjectRepository.Excel_Show_Publish_Show_Position1_Crew_Member1_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Show_Position1_Crew_Member1_Chk().isSelected())
		{
			if(Publish_Show_Position1_Crew_Member1_Chk.equals(checked))	
			{
				ShowsAction.Show_Publish_Show_Position1_Crew_Member1_Chk().click();
				Log.info("Show Position1 Crew Member1 Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Show Position1 Crew Member1 Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Show Position1 Crew Member1 Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);	
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");
	}
	
	public static void Add_Event_46() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(2000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		String Include_W2_Full_Time_Crew_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Publish_Include_W2_Full_Time_Crew_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Include_W2_Full_Time_Crew_Chk().isSelected())
		{
			if(Include_W2_Full_Time_Crew_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Publish_Include_W2_Full_Time_Crew_Chk().click();
				Log.info("Include W2 Full Time Crew Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Include W2 Full Time Crew Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Include W2 Full Time Crew Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);
		
		String Include_W2_Part_Time_Crew_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Publish_Include_W2_Part_Time_Crew_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Include_W2_Part_Time_Crew_Chk().isSelected())
		{
			if(Include_W2_Part_Time_Crew_Checkbox.equals(checked))	
			{
			((JavascriptExecutor)driver).executeScript ("document.getElementById('w2PartTimeTechcheckBox').setAttribute('checked', 'true');");
			Log.info("Include W2 Part Time Crew Checkbox is selected on Add Event Publish web page"); 
		}
		else
		{
			Log.info("Include W2 Part Time Crew Checkbox is not selected on Add Event Publish web page"); 
		}
		}
		else
		{ 
			Log.error("Include W2 Part Time Crew Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);
		
		String Include_1099_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_46, ObjectRepository.Excel_Show_Publish_Include_1099_Chk, TestCaseRow);
		if(!ShowsAction.Show_Publish_Include_1099_Chk().isSelected())
		{
			if(Include_1099_Checkbox.equals(checked))	
			{
			((JavascriptExecutor)driver).executeScript ("document.getElementById('1099TechcheckBox').setAttribute('checked', 'true');");
			Log.info("Include 1099 Checkbox is selected on Add Event Publish web page"); 
		}
		else
		{
			Log.info("Include 1099 Checkbox is not selected on Add Event Publish web page"); 
		}
		}
		else
		{ 
			Log.error("Include 1099 Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");
	}
	
	public static void Add_Event_47() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("d");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
        Thread.sleep(1000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Publish_Search_Techs_Txt());
		
		String Publish_Search_Techs_Txt=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_47, ObjectRepository.Excel_Show_Publish_Search_Techs_Txt, TestCaseRow);
		ShowsAction.Show_Publish_Search_Techs_Txt().sendKeys("b");
		ShowsAction.Show_Publish_Search_Tech1().click();
		Log.info(Publish_Search_Techs_Txt+" is entered in Search Text on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Btn_Publish_Btn_Of_Alert().click();
		Log.info("Publish button is clicked on Publish Now Alert Of Add Event Publish web page");
	}
	
	public static void Add_Event_48() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("d");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		String Publish_Search_Techs_Txt=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_48, ObjectRepository.Excel_Show_Publish_Search_Techs_Txt, TestCaseRow);
		ShowsAction.Show_Publish_Search_Techs_Txt().sendKeys("b");
		ShowsAction.Show_Publish_Search_Tech1().click();
		Log.info(Publish_Search_Techs_Txt+" is entered in Search Text on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Save_And_Complete_Later_Btn().click();
		Log.info("Save and Complete Later button is clicked on Add Event Preview web page");
			
	}
	
	public static void Add_Event_49() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_49, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Publish_Now_Btn().click();
		Log.info("Publish Now button is clicked on Add Event Preview web page");

	}
	
	public static void Add_Event_50() throws Exception
	{
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Schedule_Next_Btn());
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Documents_Next_Btn());
		
		ShowsAction.Show_Documents_Next_Btn().click();
		Log.info("Next button is clicked in Documents on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Rate_Options_Next_Btn());
		
		ShowsAction.Show_Rate_Options_Next_Btn().click();
		Log.info("Next button is clicked in Rate Options on Add Event web page");
		
		Genericmethod.waitForElement(ShowsAction.Show_Preview_Next_Btn());
		
		ShowsAction.Show_Preview_Next_Btn().click();
		Log.info("Next button is clicked on Add Event Preview web page");
		
		Thread.sleep(1000);
		
		String Publish_Crew_to_Invite_Dropdown=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_50, ObjectRepository.Excel_Show_Publish_Crew_to_Invite_Dropdown, TestCaseRow);
		ShowsAction.Show_Publish_Crew_to_Invite_Dropdown(Publish_Crew_to_Invite_Dropdown);
		Log.info(Publish_Crew_to_Invite_Dropdown+" is selected in Crew to Invite dropdown of Add Event Publish web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Publish_Save_And_Complete_Later_Btn().click();
		Log.info("Save and Complete Later button is clicked on Add Event Preview web page");
	
	}
	
	public static void Add_Event_51() throws Exception
	{
		
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add Another Position Button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().sendKeys(Position_Needs_G1Qty2);
		Log.info(Position_Needs_G1Qty2+" is entered in Group1 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Position_Needs_Group1_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position2_Dropdown(Position_Needs_G1P2);
		Log.info(Position_Needs_G1P2+" is selected in Group1 Position2 Dropdown on Add Event web page");
	
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(2000);
		
		String Show_Schedule_Override_calculated_hours_by_position_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_51, ObjectRepository.Excel_Show_Schedule_Override_calculated_hours_by_position_Chk, TestCaseRow);
		if(!ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().isSelected())
		{
			if(Show_Schedule_Override_calculated_hours_by_position_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().click();
				Log.info("Override calculated hours by position Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Override calculated hours by position Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Override calculated hours by position Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(2000);
		
		Double Total_Hours_per_Shift=Double.parseDouble(ShowsAction.Show_Schedule_Total_Hours_per_Shift_Pos1_Txt().getAttribute("value"));
		Double Quantity_Pos1=Double.parseDouble(ShowsAction.Show_Schedule_Quantity_Txt().getText());
        Double Result= Total_Hours_per_Shift*Quantity_Pos1;
        String Total=Result.toString();
        Double Total_Position_Hours=Double.parseDouble(ShowsAction.Show_Schedule_Total_Position_Hours_Pos1_Txt().getAttribute("value"));
        String Total_Hours=Total_Position_Hours.toString();
		if(Total_Hours.equals(Total))
		{
			System.out.println("Total Position Hours is Validated");
		}
		else
		{
			System.out.println("Total Position Hours is incorrect");
		}
		Thread.sleep(1000);
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
	}
	
	public static void Add_Event_52() throws Exception
	{
		
		Genericmethod.waitForElement(ShowsAction.Show_Basic_Info_Show_Name_Txt());
		
		String Basic_Info_Client_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Client_Name_Dropdown, TestCaseRow);
		ShowsAction.Show_Basic_Info_Client_Name_Dropdown(Basic_Info_Client_Name);
		Log.info(Basic_Info_Client_Name+" is selected in Client Name dropdown of Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Show_Name=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Show_Name_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Show_Name_Txt().sendKeys(Basic_Info_Show_Name);
		Log.info(Basic_Info_Show_Name+" is entered in Show Name Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Location_City=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Location_City_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_City_Txt().sendKeys(Basic_Info_Location_City);
		Log.info(Basic_Info_Location_City+" is entered in Location city Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Airport=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Nearest_Major_Airport_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Nearest_Major_Airport_Txt().sendKeys("a");
		selectOptionWithText(Basic_Info_Airport);
		Log.info(Basic_Info_Airport+" is entered in Nearest Major Airport Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_State=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Location_State_Txt, TestCaseRow);
		ShowsAction.Show_Basic_Info_Location_State_Txt().sendKeys("a");
		state_selectOptionWithText(Basic_Info_State);
		Log.info(Basic_Info_State+" is entered in Location State Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_Out_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Load_Out_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_Out_Date_Txt().sendKeys(Basic_Info_Load_Out_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadOutDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_Out_Date+" is entered in Load Out Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Load_In_Date=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Load_In_Date_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().clear();
		ShowsAction.Show_Basic_Info_Load_In_Date_Txt().sendKeys(Basic_Info_Load_In_Date); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('loadInDate').readOnly = true;"); 
		Log.info(Basic_Info_Load_In_Date+" is entered in Load In Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_End=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_bid_End_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_bid_End_Txt().sendKeys(Basic_Info_Bid_End); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('endDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_End+" is entered in Publish End Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Basic_Info_Bid_Start=cellval.getCellDataForDate(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt, TestCaseRow);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').removeAttribute('readonly',0);"); // Enables the from date box
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().clear();
		ShowsAction.Show_Basic_Info_Duration_Of_Bid_Start_Txt().sendKeys(Basic_Info_Bid_Start); //Enter date in required format that is MM/DD/YYYY
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('startDateInput').readOnly = true;"); 
		Log.info(Basic_Info_Bid_Start+" is entered in Publish start Date Text Field on Add Event web page");
		
		Thread.sleep(1000);
	
		ShowsAction.Show_Basic_Info_Next_Btn().click();
		Log.info("Next Button is clicked in Basic Info on Add Event web page");
	
		Thread.sleep(1000);
	
		Genericmethod.waitForElement(ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt());
		
		String Position_Needs_G1Qty1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity1_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity1_Txt().sendKeys(Position_Needs_G1Qty1);
		Log.info(Position_Needs_G1Qty1+" is entered in Group1 Quantity1 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P1=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Position_Needs_Group1_Position1_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position1_Dropdown(Position_Needs_G1P1);
		Log.info(Position_Needs_G1P1+" is selected in Group1 Position1 Dropdown on Add Event web page");
		
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Group1_Add_Another_Position_Btn().click();
		Log.info("Add Another Position Button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1Qty2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Position_Needs_Group1_Quantity2_Txt, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().clear();
		ShowsAction.Show_Position_Needs_Group1_Quantity2_Txt().sendKeys(Position_Needs_G1Qty2);
		Log.info(Position_Needs_G1Qty2+" is entered in Group1 Quantity2 Text-field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Position_Needs_G1P2=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Position_Needs_Group1_Position2_Dropdown, TestCaseRow);
		ShowsAction.Show_Position_Needs_Group1_Position2_Dropdown(Position_Needs_G1P2);
		Log.info(Position_Needs_G1P2+" is selected in Group1 Position2 Dropdown on Add Event web page");
	
		Thread.sleep(1000);
		
		ShowsAction.Show_Position_Needs_Next_Btn().click();
		Log.info("Next button is clicked in Position Needs on Add Event web page");
		
		Thread.sleep(2000);
		
		String Show_Schedule_Override_calculated_hours_by_position_Checkbox=cellval.getCellData(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Schedule_Override_calculated_hours_by_position_Chk, TestCaseRow);
		if(!ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().isSelected())
		{
			if(Show_Schedule_Override_calculated_hours_by_position_Checkbox.equals(checked))	
			{
				ShowsAction.Show_Schedule_Override_calculated_hours_by_position_Chk().click();
				Log.info("Override calculated hours by position Checkbox is selected on Add Event Publish web page"); 
			}
			else
			{
				Log.info("Override calculated hours by position Checkbox is not selected on Add Event Publish web page"); 
			}
		}
		else
		{ 
			Log.error("Override calculated hours by position Checkbox is already selected on Add Event Publish web page"); 
		}
		
		Thread.sleep(2000);
		
		String Schedule_Hours1_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Schedule_Hours1_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours1_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours1_Pos1_Txt().sendKeys(Schedule_Hours1_Pos1);
		Log.info(Schedule_Hours1_Pos1+" is selected in Hours1 Position1 Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_Hours2_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Schedule_Hours2_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours2_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours2_Pos1_Txt().sendKeys(Schedule_Hours2_Pos1);
		Log.info(Schedule_Hours2_Pos1+" is selected in Hours2 Position1 Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_Hours3_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Schedule_Hours3_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours3_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours3_Pos1_Txt().sendKeys(Schedule_Hours3_Pos1);
		Log.info(Schedule_Hours3_Pos1+" is selected in Hours3 Position1 Text Field on Add Event web page");
		
		Thread.sleep(1000);
		
		String Schedule_Hours4_Pos1=cellval.getCellDataForTime(ObjectRepository.Add_Event_Test_Case_52, ObjectRepository.Excel_Show_Schedule_Hours4_Pos1_Txt, TestCaseRow);
		ShowsAction.Show_Schedule_Hours4_Pos1_Txt().clear();
		ShowsAction.Show_Schedule_Hours4_Pos1_Txt().sendKeys(Schedule_Hours4_Pos1);
		Log.info(Schedule_Hours4_Pos1+" is selected in Hours4 Position1 Text Field on Add Event web page");
		
		Thread.sleep(2000);
		
		ShowsAction.Show_Schedule_Hours4_Pos2_Txt().click();
		
		Thread.sleep(1000);
		
		Double Total_Position_Hours_Pos1=Double.parseDouble(ShowsAction.Show_Schedule_Total_Position_Hours_Pos1_Txt().getAttribute("value"));
		Double Total_Position_Hours_Pos2=Double.parseDouble(ShowsAction.Show_Schedule_Total_Position_Hours_Pos2_Txt().getAttribute("value"));
        Double Result= Total_Position_Hours_Pos1+Total_Position_Hours_Pos2;
        String Total=Result.toString();
        Double Total_Event_Hours=Double.parseDouble(ShowsAction.Show_Schedule_Total_Event_Hours_Txt().getAttribute("value"));
        String Total_Hours=Total_Event_Hours.toString();
		if(Total_Hours.equals(Total))
		{
			System.out.println("Total Event Hours is Validated");
		}
		else
		{
			System.out.println("Total Event Hours is incorrect");
		}
		Thread.sleep(1000);
		
		ShowsAction.Show_Schedule_Next_Btn().click();
		Log.info("Next button is clicked in Schedule on Add Event web page");
	}
	
}

	
	
