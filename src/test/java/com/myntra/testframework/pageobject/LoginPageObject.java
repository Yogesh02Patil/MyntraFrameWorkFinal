package com.myntra.testframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	
	
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	WebElement YourAccountLink;

	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	WebElement mouseover;
	
	@FindBy(xpath="//a[@class='desktop-linkButton' and text()='login']")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@class='desktop-linkButton' and text()='Sign up']")
	WebElement SignUpButton;

	public WebElement getYourAccountLink() {
		return YourAccountLink;
	}

	public WebElement getMouseover() {
		return mouseover;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getSignUpButton() {
		return SignUpButton;
	}


}
