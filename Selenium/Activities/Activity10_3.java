package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		Actions actions = new Actions(driver);
		
		//Find the ball and simulate a click and drag to move it into "Dropzone 1".
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(ball, drop1).build().perform();
		
        //Verify that the ball has entered Dropzone 1.
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("Ball has entered dropzone 1");
        
        //Once verified, move the ball into "Dropzone 2".
        WebElement drop2 = driver.findElement(By.id("droppable"));
        dragAndDrop.dragAndDrop(ball, drop2).build().perform();
        
        //Verify that the ball has entered Dropzone 2.
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("Ball has entered dropzone 2");
		
		driver.close();

	}

}
