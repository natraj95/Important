package org.demo;

import java.util.List;      // select by value
                            //select by index
                            //select by visible text //anything can be used from three
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seletc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		
		w.navigate().to("https://www.facebook.com/");
		w.manage().window().maximize();
		
		w.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement day=w.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		s.selectByIndex(11);
		Thread.sleep(3000);
	
		WebElement month=w.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByValue("6");
		Thread.sleep(3000);
		
		WebElement year = w.findElement(By.name("birthday_year"));
		Select s2= new Select(year);
		s2.selectByVisibleText("1995");
		Thread.sleep(3000);
		
		List<WebElement> options = s1.getOptions();
		for (WebElement n:options){
			System.out.println(n.getText());		
		}
	}
}
		
	


