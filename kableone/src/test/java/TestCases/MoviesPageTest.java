/**
 * 
 */
package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Movies;

public class MoviesPageTest extends BaseClass {
	Movies movies;
	
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		AppLaunched();
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
    @Test
	public void LazyloadingVertically() throws InterruptedException {
		movies =new Movies();
		movies.NavigateToMovie();
		Thread.sleep(3000);
		//movies.PullToRefresh();
		movies.LazyloadingVertically(prop.getProperty("lastmovielistnameinmovietab"));
		
	}
}
