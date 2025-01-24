package test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
// rahulonlinetutor@gmail.com
public class day3 {
	
	@Test
	public void WebLoginHomeLoan()
	{
//		Selenium
		System.out.println("webloginhome-ListenerFailPractice");
		Assert.assertTrue(false);
		
	}
	@Test @Parameters({"URL"})
	public void TeamLogin(String urlname)
	{
		System.out.println("Team Jio");
		System.out.println(urlname);
	}
	@BeforeSuite
	public void BeforeSuiteExecution()
	{
//		Appium
		System.out.println("i am number 1");
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})
	public void LoginApiHomeLoan()
	{
//	Rest Api automation	
		System.out.println("ApilogininHome");
	}
	@Test(dataProvider="getData")
	public void MobileLoginHomeLoan(String username,String password)
	{
//		Appium
		System.out.println("mobilelogininHome");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
//		1st combination -username password -good credit history= row
//		2nd - username password - no credit history
//		3rd - fraudelent credit history
		Object[][] data=new Object[3][2];
//		1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
//		couloums in the row are nothing but values for that particular combination(row)
//		2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
//		3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
		
	}
	
}
