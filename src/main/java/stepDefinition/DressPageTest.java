package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DressPageObjects;
import utility.BaseClass;

public class DressPageTest {
	DressPageObjects dp;
	BaseClass bc;

	public DressPageTest() {
		dp = new DressPageObjects();
	}

	@When("^Click on dress tab$")
	public void click_on_dress_tab() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dp.clickOnDress();
	}

	@Then("^Validate S M L are visible$")
	public void validate_S_M_L_are_visible() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dp.verifySize();
	}
}
