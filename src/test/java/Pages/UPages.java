package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UPages {
	private WebDriver driver;

	    
	    public UPages(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Define page elements
	    By nameField0 = By.name("first_name");
	    By nameField1 = By.name("last_name");
	    By emailField = By.name("email");
	    By messageField = By.name("message");
	    By submitButton = By.cssSelector("[type='submit']");

	    // Page methods
	    public void enterfName(String name) {
	        driver.findElement(nameField0).sendKeys(name);
	    }
	    public void enterlName(String name) {
	        driver.findElement(nameField1).sendKeys(name);
	    }
	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }

	    public void enterMessage(String message) 
	    {
	        driver.findElement(messageField).sendKeys(message);
	    }

	    public void clickSubmit() 
	    {
	        driver.findElement(submitButton).click();
	    }
	    
	    public void fillForm() 
	    {
	    		enterfName("Rabindra");
	    		enterlName("Amatya");
	    		enterEmail("RabindraAmatya@example.com");
	    		enterMessage("This is a test message.");
	    		clickSubmit(); 
	    }
	    public boolean isNameFieldPresent() 
	    {
	        WebElement element = driver.findElement(By.cssSelector("#contact-us"));
	        return element.isDisplayed();
	    }

	    public String getNameFieldPlaceholder() 
	    {
	        WebElement element = driver.findElement(By.cssSelector(""));
	        return element.getAttribute("placeholder");
	    }
	  
}
