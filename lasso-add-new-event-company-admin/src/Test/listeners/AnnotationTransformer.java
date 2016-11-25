package Test.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import TestScript.SetupEnvironment;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class AnnotationTransformer implements IAnnotationTransformer 
{
	@SuppressWarnings({ "rawtypes"})
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{ 
		DOMConfigurator.configure("log4j.xml");
		BasicConfigurator.configure();
		
		SetupEnvironment test = new SetupEnvironment();
    	ArrayList<String> ae = new ArrayList<String>();
		
    	try 
    	{
				ae = test.start();
    	}
    	catch (IllegalAccessException e) 
    	{
				e.printStackTrace();
		}
    	catch (IllegalArgumentException e) 
		{
				e.printStackTrace();
		}
    	catch (InvocationTargetException e) 
    	{
				e.printStackTrace();
		}
    	catch (NoSuchMethodException e) 
    	{
				e.printStackTrace();
		}
    	catch (SecurityException e) 
    	{
				e.printStackTrace();
		}
			
		if (ae.contains(annotation.getTestName())) 
		{
		    annotation.setEnabled(true);
		}
	}
}