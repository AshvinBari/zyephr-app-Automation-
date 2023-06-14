package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
//4
public class BloodSugar extends WeightCheck
{// class

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{// main
	//BloodSugar B=new BloodSugar();
	Diabetes();
	}// main
    public static void Diabetes() throws InterruptedException, MalformedURLException 
    {
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
	    Thread.sleep(3000);
	    //Click on BloodSugar
	    driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
	   Thread.sleep(2000);
	    //Click On I Icon
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]")).click();
 	    System.out.println("Clicked on I Icon ");
       Thread.sleep(500);
    	//click On Done
 	    driver.findElement(By.id("com.health.zyephr:id/btn_done")).click();
 	    System.out.println("Clicked I Icon Done ");
 	    Thread.sleep(500);
 	    // Click On Camera Icon
 	    driver.findElement(By.id("com.health.zyephr:id/addMedIV")).click();
 	    System.out.println("Clicked On Camera Icon");
 	    Thread.sleep(3000);
 	   // Add Medicine
        driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")).click();
	    System.out.println("Add Medicine");
	    Thread.sleep(3000);
	    // Back to Home
        driver.findElement(By.xpath("	\r\n"
        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")).click();
        System.out.println("Back to Home");
        System.out.println("BloodSugar Module Tested Ok ");
        Thread.sleep(3000);
       
    }
                 
}// class 
