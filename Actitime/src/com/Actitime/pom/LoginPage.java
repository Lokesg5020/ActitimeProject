package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement username;
@FindBy(name="pwd")
private WebElement password;
@FindBy(xpath="//div[text()='Login ']")
private WebElement loginButton;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

public void loginPage(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginButton.click();
}
}
