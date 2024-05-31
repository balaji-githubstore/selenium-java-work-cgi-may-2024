package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class EmployeeTest extends AutomationWrapper {
	
	@Test
	public void addValidEmployeeTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//click on PIM
		//click on add employee
		//enter firstname, lastname, middlename
		//click on save
		//assert the firstname lastname
	}
}
