package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class DressPageObjects extends BaseClass {

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")
	private WebElement dress;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	private WebElement small;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	private WebElement medium;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	private WebElement large;
	
	@FindBy(xpath = "//ul[@id='homefeatured']//div[@class='product-container']//a[@data-id-product=1]/span[contains(text(),'Add to cart')]")
	private WebElement firstProduct;

	public DressPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnDress() {
		dress.click();
		dress1.click();
	}

	public void verifySize() {
		small.isDisplayed();
		medium.isDisplayed();
		large.isDisplayed();
	}
	public void firstProduct() {
		firstProduct.click();
	}
}
