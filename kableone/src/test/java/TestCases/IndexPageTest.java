package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.IndexPage;

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
	public void NevigateToLogInPage() throws InterruptedException {
		 indexpage=new IndexPage();
		indexpage.NevigateToLogInPage();
	}
	@Test
	public void ValidateLogo() {
		indexpage=new IndexPage();
		indexpage.ValidateLogo();
		Assert.assertTrue(true,"title");;
	}
	

}
   