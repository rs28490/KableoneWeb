package PageObjects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class MylistPage extends BaseClass{
	
	public MylistPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void excell() {
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("data_sheet");
		
	}

}
