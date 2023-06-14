package whatsapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class test 
{

//	public static void main(String[] args) 
//	{
//		
//
//	}

	public void data() throws InterruptedException, MalformedURLException 
	{// chat
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.android.settings");
	    cap.setCapability("AppActivity" , "com.whatsapp.businessquickreply.settings.view.activity.QuickReplySettingsActivity - WhatsApp Business");
	
	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	    
	    Thread.sleep(2000);
        // Open App 
	    driver.findElement(By.xpath("	\r\n"
	    		+ "//android.widget.TextView[@content-desc=\"Teams\"]")).click();
	 System.out.println("Open the Whatsapp");
	// Chat();
	 }//chat
	
//	public void Chat () throws InterruptedException, MalformedURLException 
//	
//	{//chat
//		DesiredCapabilities cap = new DesiredCapabilities();
//		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
//    
//    Thread.sleep(2000);
//    // Click On Ashu
//    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"WA Business has 3 notifications\"]")).click();
//		System.out.println("clicked on WB");
//		Thread.sleep(1000);
//	}
}
