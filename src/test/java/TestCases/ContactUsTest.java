package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ContactUs;

public class ContactUsTest {
	 private WebDriver driver;
	    private ContactUs contactUs;

	    @BeforeMethod
	    public void setUp() {
	    	String path="C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver1\\chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", path);
	        driver = new ChromeDriver();
	        contactUs = new ContactUs(driver);
	    }

	    @Test
	    public void testContactUsFormSubmission() {
	        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");	        
	        contactUs.enterName("Rabindra Amatya");
	        contactUs.enterEmail("RabindraAmatya@example.com");
	        contactUs.enterMessage("This is testNG.");
	        contactUs.clickSubmitButton();       
	        captureScreenshot("Test1");
	        
	        // Assert.assertTrue(driver.getCurrentUrl().contains("success"));
	    }
	    @Test
	    public void test2_ValidatePageTitle() {
	        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	        String pageTitle = driver.getTitle();
	        // Add assertions to validate the page title
	    }
	    
	    @Test
	    public void test3_ValidateNameField() {
	        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	        // Validate the presence and attributes of the name field
	    }
	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	    private void captureScreenshot(String testContactUsFormSubmission) {
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());
        String screenshotPath = "screenshots/" + testContactUsFormSubmission + "_" + timestamp + ".png";

        try {
            FileUtils.copyFile(srcFile, new File(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
	    
	    }   
}
