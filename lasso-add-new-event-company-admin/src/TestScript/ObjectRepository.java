package TestScript;


public class ObjectRepository 
{
		//Constant to read Controller excel file
		public static String TEST_SUITE_SHEET="TestSuite";
		public static String TEST_CASES_SHEET="Test Case";
		public static String Test_Suite_ID="Module";
		public static String Test_Case_ID="TSID";
	    public static String TCID="TCID";
	    public static String RUNMODE_YES="Y";
	    public static String RUNMODE = "Runmode";
	    public static final String Path_ScreenShot = "src//ScreenShot//";
	    public static String TVE = "Text_Verification_Error";
	    public static final String SUITE_ID = "TSID";
	    public static final String DESCRIPTION = "Description";
	    public static String RESULT="Result";
	    public static String KEYWORD_PASS = "PASS";
	    public static String KEYWORD_FAIL = "FAIL";
	    public static String KEYWORD_SKIP = "SKIP";
	    public static String TEST_RESULT_SHEET = "RESULT";
	    public static String Test_Execution_Result = "Status";
	  	public static String TEST_SUITE_SHEET1="TS01";
	    public static String Test_Column_1="UserName";
	    public static String Test_Column_2="Password";
	    public static String Not_Found="404-NotFound";
	    
	    //Data Sheet path
	    public static String Module1 = "src/config/Module1.xlsx"; 
	    
	    //Validate Page Redirection
	    public static String Validate_Page_Redirection="COM_TS02";
	    public static String Actual_URL="URL";
	    public static String Expected_URL="New Redirect";
	    

	    
//	    Company Admin New Tech Registration 
	    
//	    Login Page of company admin
	    public static final String Company_Admin_Login_Email_Txt="//*[@id='emailAddress']";
	    public static final String Company_Admin_Login_Password_Txt="//*[@id='password']";
	    public static final String Company_Admin_Login_Sign_In_Btn="/html/body/div/form[1]/div[4]/button";
	    public static final String Company_Admin_Login_Remember_Me_Chk="html body.inner-login-bg div.container form#defaultForm.form-signin.form-horizontal.login-block div.checkbox.login-mr-to.pull-left label";
	    public static final String Company_Admin_Login_Forgot_Password_Link="/html/body/div/form[1]/a";
	    
//	    Dashboard of Company Admin
	    public static final String Company_Admin_Dashboard_Dashbord_Tab="/html/body/div[1]/div[1]/div[3]/div/div/div/nav/ul/li[1]/a";
	    public static final String Company_Admin_Dashboard_Crew_Tab="/html/body/div[1]/div[1]/div[3]/div/div/div/nav/ul/li[2]/a";
	    public static final String Company_Admin_Dashboard_Shows_Tab="/html/body/div[1]/div[1]/div[3]/div/div/div/nav/ul/li[3]/a";
	    public static final String Company_Admin_Dashboard_Applications_Tab="/html/body/div[1]/div[1]/div[3]/div/div/div/nav/ul/li[4]/a";
	    public static final String Company_Admin_Dashboard_Administration_Tab="/html/body/div[1]/div[1]/div[3]/div/div/div/nav/ul/li[5]/a";
	    public static final String Company_Admin_Dashboard_Crew_Schedule_Option="Schedule";
	    public static final String Company_Admin_Dashboard_Crew_All_Crew_Option="All Crew";
	    public static final String Company_Admin_Dashboard_Crew_Approved_Option="Approved";
	    public static final String Company_Admin_Dashboard_Crew_Pending_Option="Pending";
	    public static final String Company_Admin_Dashboard_Crew_Tabled_Option="Tabled";
	    public static final String Company_Admin_Dashboard_Crew_Not_Approved_Option="Not Approved";
	    public static final String Company_Admin_Dashboard_Crew_New_Tech_Option="New Crew Member";
	    public static final String Company_Admin_Dashboard_Shows_Unpublished_Option="Unpublished";
	    public static final String Company_Admin_Dashboard_Shows_Published_Option="Published";
	    public static final String Company_Admin_Dashboard_Shows_Completed_Option="Completed";
	    public static final String Company_Admin_Dashboard_Shows_Add_New_Show_Option="Add New Event";
	    public static final String Company_Admin_Dashboard_Administration_Company_Configuration_Option="Company Configuration";
	    public static final String Company_Admin_Dashboard_Administration_Users_Option="Users";
	    public static final String Company_Admin_Dashboard_Administration_Clients_Option="Clients";
	    public static final String Company_Admin_Dashboard_Administration_Positions_Option="Positions";
	    public static final String Company_Admin_Dashboard_Administration_Email_Templates_Option="Email Templates";
	    

//      Company Admin Administration Company Configuration 
	    public static final String Company_Admin_Company_Configuration_Default_Settings_Tab="//*[@id='defaultForm']/div/div[3]/ul/li[4]/a";
	    public static final String Company_Admin_Company_Configuration_Default_Settings_Required_References="//*[@id='companyReferenceId']";
	    public static final String Company_Admin_Company_Configuration_Default_Settings_Save_btn="//*[@id='defaultForm']/div/div[3]/div/div[7]/div/button";
	    
	    
//	    for taking excel data for common util
	    public static final String Company_Admin_Login_Excel_Email_Txt="CompanyAdminEmail";
	    public static final String Company_Admin_Login_Excel_Password_Txt="CompanyAdminPassword";
	    public static final String Company_Admin_Login_CA_01="CA_01";  
	     	    
		    
//		Add New Show Module
	    public static final String Show_Basic_Info_Tab="//*[@id='step1']";
	    public static final String Show_Basic_Info_Client_Name_Dropdown="//*[@id='selectClientId']";
	    public static final String Show_Basic_Info_Show_Name_Txt="//*[@id='showName']";
	    public static final String Show_Basic_Info_Location_City_Txt="//*[@id='locCity']";
	    public static final String Show_Basic_Info_Nearest_Major_Airport_Txt="NearestAirport"; //by id 
	    public static final String Show_Basic_Info_Location_State_Txt="states"; //by id
	    public static final String Show_Basic_Info_Load_In_Date_Txt="loadInDate"; //by id
	    public static final String Show_Basic_Info_Load_Out_Date_Txt="loadOutDate"; //by id
	    public static final String Show_Basic_Info_Description_Txt="//*[@id='description']";
	    public static final String Show_Basic_Info_Event_Id_Txt="//*[@id='showCode']";
	    public static final String Show_Basic_Info_Project_Manager_Dropdown="//*[@id='selectedManagers']";
	    public static final String Show_Basic_Info_Duration_Of_Bid_Start_Txt="startDateInput"; //by id
	    public static final String Show_Basic_Info_Duration_Of_bid_End_Txt="endDateInput"; //by id
	    public static final String Show_Basic_Info_Bid_End_Time_Txt="//*[@id='bidEndTime']";
	    public static final String Show_Basic_Info_Add_Logo_Btn="//*[@id='uploadImageFiles']";
	    public static final String Show_Basic_Info_Logo_Name="//*[@id='eventLogo']";
	    public static final String Show_Basic_Info_Add_Document_Btn="//*[@id='uploadDocFiles']";
	    public static final String Show_Basic_Info_Save_And_Complete_Later_Btn="Save & Complete Later"; //by link text
	    public static final String Show_Basic_Info_Next_Btn="//*[@id='sh-next-btn1']";
	    public static final String Show_Position_Needs_Tab="//*[@id='step2']";
	    public static final String Show_Position_Needs_Group1_Txt="//*[@id='groupName1']";
	    public static final String Show_Position_Needs_Group1_Supervisor_Dropdown="//*[@id='selectedManagers1']";
	    public static final String Show_Position_Needs_Group1_Quantity1_Txt="//*[@id='1quantity_id_1']";
	    public static final String Show_Position_Needs_Group1_Position1_Dropdown="//*[@id='1select_position_id_1']";
	    public static final String Show_Position_Needs_Group1_Start_Work1_Txt="1start_work_1";
	    public static final String Show_Position_Needs_Group1_End_Work1_Txt="1end_work_1";
	    public static final String Show_Position_Needs_Group1_Start_Time1_Dropdown="1startTimeCombo1";
	    public static final String Show_Position_Needs_Group1_End_Time1_Dropdown="1endTimeCombo1";
	    public static final String Show_Position_Needs_Group1_Notes1_Txt="//*[@id='1per_notes_1']";
	    public static final String Show_Position_Needs_Group1_Quantity2_Txt="//*[@id='1quantity_id_2']";
	    public static final String Show_Position_Needs_Group1_Position2_Dropdown="//*[@id='1select_position_id_2']";
	    public static final String Show_Position_Needs_Group1_Start_Work2_Txt="1start_work_2";
	    public static final String Show_Position_Needs_Group1_End_Work2_Txt="1end_work_2";
	    public static final String Show_Position_Needs_Group1_Start_Time2_Dropdown="1startTimeCombo2";
	    public static final String Show_Position_Needs_Group1_End_Time2_Dropdown="1endTimeCombo2";
	    public static final String Show_Position_Needs_Group1_Notes2_Txt="//*[@id='1per_notes_2']";
	    public static final String Show_Position_Needs_Group1_Quantity3_Txt="//*[@id='1quantity_id_3']";
	    public static final String Show_Position_Needs_Group1_Position3_Dropdown="//*[@id='1select_position_id_3']";
	    public static final String Show_Position_Needs_Group1_Start_Work3_Txt="1start_work_3";
	    public static final String Show_Position_Needs_Group1_End_Work3_Txt="1end_work_3";
	    public static final String Show_Position_Needs_Group1_Start_Time3_Dropdown="1startTimeCombo3";
	    public static final String Show_Position_Needs_Group1_End_Time3_Dropdown="1endTimeCombo3";
	    public static final String Show_Position_Needs_Group1_Notes3_Txt="//*[@id='1per_notes_3']";
	    public static final String Show_Position_Needs_Group1_Quantity4_Txt="//*[@id='1quantity_id_4']";
	    public static final String Show_Position_Needs_Group1_Position4_Dropdown="//*[@id='1select_position_id_4']";
	    public static final String Show_Position_Needs_Group1_Start_Work4_Txt="1start_work_4";
	    public static final String Show_Position_Needs_Group1_End_Work4_Txt="1end_work_4";
	    public static final String Show_Position_Needs_Group1_Start_Time4_Dropdown="1startTimeCombo4";
	    public static final String Show_Position_Needs_Group1_End_Time4_Dropdown="1endTimeCombo4";
	    public static final String Show_Position_Needs_Group1_Notes4_Txt="//*[@id='1per_notes_4']";
	    public static final String Show_Position_Needs_Group1_Close2_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[1]/div/div[1]/div[7]/div[3]/div[6]/span";
	    public static final String Show_Position_Needs_Group1_Close3_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[1]/div/div[1]/div[7]/div[5]/div[6]/span";
	    public static final String Show_Position_Needs_Group1_Close4_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[1]/div/div[1]/div[7]/div[8]/div[6]/span";
	    public static final String Show_Position_Needs_Group2_Txt="//*[@id='groupName2']";
	    public static final String Show_Position_Needs_Group2_Supervisor_Dropdown="//*[@id='selectedManagers2']";
	    public static final String Show_Position_Needs_Group2_Quantity1_Txt="//*[@id='2quantity_id_5']";
	    public static final String Show_Position_Needs_Group2_Position1_Dropdown="//*[@id='2select_position_id_5']";
	    public static final String Show_Position_Needs_Group2_Start_Work1_Txt="2start_work_5";
	    public static final String Show_Position_Needs_Group2_End_Work1_Txt="2end_work_5";
	    public static final String Show_Position_Needs_Group2_Start_Time1_Dropdown="2startTimeCombo5";
	    public static final String Show_Position_Needs_Group2_End_Time1_Dropdown="2endTimeCombo5";
	    public static final String Show_Position_Needs_Group2_Notes1_Txt="//*[@id='2per_notes_5']";
	    public static final String Show_Position_Needs_Group2_Quantity2_Txt="//*[@id='2quantity_id_6']";
	    public static final String Show_Position_Needs_Group2_Position2_Dropdown="//*[@id='2select_position_id_6']";
	    public static final String Show_Position_Needs_Group2_Start_Work2_Txt="2start_work_6";
	    public static final String Show_Position_Needs_Group2_End_Work2_Txt="2end_work_6";
	    public static final String Show_Position_Needs_Group2_Start_Time2_Dropdown="2startTimeCombo6";
	    public static final String Show_Position_Needs_Group2_End_Time2_Dropdown="2endTimeCombo6";
	    public static final String Show_Position_Needs_Group2_Notes2_Txt="//*[@id='2per_notes_6']";
	    public static final String Show_Position_Needs_Group2_Quantity3_Txt="//*[@id='2quantity_id_7']";
	    public static final String Show_Position_Needs_Group2_Position3_Dropdown="//*[@id='2select_position_id_7']";
	    public static final String Show_Position_Needs_Group2_Start_Work3_Txt="2start_work_7";
	    public static final String Show_Position_Needs_Group2_End_Work3_Txt="2end_work_7";
	    public static final String Show_Position_Needs_Group2_Start_Time3_Dropdown="2startTimeCombo7";
	    public static final String Show_Position_Needs_Group2_End_Time3_Dropdown="2endTimeCombo7";
	    public static final String Show_Position_Needs_Group2_Notes3_Txt="//*[@id='2per_notes_7']";
	    public static final String Show_Position_Needs_Group2_Close2_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[1]/div/div[1]/div[6]/div[3]/div[6]/span";
	    public static final String Show_Position_Needs_Group2_Close3_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[1]/div/div[1]/div[6]/div[5]/div[6]/span";
	    public static final String Show_Position_Needs_Group2_Group_Close_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[1]/div/span";
	    public static final String Show_Position_Needs_Group3_Txt="//*[@id='groupName3']";
	    public static final String Show_Position_Needs_Group3_Supervisor_Dropdown="//*[@id='selectedManagers3']";
	    public static final String Show_Position_Needs_Group3_Quantity1_Txt="//*[@id='3quantity_id_8']";
	    public static final String Show_Position_Needs_Group3_Position1_Dropdown="//*[@id='3select_position_id_8']";
	    public static final String Show_Position_Needs_Group3_Start_Work1_Txt="3start_work_8";
	    public static final String Show_Position_Needs_Group3_End_Work1_Txt="3end_work_8";
	    public static final String Show_Position_Needs_Group3_Start_Time1_Dropdown="3startTimeCombo8";
	    public static final String Show_Position_Needs_Group3_End_Time1_Dropdown="3endTimeCombo8";
	    public static final String Show_Position_Needs_Group3_Notes1_Txt="//*[@id='3per_notes_8']";
	    public static final String Show_Position_Needs_Group3_Quantity2_Txt="//*[@id='3quantity_id_9']";
	    public static final String Show_Position_Needs_Group3_Position2_Dropdown="//*[@id='3select_position_id_9']";
	    public static final String Show_Position_Needs_Group3_Start_Work2_Txt="3start_work_9";
	    public static final String Show_Position_Needs_Group3_End_Work2_Txt="3end_work_9";
	    public static final String Show_Position_Needs_Group3_Start_Time2_Dropdown="3startTimeCombo9";
	    public static final String Show_Position_Needs_Group3_End_Time2_Dropdown="3endTimeCombo9";
	    public static final String Show_Position_Needs_Group3_Notes2_Txt="//*[@id='3per_notes_9']";
	    public static final String Show_Position_Needs_Group3_Quantity3_Txt="//*[@id='3quantity_id_10']";
	    public static final String Show_Position_Needs_Group3_Position3_Dropdown="//*[@id='3select_position_id_10']";
	    public static final String Show_Position_Needs_Group3_Start_Work3_Txt="3start_work_10";
	    public static final String Show_Position_Needs_Group3_End_Work3_Txt="3end_work_10";
	    public static final String Show_Position_Needs_Group3_Start_Time3_Dropdown="3startTimeCombo10";
	    public static final String Show_Position_Needs_Group3_End_Time3_Dropdown="3endTimeCombo10";
	    public static final String Show_Position_Needs_Group3_Notes3_Txt="//*[@id='3per_notes_10']";
	    public static final String Show_Position_Needs_Group3_Close2_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[2]/div/div[1]/div[6]/div[3]/div[6]/span";
	    public static final String Show_Position_Needs_Group3_Close3_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[2]/div/div[1]/div[6]/div[5]/div[6]/span";
	    public static final String Show_Position_Needs_Group3_Group_Close_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[2]/div/span";
	    public static final String Show_Position_Needs_Group4_Txt="//*[@id='groupName4']";
	    public static final String Show_Position_Needs_Group4_Supervisor_Dropdown="//*[@id='selectedManagers4']";
	    public static final String Show_Position_Needs_Group4_Quantity1_Txt="//*[@id='4quantity_id_11']";
	    public static final String Show_Position_Needs_Group4_Position1_Dropdown="//*[@id='4select_position_id_11']";
	    public static final String Show_Position_Needs_Group4_Start_Work1_Txt="4start_work_11";
	    public static final String Show_Position_Needs_Group4_End_Work1_Txt="4end_work_11";
	    public static final String Show_Position_Needs_Group4_Start_Time1_Dropdown="4startTimeCombo11";
	    public static final String Show_Position_Needs_Group4_End_Time1_Dropdown="4endTimeCombo11";
	    public static final String Show_Position_Needs_Group4_Notes1_Txt="//*[@id='4per_notes_11']";
	    public static final String Show_Position_Needs_Group4_Quantity2_Txt="//*[@id='4quantity_id_12']";
	    public static final String Show_Position_Needs_Group4_Position2_Dropdown="//*[@id='4select_position_id_12']";
	    public static final String Show_Position_Needs_Group4_Start_Work2_Txt="4start_work_12";
	    public static final String Show_Position_Needs_Group4_End_Work2_Txt="4end_work_12";
	    public static final String Show_Position_Needs_Group4_Start_Time2_Dropdown="4startTimeCombo12";
	    public static final String Show_Position_Needs_Group4_End_Time2_Dropdown="4endTimeCombo12";
	    public static final String Show_Position_Needs_Group4_Notes2_Txt="//*[@id='4per_notes_12']";
	    public static final String Show_Position_Needs_Group4_Quantity3_Txt="//*[@id='4quantity_id_13']";
	    public static final String Show_Position_Needs_Group4_Position3_Dropdown="//*[@id='4select_position_id_13']";
	    public static final String Show_Position_Needs_Group4_Start_Work3_Txt="4start_work_13";
	    public static final String Show_Position_Needs_Group4_End_Work3_Txt="4end_work_13";
	    public static final String Show_Position_Needs_Group4_Start_Time3_Dropdown="4startTimeCombo13";
	    public static final String Show_Position_Needs_Group4_End_Time3_Dropdown="4endTimeCombo13";
	    public static final String Show_Position_Needs_Group4_Notes3_Txt="//*[@id='4per_notes_13']";
	    public static final String Show_Position_Needs_Group4_Close2_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[3]/div/div[1]/div[6]/div[3]/div[6]/span";
	    public static final String Show_Position_Needs_Group4_Close3_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[3]/div/div[1]/div[6]/div[5]/div[6]/span";
	    public static final String Show_Position_Needs_Group4_Group_Close_Icon="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[3]/div[3]/div[3]/div/span";
	    public static final String Show_Position_Needs_Group1_Add_Another_Position_Btn="//*[@id='add_more_position_btn1']";
	    public static final String Show_Position_Needs_Group2_Add_Another_Position_Btn="//*[@id='add_more_position_btn2']";
	    public static final String Show_Position_Needs_Group3_Add_Another_Position_Btn="//*[@id='add_more_position_btn3']";
	    public static final String Show_Position_Needs_Group4_Add_Another_Position_Btn="//*[@id='add_more_position_btn4']";
	    public static final String Show_Position_Needs_Add_Another_Group_Btn="//*[@id='add_more_group_btn']";
	    public static final String Show_Position_Needs_Save_And_Complete_Later_Btn="Save & Complete Later"; //by link text
	    public static final String Show_Position_Needs_Previous_Btn="Previous"; //by link
	    public static final String Show_Position_Needs_Next_Btn="//*[@id='sh-next-btn2']";
	    public static final String Show_Schedule_Tab="//*[@id='step3']";
	    public static final String Show_Schedule_Start_Time1_Pos1_Dropdown="//*[@id='reg_1pos_1']";
	    public static final String Show_Schedule_End_Time1_Pos1_Dropdown="//*[@id='ot_1pos_1']";
	    public static final String Show_Schedule_Hours1_Pos1_Txt="//*[@id='hrs_1pos_1']";
	    public static final String Show_Schedule_Start_Time2_Pos1_Dropdown="//*[@id='reg_2pos_1']";
	    public static final String Show_Schedule_End_Time2_Pos1_Dropdown="//*[@id='ot_2pos_1']";
	    public static final String Show_Schedule_Hours2_Pos1_Txt="//*[@id='hrs_2pos_1']";
	    public static final String Show_Schedule_Start_Time3_Pos1_Dropdown="//*[@id='reg_3pos_1']";
	    public static final String Show_Schedule_End_Time3_Pos1_Dropdown="//*[@id='ot_3pos_1']";
	    public static final String Show_Schedule_Hours3_Pos1_Txt="//*[@id='hrs_3pos_1']";
	    public static final String Show_Schedule_Start_Time4_Pos1_Dropdown="//*[@id='reg_4pos_1']";
	    public static final String Show_Schedule_End_Time4_Pos1_Dropdown="//*[@id='ot_4pos_1']";
	    public static final String Show_Schedule_Hours4_Pos1_Txt="//*[@id='hrs_4pos_1']";
	    public static final String Show_Schedule_Start_Time1_Pos2_Dropdown="//*[@id='reg_1pos_2']";
	    public static final String Show_Schedule_End_Time1_Pos2_Dropdown="//*[@id='ot_1pos_2']";
	    public static final String Show_Schedule_Hours1_Pos2_Txt="//*[@id='hrs_1pos_2']";
	    public static final String Show_Schedule_Start_Time2_Pos2_Dropdown="//*[@id='reg_2pos_2']";
	    public static final String Show_Schedule_End_Time2_Pos2_Dropdown="//*[@id='ot_2pos_2']";
	    public static final String Show_Schedule_Hours2_Pos2_Txt="//*[@id='hrs_2pos_2']";
	    public static final String Show_Schedule_Start_Time3_Pos2_Dropdown="//*[@id='reg_3pos_2']";
	    public static final String Show_Schedule_End_Time3_Pos2_Dropdown="//*[@id='ot_3pos_2']";
	    public static final String Show_Schedule_Hours3_Pos2_Txt="//*[@id='hrs_3pos_2']";
	    public static final String Show_Schedule_Start_Time4_Pos2_Dropdown="//*[@id='reg_4pos_2']";
	    public static final String Show_Schedule_End_Time4_Pos2_Dropdown="//*[@id='ot_4pos_2']";
	    public static final String Show_Schedule_Hours4_Pos2_Txt="//*[@id='hrs_4pos_2']";
	    public static final String Show_Schedule_Save_And_Complete_Later_Btn="Save & Complete Later"; //by link text
	    public static final String Show_Schedule_Previous_Btn="Previous"; //by link text
	    public static final String Show_Schedule_Next_Btn="//*[@id='btnNextNew']";
	    public static final String Show_Schedule_Override_calculated_hours_by_position_Chk="//*[@id='chk-override-hrs']";
	    public static final String Show_Schedule_Quantity_Txt="//*[@id='dataSchedule1']/tr[2]/td[15]";
	    public static final String Show_Schedule_Total_Hours_per_Shift_Pos1_Txt="//*[@id='total_shift_hr_1']";
	    public static final String Show_Schedule_Total_Position_Hours_Pos1_Txt="//*[@id='tot_hr_by_pos_1']";
	    public static final String Show_Schedule_Total_Position_Hours_Pos2_Txt="//*[@id='tot_hr_by_pos_2']";
	    public static final String Show_Schedule_Total_Event_Hours_Txt="//*[@id='sum-of-all-tot-event-hr']";
	    public static final String Show_Documents_Tab="//*[@id='stepDocuments']";
	    public static final String Show_Documents_Add_Document_Btn="//*[@id='uploadDocumentFiles']";
	    public static final String Show_Documents_Delete_Btn="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[8]/div[1]/div/div[4]/div/div/a[1]/span";
	    public static final String Show_Documents_Save_And_Complete_Later_Btn="Save & Complete Later";
	    public static final String Show_Documents_Previous_Btn="Previous";
	    public static final String Show_Documents_Next_Btn="//*[@id='btnNextOnDoc']";
	    public static final String Show_Rate_Options_Tab="//*[@id='step4']";
	    public static final String Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[9]/div[1]/div[3]/input";
	    public static final String Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown="//*[@id='select-bid-option']";
	    public static final String Show_Rate_Options_Use_the_technicians_default_rates_Radio="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[9]/div[1]/div[7]/input";
	    public static final String Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown="//*[@id='select-bid-option2']";
	    public static final String Show_Rate_Options_Save_And_Complete_Later_Btn="Save & Complete Later"; //by link
	    public static final String Show_Rate_Options_Previous_Btn="Previous"; //by link
	    public static final String Show_Rate_Options_Next_Btn="//*[@id='btnNext3']";
	    public static final String Show_Preview_Tab="//*[@id='step5']";
	    public static final String Show_Preview_Event_Name="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[10]/div[1]/div[2]/div/div[2]/div[1]/b";
	    public static final String Show_Preview_Work_Dates="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[10]/div[1]/div[2]/div/div[2]/div[2]/b";
	    public static final String Show_Preview_Event_Logo="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[10]/div[1]/div[2]/div/div[1]/img";
	    public static final String Show_Preview_Event_Location="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[10]/div[1]/div[2]/div/div[1]/div[2]/p/b";
	    public static final String Show_Preview_Event_Position="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[10]/div[1]/div[2]/div/div[4]/label[1]/span";
	    public static final String Show_Preview_Response_Deadline="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[10]/div[1]/div[2]/div/div[4]/p";
	    public static final String Show_Preview_Save_And_Complete_Later_Btn="Save & Complete Later"; //by link
	    public static final String Show_Preview_Next_Btn="//*[@id='btnNext4']";
	    public static final String Show_Publish_Tab="//*[@id='step6']";
	    public static final String Show_Publish_Crew_to_Invite_Dropdown="//*[@id='select-techs-id']";
	    public static final String Show_Publish_Positions_Dropdown="//*[@id='select-show-pos-id']";
	    public static final String Show_Publish_Narrow_By_Local_Crew_Only_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[1]/div[4]/div[1]/div/div/div[1]/label";
	    public static final String Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[1]/div[4]/div[1]/div/div/div[4]/label";
	    public static final String Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[1]/div[4]/div[1]/div/div/div[7]/label";
	    public static final String Show_Publish_Save_And_Complete_Later_Btn="Save And Complete Later"; //by link
	    public static final String Show_Publish_Include_W2_Full_Time_Crew_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div/label[1]";
	    public static final String Show_Publish_Include_W2_Part_Time_Crew_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div/label[2]";
	    public static final String Show_Publish_Include_1099_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div/label[3]";
	    public static final String Show_Publish_Publish_Now_Btn="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[1]/div[3]/div[2]/div/div[4]/button";
	    public static final String Show_Publish_Show_Position1_Link="//*[@id='headAnchor_showPositionsAccordiondiv_1']";
	    public static final String Show_Publish_Show_Position1_Crew_Member1_Chk="/html/body/div[1]/div[2]/div/div[1]/div[4]/div/div/form/div/div[11]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/label";
	    public static final String Show_Publish_Search_Techs_Txt="//*[@id='searchUsers']";
	    public static final String Show_Publish_Search_Techs1="/html/body/ul[3]/li[1]";
	    public static final String Show_Publish_Create_Roster_Btn="//*[@id='btnPublishShowS']";
	    public static final String Show_Publish_Publish_Btn_Publish_Btn_Of_Alert="/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/span[1]/a";
	    public static final String Show_Publish_Publish_Btn_Cancel_Btn_Of_Alert="Cancel"; //by link
	    
	    
//		Show module taking data from excel
	  
	    public static final String Excel_Show_Basic_Info_Client_Name_Dropdown="ClientName";
	    public static final String Excel_Show_Basic_Info_Show_Name_Txt="ShowName";
	    public static final String Excel_Show_Basic_Info_Location_City_Txt="LocationCity";
	    public static final String Excel_Show_Basic_Info_Nearest_Major_Airport_Txt="NearestAirport";
	    public static final String Excel_Show_Basic_Info_Location_State_Txt="States"; 
	    public static final String Excel_Show_Basic_Info_Load_In_Date_Txt="LoadInDate";
	    public static final String Excel_Show_Basic_Info_Load_Out_Date_Txt="LoadOutDate"; 
	    public static final String Excel_Show_Basic_Info_Description_Txt="Description";
	    public static final String Excel_Show_Basic_Info_Event_Id_Txt="EventId";
	    public static final String Excel_Show_Basic_Info_Project_Manager_Dropdown="ProjectManager";
	    public static final String Excel_Show_Basic_Info_Duration_Of_Bid_Start_Txt="BidStartDate"; 
	    public static final String Excel_Show_Basic_Info_Duration_Of_bid_End_Txt="BidEndDate"; 
	    public static final String Excel_Show_Basic_Info_Response_Deadline="ResponseDeadline";
	  	public static final String Excel_Show_Basic_Info_Add_Logo_Btn="AddLogo";
	    public static final String Excel_Show_Basic_Info_Add_Document_Btn="AddDocument";
	    public static final String Excel_Show_Position_Needs_Group1_Txt="Group1";
	    public static final String Excel_Show_Position_Needs_Group1_Supervisor_Dropdown="Group1Supervisor1";
	    public static final String Excel_Show_Position_Needs_Group1_Quantity1_Txt="Group1Quantity1";
	    public static final String Excel_Show_Position_Needs_Group1_Position1_Dropdown="Group1Position1";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Work1_Txt="Group1StartWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group1_End_Work1_Txt="Group1EndWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Time1_Dropdown="Group1StartTime1";
	    public static final String Excel_Show_Position_Needs_Group1_End_Time1_Dropdown="Group1EndTime1";
	    public static final String Excel_Show_Position_Needs_Group1_Notes1_Txt="Group1Notes1";
	    public static final String Excel_Show_Position_Needs_Group1_Quantity2_Txt="Group1Quantity2";
	    public static final String Excel_Show_Position_Needs_Group1_Position2_Dropdown="Group1Position2";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Work2_Txt="Group1StartWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group1_End_Work2_Txt="Group1EndWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Time2_Dropdown="Group1StartTime2";
	    public static final String Excel_Show_Position_Needs_Group1_End_Time2_Dropdown="Group1EndTime2";
	    public static final String Excel_Show_Position_Needs_Group1_Notes2_Txt="Group1Notes2";
	    public static final String Excel_Show_Position_Needs_Group1_Quantity3_Txt="Group1Quantity3";
	    public static final String Excel_Show_Position_Needs_Group1_Position3_Dropdown="Group1Position3";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Work3_Txt="Group1StartWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group1_End_Work3_Txt="Group1EndWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Time3_Dropdown="Group1StartTime3";
	    public static final String Excel_Show_Position_Needs_Group1_End_Time3_Dropdown="Group1EndTime3";
	    public static final String Excel_Show_Position_Needs_Group1_Notes3_Txt="Group1Notes3";
	    public static final String Excel_Show_Position_Needs_Group1_Quantity4_Txt="Group1Quantity4";
	    public static final String Excel_Show_Position_Needs_Group1_Position4_Dropdown="Group1Position4";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Work4_Txt="Group1StartWorkDate4";
	    public static final String Excel_Show_Position_Needs_Group1_End_Work4_Txt="Group1EndWorkDate4";
	    public static final String Excel_Show_Position_Needs_Group1_Start_Time4_Dropdown="Group1StartTime4";
	    public static final String Excel_Show_Position_Needs_Group1_End_Time4_Dropdown="Group1EndTime4";
	    public static final String Excel_Show_Position_Needs_Group1_Notes4_Txt="Group1Notes4";
	    public static final String Excel_Show_Position_Needs_Group2_Txt="Group2";
	    public static final String Excel_Show_Position_Needs_Group2_Supervisor_Dropdown="Group2Supervisor2";
	    public static final String Excel_Show_Position_Needs_Group2_Quantity1_Txt="Group2Quantity1";
	    public static final String Excel_Show_Position_Needs_Group2_Position1_Dropdown="Group2Position1";
	    public static final String Excel_Show_Position_Needs_Group2_Start_Work1_Txt="Group2StartWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group2_End_Work1_Txt="Group2EndWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group2_Start_Time1_Dropdown="Group2StartTime1";
	    public static final String Excel_Show_Position_Needs_Group2_End_Time1_Dropdown="Group2EndTime1";
	    public static final String Excel_Show_Position_Needs_Group2_Notes1_Txt="Group2Notes1";
	    public static final String Excel_Show_Position_Needs_Group2_Quantity2_Txt="Group2Quantity2";
	    public static final String Excel_Show_Position_Needs_Group2_Position2_Dropdown="Group2Position2";
	    public static final String Excel_Show_Position_Needs_Group2_Start_Work2_Txt="Group2StartWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group2_End_Work2_Txt="Group2EndWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group2_Start_Time2_Dropdown="Group2StartTime2";
	    public static final String Excel_Show_Position_Needs_Group2_End_Time2_Dropdown="Group2EndTime2";
	    public static final String Excel_Show_Position_Needs_Group2_Notes2_Txt="Group2Notes2";
	    public static final String Excel_Show_Position_Needs_Group2_Quantity3_Txt="Group2Quantity3";
	    public static final String Excel_Show_Position_Needs_Group2_Position3_Dropdown="Group2Position3";
	    public static final String Excel_Show_Position_Needs_Group2_Start_Work3_Txt="Group2StartWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group2_End_Work3_Txt="Group2EndWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group2_Start_Time3_Dropdown="Group1StartTime3";
	    public static final String Excel_Show_Position_Needs_Group2_End_Time3_Dropdown="Group1EndTime3";
	    public static final String Excel_Show_Position_Needs_Group2_Notes3_Txt="Group2Notes3";
	    public static final String Excel_Show_Position_Needs_Group3_Txt="Group3";
	    public static final String Excel_Show_Position_Needs_Group3_Supervisor_Dropdown="Group3Supervisor";
	    public static final String Excel_Show_Position_Needs_Group3_Quantity1_Txt="Group3Quantity1";
	    public static final String Excel_Show_Position_Needs_Group3_Position1_Dropdown="Group3Position1";
	    public static final String Excel_Show_Position_Needs_Group3_Start_Work1_Txt="Group3StartWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group3_End_Work1_Txt="Group3EndWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group3_Start_Time1_Dropdown="Group3StartTime1";
	    public static final String Excel_Show_Position_Needs_Group3_End_Time1_Dropdown="Group3EndTime1";
	    public static final String Excel_Show_Position_Needs_Group3_Notes1_Txt="Group3Notes1";
	    public static final String Excel_Show_Position_Needs_Group3_Quantity2_Txt="Group3Quantity2";
	    public static final String Excel_Show_Position_Needs_Group3_Position2_Dropdown="Group3Position2";
	    public static final String Excel_Show_Position_Needs_Group3_Start_Work2_Txt="Group3StartWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group3_End_Work2_Txt="Group3EndWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group3_Start_Time2_Dropdown="Group3StartTime2";
	    public static final String Excel_Show_Position_Needs_Group3_End_Time2_Dropdown="Group3EndTime2";
	    public static final String Excel_Show_Position_Needs_Group3_Notes2_Txt="Group3Notes2";
	    public static final String Excel_Show_Position_Needs_Group3_Quantity3_Txt="Group3Quantity3";
	    public static final String Excel_Show_Position_Needs_Group3_Position3_Dropdown="Group3Position3";
	    public static final String Excel_Show_Position_Needs_Group3_Start_Work3_Txt="Group3StartWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group3_End_Work3_Txt="Group3EndWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group3_Start_Time3_Dropdown="Group3StartTime3";
	    public static final String Excel_Show_Position_Needs_Group3_End_Time3_Dropdown="Group3EndTime3";
	    public static final String Excel_Show_Position_Needs_Group3_Notes3_Txt="Group3Notes3";
	    public static final String Excel_Show_Position_Needs_Group4_Txt="Group4";
	    public static final String Excel_Show_Position_Needs_Group4_Supervisor_Dropdown="Group4Supervisor";
	    public static final String Excel_Show_Position_Needs_Group4_Quantity1_Txt="Group4Quantity1";
	    public static final String Excel_Show_Position_Needs_Group4_Position1_Dropdown="Group4Position1";
	    public static final String Excel_Show_Position_Needs_Group4_Start_Work1_Txt="Group4StartWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group4_End_Work1_Txt="Group4EndWorkDate1";
	    public static final String Excel_Show_Position_Needs_Group4_Start_Time1_Dropdown="Group4StartTime1";
	    public static final String Excel_Show_Position_Needs_Group4_End_Time1_Dropdown="Group4EndTime1";
	    public static final String Excel_Show_Position_Needs_Group4_Notes1_Txt="Group4Notes1";
	    public static final String Excel_Show_Position_Needs_Group4_Quantity2_Txt="Group4Quantity2";
	    public static final String Excel_Show_Position_Needs_Group4_Position2_Dropdown="Group4Position2";
	    public static final String Excel_Show_Position_Needs_Group4_Start_Work2_Txt="Group4StartWorkDate2";
	    public static final String Excel_Show_Position_Needs_Group4_End_Work2_Txt="Group4EndWork2";
	    public static final String Excel_Show_Position_Needs_Group4_Start_Time2_Dropdown="Group4StartTime2";
	    public static final String Excel_Show_Position_Needs_Group4_End_Time2_Dropdown="Group4EndTime2";
	    public static final String Excel_Show_Position_Needs_Group4_Notes2_Txt="Group4Notes2";
	    public static final String Excel_Show_Position_Needs_Group4_Quantity3_Txt="Group4Quantity3";
	    public static final String Excel_Show_Position_Needs_Group4_Position3_Dropdown="Group4Position3";
	    public static final String Excel_Show_Position_Needs_Group4_Start_Work3_Txt="Group4StartWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group4_End_Work3_Txt="Group4EndWorkDate3";
	    public static final String Excel_Show_Position_Needs_Group4_Start_Time3_Dropdown="Group4StartTime3";
	    public static final String Excel_Show_Position_Needs_Group4_End_Time3_Dropdown="Group4EndTime3";
	    public static final String Excel_Show_Position_Needs_Group4_Notes3_Txt="Group4Notes3";
	    public static final String Excel_Show_Schedule_Start_Time1_Pos1_Dropdown="StartTime1Pos1";
	    public static final String Excel_Show_Schedule_End_Time1_Pos1_Dropdown="EndTime1Pos1";
	    public static final String Excel_Show_Schedule_Hours1_Pos1_Txt="hrs_1pos_1";
	    public static final String Excel_Show_Schedule_Start_Time2_Pos1_Dropdown="StartTime2Pos1";
	    public static final String Excel_Show_Schedule_End_Time2_Pos1_Dropdown="EndTime2Pos1";
	    public static final String Excel_Show_Schedule_Hours2_Pos1_Txt="hrs_2pos_1";
	    public static final String Excel_Show_Schedule_Start_Time3_Pos1_Dropdown="StartTime3Pos1";
	    public static final String Excel_Show_Schedule_End_Time3_Pos1_Dropdown="EndTime3Pos1";
	    public static final String Excel_Show_Schedule_Hours3_Pos1_Txt="hrs_3pos_1";
	    public static final String Excel_Show_Schedule_Start_Time4_Pos1_Dropdown="StartTime4Pos1";
	    public static final String Excel_Show_Schedule_End_Time4_Pos1_Dropdown="EndTime4Pos1";
	    public static final String Excel_Show_Schedule_Hours4_Pos1_Txt="hrs_4pos_1";
	    public static final String Excel_Show_Schedule_Start_Time1_Pos2_Dropdown="StartTime1Pos2";
	    public static final String Excel_Show_Schedule_End_Time1_Pos2_Dropdown="EndTime1Pos2";
	    public static final String Excel_Show_Schedule_Hours1_Pos2_Txt="hrs_1pos_2";
	    public static final String Excel_Show_Schedule_Start_Time2_Pos2_Dropdown="StartTime2Pos2";
	    public static final String Excel_Show_Schedule_End_Time2_Pos2_Dropdown="EndTime2Pos2";
	    public static final String Excel_Show_Schedule_Hours2_Pos2_Txt="hrs_2pos_2";
	    public static final String Excel_Show_Schedule_Start_Time3_Pos2_Dropdown="StartTime3Pos2";
	    public static final String Excel_Show_Schedule_End_Time3_Pos2_Dropdown="EndTime3Pos2";
	    public static final String Excel_Show_Schedule_Hours3_Pos2_Txt="hrs_3pos_2";
	    public static final String Excel_Show_Schedule_Start_Time4_Pos2_Dropdown="StartTime4Pos2";
	    public static final String Excel_Show_Schedule_End_Time4_Pos2_Dropdown="EndTime4Pos2";
	    public static final String Excel_Show_Schedule_Hours4_Pos2_Txt="hrs_4pos_2";
	    public static final String Excel_Show_Schedule_Override_calculated_hours_by_position_Chk="Override calculated hours by position";
	    public static final String Excel_Show_Documents_Add_Document_Btn="UploadDocument";
	    public static final String Excel_Show_Rate_Options_Ask_technicians_to_submit_their_rate_Radio="Ask technicians to submit their rate";
	    public static final String Excel_Show_Rate_Options_Display_the_lowest_submitted_rate_to_the_technicians_Dropdown="Display the lowest submitted rate to the technicians";
	    public static final String Excel_Show_Rate_Options_Use_the_technicians_default_rates_Radio="Use the technicians default rates";
	    public static final String Excel_Show_Rate_Options_Display_the_default_rate_to_the_technicians_Dropdown="Display the default rate to the technicians";
	    public static final String Excel_Show_Publish_Crew_to_Invite_Dropdown="CrewtoInvite";
	    public static final String Excel_Show_Publish_Positions_Dropdown="Positions";
	    public static final String Excel_Show_Publish_Narrow_By_Local_Crew_Only_Chk="NarrowByLocalTechOnly";
	    public static final String Excel_Show_Publish_Narrow_By_Crew_with_an_Average_Rating_of_Including_unrated_tech_or_rated_higher_Chk="NarrowByTechsWithAnAverageRatingOfIncludingUnratedTechOrRatedHigher";
	    public static final String Excel_Show_Publish_Narrow_By_Crew_with_Valid_Passport_Chk="NarrowByTechswithValidPassport";
	    public static final String Excel_Show_Publish_Search_Techs_Txt="SearchTechs"; //by id
	    public static final String Excel_Show_Publish_Include_W2_Full_Time_Crew_Chk="IncludeW2FullTimeCrew";
	    public static final String Excel_Show_Publish_Include_W2_Part_Time_Crew_Chk="IncludeW2PartTimeCrew";
	    public static final String Excel_Show_Publish_Include_1099_Chk="Include1099";
	    public static final String Excel_Show_Publish_Show_Position1_Crew_Member1_Chk="Show Position1 Crew Member1";
	    
	    //test scenario's id of shows
	    public static final String Add_Event_Test_Case_01="CA_AE_01";
	    public static final String Add_Event_Test_Case_02="CA_AE_02";
	    public static final String Add_Event_Test_Case_03="CA_AE_03";
	    public static final String Add_Event_Test_Case_04="CA_AE_04";
	    public static final String Add_Event_Test_Case_05="CA_AE_05";
	    public static final String Add_Event_Test_Case_06="CA_AE_06";
	    public static final String Add_Event_Test_Case_07="CA_AE_07";
	    public static final String Add_Event_Test_Case_08="CA_AE_08";
	    public static final String Add_Event_Test_Case_09="CA_AE_09";
	    public static final String Add_Event_Test_Case_10="CA_AE_10";
	    public static final String Add_Event_Test_Case_11="CA_AE_11";
	    public static final String Add_Event_Test_Case_12="CA_AE_12";
	    public static final String Add_Event_Test_Case_13="CA_AE_13";
	    public static final String Add_Event_Test_Case_14="CA_AE_14";
	    public static final String Add_Event_Test_Case_15="CA_AE_15";
	    public static final String Add_Event_Test_Case_16="CA_AE_16";
	    public static final String Add_Event_Test_Case_17="CA_AE_17";
	    public static final String Add_Event_Test_Case_18="CA_AE_18";
	    public static final String Add_Event_Test_Case_19="CA_AE_19";
	    public static final String Add_Event_Test_Case_20="CA_AE_20";   
	    public static final String Add_Event_Test_Case_21="CA_AE_21";
	    public static final String Add_Event_Test_Case_22="CA_AE_22";
	    public static final String Add_Event_Test_Case_23="CA_AE_23";
	    public static final String Add_Event_Test_Case_24="CA_AE_24";
	    public static final String Add_Event_Test_Case_25="CA_AE_25";
	    public static final String Add_Event_Test_Case_26="CA_AE_26";
	    public static final String Add_Event_Test_Case_27="CA_AE_27";
	    public static final String Add_Event_Test_Case_28="CA_AE_28";
	    public static final String Add_Event_Test_Case_29="CA_AE_29";
	    public static final String Add_Event_Test_Case_30="CA_AE_30";
	    public static final String Add_Event_Test_Case_31="CA_AE_31";
	    public static final String Add_Event_Test_Case_32="CA_AE_32";
	    public static final String Add_Event_Test_Case_33="CA_AE_33";
	    public static final String Add_Event_Test_Case_34="CA_AE_34";
	    public static final String Add_Event_Test_Case_35="CA_AE_35";
	    public static final String Add_Event_Test_Case_36="CA_AE_36";
	    public static final String Add_Event_Test_Case_37="CA_AE_37";
	    public static final String Add_Event_Test_Case_38="CA_AE_38";
	    public static final String Add_Event_Test_Case_39="CA_AE_39";
	    public static final String Add_Event_Test_Case_40="CA_AE_40";
	    public static final String Add_Event_Test_Case_41="CA_AE_41";
	    public static final String Add_Event_Test_Case_42="CA_AE_42";
	    public static final String Add_Event_Test_Case_43="CA_AE_43";
	    public static final String Add_Event_Test_Case_44="CA_AE_44";
	    public static final String Add_Event_Test_Case_45="CA_AE_45";
	    public static final String Add_Event_Test_Case_46="CA_AE_46";
	    public static final String Add_Event_Test_Case_47="CA_AE_47";
	    public static final String Add_Event_Test_Case_48="CA_AE_48";
	    public static final String Add_Event_Test_Case_49="CA_AE_49";
	    public static final String Add_Event_Test_Case_50="CA_AE_50";
	    public static final String Add_Event_Test_Case_51="CA_AE_51";
	    public static final String Add_Event_Test_Case_52="CA_AE_52";
	    public static final String Add_Event_Test_Case_53="CA_AE_53";
	    public static final String Add_Event_Test_Case_54="CA_AE_54";
	    public static final String Add_Event_Test_Case_55="CA_AE_55";
	    
}
	    
	    
