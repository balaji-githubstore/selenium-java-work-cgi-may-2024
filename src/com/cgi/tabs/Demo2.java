package com.cgi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin »
		//b[contains(text(),'phpMy')]
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to 2nd tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		//enter password as admin123
		//click on login
		
		driver.close();  //check which tab is getting closed
		
		//switch to 1st tab
		driver.switchTo().window(windows.get(0));
		
		//get the title and print
		System.out.println(driver.getTitle());
		
		driver.quit(); //close the browser
	}
}


