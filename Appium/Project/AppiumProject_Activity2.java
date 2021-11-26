package Activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppiumProject_Activity2 {
	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "MobileTesting_Emulator_Pixel");
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("appPackage", "com.android.chrome");
	    caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 100);
	}

	@Test
	public void googleTasks() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("new_note_button"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("edit_note_text"))).sendKeys("This is for activity");
	
		driver.findElementById("editable_title").click();
		driver.findElementById("editable_title").sendKeys("My Activity note Plan");

		driver.findElementByAccessibilityId("Open navigation drawer").click();

		String noteName = driver.findElementById("index_note_title").getText();
		Assert.assertEquals(noteName, "My Activity note Plan");
		System.out.println("Note with title :" + noteName + " is added successfully");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
