package TestCases;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

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
	public void SetUp() throws InterruptedException, MalformedURLException {
		loginpage.Setup();
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}

	@Test
   public void navigatelogin() {
	   loginpage.navigatetologin();
   }
}
