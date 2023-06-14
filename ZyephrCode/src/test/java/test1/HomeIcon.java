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
//3
public class HomeIcon  extends Thyroid
{// class 

//	public static void main(String[] args) throws MalformedURLException, InterruptedException 
//	{// main
//	HomeIcon A = new HomeIcon();
//	//A.Home();
//	A.BloodPressure();
//
//	}// main
	@Test
	
	
	public  void Home () throws MalformedURLException, InterruptedException 
	{// home
		ExtentTest test1 = extent.createTest("Bloodpressure", "Test pass");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	  //  cap.setCapability("AppActivity" , "com.health.zyephr.featureModules.filescan.views.FileScanMainActivity");
	    cap.setCapability("appActivity",".featureModules.bloodPressure.views.activities.BloodPressureActivity");
	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	   // Thread.sleep(200);
	 
	    // Click on Home Icon
	    driver.findElement(By.id("com.health.zyephr:id/view1")).click(); 
	    test1.log(Status.PASS, "Click on HomeIcon");
	    System.out.println("Click on homeIcon");
	    Thread.sleep(3000);
		 // Click on BloodPressure
		driver.findElement(By.id("com.health.zyephr:id/imageView2")).click(); 
		 System.out.println("Clicked on BloodPressure");
		 test1.log(Status.PASS, "Clicked On Bloodpressure ");
		 // Click on I Icon 
		 Thread.sleep(1000);
		 driver.findElement(By.id("com.health.zyephr:id/info")).click();
		 System.out.println("clicked on I icon");
		 test1.log(Status.PASS, "Clicked on I Icon");
		 //Click Icon Done Button 
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.health.zyephr:id/button_done")).click(); 
		 System.out.println("Clicked on Icon Done Button ");
		 test1.log(Status.PASS, "Clicked on I Icon DOne Button");
		 // Add Entry 
		 Thread.sleep(5000);
	     driver.findElement(By.xpath("	\r\n"
	 		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
		 System.out.println("Clicked on ADD Entry ");
		 test1.log(Status.PASS, "Clicked On ADD Entry");
		 Thread.sleep(3000);
		 //How  you feeling today ? Open
		 // click on Breathing Difficulty 
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
	     System.out.println("Selected Sysmpoms Icon ");
	     test1.log(Status.PASS, "Selected Sysmpoms Icon ");
	     //Click on Next Button
	     Thread.sleep(3000);
	     driver.findElement(By.id("com.health.zyephr:id/button_save")).click();
	     System.out.println("Clicked on Next");
	     test1.log(Status.PASS, "Clicked on Next ");
	     //Click on See your progress Click on done
	     Thread.sleep(3000);
		 driver.findElement(By.xpath("	\r\n"
		 		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
	     System.out.println("clicked On Done ");
	     test1.log(Status.PASS, "Clicked on Done ");
	     
	    System.out.println("BloodPressure Module Tested Ok");
	    test1.log(Status.PASS, "BloodPressure Module Tested Ok ");
	 //   extent.flush();
	    thyroid() ;
	 
	    
	}// home
	
	
	
	
	

}
