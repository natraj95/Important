package org.aero;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtble {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement table = driver.findElement(By.xpath("(//table)[2]"));
	WebElement tbody = table.findElement(By.tagName("tbody"));// 1st table.findelement is typed
	
	 List <WebElement> t =tbody.findElements(By.tagName("tr"));// there will be more rows so list of webelement and findelements
       int s =t.size();  //findelements plural bcz more elements are there
       System.out.println(s); //in webelement we cannot find size so v r using list of webelement
       
       
       List <WebElement> trow =tbody.findElements(By.tagName("tr")); //findelements so list of webelement
         for (int i=0; i<trow.size(); i++){ // here v r itterating each and every rows
	     WebElement row = trow.get(i);// vr rgng to iterate upto the row so i<trwo.size
	   List <WebElement>tdata = row.findElements(By.tagName("td"));
	   
	   for (int j =0; j<tdata.size(); j++){ // iterating the datas
		   WebElement data = tdata.get(j);
		   String text = data.getText();
		   System.out.println(text);
		   
	   }
  
	   
   }
	}
}
