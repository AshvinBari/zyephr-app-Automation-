package unit_testing;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class report {

	
	 ExtentHtmlReporter htmlReporter ;
	public  static ExtentReports extent = new ExtentReports();
	
//	 public static ExtentHtmlReporter report =null;
//	 public static ExtentReports extent =null;
//	 public static ExtentTest test = null;
//	
	 @BeforeSuite
	public void reportsetup()  throws InterruptedException, MalformedURLException 
	{// reportsetup
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        
        // create ExtentReports and attach reporter(s)
//        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}//reportsetup
	
	@AfterSuite
	public  void report() throws InterruptedException, MalformedURLException 
	{//report
		 // calling flush writes everything to the log file
		
		extent.flush();
		
		
	}//

}
