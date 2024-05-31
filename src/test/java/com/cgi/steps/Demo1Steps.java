package com.cgi.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		System.out.println("when"+username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		System.out.println("when"+password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		System.out.println("login");
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
