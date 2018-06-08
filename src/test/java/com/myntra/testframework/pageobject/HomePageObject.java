package com.myntra.testframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject {

	@FindBy(xpath="//a[@class='desktop-main' and text()='Men']")
	WebElement manlink;
	
	@FindBy(xpath="//a[@class='desktop-main' and text()='Women']")
	WebElement womenLink;
	
	@FindBy(xpath="//a[@class='desktop-main' and text()='Kids']")
	WebElement KidsLink;
	
    @FindBy(xpath="//a[@class='desktop-main' and text()='Home & Living']")
    WebElement Home_LivingLink;

	public WebElement getManlink() {
		return manlink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getKidsLink() {
		return KidsLink;
	}

	 public WebElement getHome_LivingLink() {
		return Home_LivingLink;
	}


	
    
}
