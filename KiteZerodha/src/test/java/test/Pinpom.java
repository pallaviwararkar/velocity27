package test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Pinpage;
import pom.ZerodhaHomePage;
import utility.paramatraisation;

public class Pinpom {
	 WebDriver driver ;
	 @BeforeMethod
	 public void browser() {
		driver= Browser.openBrowser();
	 }
@Test 
 public void loginWithCredentialTest() throws EncryptedDocumentException, IOException, InterruptedException {
 Pinpage login= new  Pinpage(driver);
 String Username = paramatraisation.getData("sheet1", 0, 1);
 String password	= paramatraisation.getData("sheet1",1, 1);
 login.enterid(Username,driver);
 login.enterpass(password);
 login.clickonlogin();
 Thread.sleep(1000);
 String pin= paramatraisation.getData("sheet1", 2,1);
 login.enterpin(pin); 
 login.clickcontinue();
 Thread.sleep(1000);
 ZerodhaHomePage home= new ZerodhaHomePage (driver);
 String search= paramatraisation.getData("sheet1", 3, 1);
 home.searchTATA(search);
 home.buyshear(driver);
 home.itraday(driver);

 
		
	 }

	
}
