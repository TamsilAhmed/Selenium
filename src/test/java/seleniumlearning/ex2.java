package seleniumlearning;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex2 extends base1 {
	
WebDriver driver;
	@Test
	public void test() throws Exception {

		WebElement Email = driver.findElement(By.xpath("//input[@UserName='email']"));
		Email.sendKeys("admin@phptravels.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("demoadmin");

		WebElement login = driver.findElement(By.xpath("//button[@data-wow-duration='2s']"));
		login.click();

		String open = driver.getWindowHandle();
		System.out.println(open);

		Set<String> next = driver.getWindowHandles();
		System.out.println(next);

		for (String Address : next)
			if (!Address.contentEquals(open)) {
				System.out.println("The next open window is " + Address);
				driver.switchTo().window(Address);
			}

		WebElement drawer = driver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-icon')]"));
		drawer.click();

		Thread.sleep(2000);

		WebElement car = driver.findElement(By.xpath("//a[contains(@aria-controls,'carsmodule')]"));
		car.click();

		Thread.sleep(2000);

		WebElement traverse = driver
				.findElement(By.xpath("//a[contains(@aria-controls,'carsmodule')]//following::a[1]"));
		traverse.click();

		Thread.sleep(2000);

		WebElement transfer = driver.findElement(By.xpath("//a[@href='https://phptravels.net/api/admin/cars']"));
		transfer.click();
		Thread.sleep(2000);

		WebElement order = driver.findElement(By.xpath("//input[@id='order_8']"));
		System.out.println(order.getAttribute("value"));

	}

	@Test
	public void order() throws Exception {

		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("admin@phptravels.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("demoadmin");

		WebElement login = driver.findElement(By.xpath("//button[@data-wow-duration='2s']"));
		login.click();

		String open = driver.getWindowHandle();
		System.out.println(open);

		Set<String> next = driver.getWindowHandles();
		System.out.println(next);

		for (String Address : next)
			if (!Address.contentEquals(open)) {
				System.out.println("The next open window is " + Address);
				driver.switchTo().window(Address);
			}

		WebElement drawer = driver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-icon')]"));
		drawer.click();

		Thread.sleep(2000);

		WebElement car = driver.findElement(By.xpath("//a[contains(@aria-controls,'carsmodule')]"));
		car.click();

		Thread.sleep(2000);

		WebElement traverse = driver
				.findElement(By.xpath("//a[contains(@aria-controls,'carsmodule')]//following::a[1]"));
		traverse.click();

		Thread.sleep(2000);

		WebElement transfer = driver.findElement(By.xpath("//a[@href='https://phptravels.net/api/admin/cars']"));
		transfer.click();
		Thread.sleep(2000);

//		WebElement order = driver.findElement(By.xpath("//input[@id='order_8']"));
//		System.out.println(order.getAttribute("value"));

		WebElement element = driver.findElement(By.xpath("//input[@id='discount_7']"));
		element.getAttribute("Value");
		Assert.assertEquals(element.getAttribute("Value"), "10");

	}

}
