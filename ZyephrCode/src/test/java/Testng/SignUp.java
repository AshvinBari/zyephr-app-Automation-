package Testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SignUp 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
	SignUp A =new SignUp();
	A.signup();
	}
    public void signup() throws InterruptedException, MalformedURLException
    {
    	DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ashvin");
	    cap.setCapability("UDID" , "b29151f2");
	  	cap.setCapability("Platform" , "Android");
	  	cap.setCapability("Androidversion" , "12");
	    cap.setCapability("apppackage" ,"com.health.zyephr");
	    cap.setCapability("AppActivity" , ".featureModules.login.views.activities.OnBoardingActivity");

	    AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
	    Thread.sleep(3000);
	//    test1.log(Status.PASS, "Config ");
	    driver.findElement(By.xpath("	\r\n"
	    		+ "//android.widget.TextView[@content-desc=\"Zyephr Health\"]")).click();
	  //  test1.log(Status.PASS, "Click on icon  ");
	    System.out.println("app Opened ");
	    Thread.sleep(3000);
	    // Enter the Number
	    driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("9075970621");
	    System.out.println("Enter the number");
	   Thread.sleep(3000);
	   //click The Signup Button 
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
	    System.out.println("Clicked on SignUp Button ");
	    Thread.sleep(3000);
	    System.out.println("wait For OTP");
	    Thread.sleep(3000);
	    System.out.println("Open The Privacy Policy screen ");
	    //Click on i agree 
	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("	\r\n"
//	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox")).click();
//	    System.out.println("Clicked on i agree ");
//	    Thread.sleep(500);
//	    // Click on 2 agree
//	    driver.findElement(By.xpath("	\r\n"
//	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.CheckBox")).click();
//	   System.out.println("Clicked on permisson");
//	   Thread.sleep(500);
	   // Accept All
	   driver.findElement(By.xpath("	\r\n"
	   		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.CheckBox")).click();
       System.out.println("Accept All ");
       // Clicked on Signup Button
       Thread.sleep(1000);
       driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
       System.out.println("Click on Signup Button ");
       // Enter the Name 
       Thread.sleep(2000);
       driver.findElement(By.xpath("	\r\n"
       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")).sendKeys("Ashvinkumar");
       System.out.println("Enter the Name ");
       Thread.sleep(2000);
       // Selected the Gender 
       driver.findElement(By.xpath("	\r\n"
       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
       System.out.println("Selected the Gender");
       // Clicked on Done Button 
       driver.findElement(By.xpath("	\r\n"
       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
       System.out.println("Clicked on Done ");
       //click on weight
       Thread.sleep(2000);
       driver.findElement(By.xpath("	\r\n"
       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
    System.out.println("clicked on weight ");
    Thread.sleep(3000);
    driver.findElement(By.xpath("	\r\n"
    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
    System.out.println("Next and Save ");
    driver.findElement(By.xpath("	\r\n"
    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
    System.out.println("Done");
    
    
    
    }
}
