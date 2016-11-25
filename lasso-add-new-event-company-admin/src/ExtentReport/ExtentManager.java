package ExtentReport;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import TestScript.Genericmethod;



public class ExtentManager 
{
    private static ExtentReports extent;
    
    public static ExtentReports getInstance() 
    {
        if (extent == null)
        {
        	try {
				extent = new ExtentReports("ExtentReport//LASSO_Extent_Report_"+Genericmethod.GetTimeStampValue()+".html", true, DisplayOrder.OLDEST_FIRST);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
        	/*//for changing theme of report to dark
        	String css = "body, .test .right span, .collapsible-header { background: #333; color: #fff; }" +
                    "nav, .tab, .card-panel { background: #000 !important; }" +
                    "table { border: 1px solid #555 !important; }" +
                    "pre { background: #333; border: 1px solid #777 !important; color: #eee !important; }" +
                    ".select-dropdown { background: #333; border-bottom: 1px solid #777 !important; }" +
                    ".select-dropdown li:hover, .select-dropdown li.active { background: #555; }" +
                    "table.bordered > thead > tr, table.bordered > tbody > tr, th, td { border-bottom: 1px solid #555 !important; }" +
                    "th, td, .test-name, .test-desc, .test .right span { color: #fff !important; }" +
                    ".test-body .collapsible > li { border: 1px solid #777; }";

        	extent.config().insertCustomStyles(css);*/
    
        	
//        	To get properties values from config.propertise.
        	
			try 
			{
				FileInputStream fs;
				fs = new FileInputStream("src/config/config.properties");
				Properties CONFIG= new Properties();
				CONFIG.load(fs);
				
				String envirment=CONFIG.getProperty("Environment");
	        	String release=CONFIG.getProperty("Release");
	        	String browserType=CONFIG.getProperty("BrowserType");
	        	
	        	 // optional
	            extent.config().reportHeadline("")
	                .documentTitle("Lasso Automation Report")
	                .reportName("LASSO AUTOMATION");
	   
	               
//	            // optional
	            extent
	                .addSystemInfo("Selenium Version", "2.46")
	                .addSystemInfo("Environment", envirment)
	                .addSystemInfo("Release", release)
	                .addSystemInfo("Browser Type", browserType);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}  	
           
        }
        return extent;
    }
}