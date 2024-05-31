package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo4SalesForce {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		
		//driver.findElement(By.name("UserLastName")).sendKeys("john");
		driver.findElement(By.xpath("//input[contains(@id,'UserLastName')]")).sendKeys("wick");
		
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		//selectCountry.selectByVisibleText("United Kingdom");
		selectCountry.selectByValue("GB");
		
		Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("IT Manager");
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		
		
	}

}
