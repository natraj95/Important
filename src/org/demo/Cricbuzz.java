package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	driver.navigate(). to("https://www.amazon.in/");
	WebElement b=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	b.click();
	WebElement a = driver.findElement(By.id("ap_email"));//email, pass,login appears there in fb inspect area
	a.sendKeys("natrajnagaraj95@gmail.com");
			
	
	WebElement r = driver.findElement(By.id("continue"));
    r.click();
    
    WebElement s=driver.findElement(By.name("password")); // webelement is a return type here...
	s.sendKeys("dreamcivil");
//	 WebElement q=driver.findElement(By.id("signInSubmit"));
//    q.click();
	WebElement c=driver.findElement(By.linkText("Forgot Password"));
	  String o =c.getText();
	  System.out.println(o);

}




}
