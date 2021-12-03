import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAndroidTest {

                 AppiumDriver driver;


        @BeforeTest
      public void setup() throws MalformedURLException {
          DesiredCapabilities caps = new DesiredCapabilities();
          caps.setCapability("platformName","Android");
          caps.setCapability("automationName","UiAutomator2");
          caps.setCapability("platformVersion","11.0");
          caps.setCapability("deviceName","Android Emulator");
          caps.setCapability("app",System.getProperty("user.dir")+"/apps/ApiDemos.apk");
          driver= new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
            //driver.findElement(By.xpath("//android.widget.TextView[@content-desc='API Demos']")).click();

        }
     @Test
      public void click_app_button(){
           // driver.findElement(By.name("API Demos")).click();
           // driver.findElement(By.xpath("//android.widget.TextView[@content-desc='API Demos']")).click();
      }

//      @AfterTest
//    public void tearDown(){
//            if(null != driver){
//                driver.quit();
//            }
//      }

}
