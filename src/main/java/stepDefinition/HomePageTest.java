package stepDefinition;

import java.util.Objects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePageObjects;
import utility.BaseClass;

public class HomePageTest {
	HomePageObjects hp;
	BaseClass bc;

	public HomePageTest() {
		hp = new HomePageObjects();
	}

	@Given("^Launch application$")
	public void launch_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		bc = new BaseClass();
	}

	@When("^Women dresses tshirts tabs are displayed$")
	public void women_dresses_tshirts_tabs_are_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		hp.verifyTabs();
	}

	@Then("^Validate tabs are present$")
	public void validate_tabs_are_present() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		hp.verifyTabs();
	}

	@When("^Navigate women dresses and tshirts tabs$")
	public void navigate_women_dresses_and_tshirts_tabs() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		hp.navigation();
	}

	@Then("^Validate tabs are navigated$")
	public void validate_tabs_are_navigated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		hp.navigation();
	}

	@When("^Enter email and click submit$")
	public void enter_email_and_click_submit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		hp.subscription();
	}

	@Then("^Display subscription message$")
	public void display_subscription_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Message Displayed:", hp.display().equals("Newsletter : This email address is already registered."));
	}
}
