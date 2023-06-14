package test1;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	 ExtentHtmlReporter htmlReporter ;
	  ExtentReports extent = new ExtentReports();
	
	 @BeforeSuite
	public void reportsetup() // throws InterruptedException, MalformedURLException 
	{// reportsetup
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        
        // create ExtentReports and attach reporter(s)
      
        extent.attachReporter(htmlReporter);
	}//reportsetup
	
	@AfterSuite
	public  void report()// throws InterruptedException, MalformedURLException 
	{//report
		 // calling flush writes everything to the log file
		
		extent.flush();
		
		
	}//report

}

//ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
//ExtentXReporter extentx = new ExtentXReporter("localhost");
//
//ExtentReports extent = new ExtentReports();
//extent.attachReporter(html, extentx);
//
//extent.createTest("TestName").pass("Test Passed");
//
//extent.flush();
