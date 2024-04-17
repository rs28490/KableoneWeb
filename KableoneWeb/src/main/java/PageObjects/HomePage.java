package PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ActionClass.ActionClass;
import BaseClass.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath = "//button[@id='loadMoreBtn']")
	WebElement LoadmoreBtn;
	@FindBy(xpath = "//body/main[@class='main-content']/div[4]/div[1]/section[1]/div[1]/a[1]")
	WebElement ViewAllBtn;
	
	int NoOfLists = 0;
	public  HomePage() {
		PageFactory.initElements(driver, this);
	
	}
		
	public void findtotalimages() {
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("total images is: "+images.size());
		for(WebElement image:images) {
			System.out.println(image.getAttribute("src"));
		}
	}
	public void findtotallinks() {
		List<WebElement>lists=driver.findElements(By.tagName("a"));
		System.out.println(lists.size());
	
	}
	
	public void findTotallists() throws InterruptedException {
		ActionClass.click(driver, LoadmoreBtn);
		Thread.sleep(2000);
		List<WebElement>lists=driver.findElements(By.tagName("h5"));
		 //ArrayList<WebElement> arr=new ArrayList<WebElement>();
		 //arr=(ArrayList<WebElement>) driver.findElements(By.tagName("h5"));
		String [] plnames = new String[lists.size()];
		int NoOfLists = 0;
		for(WebElement list:lists) {
			if (!list.getText().isEmpty()) {
				Collections.shuffle(lists);
			System.out.println(list.getText().replaceAll(" ", "")+"---");
			plnames[NoOfLists] = list.getText();
			NoOfLists+=1;
			
			}
		}
		System.out.println("Number of the movie lists is....."+NoOfLists);
		//Assert.assertEquals(NoOfLists,prop.getProperty("TotalMovieListsOnHome"));
		Assert.assertEquals(NoOfLists, 15);
		for(int i=0;i<=NoOfLists;i++) {
			System.out.println(i);
		}
		
}
	
	public void validatelist() throws InterruptedException {
		

		   
			List<WebElement>lists=driver.findElements(By.tagName("h5"));
			
			String [] plnames = new String[lists.size()];
			int NoOfLists = 0;
			for(WebElement list:lists) {
				if (!list.getText().isEmpty()) {
				System.out.println(list.getText()+"---");
				plnames[NoOfLists] = list.getText();
				NoOfLists+=1;
				}
			}
			System.out.println("Number of the movie lists is....."+NoOfLists);
			//System.out.println(plnames.length);


	
			if(ActionClass.isDisplayed(driver, ViewAllBtn))
		ActionClass.click(driver, ViewAllBtn);
		 String pagetitle=driver.getTitle();    
		 Thread.sleep(2000);
		List<WebElement>lists1= driver.findElements(By.xpath("//body/main[@class='main-content']/div[@class='section-padding']/div[@class='container-fluid']/div[@class='card-style-grid']/div[@class='row row-cols-xl-5 row-cols-md-2 row-cols-1']/div[2]/div[1]/div[1]/div[1]/a[1]"));
		String [] plnames1= new String[lists1.size()];
		int nomovies=0;
		for(WebElement list:lists1) {
			System.out.println(list.getText());
			plnames1[nomovies]=list.getText();
			nomovies+=1;
			
			
		}
		
}
			
		}


	



