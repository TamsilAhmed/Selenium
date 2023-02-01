package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base1;

public class page1 extends base1{

	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath ="//button[contains(@class,'btn btn-default btn-lg btn-block')]")
	WebElement button;
	
	public page1() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void page(String name,String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		button.click();
	}
}
