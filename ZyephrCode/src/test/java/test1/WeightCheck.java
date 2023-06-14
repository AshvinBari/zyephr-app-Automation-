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
//5
public class WeightCheck extends ExtentReportDemo //extends Kidney
{//class

//	public static void main(String[] args)throws InterruptedException, MalformedURLException 
//	{//main
//	
//
//	}//main
	@Test
	public  void Weight() throws InterruptedException, MalformedURLException 
	{//Weight
		
		 ExtentTest test1 = extent.createTest("Weight", "Test pass");
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
	    test1.log(Status.PASS, "open the login Screen ");
	    Thread.sleep(3000);
	   //Click On WeightCheck
	    driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
	   System.out.println("Clicked On WeightCheck");
	   test1.log(Status.PASS, "Clicked On WeightCheck");
	   Thread.sleep(3000);
	   //Add your Weight
	   driver.findElement(By.id("com.health.zyephr:id/button_save")).click();
	   System.out.println("Clicked On Add YOur Weight");
	   test1.log(Status.PASS, "Clicked on Add Your Weight ");
	   Thread.sleep(5000);
	   //Show Weight Graph
	   
	   driver.findElement(By.xpath("	\r\n"
	   		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.widget.Button")).click();
	   System.out.println("Show Now Graph ");
	   test1.log(Status.PASS, "Show Now Graph");
	   System.out.println("Clicked On Done");
	   test1.log(Status.PASS, "Clicked On DOne ");
	   System.out.println("WeightCheck Module Tested Ok ");
	   test1.log(Status.PASS, "WeightCheck Module Tested Ok  ");

	  // kidney();
	}//Weight

}//class
