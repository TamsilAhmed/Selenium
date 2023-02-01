package seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronitation {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
	System.out.println("Ok " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))));
	System.out.println("Ok " + wait.until(ExpectedConditions.attributeContains(element, "name", "q")));
	System.out.println("Ok " + wait.until(ExpectedConditions.elementSelectionStateToBe(By.name("q"), true)));
		
		
	}

}
