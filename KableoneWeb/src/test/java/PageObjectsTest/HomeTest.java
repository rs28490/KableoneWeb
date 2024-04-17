package PageObjectsTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.HomePage;
import PageObjects.LogInPage;

public class HomeTest extends BaseClass {
	 HomePage home;
	 LogInPage login;
	 
	 @BeforeTest
	 public void LaunchApp() {
	 }
	 @AfterTest
	 public void TearDown() {
	 	driver.quit();
	 }
	 
	 @Test
	public void findimages() {
	 home=new HomePage();
	 home.findtotalimages();
	 }
	 @Test
	 public void findlinks() {
		 home=new HomePage();
		 home.findtotallinks();
	 }
	 @Test
	 public void findTotallists() throws InterruptedException {
		 home=new HomePage();
		 home.findTotallists();
	 }
	 @Test
	 public void validatelist() throws InterruptedException {
		 home=new HomePage();
		 login=new LogInPage();
		 login.Login();
		 home.validatelist(); 
	 }

}
