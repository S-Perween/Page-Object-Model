package POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PomandPageFactory {
	
	WebDriver driver;
	
	public PomandPageFactory(WebDriver Ldriver) {   // whatever we will recieve from Ldriver of page factory local driver it will initialize with driver 
		this.driver= Ldriver;
	}
	
	
	@FindBy(xpath="// input[@id =\"wpName1\"]") WebElement username;
	
	@FindBy( how = How.XPATH, using="// input[@id =\"wpPassword1\"]") 
	@CacheLookup    // we use this when we are sure about webelement not changing as it stores all the weblement in cache memory(it does not check for webelement written in code as it takes from cache memory)
	WebElement password;   //how is dynamic variable
	
	@FindBy(how = How.XPATH, using ="//button [@name=\"wploginattempt\"]") WebElement submit ;
	
	
	public void signup_wiki(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		submit.click();
	}
	
	

}
