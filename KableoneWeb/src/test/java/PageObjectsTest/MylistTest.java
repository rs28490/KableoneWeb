package PageObjectsTest;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.MylistPage;

public class MylistTest extends BaseClass {
	MylistPage list;
	@Test
	public void data() {
		MylistPage list=new MylistPage();
		list.excell();
	}

}
