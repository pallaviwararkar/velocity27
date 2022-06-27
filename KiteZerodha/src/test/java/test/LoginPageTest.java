package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.zerodhaLogin;
import utility.paramatraisation;
@Listeners(TestListeners.class)
public class LoginPageTest extends BaseTest {
 WebDriver driver ;
 @BeforeMethod
 public void browser() {
	driver= Browser.openBrowser();
}
  @Test
 public void loginWithCredentialsTest() throws EncryptedDocumentException, IOException {
	zerodhaLogin login = new zerodhaLogin(driver);
	String Username = paramatraisation.getData("sheet1", 0, 1);
	String password	= paramatraisation.getData("sheet1",1, 1);
	login.enterid(Username);
	login.enterpass(password);
	login.clickonlogin();
  }	
	
@Test(enabled=false)
public void forgetpasswordlink() {
	zerodhaLogin login = new zerodhaLogin(driver);
	login.clickonforgetpass();
}
@Test(dependsOnMethods="loginWithCredentialsTest")
public void signuplink () {
	zerodhaLogin login = new zerodhaLogin(driver);
	login.clickonsignup();
	
}

		
}
	
 
	
