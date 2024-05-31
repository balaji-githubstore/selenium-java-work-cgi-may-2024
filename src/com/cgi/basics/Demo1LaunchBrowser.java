package com.cgi.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {

		String browser = "edge";
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.get("https://www.facebook.com/");

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		System.out.println(driver.getCurrentUrl());

//		System.out.println(driver.getPageSource());

	}

}
