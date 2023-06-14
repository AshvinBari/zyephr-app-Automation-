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

public class Heart extends ExtentReportDemo
{//class

//	public static void main(String[] args) throws MalformedURLException, InterruptedException 
//	{//main
//		Heart A = new Heart();
//		A.heart();
//
//	}//main
	
	@Test
	public void heart() throws MalformedURLException, InterruptedException 
	{//heart
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	    cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");

	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	    Thread.sleep(2000);
//	    driver.manage().window().maximize();
	    ExtentTest test1 = extent.createTest("Heart", "Test pass");
	  //  test1.log(Status.INFO, "Click on Home ");
	    driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.View")).click();
	    System.out.println("Click on Home Icon ");
	    test1.log(Status.PASS, "Click on icon  ");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
	System.out.println("Click on Heart");
	 test1.log(Status.PASS, "Click on Heart  ");
	Thread.sleep(2000);
	  driver.findElement(By.id("com.health.zyephr:id/imageView5")).click();
	  test1.log(Status.PASS, "How are you felling today  ");
	  System.out.println("How are you felling Today");
	  System.out.println("Slight limitation of Physical activity");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("	\r\n"
	  		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
	  System.out.println("Clicked on Save And Next");
	  test1.log(Status.PASS, "Clicked on save and Next  ");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("	\r\n"
	  		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
	  System.out.println("clicked on info button ");
	  test1.log(Status.PASS, "Clicked on info button  ");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("	\r\n"
	 		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
	  System.out.println("click on info Done Button ");
	  test1.log(Status.PASS, "Clicked on info Done button  ");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("	\r\n"
	  		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
	  System.out.println("Clicked on Next ");
	  test1.log(Status.PASS, "Clicked on Next   ");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("	\r\n"
	  		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
	  System.out.println("Click on Done ");
	  System.out.println("All test pass heart modules");
	  
	  
	
	
	
	
	
	
	}//heart

}//class
