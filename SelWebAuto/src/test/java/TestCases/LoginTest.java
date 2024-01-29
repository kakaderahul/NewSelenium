package TestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Base;
import POMObjectRepo.LoginPage;

public class LoginTest extends Base{
	LoginPage loginobj;
	
//	@Test
//	public void loginTestMethod() {
//		
//		// step 1:Open browser 
//		
//		// step 2: enter url
//		String Baseurl=read.getBrowserUrl();
//		System.out.println("Baseurl: "+Baseurl);
//		driver.get("https://rahulshettyacademy.com/client");
//		
//		// step 3: enter email, pwd and click on login button.
//		loginobj=new LoginPage(driver);
//	
//		
//		loginobj.enterEmail("kakaderahul70@gmail.com");
//		loginobj.enterPassword("Rahul@123");
//		loginobj.clickLoginBtn();
//		
//		
//	}
//	
	@Test
	public void loginTestWithInvalidData() throws InterruptedException {
		
		// step 1:Open browser 
		
				// step 2: enter url
				String Baseurl=read.getBrowserUrl();
				System.out.println("Baseurl: "+Baseurl);
				driver.get("https://rahulshettyacademy.com/client");
				driver.manage().window().maximize();
				
				// step 3: enter email, pwd and click on login button.
				loginobj=new LoginPage(driver);
			
				
				loginobj.enterEmail("kakaderahul70@gmail.com");
				loginobj.enterPassword("Rahul@1234");
				loginobj.clickLoginBtn();
				Thread.sleep(20000);
				//Alert alert=driver.switchTo().alert();
				//String errorMessage=alert.getText();
				 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			     WebElement errorMessageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("error-message")));
				System.out.println("errorMessage: "+errorMessageElement);
		
	}
	
	

}
