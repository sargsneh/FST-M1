package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	
	//In the @BeforeClass method, create the a driver instance for FirefoxDriver
	@BeforeClass(alwaysRun = true)
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	  }
	
	//Checking the page title
    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {	
        String title = driver.getTitle();	
        System.out.println("Title is: " + title);	
        Assert.assertEquals(title, "Target Practice");	
    }

    //Find the third header and assert the text in the h3 tag.
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})	
    public void HeaderTest1() {	
        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));	
        Assert.assertEquals(header3.getText(), "Third header");	
    }

    //Find and assert the colour of the fifth header tag element.
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})	
    public void HeaderTest2() {	
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));	
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");	
    }

    //Find the button with the class olive and assert it text.
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})	
    public void ButtonTest1() {	
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));	
        Assert.assertEquals(button1.getText(), "Olive");	
    }

    //Find and assert the colour of the first button in the third row.
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})	
    public void ButtonTest2() {	
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));	
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");	
    }
	
	
	//In the @AfterClass method, use close() to close the browser once the test is done.
	 @AfterClass(alwaysRun = true)
	  public void afterClass() {
		  driver.close();
	  }

}
