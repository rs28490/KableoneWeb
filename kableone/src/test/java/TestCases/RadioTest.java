package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Radio;

public class RadioTest extends BaseClass{
	Radio radio;
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
		
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
		
	}@Test(priority = 0)
	public void LaunchedRadio() throws InterruptedException {
		 radio=new Radio();
		radio.NevigateToRadio();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void getlist() {
		radio=new Radio();
		radio.RadioChannelsList();
	}@Test(priority = 2)
	public void ValidateBanners() throws InterruptedException {
		radio=new Radio();
		radio.PlayRadio("SagaHaryanvi");
		System.out.println("SagaHaryanvi is playing for 20 secs");
		Thread.sleep(2000);
		radio.PlayRadio("SikhRatnavali");
		System.out.println("SikhRatnavali is playing for 20 secs");
		Thread.sleep(2000);
		radio.PlayRadio("SagaMusic");
		System.out.println("SagaMusic is playing for 20 secs");
		Thread.sleep(2000);
		radio.PlayRadio("GaintPunjab");
		System.out.println("Gaintpunjab is playing for 20 secs");
		Thread.sleep(2000);
		
		
	}

}
