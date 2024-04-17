package PageObjectsTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.LogInPage;

public class LoginTest extends BaseClass {
	
	
	@FindBy(xpath = "//button[@id='loadMoreBtn']")
	   WebElement loadMoreBtn;
	
	
	LogInPage login;
	LoginTest logintest;
	@BeforeTest
	public void LaunchApp() {
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	@Test
	public void register() throws InterruptedException {
		login=new LogInPage();
		login.ValidateRegisterLink();
		login.RegisterUser();
	}
		@Test
		public void login() throws InterruptedException {
			LogInPage login=new LogInPage();
			 login.Login();
		}
		@Test
		public void validateforgotbtn() throws InterruptedException {
			login=new LogInPage();
			login.ValidateForgotBtn();
		}
		@Test
		public void generatenewpass() throws InterruptedException {
			login=new LogInPage();
			//logintest=new LoginTest();
			logintest=new LoginTest();
			logintest.validateforgotbtn();
			Thread.sleep(2000);
			login.GenerateNewPassword();			
		}
		@Test(enabled = false)
		public void validateregisterlink() throws InterruptedException {
			login =new LogInPage();
			login.ValidateRegisterLink();
			login.RegisterUser();
			Thread.sleep(3000);
		}
		
		@DataProvider(name="data")
		public Object[][] data()throws Exception {
			
			FileInputStream file=new FileInputStream("./Testdata/sheet1.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet1=workbook.getSheet("loginsheet");
			int noofdata=sheet1.getPhysicalNumberOfRows();
			Object[][] data=new Object [noofdata][2];
			
		}
		@Test
		public void validateremembermebtn() throws InterruptedException {
			login=new LogInPage();
			login.validateRememberBtn();
			
		}
		@Test
		public void play() throws InterruptedException {
			login=new LogInPage();
			login.Login();
			Actions act=new Actions(driver);
			act.scrollToElement(loadMoreBtn).perform();
			Thread.sleep(2000);
		}
}
