package seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class SliderLearning {
	WebDriver driver;
	@Test
	public void Horizontal() throws Exception {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	action.dragAndDropBy(slider, 150, 0).build().perform();
	Thread.sleep(2000);
	action.dragAndDropBy(slider, -110, 0).build().perform();
	

}
	@Test
	public void Vertical() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-vertical']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(slider, 90, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(slider, -90, 0).build().perform();
		
	}
	
}