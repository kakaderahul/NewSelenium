package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import Utilities.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Readconfig read;
	
	@BeforeClass
    public void setUp() throws IOException {
    	
		 read=new Readconfig();
    	
    	String actualBrowserName="Chrome";
    	System.out.println("actualBrowserName:::"+actualBrowserName);
    	
    	if(actualBrowserName.equalsIgnoreCase("Chrome")) {
    		
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    		
    	}
    	else if(actualBrowserName.equalsIgnoreCase("Firefox")) {
    		
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    		
    		}
    	else
    		System.out.println("Invalid browser Name");
    	
    	
    	
    	
    }
	

}
