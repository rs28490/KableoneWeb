package Base; 
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codeborne.selenide.commands.IsDisplayed;

import ActionDriver.ActionClass;
import PageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;


public class BaseClass {
	
	@FindBy (xpath = "//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/logo\"]")
	WebElement applogo;
	
	public static AndroidDriver driver;
	public static Properties prop;
	 @BeforeTest
	public void Setup() throws MalformedURLException{
		 
		 {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(CapabilityType.PLATFORM_NAME, "android");
		caps.setCapability("VERSION", "11"); 
		caps.setCapability("deviceName","Mi9");            
		caps.setCapability("appPackage", "com.kableone.tveverywhere");
		caps.setCapability("appActivity","com.kableone.tveverywhere.MainActivity");
		caps.setCapability("noReset", "true");
		
			URL remoteUrl = new URL("http://localhost:4723/wd/hub");
			driver = new AndroidDriver (remoteUrl, caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

			
		
	} }
	 
	@Test
	public void AppLaunch() throws InterruptedException {
		Thread.sleep(8000);
		
		if(ActionClass.isDisplayed(driver, applogo)){
			
			System.out.println("App Launched");
		}else {
			System.out.println("failed to launched");
		}
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	public void readCofig(){
		try {
			prop =new Properties();
			FileInputStream fs =new FileInputStream(System.getProperty("user.dir")+"/Configuration/Config.properties");
				prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		
		}
	}}


