package BaseClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 //public static AndroidDriver driver;
	 public static Properties prop;
	 public static WebDriver driver;
	 
	 
	 @BeforeTest
	public void launchApp() {
		 readCofig();
		 
		WebDriverManager.chromedriver().setup();
		String browsername = prop.getProperty("browsername");
		
		if(browsername.contains("Chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.contains("Firefox"))
		{
			driver=new FirefoxDriver();	
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}

	public void readCofig(){
		try {
			prop =new Properties();
			FileInputStream fs =new FileInputStream(System.getProperty("user.dir")+"/Configuration/Config1.properties");
				prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
