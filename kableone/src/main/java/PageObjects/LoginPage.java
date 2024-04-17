package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codeborne.selenide.commands.IsDisplayed;

import ActionDriver.ActionClass;
import Base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/navigation_bar_item_icon_view\"])[4]")
	WebElement ProfileTab;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Click here to manage your account.\"]")
	WebElement LogInLink;
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\"com.kableone.tveverywhere:id/rlClickConsumer\"]")
	WebElement CountrySelectionList;
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/userMobileNumberET\"]")
	WebElement EmailPasswordField;
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/userPasswordET\"]")
	WebElement PasswordField;
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/signInBtn\"]")
	WebElement SignInBtn;
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/userNameTV\"]")
	WebElement UserNameValidation;
	@FindBy(xpath = "//android.widget.TextView[@text=\"ACCOUNT\"]")
	WebElement AccountBtn;
    @FindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\"com.kableone.tveverywhere:id/rlClickConsumer\"]")
    WebElement CountrySelectionListBtn;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/editText_search\"]")
    WebElement SearchBoxForCountrySearch;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/textView_countryName\" and @text=\"India (IN)\"]")
    WebElement CountrySelectIndia;
    @FindBy (xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/local_src\"])[9]")
    WebElement logoutbtn;

    
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);     
		
	}
	public void navigatetologin() {
		ActionClass.click(driver, ProfileTab);
		ActionClass.click(driver, LogInLink);
		driver.manage().timeouts().getPageLoadTimeout();
	}
 }
	 
	
 

