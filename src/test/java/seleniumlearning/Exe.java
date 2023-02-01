package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exe {
@Test
		public void Test1(){
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluedart.com/home#transitfinder");
		 WebElement element =  driver.findElement(By.xpath("//input[contains(@id,'sourceLocation')]"));
		 element.sendKeys("Kadayanallur");
		 element.sendKeys(Keys.ENTER);
		
		 element =  driver.findElement(By.xpath("//*[@id='destinationLocation']"));
		 element.sendKeys("Chennai");
		 element.sendKeys(Keys.ENTER);

		 element =  driver.findElement(By.xpath("//input[@id='weightInKg']"));
		   element.sendKeys("40");
		   element.sendKeys(Keys.ENTER);
		   
		   element = driver.findElement(By.xpath("//button[@class='btn']"));
		   element.click();
		   
		   element = driver.findElement(By.xpath("//input[contains(@id,'packages_1')]"));
		   element.sendKeys("15");
		   
		   
		   element = driver.findElement(By.xpath("//input[@id='height_1']"));
		   element.sendKeys("9");
			
		   element = driver.findElement(By.xpath("//input[contains(@id,'length_1')]"));
		   element.sendKeys("10");
			
		   element = driver.findElement(By.xpath("//input[starts-with(@id,'width_1')]"));
		   element.sendKeys("20");
		   
		   element = driver.findElement(By.xpath("//button[contains(@id,'volumeWeightSubmit')]"));
		   element.click();
		}

	}


