package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
	private By addEmployeeLocator=By.linkText("Add Employee");
	
	private WebDriver driver;

	public PIMPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
}
