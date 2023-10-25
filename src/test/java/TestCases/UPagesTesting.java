package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.UPages;

public class UPagesTesting {
	private WebDriver driver;
	private UPages pageTest;
	  
	  @BeforeMethod
	  public void setUp() 
	  {
	    String path="C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver1\\chromedriver.exe";
	    String url="https://www.webdriveruniversity.com/Contact-Us/contactus.html";
	    System.setProperty("webdriver.chrome.driver", path);
	    driver = new ChromeDriver();
	    pageTest = new UPages(driver);
	    driver.get(url);
	    driver.manage().window().maximize();
	  }
	  
	  
	  @Test
	  public void testContactFormSubmission() {
	        // Find and interact with web page elements
//		  pageTest.enterfName("Rabindra");
//		  pageTest.enterlName("Amatya");
//		  pageTest.enterEmail("RabindraAmatya@example.com");
//		  pageTest.enterMessage("This is a test message.");
//		  pageTest.clickSubmit();       
	      	   pageTest.fillForm();    
	    }
	
	  @Test
	    public void testSubmissionSuccess() {
		   driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	        // Locate the success message element and get its text
		    
		   pageTest.fillForm();
	        WebElement successMessage = driver.findElement(By.tagName("h1"));
	        String messageText = successMessage.getText();
	        // Assert that the success message contains the expected text
	        //assert (messageText.contains("Thank you for your message!"));
	        
	        Assert.assertEquals(messageText, "Thank You for your Message!");
	    }	       
	     
	      @Test
	      public void test2_ValidatePageTitle() {
	          driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	          String pageTitle = driver.getTitle();
	          // Add assertions to validate the page title
	          String expectedTitle = "WebDriver | Contact Us";
	          Assert.assertEquals(pageTitle, expectedTitle);
	      }
	      
	      @Test
	      public void test3_ValidateNameField() {
	          driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	          // Validate the presence and attributes of the name field
	          WebElement successMessage = driver.findElement(By.tagName("h2"));
		        String messageText = successMessage.getText();
		        // Assert that the success message contains the expected text        
		        
		        Assert.assertEquals(messageText, "CONTACT US");
	      }

	   
	      
	      @AfterTest
	      public void tearDown() 
	      {
	          driver.quit();
	      }
	  }

	  
	 
	  
