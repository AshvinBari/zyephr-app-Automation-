package test1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Allergies 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{//
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("DevicesName ","onepluseNordCE2Lite ");
		cap.setCapability("UDID" , "b29151f2");		cap.setCapability("Platform" , "Android");;
	    cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
        cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");
      AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(3000);
     allergies();
	}//
	public static void allergies() throws MalformedURLException, InterruptedException 
	{//allergies
		   DesiredCapabilities cap = new DesiredCapabilities();
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //Click on Hello
	      driver.findElementByXPath("	\r\n"
	      		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.View").click();
	   System.out.println("Clicked on 3 line ");
	   Thread.sleep(1000);
	   //Click on Allergies
	   driver.findElementByXPath("	\r\n"
	   		+ "/hierarchy/android.widget.FrameLayou;;t/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]").click();
		System.out.println("Clicked on Allergies");
		Thread.sleep(1000);
		//Click on Allergies
		driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]").click();
        System.out.println("Clicked on add Allergies");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//allergies

}
