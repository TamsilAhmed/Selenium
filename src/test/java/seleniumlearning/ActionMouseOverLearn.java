package seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMouseOverLearn {
	WebDriver driver;
	@BeforeMethod
	public void Start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rightstartmath.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws Exception {
		
		WebElement menu = driver.findElement(By.xpath("//span[contains(text(),'Curriculum')]"));
		WebElement childmenu = driver.findElement(By.xpath("//span[contains(text(),'Research')]"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		Thread.sleep(2000);
		action.moveToElement(childmenu).doubleClick(childmenu).build().perform();
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
