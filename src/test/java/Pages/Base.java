package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver = null;
	  
	  
	  @BeforeMethod
	  public void setUp() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver1\\chromedriver.exe");
	  driver = new ChromeDriver();	    
	  }	
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
}
