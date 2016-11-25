package AppModule;

import DataTable.Log;
import DataTable.Xls_Reader;
import TestMethod.CommonAction;
import TestScript.Genericmethod;
import TestScript.ObjectRepository;

public class CommonUtility {
	
	 public static int TestCaseRow=2;
	 public static String TestURL;
	 public static Xls_Reader cellval = new Xls_Reader("src/config/CommonUtil.xlsx"); 
	 public static int currentTestCaseID;
	 
	 
	 public static void Company_Admin_Login() throws Exception 
	 {
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Login_Email_Txt());
	  
	  String CompanyAdminLoginEmail=cellval.getCellData(ObjectRepository.Company_Admin_Login_CA_01, ObjectRepository.Company_Admin_Login_Excel_Email_Txt, TestCaseRow);
	  CommonAction.Company_Admin_Login_Email_Txt().sendKeys(CompanyAdminLoginEmail);
	  Log.info(CompanyAdminLoginEmail+" is entered on Email Text Field of Company Admin Login Page");
	  
	  String CompanyAdminLoginPassword=cellval.getCellData(ObjectRepository.Company_Admin_Login_CA_01, ObjectRepository.Company_Admin_Login_Excel_Password_Txt, TestCaseRow);
	  CommonAction.Company_Admin_Login_Password_Txt().sendKeys(CompanyAdminLoginPassword);
	  Log.info(CompanyAdminLoginPassword+" is entered on Email Text Field of Company Admin Login Page");
	  
	  CommonAction.Company_Admin_Login_Sign_In_Btn().click();
	  Log.info("SignIn Button is clicked on Company AdminLogin Web Page");
	  
	 }
	
	 public static void New_Tech_Navigation() throws Exception 
	 {

	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
	  Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_New_Tech_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_New_Tech_Option().click();
	  Log.info("Crew Tab of New Tech option is Clicked of Company Admin Dashboard Page");
	  
	 }
	 
	 public static void All_Crew_Navigation() throws Exception 
	 {
	 
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
	  Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_All_Crew_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_All_Crew_Option().click();
	  Log.info("Crew Tab of All Crew option is Clicked of Company Admin Dashboard Page");
	  
	 }
	 
	 public static void Approved_Navigation() throws Exception 
	 {
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
	  Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Approved_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Approved_Option().click();
	  Log.info("Crew Tab of Approved option is Clicked of Company Admin Dashboard Page");
	  
	 }
	 
	 public static void Not_Approved_Navigation() throws Exception 
	 {
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
	  Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Not_Approved_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Not_Approved_Option().click();
	  Log.info("Crew Tab of Not Approved option is Clicked of Company Admin Dashboard Page");
	  
	 }
	 
	 public static void Pending_Navigation() throws Exception 
	 {
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
	  Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Pending_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Pending_Option().click();
	  Log.info("Crew Tab of Pending option is Clicked of Company Admin Dashboard Page");
	  
	 }
	 
	 public static void Tabled_Navigation() throws Exception 
	 {
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
	  Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tabled_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Crew_Tabled_Option().click();
	  Log.info("Crew Tab of Tabled option is Clicked of Company Admin Dashboard Page");
	  
	 }
	 
	 public static void Company_Configuration_Navigation() throws Exception 
	 {
		 Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Tab());
			
		CommonAction.Company_Admin_Dashboard_Administration_Tab().click();
		Log.info("Administration Tab is Clicked of Company Admin Dashboard Page");
			
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Company_Configuration_Option());
			
		CommonAction.Company_Admin_Dashboard_Administration_Company_Configuration_Option().click();
		Log.info("Company Configuration option of Administration tab is clicked on Company Admin Dashboard Page");
	 
	  
	 } 
	
	public static void Default_Settings_References() throws Exception 
	{
		Genericmethod.waitForElement(CommonAction.Company_Admin_Company_Configuration_Default_Settings_Tab());
		
		CommonAction.Company_Admin_Company_Configuration_Default_Settings_Tab().click();
		Log.info("Default Settings Tab is clicked on Company Configuration Web Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Company_Configuration_Default_Settings_Required_References_Dropdown());
		
		CommonAction.Company_Admin_Company_Configuration_Default_Settings_Required_References_Dropdown().click();
		Log.info("Required References Dropdown is clicked on Company Configuration Web Page");
		
		Thread.sleep(500);
		
		CommonAction.Company_Admin_Company_Configuration_Default_Settings_Save_Button().click();
		Log.info("Save Button is clicked in Company Admin Company Configuration on Default and Settings web page");
		
		Thread.sleep(1000);
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
		
		CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
		Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_New_Tech_Option());
		
		CommonAction.Company_Admin_Dashboard_Crew_New_Tech_Option().click();
		Log.info("Crew Tab of New Tech option is Clicked of Company Admin Dashboard Page");
		
	}
	
	public static void Administration_Company_Configuration_Set_References_2() throws Exception 
	{
		Genericmethod.waitForElement(CommonAction.Company_Admin_Login_Email_Txt());
		
		String email="admin@lassoworkforce.com";
		CommonAction.Company_Admin_Login_Email_Txt().sendKeys(email);
		Log.info(email+" is entered on Email Text Field of Company Admin Login Page");
		
		String password="adminadmin";
		CommonAction.Company_Admin_Login_Password_Txt().sendKeys(password);
		Log.info(password+" is entered on Email Text Field of Company Admin Login Page");
		
		CommonAction.Company_Admin_Login_Sign_In_Btn().click();
		Log.info("SignIn Button is clicked on Company Admin Login Web Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Applications_Tab());
		
		CommonAction.Company_Admin_Dashboard_Administration_Tab().click();
		Log.info("Administration Tab is Clicked of Company Admin Dashboard Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Company_Configuration_Option());
		
		CommonAction.Company_Admin_Dashboard_Administration_Company_Configuration_Option().click();
		Log.info("Company Configuration option of Administration tab is clicked on Company Admin Dashboard Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Company_Configuration_Default_Settings_Tab());
		
		CommonAction.Company_Admin_Company_Configuration_Default_Settings_Tab().click();
		Log.info("Default Settings Tab is clicked on Company Configuration Web Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Company_Configuration_Default_Settings_Required_References_Dropdown());
		
		CommonAction.Company_Admin_Company_Configuration_Default_Settings_Required_References_Dropdown().click();
		Log.info("Required References Dropdown is clicked on Company Configuration Web Page");
		
		Thread.sleep(500);
		
		CommonAction.Company_Admin_Company_Configuration_Default_Settings_Save_Button().click();
		Log.info("Save Button is clicked in Company Admin Company Configuration on Default and Settings web page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_Tab());
		
		CommonAction.Company_Admin_Dashboard_Crew_Tab().click();
		Log.info("Crew Tab is Clicked of Company Admin Dashboard Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Crew_New_Tech_Option());
		
		CommonAction.Company_Admin_Dashboard_Crew_New_Tech_Option().click();
		Log.info("Crew Tab of New Tech option is Clicked of Company Admin Dashboard Page");
		
	}
	
	public static void Clients_Navigation() throws Exception 
	{
	 
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Administration_Tab().click();
	  Log.info("Administration Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Clients_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Administration_Clients_Option().click();
	  Log.info("Client Option on Administration Tab is Clicked on Company Admin Dashboard Page");
	  
	 }
	
	public static void Positions_Navigation() throws Exception 
	{
	 
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Administration_Tab().click();
	  Log.info("Administration Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Positions_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Administration_Positions_Option().click();
	  Log.info("Positions Option on Administration Tab is Clicked on Company Admin Dashboard Page");
	  
	 }
	
	public static void Users_Navigation() throws Exception 
	{
	 
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Tab());
	  
	  CommonAction.Company_Admin_Dashboard_Administration_Tab().click();
	  Log.info("Administration Tab is Clicked of Company Admin Dashboard Page");
	  
	  Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Administration_Users_Option());
	  
	  CommonAction.Company_Admin_Dashboard_Administration_Users_Option().click();
	  Log.info("Users Option on Administration Tab is Clicked on Company Admin Dashboard Page");
	  
	 }
	
	public static void Add_New_Event_Navigation() throws Exception 
	{
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Shows_Tab());
		
		CommonAction.Company_Admin_Dashboard_Shows_Tab().click();
		Log.info("Shows Tab is Clicked of Company Admin Dashboard Page");
		
		Genericmethod.waitForElement(CommonAction.Company_Admin_Dashboard_Shows_Add_New_Show_Option());
		
		CommonAction.Company_Admin_Dashboard_Shows_Add_New_Show_Option().click();
		Log.info("Add New Event Option on Events Tab is Clicked on Company Admin Dashboard Page");
		
	}
	

}
