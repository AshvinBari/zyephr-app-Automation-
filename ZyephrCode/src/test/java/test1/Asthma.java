package test1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Asthma 
{//class

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{//main
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("DevicesName ","onepluseNordCE2Lite ");
		cap.setCapability("UDID" , "b29151f2");		cap.setCapability("Platform" , "Android");
	    cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
        cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");
      AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(3000);
      asthma();
     
	}//main 
	public static void asthma() throws MalformedURLException, InterruptedException 
	{  //asthma  
		
		DesiredCapabilities cap = new DesiredCapabilities();
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Click On Home 
		   driver.findElement(By.id("com.health.zyephr:id/view1")).click(); 
		    System.out.println("Click on homeIcon");
		    Thread.sleep(3000);
		//Click On Asthma
		    driver.findElementByXPath("	\r\n"
		    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.ImageView").click();
		System.out.println("Clicked on Asthma");
		Thread.sleep(3000);
		//Add Peak flow Rate and Pulse 
		driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button").click();
	    Thread.sleep(2000);
	    //Click on i icon  
	    driver.findElementByXPath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[2]").click();
	    System.out.println("Click on I Icon ");
	    Thread.sleep(500);
	    //Click on Done 
	    driver.findElementByXPath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button").click();
	     System.out.println("Clicked on the  Done Button   ");
	     Thread.sleep(1000);
	     //Click on add Entry
	     driver.findElementByXPath("	\r\n"
	     		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button").click();
	     System.out.println("Clicked on add Entry button ");
	     Thread.sleep(500);
	     //select the triggers
	     driver.findElementByXPath("	\r\n"
	     		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button").click();
	     System.out.println("Selected the trigger ");
	     Thread.sleep(2000);
	  //Click on Next 
	driver.findElementByXPath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button").click();
	Thread.sleep(3000);
	//Select the Symptoms
	driver.findElementByXPath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView").click();
	System.out.println("Slected the Symptoms");
	Thread.sleep(2000);
	//Click on done 
	driver.findElementByXPath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button").click();
	System.out.println("Clicked on Done");
	// Scroll up 
	// Click on Done 
	
	
	
	
	
	}//asthma
}//class
