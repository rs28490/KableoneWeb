package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.IndexPage;
import PageObjects.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginpage;
	IndexPage indexpage;
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	@Test
	public void Loginto() throws InterruptedException {
		 loginpage= new LoginPage();
		 loginpage.NevigateToLogin();
		 loginpage.LogInWithValidCredentials();
		 System.out.println("Successfully Login");
	}
	@Test
	public void validatelogin() throws InterruptedException{
		loginpage.ValidateLogin();
		
	}
	@Test
	public void SelectCountry() throws InterruptedException {
		loginpage=new LoginPage();
		indexpage=new IndexPage();
		indexpage.NevigateToLogInPage();
		Thread.sleep(2000);
		loginpage.CountrySelection();
	}
}
