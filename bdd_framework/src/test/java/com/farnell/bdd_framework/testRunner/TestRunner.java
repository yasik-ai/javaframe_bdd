package com.farnell.bdd_framework.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "resources/features", glue = { "com/farnell/bdd_framework/stepDefinitions" }, plugin = {
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }, monochrome = true, dryRun = false)

public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	
	@Test(groups = "cucumber", description = "Run Cucumber Tests")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}

}
