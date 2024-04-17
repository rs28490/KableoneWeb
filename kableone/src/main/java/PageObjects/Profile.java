package PageObjects;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.ActionClass;
import Base.BaseClass;

public class Profile extends BaseClass {
	
	 @FindBy(xpath = " (//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/navigation_bar_item_icon_view\"])[4]")
	
	 WebElement ProfileBtn1;
	 @FindBy(xpath = "//android.widget.TextView[@text=\"LOGIN TO TV\"]")
	 WebElement LoginTvBtn;
	 
	 public void ProfileTab() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 public void GetLoginTvCode() throws InterruptedException, IOException {
		 ActionClass.click(driver, ProfileBtn1);
		 Thread.sleep(5000);
		 ActionClass.click(driver, LoginTvBtn);
		 Thread.sleep(2000);
		String LoginCode=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/otpCodeTV\"]")).getText();
		System.setProperties(prop);
		System.out.println(LoginCode);
		
		
		File file=null;
		file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Bhanu-Pratap\\git\\repository\\kableone\\Screenshots\\image1.png "));
	 }
	 

}
