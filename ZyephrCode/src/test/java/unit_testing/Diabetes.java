package unit_testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Diabetes
{// Class

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{//main
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
	   Thread.sleep(200);
	 

          
//          	 
          	 Thread.sleep(2000);
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
        	   // call The Medicine method only save medicine time 
        	    //Medicine();
        	    //Click On Medicine Details Clicked On Camera 
        	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout")).click();
        	    System.out.println("Clicked On Camera Icon");
        	    Thread.sleep(2000);
        	    // Click On Instructions Capture Button 
        	    driver.findElement(By.xpath("	\r\n"
        	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
              System.out.println("Clicked on Capture Button ");
              Thread.sleep(3000);
              // Select the images
              driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.View")).click();
              System.out.println("Image Selected ");
              Thread.sleep(3000);
              //Click on Apply Button 
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.TextView[2]")).click();
              System.out.println("Clicked on Apply");
              Thread.sleep(3000);
              //Click on Brand Name
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView")).click();
              System.out.println("Opened the Brand Name ");
              //Click on Medicine Name 
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")).click();
               System.out.println("Selected Medicine Name ");
               //Click on Type on Medicine Button 
               driver.findElement(By.xpath("	\r\n"
               		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")).click();
               System.out.println("Clicked on Type Of Medicine");
              
            //   typeofMedicine();
                  //Medicine
               driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
          	 System.out.println("Clicked on Medicines");
               //Click On What is this Medicine For
               driver.findElement(By.xpath("	\r\n"
               		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
              System.out.println("Clicked on What is this Medicine For plus Icon");
              // Select the Diabetes Icon
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
              System.out.println("Clicked the Diabetes ");
              // Click on Next
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
              System.out.println("Clicked on Next Button ");
              // Done 
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
              System.out.println("Click on Done Button ");
              // Add Medicine
              driver.findElement(By.xpath("	\r\n"
      	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")).click();
      	    System.out.println("Add Medicine");
      	    Thread.sleep(2000);
      	    // Back to Home
              driver.findElement(By.xpath("	\r\n"
              		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")).click();
              
              
              
              
	}//main
           
 public static void Medicine() throws InterruptedException, MalformedURLException 
 {// Medicine
	   DesiredCapabilities cap = new DesiredCapabilities();
	 AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);

 
     // Click On Add Medicine
  	    driver.findElement(By.xpath("	\r\n"
  	    		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")).click();
  	    System.out.println("Medicine Details  screen Opened");
  	    Thread.sleep(3000);

  }// Medicine
public static void typeofMedicine() throws MalformedURLException, InterruptedException 
{// typeofMedicine
	 DesiredCapabilities cap = new DesiredCapabilities();
 AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
Thread.sleep(2000);
//Medicine
 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
	 System.out.println("Clicked on Medicines");
	 
	 
	// Insulin
//	 driver.findElement(By.xpath("	\r\n"
//	 		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
//	 System.out.println("Clicked of Insulin");
//	 
	 
	 // Puff
//	 driver.findElement(By.xpath("	\r\n"
//	 		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView")).click();
//	 System.out.println("Clicked on Puff");
	 
}// typeofMedicine
 
       
        
	

}//class 
