package org.aero;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Farme {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver ();
	 driver.navigate().to(" https://demo.guru99.com/test/guru99home/");
	 driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement scroll = driver.findElement(By.xpath("//*[text() = 'Email Submission']"));
	JavascriptExecutor i = (JavascriptExecutor)driver;
	i.executeScript("arguments[0].scrollIntoView()", scroll);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("natraj95@gmail.com");
	
	i.executeScript("window.scrollBy(0,-120)");
	Thread.sleep(2000);
	
	driver.switchTo().frame("a077aa5e"); //a077aa5e this is frame id which v got from webelement of the image
	driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
	driver.switchTo().parentFrame(); //doubt
	 
 List<WebElement>dx = driver.findElements(By.tagName("iframe")); // finelements plural is used because there may be more number of frames
	System.out.println(dx.size()); // to find the numbr of iframes
//	
}
}
