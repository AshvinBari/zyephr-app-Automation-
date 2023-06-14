package Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report
{// class
	 ExtentReports extent = new ExtentReports();
	 @BeforeSuite
	 public void reportSetup() 
	 { 
		 ExtentHtmlReporter Html=new ExtentHtmlReporter("extent.Html");
	
		
	        extent.attachReporter(Html);
	 }
	 
	 @AfterSuite
	 
	 public void reportTeardown() 
	 {   
		 extent.flush();
		 
	 }
	

}//class
