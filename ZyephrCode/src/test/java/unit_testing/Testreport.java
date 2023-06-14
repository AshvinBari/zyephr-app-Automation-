package unit_testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Testreport extends report
{//class
//	public static void main(String[] args) throws MalformedURLException, InterruptedException 
//	{Testreport A = new Testreport();
//	A.test();
//		
//	}
	

	@Test
	public void test() throws InterruptedException, MalformedURLException 
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
	 // creates a toggle for the given test, adds all log events under it    
      ExtentTest test1 = extent.createTest("Kidney test start", "Test pass");
      
    //  test1.log(Status.INFO, "Click on Home ");
       //Click On Home 
	   driver.findElement(By.id("com.health.zyephr:id/view1")).click(); 
	    System.out.println("Click on homeIcon");
        // log(Status, details)
        test1.log(Status.PASS, "Click on Home ");

	    Thread.sleep(3000);
	   //Click On Kidney
	    driver.findElement(By.xpath("	\r\n"
	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
	   System.out.println("Clicked On Kidney");
	  test1.log(Status.PASS, "Clicked On Kidney");
	   Thread.sleep(3000);
	   // Click on I Icon
	   driver.findElement(By.id("com.health.zyephr:id/info")).click();
	   System.out.println("Click on I Icon");
	  test1.log(Status.PASS, "Click on I Icon");
	   Thread.sleep(3000);
	   //I Icon Done button 
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
	  System.out.println("Click on Done");
	  test1.log(Status.PASS, "Click on Done");
	   Thread.sleep(3000);
	   //Creatinine Entry next
	   driver.findElement(By.xpath("	\r\n"
	   		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
	   System.out.println("Creatinine Entry Next ");
	  test1.log(Status.PASS, "Creatinine Entry Next ");
	   Thread.sleep(3000);
	   //How do you feel Today? 
	   // Select the Symptoms
//	   driver.findElement(By.xpath("	\r\n"
//	   		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
//         System.out.println("Symptoms selected ");
//       test1.log(Status.PASS, "Symptoms selected");
//         Thread.sleep(5000);
//         //save and Next
//         driver.findElement(By.id("com.health.zyephr:id/button_save")).click();
//         System.out.println("Save And Next");
//        test1.log(Status.PASS, "Save And Next");
//         Thread.sleep(3000);
//         //Click on Done 
//         driver.findElement(By.id("com.health.zyephr:id/done")).click();
         test1.log(Status.INFO, "Clicked don Done");
         System.out.println("Clicked don Done ");
         System.out.println("kidney Module Tested Ok ");
         extent.flush();
    
		
	}

}//class
