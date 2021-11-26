package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.training-support.net/selenium/javascript-alerts");
	System.out.println("The title of the page is: " + driver.getTitle());
	
	//use findElement() to find the button to open a PROMPT alert and click it.
	driver.findElement(By.cssSelector("button#prompt")).click();
	
	//Switch the focus from the main window to the Alert box.
	Alert promptAlert = driver.switchTo().alert();
	System.out.println("Alert text is: " + promptAlert.getText());
	
	//Use sendKeys() to type in "Yes, you are!".
	promptAlert.sendKeys("Yes, you are!");
	
	//Close the alert with alert.accept().
	promptAlert.accept();
	
	driver.close();
}
	
}
