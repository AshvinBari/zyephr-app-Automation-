package Testng;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class onetest
{//class 

	
//	
//		public static void main(String[] args) throws MalformedURLException, InterruptedException 
//	{onetest A = new onetest();
//	//A.config();
//	A.error();
//	
//	}
//	

	
	AndroidDriver<AndroidElement> driver;
	public static ExtentReports extent = new ExtentReports();
	
	 @BeforeSuite
	 public void config() 
	 {
		 
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.div")+"//report//ExtentReport.html");
		 //"user.div"
		 htmlReporter.config().setReportName("Android App Automation");
		 htmlReporter.config().setDocumentTitle("Test Result");
		 
		 
	//	 ExtentReports extent= new ExtentReports();
		//ExtentReports test= new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Author ", "Ashvinkumar");//1.22.3
		extent.setSystemInfo("Appium Version ","1.22.3");		
		extent.setSystemInfo("platform", "Android");
	
		
	 }
	
	
	@Test
	
	public void error() throws MalformedURLException
	{ 
		extent.createTest("error");
		

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	    cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");
	    cap.setCapability(MobileCapabilityType.NO_RESET,true);
	    cap.setCapability(MobileCapabilityType.FULL_RESET,false);
	    driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
//	   test.log(Status.PASS, "details");
//	    test.pass("details");
//	    test.pass(MarkupHelper.createCodeBlock(code));
	    driver.findElement(By.xpath("	\r\n"
	    		+ "//android.widget.TextView[@content-desc=\"Zyephr Health\"]")).click();
	  //  driver.findElement(By.id("com.health.zyephr:id/view1")).click(); 
	    System.out.println("All test pass ");
	    extent.flush();
	}
	
	
	
	
	
}//class 
