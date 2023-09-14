package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//add library, driver
public class Cicilone {
  public static void main(String[] args) throws InterruptedException { //throws for Thread.sleep
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe" );
	 
	//System.setProperty("key,value); // value comes from driver .
	// right click at driver click properties& copy the location appears there. and paste it here..
	 //key varies for chrome,mozila,ie check notes for syntax of key
	
	  WebDriver driver = new ChromeDriver();
	//  driver.get("https://www.facebook.com/"); //download jar files externally
	  // webdriver is an interface    
	  //driver - object
	  //chromedriver - child class
	   
	 driver.navigate().to("https://www.facebook.com/");
	  //both driver.get and driver.navigate are same but in real time driver.get is used
	 
	 driver.manage().window().maximize ();// will maximize facebook page
	Thread.sleep(3000);//fb maximizes waits for 3 sec then referesh (next code)
	 driver.navigate(). refresh();
	 Thread.sleep(3000);// after refreshing waits fpr 3 sec then it will go back
	 driver.navigate().back();
	 Thread.sleep(3000);// after 3 sec it will comes forward
	 driver.navigate().forward();
     String a =driver.getTitle();
    System.out.println(a);
	String b= driver.getCurrentUrl();
	System.out.println(b);
    String c = driver.getPageSource();
    System.out.println(c);
    
    
}
}