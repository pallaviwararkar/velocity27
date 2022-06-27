package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaLogin {
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgetpass;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	
	
	public zerodhaLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
}
public void enterid(String id) {
	userid.sendKeys(id);
}
	public void enterpass(String pass) {
		password.sendKeys(pass);	
}
	public void clickonlogin() {
		submit.click();
}
public void clickonforgetpass() {
	forgetpass.click();
}
public void clickonsignup() {
	signup.click();
}

}
	
	
	

