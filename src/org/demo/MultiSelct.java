package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelct {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(" https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();
        Thread.sleep(3000);
         // to select multiple option we are using this website while inspecting tagname
        // has multiple word in it.. but multiple will not be there in facebook
      
        WebElement o= driver.findElement(By.xpath("//*[contains(text(),'Profile Picture')]"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].scrollIntoView()",o);
        Thread.sleep(2000);
        

        WebElement t =driver.findElement(By.name("selenium_commands"));
        
       Select s= new Select (t);
         boolean m = s.isMultiple();
        System.out.println(m);
        
        s.selectByIndex(1);
       s.selectByVisibleText("Wait Commands");	
	//s.selectByValue("1");
	
	//s.deselectByVisibleText("Wait Commands");
	//s.deselectAll();
       Thread.sleep(2000);
     System.out.println(s.getFirstSelectedOption());  
     
     s.getAllSelectedOptions(); 
     
       
	}
}
