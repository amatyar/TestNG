package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Pages;

public class TestPages {
	private WebDriver driver;
	private Pages pages;
	@BeforeClass
	public void setup()
	{
		String path="C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.deriver", path);
		driver = new ChromeDriver();
		pages = new Pages(driver);
		
	}
	@Test
	public void myTest() 
	{
		pages.openUrl("http://www.webdriveruniversity.com/");
		pages.clickElement(By.id("contact-us"));
		 // Send keys to an input field
        pages.sendKeys(By.name("inputField"), "Hello, World!");

        // Wait for a specific duration
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 2 seconds

        // Take a screenshot
        // You can use Selenium or other screenshot libraries to capture a screenshot.

        // Get today's date and time in a string
        java.util.Date now = new java.util.Date();
        String dateTimeString = now.toString();
        System.out.println("Date and Time: " + dateTimeString);

        // Get only the date in a string
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(now);
        System.out.println("Date: " + dateString);
	}
	
}
