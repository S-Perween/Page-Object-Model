package testcasePOMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMwithPageFactory.PomandPageFactory;
import browserselection.baseclass;

public class testingPOMwithPageFactory {
	
	
@Test
public void wikiuser() {
	
	// to launch specific browser with url
	WebDriver driver = baseclass.startbrowser("Firefox", "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
	
	//Created page object using page factory
	PomandPageFactory login= PageFactory.initElements(driver, PomandPageFactory.class); //  PomandPageFactory.class return object of same class(PomandPageFactory with login)
	
	//call the method
	 login.signup_wiki("admin123", "admin099");
	 driver.close();
		
	}
	
	
}
