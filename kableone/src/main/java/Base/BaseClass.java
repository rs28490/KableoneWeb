package Base;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	 public static AndroidDriver driver;
	 public static Properties prop;
	@BeforeTest
	public void Setup(){
		
		 try {
			
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(CapabilityType.PLATFORM_NAME, "android");
		caps.setCapability("VERSION", "11"); 
		caps.setCapability("deviceName","Mi9");            
		caps.setCapability("appPackage", "com.kableone.tveverywhere");
		caps.setCapability("appActivity","com.kableone.tveverywhere.MainActivity");
		caps.setCapability("noReset", "true");
		
			URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver(remoteUrl, caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			 
		} catch (MalformedURLException e) {
			System.out.println("cause is:"+e.getCause());
			System.out.println("message is:"+e.getMessage());
			e.printStackTrace();
		}
	}
	@Test()
	public void AppLaunched() throws InterruptedException {
	
	System.out.println("Kableone App Launched");
	Thread.sleep(5000);
	
	}
	
	
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(20000);
		driver.quit();
	}
	public void Login() {
		// TODO Auto-generated method stub
		
	}
	
}
