package com.cgi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("bala123445555@gmail.com");
		
		By loc=By.id("email");	
		
		
		WebElement element= driver.findElement(loc);
		
		
		element.sendKeys("bala123445555@gmail.com");
		
		
		driver.findElement(By.id("pass")).sendKeys("welcom123");
		
		driver.findElement(By.name("login")).click();
		
	}
}
