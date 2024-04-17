package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/navigation_bar_item_icon_view\"])[4]")
	WebElement ProfileTab;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Click here to manage your account.\"]")
	WebElement LogInLink;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/logo\"]")
	WebElement LogoName;
	String title="kableone";
	
	public IndexPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	public LoginPage NevigateToLogInPage() throws InterruptedException {
		ActionClass.click(driver, ProfileTab);
		Thread.sleep(2000);
		ActionClass.click(driver, LogInLink);
		return new LoginPage();
		
	}
	
	public String ValidateLogo() {
		
		ActionClass.isDisplayed(driver, LogoName);
		return title;
	}
	public void screenshot() {
	      driver.pressKey(new KeyEvent()
	    	      .withKey(AndroidKey.VOLUME_DOWN)
	    	      .withKey(AndroidKey.POWER));  	
	}
}


	
	
	
	
	

