package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.codeborne.selenide.impl.JavaScript;

import ActionClass.ActionClass;
import BaseClass.BaseClass;

public class LogInPage extends BaseClass {
	
	
	@FindBy(xpath = "//input[@id='mobile_code']")
	WebElement UsernameField;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement PasswordField;
	@FindBy(xpath = "//button[@id='btn-submit']")
	WebElement LogInBtn;
	@FindBy(xpath = "//a[@class='btn-signin']")
	WebElement SignInBtn;
	@FindBy(xpath = "//div[@class='lobibox-notify-msg']")
	WebElement maxdevicetoast;
	@FindBy(xpath = "//a[@class='text-primary fw-semibold fst-italic']")
	WebElement forgotbtn;
	@FindBy(xpath = "//input[@id='mobile_code']")
	WebElement forgtfield;
	@FindBy(xpath = "//span[@class='button-text']")
	WebElement getnewpasswordbtn;
	@FindBy(xpath = "//a[@class='text-primary ms-1']")
	WebElement registerBtn;
	@FindBy(xpath = "//input[@id='Name']")
	WebElement RegFieldUsername;
	@FindBy(xpath = "//div[@class='iti__selected-dial-code']")
	WebElement selectcountrycode;
	@FindBy(xpath = "//span[contains(text(),'India (भारत)')]")
	WebElement indiafromlist;
	@FindBy(xpath = "//input[@id='mobile_code']")
	WebElement RegFieldEmailMobNo;
	@FindBy(xpath = "//select[@id='CountryDropdown']")
	WebElement RegSelectCountry;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement RegFieldPass;
	@FindBy(xpath = "//button[@id='get-otp']")
	WebElement RegBtn;
	@FindBy (xpath = "//input[@id='rememberme']")
	WebElement RememberMeBtn;
	@FindBy(xpath = "//input[@id='Name']")
	WebElement Yourname;
	@FindBy(xpath = "//input[@id='mobile_code']")
	WebElement RegisterMobNo;

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login() throws InterruptedException {
		ActionClass.click(driver, SignInBtn);
		Thread.sleep(2000);
		ActionClass.type(UsernameField,prop.getProperty("Username"));
		ActionClass.type(PasswordField,prop.getProperty("password"));
		ActionClass.click(driver, LogInBtn);
		Thread.sleep(3000);
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://kableone.com/";
			Assert.assertEquals(actualurl, expectedurl);
		}
	public void ValidateForgotBtn() throws InterruptedException
	{
		ActionClass.click(driver, SignInBtn);
		Thread.sleep(3000);
		ActionClass.click(driver, forgotbtn);
		Thread.sleep(3000);
		String actualurl=driver.getCurrentUrl();
	    String expectedurl="https://kableone.com/Forgot/Index";
		Assert.assertEquals(actualurl, expectedurl);	
	}
	public void GenerateNewPassword() throws InterruptedException {
		ActionClass.type(forgtfield, prop.getProperty("Username"));
		ActionClass.click(driver, getnewpasswordbtn);
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://test.kableone.com/Forgot/verifiedOtp";
		Thread.sleep(3000);
		Assert.assertEquals(actualurl, expectedurl);
		
	}
	public void ValidateRegisterLink() throws InterruptedException {
		ActionClass.click(driver, SignInBtn);
		Thread.sleep(3000);
		ActionClass.click(driver, registerBtn);
		Thread.sleep(2000);
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://kableone.com/Auth/Reg";
		Assert.assertEquals(actualurl, expectedurl);
		Thread.sleep(2000);
	}
	public void RegisterUser() throws InterruptedException {
		String countryname=prop.getProperty("countryname");
		ActionClass.type(Yourname, prop.getProperty("Yourname"));
		ActionClass.type(RegisterMobNo, prop.getProperty("registermobno"));
		
		 ActionClass.click(driver, RegSelectCountry);
		 WebElement Element = driver.findElement(By.name("countryname"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
	}
	public boolean validateRememberBtn() throws InterruptedException {
		Thread.sleep(2000);
		ActionClass.click( driver,SignInBtn);
		Thread.sleep(2000);
		if(RememberMeBtn.isSelected()) {
			System.out.println("troggle button is clicked");
		}
		else
		{
			System.out.println("troggle button was unclicked now trying to click");
			ActionClass.click(driver, RememberMeBtn);
			if(RememberMeBtn.isSelected()) {
				System.out.println("troggle btn clicked now");
				return true;
			}
			
		}
		return false;
	}
	
	
	}
	


