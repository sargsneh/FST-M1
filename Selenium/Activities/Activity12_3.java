package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("The title of the page is: " + driver.getTitle());
		
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions builder = new Actions(driver);
        
		//Find the Sign in button and hover over it. Print the tooltip message.
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);
		
		//Click the button to open the Sign in form.
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		
		//Enter the credentials 
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
		
		//Click login and print the message on the page after logging in.
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        System.out.println("Message on login is: " +driver.findElement(By.id("action-confirmation")).getText());
		
		driver.close();
		
	}

}
