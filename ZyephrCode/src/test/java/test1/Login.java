package test1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
//2
public class Login extends HomeIcon
{// class

	@Test
	public  void call () throws MalformedURLException , InterruptedException
	{// call
		 ExtentTest test1 = extent.createTest("SignUp", "Test pass");
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
 		
    //Login Button Down SigUp Screen 
      driver.findElement(By.id("com.health.zyephr:id/btn_log_in")).click();// user
      System.out.println("The Login Screen Opened ");
      test1.log(Status.PASS, "open the login Screen ");
      Thread.sleep(3000);
      // Enter Number 
      driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("9075970621");
   System.out.println("Clicked On Login Link ");
   test1.log(Status.PASS, "Enter the Number ");
  Thread.sleep(3000);
      // LoginUp Button 
      driver.findElement(By.id("com.health.zyephr:id/btn_log_in")).click();
      System.out.println("Clicked On Login Button ");
      test1.log(Status.PASS, "Clicked on login button ");
      System.out.println("Wait For OTP");
      test1.log(Status.PASS, "Wait for OTP ");
      System.out.println("Login");
      Thread.sleep(500);
      driver.findElement(By.id("com.health.zyephr:id/negativeButton")).click();
      System.out.println("Clicked on update Back Button ");
      test1.log(Status.PASS, "Clicked on update Back Button");
      test1.log(Status.PASS, "login successful");
      Home();

    
      
      
	} 
	
}//class
