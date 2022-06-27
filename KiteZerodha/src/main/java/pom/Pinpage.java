package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pinpage {

@FindBy(xpath="//input[@id='userid']")private WebElement userid;
@FindBy(xpath="//input[@type='password']")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement submit;
@FindBy(xpath="//input[@id='pin']")private WebElement pin;
@FindBy(xpath="//button[@type='submit']")private WebElement continues;


public Pinpage (WebDriver driver) {
	PageFactory.initElements(driver,this);
    }
    public void enterid(String id,WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));
	wait.until(ExpectedConditions.visibilityOf(userid));
	userid.sendKeys(id);
    }
	public void enterpass(String pass) {
		password.sendKeys(pass);	
    }
	public void clickonlogin() {
		submit.click();
	}	
	public void enterpin(String pinnumber) {
	pin.sendKeys(pinnumber);
    }
	public void clickcontinue() {
	continues.click();	
	}

	   
}









	
	
	
	
	
