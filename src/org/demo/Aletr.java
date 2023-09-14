package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aletr {
	 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
	d.manage().window().maximize();
	
	
	d.findElement(By.xpath("//button[contains(text(),'display an  alert box')] ")).click();
	Alert q = d.switchTo().alert();
	q.accept();
	d.findElement(By.xpath("//a[contains(text(),'Cancel')] ")).click();
	d.findElement(By.xpath("//button[contains(text(),'confirm ')] ")).click();
	Thread.sleep(3000);
	
	q.dismiss();
	d.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
	d.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate ')]")).click();
	
    String r =q.getText();
  System.out.println(r);
	q.accept();
		}
}