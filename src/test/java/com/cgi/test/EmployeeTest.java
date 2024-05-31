package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;

public class EmployeeTest extends AutomationWrapper {
	
	@Test
	public void addValidEmployeeTest()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//click on PIM
		//click on add employee
		//enter firstname, lastname, middlename
		//click on save
		//assert the firstname lastname
	}
}
