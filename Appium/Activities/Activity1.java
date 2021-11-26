package Activities;

import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
  @Test	
  public void calc() throws InterruptedException, IOException {
      DesiredCapabilities caps = new DesiredCapabilities();
      //caps.setCapability("deviceId", "2eed910sa");
      caps.setCapability("deviceName", "MobileTesting_Emulator_Pixel");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.calculator2");
      caps.setCapability("appActivity", "com.android.calculator2.Calculator");
	
      AppiumDriver<MobileElement> driver = null;
      try {
          driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);	
          System.out.println("Calculator is open");
      } catch (MalformedURLException e) {	
          System.out.println(e.getMessage());	
      }
  }
}
