package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {
	private WebDriver driver;

    public ContactUs(WebDriver driver) {
        this.driver = driver;
    }

    // Define locators for elements on the Contact Us page
    By nameInput = By.name("first_name");
    By emailInput = By.name("email");
    By messageInput = By.name("message");
    By submitButton = By.cssSelector("#form_buttons > input:nth-child(2)");

    // Methods to interact with the page
    public void enterName(String name) 
    {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void enterEmail(String email) 
    {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterMessage(String message) 
    {
        driver.findElement(messageInput).sendKeys(message);
    }

    public void clickSubmitButton() 
    {
        driver.findElement(submitButton).click();
    }
}
