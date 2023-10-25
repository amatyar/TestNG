package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pages {
private WebDriver driver;
	
	public Pages(WebDriver dr)
	{
		this.driver = dr;
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
	}
	public void clickElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		element.click();
	}
	public void sendKeys(By locator, String text)
	{
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
}
