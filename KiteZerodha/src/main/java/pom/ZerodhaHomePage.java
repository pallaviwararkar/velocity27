package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="(//span[text()='TATACOFFEE'])")private WebElement TATACOFI;
	@FindBy(xpath="//button[@type='button']")private WebElement buy;
	@FindBy(xpath="//label[@for='radio-130']")private WebElement intraday;
	@FindBy(xpath="//label[@class='su-radio-label']")private WebElement market;
	@FindBy(xpath="//button[@type='submit']")private WebElement finalbuy;
	
	
	public ZerodhaHomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void searchTATA(String searchelement) {
		search.click();
		search.sendKeys(searchelement); 
	}

    public void buyshear (WebDriver driver) {
	Actions a= new Actions(driver);
	a.moveToElement(TATACOFI).perform();
	a.click();
	a.moveToElement(buy);
	a.click();
	a.perform();
	}
	public void itraday(WebDriver driver) {
	Actions b = new Actions(driver);
	b.moveToElement(intraday);
	b.click();
	b.moveToElement(market);
	b.click();
	b.moveToElement(buy);
		b.click();
	}

}



