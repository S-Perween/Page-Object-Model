package testpageobjmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjmodel.pom;

public class testpom {
	
	@Test
	public void verifywikisearch() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		pom wiki =new pom(driver);
		
		Thread.sleep(2000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total link is : "+ links.size());
		for(WebElement gettinglink:links  ) {
			System.out.println("The name of link is "+ gettinglink.getText()+" --- and URL is "+gettinglink.getAttribute("href"));
			
		}
		
		wiki.enterword();
		wiki.searchbar();
		
		driver.quit();
	}

}
