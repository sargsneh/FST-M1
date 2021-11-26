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

public class AppiumProject_Activity3 {
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
		wait = new WebDriverWait(driver, 50);
	}

	@Test
	public void googleTasks() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("new_note_button"))).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("edit_note_text"))).sendKeys("This is for activity");
		driver.findElementById("editable_title").sendKeys("My Activity note Plan");		
		driver.findElementById("menu_switch_to_list_view").click();		
		driver.findElementByXPath("//android.widget.TextView[@text='Pick a date & time']").click();		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.LinearLayout[contains(@content-desc,'Time - Currently selected')]/android.widget.Spinner/android.widget.TextView"))).click();		
		driver.findElementByXPath("//android.widget.TextView[@text='Afternoon']").click();		
		driver.findElementById("save").click();		
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Open navigation drawer"))).click();

		String noteName = driver.findElementById("index_note_title").getText();
		Assert.assertEquals(noteName, "This is for activity");
		System.out.println("Note with title :" + noteName + " is added successfully");
		Assert.assertTrue(driver.findElementById("reminder_chip_text").isDisplayed());

		System.out.println("Note is set with reminder: " + driver.findElementById("reminder_chip_text").getText());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
