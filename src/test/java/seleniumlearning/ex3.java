package seleniumlearning;

import java.util.Set;
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

public class ex3 {
WebDriver driver;
	
	@BeforeMethod
	public void start() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	@Test
	public void test() throws Exception {
		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/login");
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("user@phptravels.com");
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.xpath("//div[@class='btn-box pt-3 pb-4']//following::button[1]"));
		login.click();
		
		String parentpage = driver.getWindowHandle();
		System.out.println(parentpage);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		
		for(String address:child) {
			if(!address.contentEquals(parentpage)) {
				System.out.println("The address of recent page " + address);
				driver.switchTo().window(address);
			}

			WebElement link = driver.findElement(By.linkText("Transfers"));
			link.click();
			
			WebElement d1 = driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		    d1.click();
            WebElement d11 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
            d11.sendKeys("Delhi");
            WebElement d = driver.findElement(By.xpath("//li[@data-select2-id='26']"));
            Actions action = new Actions(driver);
            action.moveToElement(d).build().perform();
         
            
            
            
            		}
		
		
}
	@AfterMethod
	public void close() throws Exception {
		Thread.sleep(3000);
		//driver.close();
	}
}