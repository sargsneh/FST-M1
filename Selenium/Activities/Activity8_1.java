package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		//Use findElements() in combination with xpath() 
		//to find the number of columns and rows (not counting the table header) and print them.
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println("No of columns of the table are: " + cols.size());
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println("No of rows of the table are: " + rows.size());
		
		//Find and print the all the cell values of the third row of the table.
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }
		
		//Find and print the cell value at the second row and second column.
		WebElement secondRowColumn = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("Cell values of 2nd row and 2nd column: " + secondRowColumn.getText());
		
		driver.close();
	}

}
