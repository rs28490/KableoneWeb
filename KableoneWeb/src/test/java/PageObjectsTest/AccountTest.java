package PageObjectsTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.Account;
import PageObjects.LogInPage;

public class AccountTest extends BaseClass {
	
	LogInPage login;
	LoginTest logintest;
	Account account;
	@BeforeTest
	public void LaunchApp() {
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}@Test
	public void validatesignout() {
		 account=new Account();
		account.ValidateSignoutBtn();
	}
}
