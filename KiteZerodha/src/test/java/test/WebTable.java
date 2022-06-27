package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pojo.Brows;

public class WebTable {
	public static void main(String[] args) {
	WebDriver driver=Brows.openBrowser("https://demo.guru99.com/test/web-table-element.php");
	WebElement stock=driver.findElement(By.xpath("//table//tbody//tr[14]//td[4]"));
	String name = stock.getText();
	System.out.println(name);
	WebElement company = driver.findElement(By.xpath("//table//tbody//tr[4]"));
	String companyname = company.getText();
	System.out.println(companyname);
	
	
	
	}

}
