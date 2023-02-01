package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsLearning {
@Test
public void AlertsInformative() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
	WebElement ele = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
	ele.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
}
@Test
public void AlertsTextRead() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
	WebElement ele = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
	ele.click();
	Thread.sleep(2000);
	System.out.println(driver.switchTo().alert().getText());
	Assert.assertEquals("I am an example for alert box!", driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
}
@Test
public void AlertsDecisionMaking() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
	WebElement ele = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
	ele.click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
}
@Test
public void AlertsPassingValue() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
	WebElement ele = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
	ele.click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("Come");
	driver.switchTo().alert().accept();
}
}