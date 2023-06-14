package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Migraine_test 
{//class

//	public static void main(String[] args) throws MalformedURLException, InterruptedException
//	{//main
//		
//
//	}//main
	public void Migraine() throws MalformedURLException, InterruptedException
	{//Migraine
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	  //  cap.setCapability("AppActivity" , "com.health.zyephr.featureModules.filescan.views.FileScanMainActivity");
	    cap.setCapability("appActivity",".featureModules.migraine.views.activities.MigraineDailyEntryActivity");
	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	   Thread.sleep(2000);
	  // Click On Home 
	   driver.findElement(By.id("com.health.zyephr:id/view1")).click(); 
	    System.out.println("Click on homeIcon");
	    Thread.sleep(3000);
	   // Click On Migraine icon 
	    driver.findElementByXPath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView").click();
		System.out.println("Click On Migraine");
		Thread.sleep(8000);
		//Click on Record Your Migraine 
		driver.findElement(By.id("com.health.zyephr:id/img_start_record")).click();
		System.out.println("Record Migraine");
		Thread.sleep(3000);
		//Stop Record 
		driver.findElement(By.id("com.health.zyephr:id/img_start_record")).click();
		System.out.println("completed  the Record");
		Thread.sleep(1000);
		//Select the  Triggered
		driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView").click();
         System.out.println("Clicked On Triggered");
         Thread.sleep(1000);
         //Click on Save Next
         driver.findElement(By.id("com.health.zyephr:id/btn_save_and_next")).click();
         System.out.println("Clicked On Save And Next ");
         Thread.sleep(1000);
         //select the Symptoms 
         driver.findElementByXPath("	\r\n"
         		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView").click();
         System.out.println("Clicked on Symptoms");
         Thread.sleep(1000);
         //save and Next 
         driver.findElementByXPath("	\r\n"
         		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button").click();
         System.out.println("Save and Next");
         //How intense was the Migraine?
         driver.findElementByXPath("	\r\n"
         		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout").click();
         System.out.println("Clicked On Ok");
         Thread.sleep(3000);
         //Click on Done
         driver.findElementByXPath("	\r\n"
         		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button").click();
         System.out.println("Clicked on Done");
         Thread.sleep(3000);
         //Click on Graph Screen Done Button 
         driver.findElementByXPath("	\r\n"
         		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button").click();
         System.out.println("Clicked on Done for Graph screen");
         System.out.println("migraine Module Tested ok ");
	
	}//Migraine 
	
	
}//class
