package flexonfromework.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	public static WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement inputEmail;
	
	@FindBy(xpath="//input[@name='pass']")
	public WebElement inputPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement login;

	
	public void signIn() {
		login.click();
		
	}

	

}
