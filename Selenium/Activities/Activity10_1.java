package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Left click and print the value of the side in the front.
		Actions actions = new Actions(driver);
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        actions.click(cube);
    	WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Value on the Left Click is: " + cubeVal.getText());
		
		//Double click to show a random side and print the number.
        actions.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Value on the Double Click is: " + cubeVal.getText());
		
		//Right click and print the value shown on the front of the cube.
        actions.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Value on the Right Click is: " + cubeVal.getText());

		driver.close();
	}

}
