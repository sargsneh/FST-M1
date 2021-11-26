package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumProject_Activity4 {
	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("deviceName", "MobileTesting_Emulator_Pixel");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 10);

		driver.get("https://www.training-support.net/selenium");
	}

	@Test
	public void scrollIntoViewTest() {
		String[] tasks = { "Add tasks to list", "Get number of tasks", "Clear the list" };
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollDescriptionIntoView(\"To-Do List Elements get added at run time\")")).click();
		// Add all the 3 tasks to the list
		for (int i = 0; i < tasks.length; i++) {
			wait.until(
			ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")"))).sendKeys(tasks[i]);
			driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
		}

		
		for (int i = 0; i < tasks.length; i++) {
			driver.findElementByXPath("//android.view.View[@text='" + tasks[i] + "']").click();
		}
		
		driver.findElementByXPath("//android.widget.TextView[@text='Clear List']").click();
		Boolean a = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("taskInput")));
		
		Assert.assertTrue(a, "List is cleared successfully");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
