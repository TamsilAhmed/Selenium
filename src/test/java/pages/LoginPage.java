package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseClass;

public class LoginPage extends baseClass {
	@FindBy(xpath="//input[@name='email']")
	WebElement name;
	
	@FindBy(xpath ="//input[@name='password']")
	WebElement pass;
	
	@FindBy(xpath = "//button[@data-wow-duration='2s']")
	WebElement loginButton;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
public void login(String LoginUsername, String Password) {
	name.sendKeys(LoginUsername);
	pass.sendKeys(Password);
	loginButton.click();
}
}
