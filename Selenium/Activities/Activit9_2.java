package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activit9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		//Use findElement() to find the multi-select WebElement on the page
		WebElement multiSelect = driver.findElement(By.id("multi-select"));
		
		//Create a new Select class object with the WebElement
		Select multiS = new Select(driver.findElement(By.id("multi-select")));
		
		//Check if the HTML element is a multi-list.
		if(multiS.isMultiple()) {
			//Select the 'JavaScript' option by visible text.
			multiS.selectByVisibleText("Javascript");
						
			//Select the 'NodeJS' option by value.
			multiS.selectByValue("node");
						
			//Select the 4th, 5th, and the 6th options by index.
			int i;
			for (i=4; i<=6; i++) {
				multiS.selectByIndex(i);
			}
			
			List<WebElement> selectedOptions = multiS.getAllSelectedOptions();
			//Print all selected options one by one 
	        for(WebElement selectedOption : selectedOptions) {
	            System.out.println("Selected option: " + selectedOption.getText());
	        }
								
			//Deselect the 'NodeJS' option by value attribute.
			multiS.deselectByValue("node");
						
			//Deselect the 7th option by index.
			multiS.deselectByIndex(7);
						
			List<WebElement> selectedOptions1 = multiS.getAllSelectedOptions();
			//Print all selected options one by one 
	        for(WebElement selectedOption : selectedOptions1) {
	            System.out.println("Selected option after certain deslections: " + selectedOption.getText());
	        }
		}
	
        //Deselect all options
        multiS.deselectAll();
        System.out.println("All options are deselected");
        
		driver.close();

	}

}
