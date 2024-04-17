package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;

import PageObjects.Profile;

public class ProfileTest extends BaseClass{
	LoginPageTest loginPagetest;
	Profile profile;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		AppLaunched();
	}
	public void loginbefore() throws InterruptedException {
		loginPagetest= new LoginPageTest();
		loginPagetest.LogIn();
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	@Test
	public void logintv() throws InterruptedException, IOException {
		profile=new Profile();
		Thread.sleep(5000);
		profile.GetLoginTvCode();  
		
		
		
		
		
	}
}
