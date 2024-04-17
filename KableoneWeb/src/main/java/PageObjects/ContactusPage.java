package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.ActionClass;
import BaseClass.BaseClass;

public class ContactusPage extends BaseClass{
	@FindBy(xpath = "//a[@class='nav-link '][normalize-space()='Contact Us']")
	WebElement ContactUsBtn;
	@FindBy (xpath = "//div[@class='d-flex gap-3 gap-xl-0 align-items-center']//img[@alt='streamit']")
	WebElement kableonelogo;
	
	public ContactusPage() {
		PageFactory.initElements(driver, this);
	}
	public ContactusPage NavigateToContactUs() {
		ActionClass.click(driver, ContactUsBtn);
		return new ContactusPage();
		
	}
	public void validatelogo() {
		
	}
}
