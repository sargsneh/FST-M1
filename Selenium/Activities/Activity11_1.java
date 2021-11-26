package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() to find the button to open a SIMPLE alert and click it.
		 driver.findElement(By.cssSelector("button#simple")).click();
		 		
		//Switch the focus from the main window to the Alert box and get the text in it and print it
		 org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
		 System.out.println("Alert text is: " + simpleAlert.getText());
		
		//close the alert with alert.accept() 
		 simpleAlert.accept();
		 
		driver.close();

	}

}
