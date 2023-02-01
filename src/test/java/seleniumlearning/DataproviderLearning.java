package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderLearning {
	WebDriver driver;
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@DataProvider(name="keywords")
	public Object[][] keywordGenerator(){
		Object[][] data = new Object[3][2];
		data[0][0] = "slenium";
		data[0][1] = "selenium - Google Search";	
		
		data[1][0] = "java";
		data[1][1] = "java - Google Search";
		
		data[2][0] = "C#";
		data[2][1] = "C# - Google Search";
		
		return data;
	}
	
	@Test(dataProvider = "keywords")
	public void Selenium(String keyword, String exptitle) {
		driver.findElement(By.name("q")).sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		
		
	}
	@Test(dataProvider = "keywords")
	
	public void java(String keyword,String exptitle) {
		driver.findElement(By.name("q")).sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		

	}
	@Test(dataProvider = "keywords")
	
	public void csharp(String keyword,String exptitle) {
		driver.findElement(By.name("q")).sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		
		
	}
	@AfterMethod
	public void close() {
		driver.close();
		
	}

}
