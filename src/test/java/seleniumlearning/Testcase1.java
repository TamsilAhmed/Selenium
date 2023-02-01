package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void start() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	public void search1() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("4+4");
		element.sendKeys(Keys.ENTER);
         String result = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
         Assert.assertEquals(result, "8");
	}
	@Test(dependsOnMethods = {"search1"})
	public void search2() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("5+2");
		element.sendKeys(Keys.ENTER);
         String result = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
         Assert.assertEquals(result, "8");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
