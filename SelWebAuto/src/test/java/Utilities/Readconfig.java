package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	
	Properties pr=new Properties();
	
	public Readconfig() throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\WebAutomationTesting\\SelWebAuto\\Config\\config.properties");
		
		pr.load(fis);
	}
	
    public String getBrowserName() {
    	
    	return pr.getProperty("Browser");
    	
    }
	
    public String getBrowserUrl() {
    	
    	return pr.getProperty("BaseUrl");
    }
	
}
