package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.ForgotPassword;

public class ForgotPasswordTest extends BaseClass {
	ForgotPassword forgotpassword;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	@Test
	public void ForgotPassword() throws InterruptedException {
		 forgotpassword = new ForgotPassword();
		forgotpassword.NevigateToForgotPassword();
	}

}
