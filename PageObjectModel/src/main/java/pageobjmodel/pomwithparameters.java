package pageobjmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomwithparameters {
	
	
    WebDriver driver;
	
	By enterwiki = By.className("vector-search-box-input");
	By search = By.id("searchButton");
	
	public  pomwithparameters(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void wikipediasearch(String word) {   // to make code simple instead of writing public void again for another options  
		driver.findElement(enterwiki).sendKeys(word);
		driver.findElement(search).click();
	}
	
//	public void enterword(String word) {
//		
//		driver.findElement(enterwiki).sendKeys(word);
//	}
//
//	public void searchbar() {
//		driver.findElement(search).click();
//	}
}



