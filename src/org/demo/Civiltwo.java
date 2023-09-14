package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Civiltwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver ();
	driver. navigate(). to ("https://www.facebook.com/");
	
	WebElement a = driver.findElement(By.id("email"));//email, pass,login appears there in fb inspect area
	a.sendKeys("natrajnagaraj95@gmail.com");
	Thread.sleep(3000);
	WebElement b=driver.findElement(By.name("pass")); // webelement is a return type here...
	b.sendKeys("dreamcivil");
//	WebElement c =driver.findElement(By.name("login"));
//	c.click();
	WebElement c=driver.findElement(By.linkText("Log in"));
	  String o =c.getText();
	  System.out.println(o);
	  WebElement g=driver.findElement(By.partialLinkText("new account"));
	 g.click();
//	 WebElement m=driver.findElement(By.className("_8ice"));
//	 String r =m.getText();
//	  System.out.println(r);
    
	
	 
	
	
	
	
	}
	
	
	
}
