package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ActionDriver.ActionClass;
import Base.BaseClass;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;

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

	public HomePage() {
		 PageFactory.initElements(driver, this);
		 }
	
	public void Log() throws InterruptedException {
		
		LoginPage page = new LoginPage();
		page.LogInWithValidCredentials();
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
}