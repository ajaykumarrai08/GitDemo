package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	@Test @Parameters({"URL"})
	public void JioLogin(String urlname)
	{
		System.out.println("Login Jio");
		System.out.println(urlname);
	}
	@Test @Parameters({"URL","APIkey/username"})
	public void SigninJio(String urlname,String key)
	{
		System.out.println("Sign Jio");
		System.out.println(urlname);
		System.out.println(key);

      }
	}
