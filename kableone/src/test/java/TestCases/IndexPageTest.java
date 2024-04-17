package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.IndexPage;
import PageObjects.LoginPage;

public class IndexPageTest extends BaseClass {
	
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
	public LoginPage NevigateToLogInPage() throws InterruptedException  {
		
			indexpage=new IndexPage();
			indexpage.NevigateToLogInPage();
			Thread.sleep(5000);
			return new LoginPage();
		
	}
	@Test(enabled=false)
	public void ValidateLogo() {
		indexpage=new IndexPage();
		indexpage.ValidateLogo();
		Assert.assertTrue(true,"title");;
	}
	
     @Test
	public void button() {
		indexpage=new IndexPage();
		indexpage.screenshot();
	}
}
   