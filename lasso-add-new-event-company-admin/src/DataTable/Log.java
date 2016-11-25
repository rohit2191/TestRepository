package DataTable;

import java.io.IOException;
import org.apache.log4j.Logger;
import TestScript.Genericmethod;



public class Log 
{
	// Initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName()); 
    
    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
    public static void startTestCase()
    {
    	Log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    	Log.info("XXXXXXXXXXXXXXXXX      "+"Execution of LASSO Test cases"+"     XXXXXXXXXXXXXXXX");
    	Log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
 
    public static void Environmentdetails(String Environment) throws IOException
    {
    	Log.info("========================================================================================");
    	Log.info("XXXXXXXXXXXXXXX "+Environment+" Site is used for performing testing"+"  XXXXXXXXXXXXXXXX");
    	Log.info("XXXXXXXXXXXXXXX Execution started at:-"+Genericmethod.GetTimeStampValue()+" XXXXXXXXXXXX");
    	Log.info("========================================================================================");
    }
    
    //This is to print log for the ending of the test case
    public static void endTestCase()
    {
    	Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    	Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXX             E---N---D           XXXXXXXXXXXXXXXXXXXXXXXXXXX");
    	Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
 
    public static void info(String message) 
    {
        Log.info(message);
    }
    
    public static void warn(String message) 
    {
    	Log.warn(message);
    }
    
    public static void error(String message) 	
    {
    	Log.error(message);
    }

    public static void fatal(String message) 
    {
    	Log.fatal(message);
    }
    
    public static void debug(String message) 
    {
    	Log.debug(message);
    }
}