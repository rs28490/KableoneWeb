package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ActionDriver.ActionClass;
import Base.BaseClass;

public class Radio extends BaseClass{
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/navigation_bar_item_icon_view\"])[3]")
	WebElement RadioBtn;
	@FindBy(className = "android.widget.TextView")
	WebElement LiveText;
	@FindBy(xpath = "android.widget.GridView")
	WebElement ChannelList;
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/radioImage\"])[1]")
	WebElement SagaHaryanvi;
	@FindBy(xpath = "com.kableone.tveverywhere:id/miniPlayerTitle")
	WebElement TitleSagaHaryanvi;
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/radioImage\"])[2]'")
	WebElement SikhRatnavali;
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/radioImage\"])[3]")
	WebElement SagaMusic;
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kableone.tveverywhere:id/radioImage\"])[4]")
	WebElement GaintPunjab; 
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.kableone.tveverywhere:id/confirmButton\"]")
	WebElement LogInPopUp;
	@FindBy(xpath = "com.kableone.tveverywhere:id/miniPlayerBtn")
	WebElement PlayPauseBtn;
	
	
	public Radio() {
		PageFactory.initElements(driver,this);
	}	
	public boolean NevigateToRadio() {
		ActionClass.click(driver, RadioBtn);
		System.out.println(LiveText);
		return ActionClass.isDisplayed(driver, LiveText);	
	}
	public void RadioChannelsList() {
		String listsize;
		listsize=driver.findElement(By.className("android.widget.GridView")).getText();
		ActionClass.isDisplayed(driver, ChannelList);
		System.out.println(listsize);	
	}
	public Radio PlayRadio(String ChannelName) throws InterruptedException {
		LoginPage loginpage;
		loginpage=new LoginPage();
		
		ActionClass.click(driver, SagaMusic);
		if(ActionClass.isDisplayed(driver, LogInPopUp))
				{
			ActionClass.click(driver, LogInPopUp);
			loginpage.LogIn(prop.getProperty("validusername"), prop.getProperty("validpassword"));
			Thread.sleep(2000);
			return new Radio();
				}
			else {
				ActionClass.click(driver, SagaMusic);
				Thread.sleep(5000);
				ActionClass.isDisplayed(driver, TitleSagaHaryanvi);				
			}
		return null;		
	}
	public void ValidateRadioBanners() {
		
	}

}
