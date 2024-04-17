package PageObjectsTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.ContactusPage;
import PageObjects.IndexPage;

public class ContactUsTest extends BaseClass {

	IndexPage indexpage;
	ContactusPage contactus;
	@BeforeTest
	public void LaunchApp() {
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	} 
     @Test
     public void NavigateToContactUs() throws InterruptedException {
    	  contactus=new ContactusPage();
    	  indexpage=new IndexPage();
    	  contactus.NavigateToContactUs();
    	  IndexPage.BrockenLinks(prop.getProperty("contactusurl"));
    	  Thread.sleep(2000);
    	  //indexpage.verifyLink(prop.getProperty("contactusurl"));
    	  //Thread.sleep(2000);
    	 
    
     }

}
