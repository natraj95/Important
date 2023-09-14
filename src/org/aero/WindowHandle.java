package org.aero;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// we are using try catch here bcz separate login tab opens here so to avoid it we are using try catch
	// try catch is not always used in windows handling
	
	try{
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		}
	catch (Exception e){
		System.out.println("user id");
	}
	 driver.findElement(By.name("q")).sendKeys("samsung a12");
	 driver.findElement(By.xpath("//*[@type='submit']")).click();
	 Thread.sleep(2000);
	
	 driver.findElement(By.xpath("(//*[contains(text(),'SAMSUNG Galaxy A12')])[1] ")).click();
	 
	 String parent = driver.getWindowHandle(); // the selected item will be opened in another tab
	 Set<String> child = driver.getWindowHandles(); // v r using set here bcz it ignores duplicates. v dont want duplicate child window
 // list will be used for many tabs  
	 
	 for (String x:child){               //for parent -window handle.. using string here bcz it is url
		 if(!parent.equals(x)){          //for child - window handles bcz more tabs can be opened
			 driver.switchTo().window(x);  // ! equals means not equals
			 // if parent !equals child then switch to child
			 
			 //writing the above code to switch driver from parent to child window
			 // after switching we can get text or do something in child window
			 //v cant get text from child window without switching the driver
			 
			 WebElement sep = driver.findElement(By.xpath("//*[text()='Sold Out']"));
			 System.out.println(sep.getText());
			 
			 driver.switchTo().window(parent);//now it will switch to parent window
			 driver.close();// it will close the parent window..
		 }
	 }
	 
	}
}
 
