package Pages;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends utilities implements ITestListener 
{
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("On test start......");
        System.out.println("Test started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) 
    {
    	System.out.println("on test success");
        System.out.println("Test passed: " + result.getName());
    }

    public void onTestFailure(ITestResult result) 
    {
    	System.out.println("on test failure.....");
        System.out.println("Test failed: " + result.getName());
        if (result.getStatus() == ITestResult.FAILURE) 
        {
        	 captureScreenshot(result.getName());
        }
    }
}
