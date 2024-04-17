package Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Compare extends BaseClass{
	
	public Compare() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateurl(String Expectedurl,WebDriver driver, WebElement ele) {
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(Expectedurl)){
			flag=true;
		}else
		{
			flag=false;
		}return flag;
	}
	
}
