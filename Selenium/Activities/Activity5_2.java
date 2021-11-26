package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() to find the checkbox input element
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		//Use the isSelected() method to check if the checkbox is selected
		System.out.println("The checkbox Input is displayed: " + checkBox.isSelected());
		
		//Click the checkbox to select it.
		checkBox.click();
		
		//Use the isSelected() method again and print the result
		System.out.println("The checkbox Input is displayed: " + checkBox.isSelected());
		
		driver.close();

	}

}
