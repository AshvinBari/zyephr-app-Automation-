package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Thyroid extends  Heart
{//main

//	public static void main(String[] args)throws InterruptedException, MalformedURLException 
//	{//main
//	
//		
//
//	}//main
	@Test
	
	public void thyroid() throws InterruptedException, MalformedURLException 
	{//Weight
		
		ExtentTest test1 = extent.createTest("Thytoid", "Test pass");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	  //  cap.setCapability("AppActivity" , "com.health.zyephr.featureModules.filescan.views.FileScanMainActivity");
	    cap.setCapability("appActivity",".featureModules.diabetes.views.activities.DiabetesGraphActivity");
	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	   Thread.sleep(2000);
	   //Click On Home 
	   driver.findElement(By.id("com.health.zyephr:id/view1")).click(); 
	    System.out.println("Click on homeIcon");
	    test1.log(Status.PASS, "Click on HomeIcon");
	    Thread.sleep(3000);
	    //Click on Thyroid icon
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
	   System.out.println("clicked on Throid Icon");
	   test1.log(Status.PASS, "Clicked On Thtoid Icon ");
	   Thread.sleep(2000);
	   //Click on Add Entry
	   driver.findElement(By.xpath("	\r\n"
	   		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
	  System.out.println("Clicked on Add Entry");
	  test1.log(Status.PASS, "Clicked On Add Entry ");
	  Thread.sleep(5000);
	  //Done
	  driver.findElement(By.xpath("	\r\n"
	  		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();	
	System.out.println("Clicked on Done ");
	test1.log(Status.PASS, "Clicked On Done ");
	
	
	}//

}//main
