package PageObjectsTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.IndexPage;

public class IndexTest extends BaseClass {
	
	IndexPage indexpage;
	@BeforeTest
	public void LaunchApp() {
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
     
	@Test
	public void BrockenLinks() throws InterruptedException {
		     indexpage=new IndexPage();
		indexpage.Scroll();
		//indexpage.ClickToLoadmore();
		     indexpage.FindList();	
		Thread.sleep(5000);
	}

}
 