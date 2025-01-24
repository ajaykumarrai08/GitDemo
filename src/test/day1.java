package test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class day1 {
	
	
	
	@Test(groups= {"Smoke"})
	public void Demo()
	
	{
		System.out.println("Hello");
	}
	@AfterSuite
	public void AfterSuiteExecution()
	
	{
		System.out.println("i am the number 1 in last");
	}
	@Test
	public void SecondTest()
	
	{
		System.out.println("bye");
		
	}
	@AfterTest
	public void lastExecution()
	
	{
		System.out.println("i will execute last");
		
	}
}
