package Activities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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

public class AppiumProject_Activity6 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void setup() throws InterruptedException, IOException {
		DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("deviceName", "MobileTesting_Emulator_Pixel");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			System.out.println("Chrome is opened");
			// Initialize wait
			wait = new WebDriverWait(driver, 10);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void PopUp() throws InterruptedException {
		driver.get("https://www.training-support.net/selenium");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollDescriptionIntoView(\"Popups Tooltips and Modals\")")).click();
	}

	@Test(priority = 2)
	public void Correctcase() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Sign In\")"))).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[contains(@resource-id, 'username')]"))).click();
		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'username')]").sendKeys("admin");

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[contains(@resource-id, 'password')]"))).click();
		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'password')]").sendKeys("password");

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Log in\")"))).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[contains(@resource-id, 'confirmation')]")));
		String confirm_msg = driver.findElementByXPath("//android.view.View[contains(@resource-id, 'confirmation')]").getText();

		Assert.assertEquals(confirm_msg, "Welcome Back, admin");
		System.out.println("Test case 1 is passed");
	}

	@Test(priority = 3)
	public void InCorrectcase() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Sign In\")"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[contains(@resource-id, 'username')]"))).click();
		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'username')]").sendKeys("admin1");

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[contains(@resource-id, 'password')]"))).click();
		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'password')]").sendKeys("password1");

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Log in\")"))).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[contains(@resource-id, 'confirmation')]")));
		String confirm_msg = driver.findElementByXPath("//android.view.View[contains(@resource-id, 'confirmation')]").getText();

		Assert.assertEquals(confirm_msg, "Invalid Credentials");
		System.out.println("Test case 2 is passed");
	}

	@AfterClass
	public void last() {
		driver.quit();
	}
}
