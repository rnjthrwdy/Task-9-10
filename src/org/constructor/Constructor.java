package org.constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Constructor {

public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\eclipse-workspace\\Ranjithrajan\\driver\\chromedriver.exe");
	
	WebDriver a=new ChromeDriver();

	
	a.manage().window().maximize();
	
	
	
}
}
