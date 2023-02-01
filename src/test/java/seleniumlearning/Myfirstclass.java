package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myfirstclass {

	
@Test
 public void Test1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamsil Ahmed\\eclipse-workspace\\SeleniumLearning\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("Selenium \n");
	
	driver.findElement(By.linkText("Images")).click();
	
	element= driver.findElement(By.linkText("Videos"));
	element.click();
	element= driver.findElement(By.linkText("News"));
	element.click();
	

	}
@Test
public void Test2() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/webpage.html");
	List<WebElement> elementList = driver.findElements(By.tagName("label"));
	
	System.out.println(elementList);
	
	for(WebElement e: elementList) {
		System.out.println(e.getAttribute("for"));
		
	}
}
}
