package flexonfromework.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement inputEmail;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement inputPassword;
	
	@FindBy(xpath="//input[@id='u_0_2']")
	public WebElement login;

	
	public void signIn() {
		login.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
