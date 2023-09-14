package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class civilthree {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
       driver.findElement(By.xpath("//span [@class='_1Mikcj']")).click();
//webElement q= driver.findElement(By.xpath("//input[@class='loginCont__input']"));

//return type is always not needed..instead we can type like this to send keys or click or to do something
        driver.findElement(By.xpath("//input [@class='_3704LK']")).sendKeys("7010136816"); 
driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("preethipratheeba@gmail.com");
}
}
