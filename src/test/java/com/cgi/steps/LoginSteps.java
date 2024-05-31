package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cgi.base.AutomationWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I have browser with orange hrm application")
	public void i_have_browser_with_orange_hrm_application() {
		AutomationWrapper.driver = new ChromeDriver();
		AutomationWrapper.driver.manage().window().maximize();
		AutomationWrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AutomationWrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		AutomationWrapper.driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		AutomationWrapper.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		AutomationWrapper.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("I should access to dashboard with title {string}")
	public void i_should_access_to_dashboard_with_title(String expectedValue) {
		System.out.println("Then"+expectedValue);
	}
	
	@Then("I should not get access to dashboard with error {string}")
	public void i_should_not_get_access_to_dashboard_with_error(String expectedError) {
	   System.out.println("validate error "+expectedError);
	}

}
