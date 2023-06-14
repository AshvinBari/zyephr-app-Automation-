package unit_testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class run extends report
{

//	public static void main(String[] args) throws MalformedURLException, InterruptedException 
//	{
//		run a= new run ();
//		a.go();
//	}
	@Test
	public void  go() throws MalformedURLException, InterruptedException
	{    
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	    cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");

	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	  //  Thread.sleep(2000);
//	    driver.manage().window().maximize();
	ExtentTest test1 = extent.createTest("Kidney test start", "Test pass");
	      
      test1.log(Status.INFO, "Click on icon  ");
	      test1.log(Status.PASS, "Click on icon2  ");

	    driver.findElement(By.xpath("	\r\n"
	    		+ "//android.widget.TextView[@content-desc=\"Zyephr Health\"]")).click();
    test1.log(Status.INFO, "pass  ");
    System.out.println("click on app ");
	    System.out.println("All test pass ");
	   
	   extent.flush();
	  
	    
	}
}
