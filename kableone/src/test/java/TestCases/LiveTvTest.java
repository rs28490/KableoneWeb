package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LiveTv;

public class LiveTvTest extends BaseClass{
	
	LiveTv livetv;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	@Test(priority = 0)
	public void pulltorefresh1() throws InterruptedException {
		livetv=new LiveTv();
		livetv.NevigateToLiveTv();
		livetv.pulltorefresh1();
	}
	@Test(priority = 1)
	public void FindList() throws InterruptedException {
		livetv=new LiveTv();
		livetv.FindList();
		
	}

}
