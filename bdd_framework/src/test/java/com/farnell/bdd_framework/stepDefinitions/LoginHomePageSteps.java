package com.farnell.bdd_framework.stepDefinitions;

import com.farnell.bdd_framework.pageObjects.LoginHomePage;
import com.farnell.bdd_framework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginHomePageSteps extends TestBase {
	
	LoginHomePage loginPage = new LoginHomePage();
	
	@Given("^User launch browser and navigate to Farnell \"([^\"]*)\" site$")
	public void user_launch_browser_to_navigate_farnell_sites (String url)throws Throwable{
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@When("^User verify and accepts cookies on the page$")
	public void user_verify_and_accepts_cookies_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User landed on Farnell Home Page$")
	public void user_landed_on_Farnell_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User clicks on Register button on home page$")
	public void user_clicks_on_Register_button_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" on register page$")
	public void user_enters_and_on_register_page(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should register successfully on Farnell application$")
	public void user_should_register_successfully_on_Farnell_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
