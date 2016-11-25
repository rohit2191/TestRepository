package TestScript;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Date;
import java.util.Properties;
import DataTable.Log;
import org.testng.annotations.Test;

import DataTable.Xls_Reader;



@SuppressWarnings("all")
public class ReportUtil 
{
	public static String result_FolderName=null;

	public static void main(String[] arg) throws Exception 
	{
	     // read suite.xls
		 System.out.println("Execution process completed and creating the html test reports");
	     Date d = new Date();
	     String date=d.toString().replaceAll(" ", "-");
	     date=date.replaceAll(":", "-");
	     date=date.replaceAll("\\+", "-");
	     System.out.println(date);
	     result_FolderName="Reports"+"-"+date;
	     String reportsDirPath=System.getProperty("user.dir")+"\\Reports";
	     new File(result_FolderName).mkdirs();
	
	     FileInputStream fs = new FileInputStream("src/config/config.properties");
	     Properties CONFIG= new Properties();
	 	 CONFIG.load(fs);
	
	     String environment=CONFIG.getProperty("Environment");
	     String release=CONFIG.getProperty("Release");
	     Xls_Reader suiteXLS = new Xls_Reader("src/config/Controller.xlsx");
	
	     // create index.html
	     String indexHtmlPath=result_FolderName+"\\index.html";
	     new File(indexHtmlPath).createNewFile();
	
	     try
	     {
	         FileWriter fstream = new FileWriter(indexHtmlPath);
	         BufferedWriter out = new BufferedWriter(fstream);
	         out.write("<html><HEAD> <TITLE> LASSO Automation Test Results</TITLE></HEAD><body><h4 align=center><FONT COLOR=660066 FACE=AriaL SIZE=6><b><u> LASSO Automation Test Results</u></b></h4><table  border=1 cellspacing=1 cellpadding=1 ><tr><h4> <FONT COLOR=660000 FACE=Arial SIZE=4.5> <u>Test Details :</u></h4><td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75><b>Run Date</b></td><td width=150 align=left><FONT COLOR=#153E7E FACE=Arial SIZE=2.75><b>");
	         out.write(d.toString());
	         out.write("</b></td></tr><tr><td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75><b>Run Environment</b></td><td width=150 align=left><FONT COLOR=#153E7E FACE=Arial SIZE=2.75><b>");
	         out.write(environment);
	         out.write("</b></td></tr><tr><td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Release</b></td><td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>");
	         out.write(release);
	         out.write("</b></td></tr></table><h4> <FONT COLOR=660000 FACE= Arial  SIZE=4.5> <u>Report :</u></h4><table  border=1 cellspacing=1 cellpadding=1 width=100%><tr><td width=20% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>SUITE NAME</b></td><td width=40% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>DESCRIPTION</b></td><td width=10% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>EXECUTION RESULT</b></td></tr>");
//	         out.write("<tr><td width=20% align= center><FONT COLOR=#153E7E FACE= Arial  SIZE=2><b>TC04</b></td><td width=40% align= center><FONT COLOR=#153E7E FACE= Arial  SIZE=2><b>TC04</b></td><td width=10% align=center  bgcolor=yellow><FONT COLOR=153E7E FACE=Arial SIZE=2><b>Skip</b></td></tr>");
	
	         int totalTestSuites=suiteXLS.getRowCount(ObjectRepository.TEST_SUITE_SHEET);
	         String currentTestSuite=null;
	         Xls_Reader current_suite_xls=null;
	         String suite_result="";
	         for(int currentSuiteID =2;currentSuiteID<= totalTestSuites;currentSuiteID++)
	         {
	             suite_result="";
	             currentTestSuite=null;
	             current_suite_xls=null;
	             currentTestSuite = suiteXLS.getCellData(ObjectRepository.TEST_SUITE_SHEET, ObjectRepository.Test_Suite_ID,currentSuiteID);
	             current_suite_xls=new Xls_Reader(System.getProperty("user.dir")+"//src//config//"+currentTestSuite+".xlsx");
	
	             String currentTestName=null;
	             String currentTestRunmode=null;
	             String currentTestDescription=null;
	             for(int currentTestCaseID=2;currentTestCaseID<=current_suite_xls.getRowCount(ObjectRepository.TEST_CASES_SHEET);currentTestCaseID++)
	             {
	                 currentTestName=null;
	                 currentTestDescription=null;
	                 currentTestRunmode=null;
	
	                 currentTestName = current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, ObjectRepository.Test_Case_ID, currentTestCaseID);
	                 currentTestDescription = current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, ObjectRepository.DESCRIPTION, currentTestCaseID);
	                 currentTestRunmode = current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, ObjectRepository.RUNMODE, currentTestCaseID);
	                 
//	                 System.out.println(currentTestSuite + " -- "+currentTestName );
	
	                 // make the file corresponding to test Steps
	                 String testSteps_file=result_FolderName+"\\"+currentTestSuite+"_steps.html";
	                 new File(testSteps_file).createNewFile();
	
	                 int rows= current_suite_xls.getRowCount(ObjectRepository.TEST_CASES_SHEET);
	                 int cols = current_suite_xls.getColumnCount(ObjectRepository.TEST_CASES_SHEET);
	                 FileWriter fstream_test_steps= new FileWriter(testSteps_file);
	                 BufferedWriter out_test_steps= new BufferedWriter(fstream_test_steps);
	                 out_test_steps.write("<html><HEAD> <TITLE>"+currentTestSuite+" Test Results</TITLE></HEAD><body><h4 align=center><FONT COLOR=660066 FACE=AriaL SIZE=6><b><u> "+currentTestSuite+" Detailed Test Results</u></b></h4><table width=100% border=1 cellspacing=1 cellpadding=1 >");
	                 out_test_steps.write("<tr>");
	                 for(int colNum=0;colNum<cols;colNum++)
	                 {
	                     out_test_steps.write("<td align= center bgcolor=#153E7E><FONT COLOR=#ffffff FACE= Arial  SIZE=2><b>");
	                     out_test_steps.write(current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, colNum, 1));
	                 }
	                 out_test_steps.write("</b></tr>");
	
	                 // fill the whole sheet
	                 boolean result_col=false;
	                 for(int rowNum=2;rowNum<=rows;rowNum++)
	                 {
	                     out_test_steps.write("<tr>");
	                     for(int colNum=0;colNum<cols;colNum++)
	                     {
//	                    	 int cvalue = colNum;
//	                    	 System.out.println( cvalue + " is the column no");
	                         String data=current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, colNum, rowNum);
	                         result_col=current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, ObjectRepository.RESULT, rowNum).startsWith(ObjectRepository.RUNMODE_YES);
	                         String result_value=current_suite_xls.getCellData(ObjectRepository.TEST_CASES_SHEET, ObjectRepository.RESULT, rowNum);
	                         
	                         if(data.isEmpty())
	                         {
	                             if(result_col)
	                                 data="SKIP";
	                             else
	                                 data=" ";
	                         }
	                         
	                         if(data.equals("Y"))
	                         {
	                            if(result_value.equals("PASS")) 
	                            {
	                            	out_test_steps.write("<td align=center bgcolor=green><FONT COLOR=#000000 FACE= Arial  SIZE=1>");
	                            	suite_result="PASS";
	                            }else{
	                            	out_test_steps.write("<td align=center bgcolor=red><FONT COLOR=#000000 FACE= Arial  SIZE=1>");
	                                suite_result="FAIL";
	                            }
	                         }
	                         else if(data.equals("N"))
	                         	{
	                        	 	out_test_steps.write("<td align=center bgcolor=yellow><FONT COLOR=#000000 FACE= Arial  SIZE=1>");
	                         	}
	                         else if(colNum == 6)
	                         {
	                        	 out_test_steps.write("<td align= left bgcolor=#ffffff><FONT COLOR=#000000 FACE= Arial  SIZE=1>");
	                         }
	                         else
	                         {
	                        	 out_test_steps.write("<td align= center bgcolor=#ffffff><FONT COLOR=#000000 FACE= Arial  SIZE=1>");
	                         }
	                         out_test_steps.write(data);
	                     }
	                     out_test_steps.write("</tr>");
	                 }
	
	                 out_test_steps.write("</tr>");
	                 out_test_steps.write("</table>");
	                 out_test_steps.close();
	             }

	             out.write("<tr><td width=20% align= center><FONT COLOR=#153E7E FACE= Arial  SIZE=2><b>");
	             out.write("<a href="+currentTestSuite.replace(" ", "%20")+"_steps.html>"+currentTestSuite+"</a>");
	             out.write("</b></td><td width=40% align= center><FONT COLOR=#153E7E FACE= Arial  SIZE=2><b>");
	             out.write(suiteXLS.getCellData(ObjectRepository.TEST_SUITE_SHEET, ObjectRepository.DESCRIPTION,currentSuiteID));
	             out.write("</b></td><td width=10% align=center  bgcolor=");
	             if(suiteXLS.getCellData(ObjectRepository.TEST_SUITE_SHEET, ObjectRepository.RUNMODE,currentSuiteID).equalsIgnoreCase(ObjectRepository.RUNMODE_YES))
	                 if(suite_result.equals("FAIL"))
	                     out.write("red><FONT COLOR=153E7E FACE=Arial SIZE=2><b>FAIL</b></td></tr>");
	                 else
	                     out.write("green><FONT COLOR=153E7E FACE=Arial SIZE=2><b>PASS</b></td></tr>");
	             else
	                 out.write("yellow><FONT COLOR=153E7E FACE=Arial SIZE=2><b>SKIP</b></td></tr>");
	         }
	         //Close the output stream
	         out.write("</table>");
	         out.close();
	         System.out.println("Completed with the creation of the LASSO Test Report");
	     }
	     catch (Exception e)
	     {//Catch exception if any
	         System.err.println("Error: " + e.getMessage());
	         e.printStackTrace();
	     }
	 }
}
