package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductPageObjects;
import utility.BaseClass;

public class ProductPageTest {
	ProductPageObjects po;
	BaseClass bc;

	public ProductPageTest() {
		po = new ProductPageObjects();
	}
	
	@When("^twitter is displayed$")
	public void twitter_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    po.verifyTwitter();
	}

	@Then("^short description displayed$")
	public void short_description_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    po.verifydescrip();
	}
}

