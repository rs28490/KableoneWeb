/**
 * 
 */
package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ActionDriver.ActionClass;
import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;

/**
 * 
 */
public class RegisterPageTest extends BaseClass {
	
	RegisterPage registerpage;
	LoginPage loginpage;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	@Test(priority = 1)
	public void Registration() throws InterruptedException {
		registerpage=new RegisterPage();
		loginpage=new LoginPage();
		loginpage.NevigateToLogin();
		registerpage.NavigateToRegisterPage();
		Thread.sleep(1000);
		registerpage.Validatetitle();
		registerpage.RegisterUser();
		loginpage=new LoginPage();
		loginpage.CountrySelection();
		Thread.sleep(5000);
		
	}
	@Test(priority = 0)
	public void validatebackbtn() throws InterruptedException {
		loginpage=new LoginPage();
		registerpage = new RegisterPage();
		loginpage.NevigateToLogin();
		
		registerpage.ValidateBackBtn();
	}
	@Test
	public void Validatetitle() {
		registerpage=new RegisterPage();
		registerpage.Validatetitle();
	}

}
