package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.ActionClass;
import BaseClass.BaseClass;

public class Account extends BaseClass {
	@FindBy(xpath = "//h6[normalize-space()='SignOut']")
	WebElement SignoutBtn;
	
	
	public Account() {
		PageFactory.initElements(driver, this);
	}
	
	public LogInPage ValidateSignoutBtn() {
		ActionClass.click(driver, SignoutBtn);
		return new LogInPage();
			
		
	}
	

}
