package org.aero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seed {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.amazon.in/");
	String a = driver.getTitle();
	System.out.println(a);





}
}
