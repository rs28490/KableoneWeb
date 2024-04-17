package PageObjects;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codeborne.selenide.impl.WebElementsCollectionWrapper;

import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.AppiumBy;
public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/ivSearch\"]")
	WebElement SearchBtn;
	@FindBy(id = "com.kableone.tveverywhere:id/headerTitle")
	WebElement HeaderTitle;
	@FindBy(xpath = "(//androidx.cardview.widget.CardView[@resource-id=\"com.kableone.tveverywhere:id/imageCardView\"])[3]/android.widget.RelativeLayout")
	WebElement MovieList;
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.kableone.tveverywhere:id/searchViewET\"]")
	WebElement SearchBox;
	String ActualResult= "Treanding Search";
	String MovieName="25 kille";
    @FindBy(id= "com.kableone.tveverywhere:id/viewMoreTV")
    WebElement SeeAllBtn;
    @FindBy(id = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/moviesTv\"]")
    WebElement MovieTab;
    @FindBy(className = "//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/title\" and @text=\"ROMANTIC\"]")
    WebElement listname;
    @FindBy(className = "android.widget.RelativeLayout")
    WebElement ListSize;
    @FindBy (xpath = "(//android.widget.TextView[@resource-id=\"com.kableone.tveverywhere:id/viewMoreTV\"])[1]")
    WebElement SeeAll1stList;

    String LastMovieListName="FAMILY DRAMA";
    
	public HomePage() {
		 PageFactory.initElements(driver, this);
		 }
	
	public void Log() throws InterruptedException {
		
		LoginPage page = new LoginPage();
		page.LogIn("bhanusingunisys@gmail.com", "123456");
	}



     public void ValidateSearchBtn() throws InterruptedException {
    	  ActionClass.click(driver, SearchBtn);
    	  //ActionClass.selectByIndex(MovieList, 2);
    	  Thread.sleep(2000);
}
     public boolean IsSearchBoxPresent() { 
    	return ActionClass.isDisplayed(driver, SearchBox);
     
     }
     
    public void OpenMovieTab(){
    	ActionClass.click(driver, MovieTab);
    }
    //taking screenshots
    public void TakeScreenShot() throws IOException {
		
		
		File file= driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:/Users/Bhanu-Pratap/git/repository/kableone/Screenshots/image3.png"));

	}
    
    /*public void Scroll() {
    	 PointOption pointStart = PointOption.point(0,700);	   
 	    PointOption pointEnd = PointOption.point(0,100);
		TouchAction action = new TouchAction(driver);
		action.longPress(pointStart).moveTo(pointEnd).release().perform();
    
    }*/
    
    public void ScrollVertically(String playlistname) {
    	if (!playlistname.isEmpty()) {
			String playListScroll = String.format(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
					playlistname);
			driver.findElement(AppiumBy.androidUIAutomator(playListScroll)).click();
		}else
			System.out.println("playlist not exist");
  
    }
    public void getlistsize() throws InterruptedException {
    	
    	ActionClass.click(driver, SeeAll1stList);
    	System.out.println("clicked perform");
    	//List<WebElement>lsists=driver.findElements(By.className("android.widget.RelativeLayout"));
     //System.out.println("the size of the list is "+ lsists);
     Thread.sleep(2000);
    	
    }
    
    public void getElementToFile()
    {
    	List<WebElement> allCheckBoxes=driver.findElements(By.className("android.widget.TextView"));
    	

        for (WebElement mobileElement:allCheckBoxes) {
            System.out.println(mobileElement.getText());
          
        
        }

    }
    
}