package PageObjects;

import org.openqa.selenium.support.PageFactory;
import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ChromeCast extends BaseClass {
	public ChromeCast() {
		
		PageFactory.initElements(driver, this);
	}
	public void ValidateChromeCast() {
		ActionClass.click(driver, null);
	}
	  
		public void screenshot() {
		      driver.pressKey(new KeyEvent()
		    	      .withKey(AndroidKey.VOLUME_DOWN)
		    	      .withKey(AndroidKey.POWER));  	
		}
	}


