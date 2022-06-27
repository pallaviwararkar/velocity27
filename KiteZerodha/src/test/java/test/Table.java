package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pojo.Brows;

public class Table {

public static void main(String[] args) {
WebDriver driver=Brows.openBrowser("https://demo.guru99.com/test/web-table-element.php");
List<WebElement> coloum=driver.findElements(By.xpath("//table//thead//tr//th"));
int coloumnsize = coloum.size();
System.out.println(coloumnsize);
List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
int rowsize= row.size();
System.out.println(rowsize);
List<WebElement> currentPrice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
double max = 0;
for(int i = 0;i<currentPrice.size();i++)
{
WebElement price = currentPrice.get(i);
String d = price.getText();
Double value = Double.parseDouble(d);
if(value > max);
{
max = value;
}
}
System.out.println(max);

double min= max;
for(int i=0;i<currentPrice.size();i++) {

WebElement stock = currentPrice.get(i);
String p= stock.getText();
Double baseprice = Double.parseDouble(p);
if(baseprice<min);
{
min = baseprice;
}
}
System.out.println(min);
}
}



