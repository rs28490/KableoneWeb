package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ActionDriver.ActionClass;
import Base.BaseClass;

public class ForgotPassword extends BaseClass {
	
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/navigation_bar_item_icon_view\"])[4]")
	WebElement ProfileTab;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Click here to manage your account.\"]")
	WebElement LogInLink;
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/forgotPasswordTV\"]")
	WebElement ForgotPasswordBtn;
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\"com.kableone.tveverywhere:id/rlClickConsumer\"]")
	WebElement CountrySelectionList;
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/userMobileNumberET\"]")
	WebElement ForgotPasswordField;
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.kableone.tveverywhere:id/submit\"]")
	WebElement SendOtpBtn;
	String Userid="rs284909@gmail.com";
	
	 public ForgotPassword() {
	 PageFactory.initElements(driver, this);
	 }
	public void NevigateToForgotPassword() throws InterruptedException{
		ActionClass.click(driver, ProfileTab);
		Thread.sleep(2000);
		ActionClass.click(driver, LogInLink);
		Thread.sleep(2000);
		ActionClass.click(driver, ForgotPasswordBtn);
		Thread.sleep(2000);
		ActionClass.selectByValue(ForgotPasswordField, "rs284909@gmail.com");
		Thread.sleep(2000);
		ActionClass.type(ForgotPasswordField, Userid);
		ActionClass.click(driver, SendOtpBtn);	
	}
}
