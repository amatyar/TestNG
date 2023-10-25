package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class utilities extends Base {
	 public void captureScreenshot(String testName) {
	    	System.out.println(driver);
	        if (driver != null) {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
	            String destination = ".//screenshot//" + testName + ".png"; // Set the destination path

	            try {
	                FileUtils.copyFile(source, new File(destination));
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
