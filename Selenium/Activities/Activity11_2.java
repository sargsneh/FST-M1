package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() to find the button to open a CONFIRM alert and click it.
		driver.findElement(By.cssSelector("button#confirm")).click();
		
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Alert text is: " + confirmAlert.getText());
		
		//Close the alert once with alert.accept()
		confirmAlert.accept();
		System.out.println("Closed the alert using alert.accept()");
		
		//again with alert.dismiss()
		driver.findElement(By.cssSelector("button#confirm")).click();
		confirmAlert.dismiss();
		System.out.println("Opened the alert and closed is using alert.dismiss()");
		
		driver.close();

	}

}
