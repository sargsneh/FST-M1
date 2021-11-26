package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("The title of the page is: " + driver.getTitle());
		System.out.println("Parent Window handle is: " + driver.getWindowHandle());
		
		//Find the button to open a new tab and click it.
        driver.findElement(By.linkText("Click Me!")).click();
		
		//Wait for the new tab to open.
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//Print all the handles.
        System.out.println("All window handles: " + driver.getWindowHandles());
		
		//Switch to the newly opened tab, print it's title and heading.
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("Current window handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        System.out.println("New tab heading is: " + driver.findElement(By.cssSelector("div.content")).getText());
		
		//Repeat steps 6-8 by clicking the button on the new tab.
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println("All window handles: " + driver.getWindowHandles());
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("New tab handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        System.out.println("New tab heading is: " + driver.findElement(By.cssSelector("div.content")).getText());
        
		//Finally, close both windows using quit().
        driver.quit();

	}

}
