/**
 * 
 */
package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.IndexPage;
import PageObjects.LoginPage;

/**
 * 
 */
public class HomePageTest extends BaseClass {
	
	HomePage homepage;
	LoginPage loginpage;
	IndexPage indexpage;
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
		Thread.sleep(5000);
	}
	@Test(enabled = false)
	public void LogIn() throws InterruptedException {
		LoginPageTest log=new LoginPageTest();
		log.LogIn();
		Thread.sleep(5000);
	}
	@Test(enabled = false)
	public void Validate() {
		homepage=new HomePage();
		homepage.IsSearchBoxPresent();
		
	}@Test(enabled = true)
	public void ScrollVertically() throws IOException, InterruptedException {
		
		homepage=new HomePage();
		//homepage.ScrollVertically(prop.getProperty("lastmovielistnameinhometab"));
		homepage.getlistsize();
		Thread.sleep(2000);
	}
	@Test(enabled = false)
	public void getlistSize() {
		homepage=new HomePage();
		homepage.getElementToFile();
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
}
