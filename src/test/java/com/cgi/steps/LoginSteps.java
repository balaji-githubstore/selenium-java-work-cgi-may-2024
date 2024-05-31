package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class LoginSteps {
	
	private AutomationWrapper wrapper;
	private LoginPage login;
	private DashboardPage dashboard;
	
	public LoginSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
	}
	
	@Given("I have browser with orange hrm application")
	public void i_have_browser_with_orange_hrm_application() {
		wrapper.driver = new ChromeDriver();
		wrapper.driver.manage().window().maximize();
		wrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
		initPages();
	}
	
	public void initPages()
	{
		login=new LoginPage(wrapper.driver);
		dashboard=new DashboardPage(wrapper.driver);
	}
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
//		wrapper.driver.findElement(By.name("username")).sendKeys(username);
		 
		login.enterUsername(username);	
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		//wrapper.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		login.enterPassword(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		wrapper.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("I should access to dashboard with title {string}")
	public void i_should_access_to_dashboard_with_title(String expectedValue) {
//		System.out.println("Then"+expectedValue);
		String actualValue = dashboard.getQuickLaunchHeader();
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	@Then("I should not get access to dashboard with error {string}")
	public void i_should_not_get_access_to_dashboard_with_error(String expectedError) {
	   System.out.println("validate error "+expectedError);
	}

}
