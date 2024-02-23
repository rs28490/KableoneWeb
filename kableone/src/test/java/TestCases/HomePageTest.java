/**
 * 
 */
package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;

/**
 * 
 */
public class HomePageTest extends BaseClass {
	
	HomePage homepage;
	LoginPage loginpage;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	@Test(priority = 0)
	public void login() throws InterruptedException {
		loginpage=new LoginPage();
		loginpage.LogInWithValidCredentials();
		System.out.println("Suceessfully Login");
	}
	@Test(priority = 1)
	public void Validate() {
		homepage=new HomePage();
		homepage.IsSearchBoxPresent();
		
	}

}
