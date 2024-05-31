package com.cgi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/feature/"}
		,glue = {"com.cgi.steps","com.cgi.base"}
		,publish = false
		,plugin = {"html:target/cucumber-report.html"}
		,tags = "@employee"
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

	
}
