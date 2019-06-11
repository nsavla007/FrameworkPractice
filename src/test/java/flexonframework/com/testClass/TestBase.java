package flexonframework.com.testClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialzeThis() throws IOException{
		System.out.println("in before test");
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("/Users/neelsavla/Desktop/FlexonNotes/Eclipes_notes/framework/src/test/java/resources/utilities.properties");
		prop.load(fis);
		String browserName= prop.getProperty("webBrowser");
		String urlName=prop.getProperty("URL");
		int impliWait=Integer.parseInt(prop.getProperty("implicitWaitTime"));
		
		if(browserName.contains("chromeG")) {
			 System.setProperty("webdriver.chrome.driver", "/Users/neelsavla/Desktop/FlexonNotes/chromedriver");
		     WebDriver driver = new ChromeDriver();
		}
		else if(browserName.contains("FireFox")) {
			
		}
	
	}



}
