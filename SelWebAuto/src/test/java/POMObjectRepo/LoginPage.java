package POMObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;



public class LoginPage {

	WebDriver localDriver;
	public LoginPage(WebDriver driver) {
		
		localDriver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//input[@id='userEmail']") private WebElement email;
	
	@FindBy(xpath="//input[@id='userPassword']") private WebElement password;
	
	@FindBy(xpath="//input[@id='login']") private WebElement loginBtn;
	
	public void enterEmail(String emailid) {
		
		email.sendKeys(emailid);
		
	}
	
	public void enterPassword(String pwd) {
		
		password.sendKeys(pwd);
		
	}
	
	public void clickLoginBtn() {
		
		loginBtn.click();
		
	}
	
	
	
}

   
   
   
