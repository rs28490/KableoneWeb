package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.android.AndroidTouchAction;

public class RegisterPage extends BaseClass {
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/newUserRegistrationTv\"]")
	WebElement RegisterNowBtn;
	@FindBy(id = "com.kableone.tveverywhere:id/backBtnIV")
	WebElement BackBtn;
	@FindBy(id = "com.kableone.tveverywhere:id/userFirstName")
	WebElement NameField;
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/userMobileNumberET\"]")
	WebElement EnterEmailPasswordField;
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/userPasswordET\"]")
	WebElement EnterPassworField;
	@FindBy (xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/confirmUserPasswordET\"]")
	WebElement EnterConfirmPasswordField;
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/registerBtn\"]")
	WebElement RegisterBtn;
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\"com.kableone.tveverywhere:id/toolbar\"]/android.widget.ImageView[2]")
	WebElement FormTitle;
	@FindBy(id = "com.kableone.tveverywhere:id/facebookSignIn")
	WebElement FacebbokApi;
	@FindBy(id = "com.kableone.tveverywhere:id/googleSignIn")
	WebElement GoogleApi;
	@FindBy(id = "com.kableone.tveverywhere:id/backBtnIV")
	WebElement RegisterBackBtn;
	
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
  public void NavigateToRegisterPage() {
	  ActionClass.click(driver, RegisterNowBtn);
	  System.out.println("Successfully Reached to RegisterPage");
  }
  
  
  public void RegisterUser() {
	  ActionClass.type(NameField, "ABC By APPIUM");
	  ActionClass.type(EnterEmailPasswordField, "1234567811");
	  ActionClass.type(EnterPassworField, "qwerty");
	  ActionClass.type(EnterConfirmPasswordField, "qwerty");
  }
  
  public boolean Validatetitle(){
		 return ActionClass.isDisplayed(driver, FormTitle);
		  
	  }
  public void ValidateBackBtn() {
	  ActionClass.click(driver, RegisterBackBtn);
	 ActionClass.isDisplayed(driver, RegisterNowBtn);
	  
  }
	  
  }

