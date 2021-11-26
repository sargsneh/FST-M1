package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
    
    //In the @BeforeMethod method, create the a driver instance for FirefoxDriver
    @BeforeMethod
    public void beforeMethod() {
    	driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
    }

    @Test
    public void exampleTestCase() {
        //Use getTitle() to get and print the title of the page.
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
            
        //Make an assertion using assertEquals() to make sure the title of the page is "Training Support".
        Assert.assertEquals("Training Support", title);
                    
        //Use findElement() to find the "About Us" Button on the page and click it.
        driver.findElement(By.id("about-link")).click();
                    
        //Get and print the title of the new page.
        System.out.println("New page title is: " + driver.getTitle());
        
        //Assert the title of the new page.
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    //In the @AfterMethod method, use close() to close the browser once the test is done.
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
