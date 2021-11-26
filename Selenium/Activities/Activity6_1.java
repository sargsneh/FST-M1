package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Find the checkbox toggle button and click it.
		driver.findElement(By.id("toggleCheckbox")).click();
		
		//declare an element for the check box
		WebElement checkBox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		
		//Wait till the checkbox disappears
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
		System.out.println("The Dynamic check box is disabled");
		
		//Click the button again. Wait till it appears and check the checkbox.
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("dynamicCheckbox")));
		System.out.println("The Dynamic check box is enabled");
		
		driver.close();

	}

}