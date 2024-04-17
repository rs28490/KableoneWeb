package PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.ActionClass;
import BaseClass.BaseClass;

public class MoviesPage extends BaseClass {
	@FindBy(xpath = "//a[normalize-space()='Movies']")
	WebElement MovieTabBtn;

	public MoviesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void findlist() throws InterruptedException, IOException {
		ActionClass.click(driver, MovieTabBtn);
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.tagName("h5"));
		String[] listname=new String[list.size()];
		int listcount=0;
		for( WebElement lists:list) {
			if(!lists.getText().isEmpty()){
				System.out.println(lists.getText().replaceAll(" ", ""));
				
				File src=new File("D:\\Eclipse EE Workspace\\KableoneWeb\\OutputData\\Datasheet1.xlsx");
				FileInputStream file=new FileInputStream(src);
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				
				XSSFSheet sheet1=workbook.getSheet("src");
				XSSFRow row=sheet1.getRow(listcount);
				XSSFCell cell=row.getCell(listcount);
				sheet1.getRow(1).getCell(listcount).setCellValue(lists.getText().replaceAll(" ", "")+"---");
				FileOutputStream file1=new FileOutputStream(src);
				workbook.write(file1);
				workbook.close();
			}
		}				
	}
	public void findmovies() throws InterruptedException {
		ActionClass.click(driver, MovieTabBtn);
		Thread.sleep(2000);
		List<WebElement>movielist=driver.findElements(By.className("block-images position-relative w-100"));
		for(WebElement list2:movielist) {
			System.out.println(list2.getText());
			
		}
		
	
		
	}
	public void findlist2() {
		LinkedList<String>list=new LinkedList<String>();
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
