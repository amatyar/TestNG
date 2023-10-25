package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	}	
	
	@Test
	public void test1() {
	System.out.println("Test Case 1");
	}
	@Test
	public void test2() {
	System.out.println("Test Case 2");
	}
	@Test(description="This is testcase1")  
	public void testcase1()  
	{  
	System.out.println("HR");  
	}  
	@Test(description="This is testcase2")  
	public void testcase2()  
	{  
	System.out.println("Software Developer");  
	}  
	@Test(description="This is testcase3")  
	public void testcase3()  
	{  
	System.out.println("QA Analyst");  
	}  
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() {
	System.out.println("After Test");
	}	
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Suite");
	}
}
