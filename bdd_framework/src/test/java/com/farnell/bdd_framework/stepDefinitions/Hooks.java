package com.farnell.bdd_framework.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import com.farnell.bdd_framework.enums.Browsers;
import com.farnell.bdd_framework.helper.LoggerHelper;
import com.farnell.bdd_framework.testBase.TestBase;

public class Hooks{

	TestBase testbase;

	Logger logger = LoggerHelper.getLogger(Hooks.class);

	@Before
	public void initializeTest() {
		testbase = new TestBase();
		testbase.selectBrowser(Browsers.CHROME.name());

	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				logger.info(scenario.getName() + " is Failed");

				final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
		} else {
			logger.info(scenario.getName() + " is Passed");
		}
		
		TestBase.driver.quit();
	}
	
}
