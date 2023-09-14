package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascrit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement q=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement r=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement s=driver.findElement(By.name("login"));
		
		JavascriptExecutor o= (JavascriptExecutor)driver;
		o.executeScript("arguments[0].setAttribute('value','natraj@gmail.com')",q);
		o.executeScript("arguments[0].setAttribute('value','nattu100')",r);
		//o.executeScript("arguments[0].click()",s);
		 
		
	//this is scroll by pixel (0,250)
	o.executeScript("window.scrollBy(0,250)"); //+ve value 250 for scroll down
	Thread.sleep(3000);
	o.executeScript("window.scrollBy(0,-200)");//-ve value for scroll up
		
	//for scrolling upto specified point. scroll by pixel
		//o.executeScript("arguments[0].scrollIntoView()",celebrity); this is scrolling uusing webelement try later
		
	}

}
