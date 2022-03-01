package pageobjmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {  // for basic pom model
	
	WebDriver driver;
	
	By enterwiki = By.className("vector-search-box-input");
	By search = By.id("searchButton");
	
	public pom(WebDriver driver) {   //its a constructor with same name as class
		
		this.driver = driver;
		
	}
	
	public void enterword() {
		
		driver.findElement(enterwiki).sendKeys("automation testing");
	}

	public void searchbar() {
		driver.findElement(search).click();
	}
}
