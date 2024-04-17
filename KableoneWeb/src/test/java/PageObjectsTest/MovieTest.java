package PageObjectsTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.MoviesPage;

public class MovieTest extends BaseClass {
	MoviesPage movie;
	@BeforeTest
	public void LaunchApp() {
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	@Test
	public void findlist()throws InterruptedException, IOException {
		MoviesPage movie=new MoviesPage();
		movie.findlist();
		Thread.sleep(3000);
	}
	@Test
	public void findmovies()throws InterruptedException, IOException {
		MoviesPage movie=new MoviesPage();
		movie.findmovies();
		Thread.sleep(3000);
	}
	
	}
		
		


