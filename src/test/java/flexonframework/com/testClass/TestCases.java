package flexonframework.com.testClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import flexonfromework.com.pages.Login;

public class TestCases extends TestBase {
	
	@Test(priority=1, dataProvider="newdata")
	public void enterUnamePass(String inputEmail,String inputPassword) throws Exception{
		Login f=PageFactory.initElements(driver, Login.class);
		f.inputEmail.sendKeys(inputEmail);
		f.inputPassword.sendKeys(inputPassword);
		f.signIn();
	}
//	@Test
//	public void test() {
//		Login f=PageFactory.initElements(driver, Login.class);
////		f.inputEmail.sendKeys("nsavla@gmail.com");
////		f.inputPassword.sendKeys("n12345");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nen");
//
//		//f.signIn();
//	}
	@DataProvider(name="newdata")
	public static Object[][] getdata(){
		Object[][] data= new Object[1][2];
		data[0][0]= "nsavla@gmail.com";
		data[0][1]= "nsavla12345";
		return data;
	}

	

}
