package seleniumlearning;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class exambles {

	
	@Test
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
		
		WebElement button = driver.findElement(By.xpath("//input[@id='login-button']"));
		button.click();
		
		String page1 = driver.getWindowHandle();
		Set<String>page2=driver.getWindowHandles();
		for(String address:page2) {
			if(!address.contentEquals(page1)) {
				System.out.println(address);
				driver.switchTo().window(address);
				break;
			}
			
		}
		
		WebElement product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		product1.click();

		WebElement product2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		product2.click();
		
		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();
		
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='first-name']"));
		fname.sendKeys("Tamsil");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='last-name']"));
		lname.sendKeys("Ahmed");
		
		WebElement code = driver.findElement(By.xpath("//input[@id='postal-code']"));
		code.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
		submit.click();
		
		WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();
		
		String text = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	
		AssertJUnit.assertEquals(text, "THANK YOU FOR YOUR ORDER");
	}
}
