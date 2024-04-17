package PageObjects;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class LiveTv extends BaseClass {
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/navigation_bar_item_icon_view\"])[2]")
	WebElement LiveTvBtn;
	
	
	public LiveTv() {
		PageFactory.initElements(driver, this);
	}
	public LiveTv NevigateToLiveTv() {
		ActionClass.click(driver, LiveTvBtn);
		return new LiveTv();
		
	}
	
  public void FindList()  {
	  
		List<WebElement> lists=driver.findElements(By.className("android.widget.TextView"));
		System.out.println(lists.size());
		for(WebElement e: lists) {
			
			System.out.println(e.getAttribute("text"));
		}
			Dimension dimention=driver.manage().window().getSize();
			int start_x=(int) (dimention.width*0.5);
			int strt_y=(int) (dimention.height*0.8);
			
			int end_x=(int) (dimention.width*0.5);
			int end_y=(int) (dimention.height*0.2);
			
			
			TouchAction touch=new TouchAction(driver);
			touch.press(PointOption.point(start_x, strt_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
			
		}
	
  public LiveTv pulltorefresh1() {
	  
	 
		Dimension dimention=driver.manage().window().getSize();
		  int start_x=(int) (dimention.width*0.5);
			int start_y=(int) (dimention.height*0.2);
			
			int end_x=(int) (dimention.width*0.5);
			int end_y=(int) (dimention.height*0.8);
			
			TouchAction touch=new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
			return new LiveTv();
	
		
	}
	  
  }


    
	
	
