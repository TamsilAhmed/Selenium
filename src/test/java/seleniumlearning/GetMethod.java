package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {

	@Test
	
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ENTER);
		
		System.out.println("The title is " + driver.getTitle());
		System.out.println("The URL " + driver.getCurrentUrl());
	}
	@Test
	public void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='location']"));
		System.out.println(element.getAttribute("placeholder"));
		
		
	}
}
