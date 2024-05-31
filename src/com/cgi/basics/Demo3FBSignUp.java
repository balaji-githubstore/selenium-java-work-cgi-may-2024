package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args){
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//findElement - check for presence of element only for 0.5s 
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		
		//findElement - check for presence of element only for 0.5s 
		driver.findElement(By.linkText("Create new account")).click();
		
		//findElement - check for presence of element only for 0.5s 
		driver.findElement(By.name("firstname")).sendKeys("john");
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//click on custom gender
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		//20 Dec 2000
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");	
		
		//select year as 2000
		
	}

}
