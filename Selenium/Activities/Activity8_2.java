package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		//Use findElements() in combination with xpath() 
		//to find the number of columns and rows (not counting the table header) and print them
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr/th"));
		System.out.println("No of columns of the table are: " + cols.size());
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr"));
		System.out.println("No of rows of the table are: " + rows.size());
		
		//Find and print the cell value at the second row and second column
		WebElement secondRowColumn = driver.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr[2]/td[2]"));
		System.out.println("Cell values of 2nd row and 2nd column: " + secondRowColumn.getText());
		
		//Click the header of the first column to sort by name.
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
		
		//Find and print the cell value at the second row and second column again.
		WebElement secondRowColumn1 = driver.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr[2]/td[2]"));
		System.out.println("Cell values of 2nd row and 2nd column: " + secondRowColumn1.getText());
		
		//Print the cell values of the table footer.
		List<WebElement> footer = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tfoot/tr"));
        for(WebElement cellValue : footer) {
            System.out.println("Cell Value: " + cellValue.getText());
        }

        driver.close();
	}

}
