package PageObjects;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
public class Movies extends BaseClass{
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/moviesTv\"]")
	WebElement MovieTabBtn;
	
	public Movies() {
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToMovie() throws InterruptedException {
		ActionClass.click(driver, MovieTabBtn);
		Thread.sleep(2000);
		
	}
	 public void LazyloadingVertically(String playlistName) {
		 if (!playlistName.isEmpty()) {
			String playListScroll = String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))", playlistName);
			driver.findElement(AppiumBy.androidUIAutomator(playListScroll)).click();
			System.out.println(playListScroll);

		} else
		{
			System.out.println("LazyLoading not Perform");
		} 
	}
	public void PullToRefresh() throws InterruptedException {
	
	    	 PointOption pointStart = PointOption.point(0,100);	   
	 	    PointOption pointEnd = PointOption.point(0,800);
			TouchAction action = new TouchAction(driver);
			action.longPress(pointStart).moveTo(pointEnd).release().perform();
			Thread.sleep(2000);
			
	}
	}
			
	


