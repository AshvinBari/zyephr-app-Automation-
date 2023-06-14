package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
//1
public class LaunchZyephrApp extends Login
{// class
	static AndroidDriver<MobileElement> driver;
	
       @Test
	  public void Openapp()  throws InterruptedException, MalformedURLException
	  {
		  
    	  ExtentTest test1 = extent.createTest("Launchapp", "Test pass");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	    cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");

	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	    Thread.sleep(3000);
	    test1.log(Status.PASS, "Config ");
	    driver.findElement(By.xpath("	\r\n"
	    		+ "//android.widget.TextView[@content-desc=\"Zyephr Health\"]")).click();
	    test1.log(Status.PASS, "Click on icon  ");
	 
	    //  Signup class call method 
	      System.out.println("App Opened");
	      test1.log(Status.PASS, "App opened ");
	   
	      call();
	  
	    
	  }
	  
	

}//class
