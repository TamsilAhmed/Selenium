package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datamanipu {
	
	WebDriver driver;
	@BeforeMethod
	public void startup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@DataProvider(name="key")
public Object[][] setup(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Tamsil";
		data[0][1] = "ahmed";
		
		data[1][0] = "Aasir";
		data[1][1] = "moorthy";
		
		return data;

		
	}
	@Test(dataProvider = "key")
	public void test(String keyword, String exresult) {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exresult);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
