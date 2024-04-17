package PageObjects;
import java.awt.Robot;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.zeromq.ZStar.Set;

import com.neilalexander.jnacl.crypto.xsalsa20;

import ActionClass.ActionClass;
import BaseClass.BaseClass;
import dev.failsafe.internal.util.Assert;
import io.appium.java_client.android.nativekey.KeyEvent;

public class IndexPage extends BaseClass {
	//@FindBy(xpath = "//span[normalize-space()='SIGN IN']")
	//WebElement SignInBtn;
   @FindBy(xpath = "//a[@class='btn-signin']")
   WebElement SignInBtn;
   @FindBy(xpath = "//div[@class='d-flex gap-3 gap-xl-0 align-items-center']//img[@alt='streamit']")
   WebElement Logo;
   @FindBy(xpath = "//h5[normalize-space()='Coming Soon']")
   WebElement MoviesLists;
   @FindBy(xpath = "//button[@id='loadMoreBtn']")
   WebElement loadMoreBtn;
   @FindBy(xpath = "//body/main[@class='main-content']/div[1]/div[1]/section[1]/div[1]/a[1]")
   WebElement ViewAllBtn;
   @FindBy(xpath = "//body/main[@class='main-content']/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]")
   WebElement horizentalswipe;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
		
		public LogInPage clicktosigninbtn() {
			
			//ActionClass.scrollByVisibilityOfElement(driver, LoaddmoreBtn);
			ActionClass.click(driver, SignInBtn);
			return new LogInPage();
		}
		
		
		public boolean VerifyLogo() {
			ActionClass.isDisplayed(driver, Logo);
			return true;
			
		}
		public String ValidateTitle() {
			String TitleName="Home";
			String IndexPageTitle=driver.getTitle();
			System.out.println(IndexPageTitle);
			return IndexPageTitle;
		}
		
			public static void FindList() {
				{
			    	List<WebElement>tabs=driver.findElements(By.tagName("h5"));		
			    	WebElement q;
			       
			    	/*for (WebElement mobileElement:allCheckBoxes) {
		            System.out.println(mobileElement.getText());
		            //System.out.println(mobileElement.getSize());
		        }*/
			    	System.out.println(tabs.size());
			    	for(int i=0;i<=tabs.size();i++) {
			    		q=tabs.get(i);
			    		System.out.println(q.getText());
			    		
			    	}   	
			}
		}

        public void Scroll() {
        	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        	jse1.executeScript("window.scrollBy(0,900)"); 
        	//ActionClass.click(driver, horizentalswipe);
        
        
        	
        }
        
        public void ScrollByName() {
        	ActionClass.scrollByVisibilityOfElement(driver, loadMoreBtn);
        	
        }
        
        public void ClickToLoadmore() {
        	ActionClass.click(driver, loadMoreBtn);
        }



	
	
	}
	 


