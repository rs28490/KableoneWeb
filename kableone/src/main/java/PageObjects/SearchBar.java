package PageObjects;
import java.util.Iterator;
import java.util.LinkedList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SearchBar extends BaseClass{
	
	public SearchBar() {
		PageFactory.initElements(driver, this);
	}
	
	public void findlist() {
		
		LinkedList <String>list=new LinkedList<String>();
		for(WebElement lists:list) {
			
		}
	}

}
