package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class HomePageObjects extends BaseClass {

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")
	private WebElement dresses;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")
	private WebElement tshirts;

	@FindBy(id = "newsletter-input")
	private WebElement newsletter;

	@FindBy(name = "submitNewsletter")
	private WebElement submit;

	@FindBy(xpath = "//p[@class='alert alert-danger']")
	private WebElement message;

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTabs() {
		//driver.navigate().to("http://automationpractice.com/index.php");
		women.isDisplayed();
		dresses.isDisplayed();
		tshirts.isDisplayed();
	}

	public void navigation() {
		//driver.navigate().to("http://automationpractice.com/index.php");
		women.click();
		dresses.click();
		tshirts.click();
	}

	public void subscription() {
		driver.navigate().to("http://automationpractice.com/index.php");
		newsletter.sendKeys("skumarscse@gmail.com");
		submit.click();
	}
	public String display() {
		return message.getText();
	}
	
}
