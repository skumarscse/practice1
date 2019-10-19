package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class ProductPageObjects extends BaseClass{
	
	@FindBy(xpath = "//div[@class='columns-container']//div[@class='product-container']")
	private WebElement product;
	
	@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[@class='btn btn-default btn-twitter']")
	private WebElement twitter;
	
	@FindBy(xpath = "//div[@id='short_description_content']")
	private WebElement shortdescp;
	
	public ProductPageObjects() {
		PageFactory.initElements(driver, this);
	}
	public void verifyTwitter() {
		driver.navigate().to("http://automationpractice.com/index.php");
		product.click();
		twitter.isDisplayed();
	}
	public void verifydescrip() {
		shortdescp.isDisplayed();
	}
}
	