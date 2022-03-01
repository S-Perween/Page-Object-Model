package testpageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import pageobjmodel.pomwithparameters;

public class testpomwithparameters {
	
	
	@Test
	public void verifywiki() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		pomwithparameters wiki =new pomwithparameters(driver);
//		wiki.enterword("automation testing");
//		wiki.searchbar();
		
		wiki.wikipediasearch("Manual testing");
		
		Thread.sleep(2000);
		
		driver.quit();
	}


}
