package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		Actions actions = new Actions(driver);
		
		//Press the key of your first name in caps
        Action actionSequence1 = actions.sendKeys("S").build();
    	actionSequence1.perform();
        System.out.println("Press the key of your first name in caps is: " + pressedKey.getText());
        
		//Press CTRL+a and the CTRL+c to copy all the text on the page
        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        System.out.println("All the text on the page is: " + pressedKey.getText());
		
		driver.close();

	}

}
