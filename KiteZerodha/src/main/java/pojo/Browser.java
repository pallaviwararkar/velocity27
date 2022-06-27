package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static WebDriver openBrowser() {
	System.setProperty("webdriver.chrome.driver","E:\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	return driver ;
	
	
	
	
	
	
}	

}