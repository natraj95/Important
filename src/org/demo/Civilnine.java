package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Civilnine {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe ");
   WebDriver driver = new ChromeDriver();
   driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
   driver.manage().window().maximize();
   
  
  WebElement q1= driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
  WebElement w1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
 

  WebElement q2=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
  WebElement w2= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
  
  WebElement q3=driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
 
  WebElement w3=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
  
  WebElement q4=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
  WebElement w4= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
 

  
  
  Actions s = new Actions (driver);
  s.dragAndDrop(q1, w1).build().perform();
  s.dragAndDrop(q2, w2).build().perform();
  Thread.sleep(3000);
  s.dragAndDrop(q3, w3).build().perform(); 
  s.dragAndDrop(q4, w4).build().perform(); 
  
  WebElement c=driver.findElement(By.partialLinkText("Perfect")); 
  String o =c.getText();
  System.out.println(o);
  
  
 
		
	}

}
