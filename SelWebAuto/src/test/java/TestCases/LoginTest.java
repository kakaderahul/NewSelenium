package TestCases;

import org.testng.annotations.Test;

import Base.Base;

public class LoginTest extends Base{
	
	@Test
	public void loginTestMethod() {
		
		// step 1:Open browser 
		
		// step 2: enter url
		String Baseurl=read.getBrowserUrl();
		System.out.println("Baseurl: "+Baseurl);
		driver.get("https://rahulshettyacademy.com/client");
		
		
		
	}
	
	

}
