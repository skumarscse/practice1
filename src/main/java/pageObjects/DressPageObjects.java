package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class DressPageObjects extends BaseClass {

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#size-s']")
	private WebElement small;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#size-m']")
	private WebElement medium;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#size-l']")
	private WebElement large;

	public DressPageObjects() {
		PageFactory.initElements(driver, this);
	}
public void verifySize() {
	small.isDisplayed();
	medium.isDisplayed();
	large.isDisplayed();
}
	
}
