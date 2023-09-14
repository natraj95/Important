package org.aero;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acton {
	  
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			 
			WebElement t =driver.findElement(By.xpath("//span[text()='Prime']"));
			Thread.sleep(2000);
			 Actions e = new Actions(driver);
			 
         e.moveToElement(t).build().perform();
         
      
           e.click(t).build().perform();
            
           
           WebElement i =driver.findElement(By.xpath("//*[contains(@class,'a-button a')]"));
           e.click(i).build().perform();
           e.sendKeys("natraj@gmail.com").build().perform();
           Thread.sleep(2000);
           e.doubleClick().build().perform();
           Thread.sleep(2000); 
          // e.contextClick().build().perform();
           
           
           Robot r = new Robot();
//          r.keyPress(KeyEvent.VK_DOWN);
//          r.keyRelease(KeyEvent.VK_DOWN);
//          Thread.sleep(2000);
//          r.keyPress(KeyEvent.VK_DOWN);
//          r.keyRelease(KeyEvent.VK_DOWN);
//          Thread.sleep(2000);
//          r.keyPress(KeyEvent.VK_ENTER);
//          r.keyRelease(KeyEvent.VK_ENTER);
           
           r.keyPress(KeyEvent.VK_TAB);
           r.keyRelease(KeyEvent.VK_TAB);
           r.keyPress(KeyEvent.VK_ENTER);
           r.keyRelease(KeyEvent.VK_ENTER);
           

}
}