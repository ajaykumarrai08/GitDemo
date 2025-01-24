package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@BeforeClass
	public void BeforeClassExecution()
	{
//		Selenium
		System.out.println("Before Execution all the method in the class");
		
	}
	@AfterClass
	public void AfterClassExecution()
	{
//		Selenium
		System.out.println("After Execution all the method in the class");
		
	}

	@Test(groups= {"Smoke"})
	public void WebLoginCarLoan()
	{
//		Selenium
		System.out.println("webloginCar");
		
	}
	@BeforeMethod
	public void BeforemethodExecution()
	{
//		Selenium
		System.out.println("Before every method in a class");
		
	}
	@Test
	public void MobileLoginCarLoan()
	{
//		Appium
		System.out.println("mobilelogininCar");
	}
	@Test
	public void LoginApiCarLoan()
	{
//	Rest Api automation	
		System.out.println("ApilogininCar");
	}
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("i will execute first");
	}
	@AfterMethod
	public void AftermethodExecution()
	{
//		Selenium
		System.out.println("After every method in a class");
		
	}
	
}
	
	

