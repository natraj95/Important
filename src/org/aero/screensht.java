package org.aero;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screensht {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot y = (TakesScreenshot)driver;
		
		File s = y.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\NATARAJAN\\workspace\\Eclipse\\Sele\\screen jar\\evil.png");
		FileUtils.copyFile(s,d); // open the image with system editor
		
	}

}
