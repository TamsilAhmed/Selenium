package assignment;

import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1 {
	@Test
	
public void ListKeywords () throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Keywords you wanted to give ? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
	
		String keywords = sc.next();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      WebElement element = driver.findElement(By.name("q"));
	      element.sendKeys(keywords);
	      element.sendKeys(Keys.ENTER);
	      
	      List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(@class,' d-ib p-abs')]"));
	
	      for(WebElement element1 : allLinks){
	    	  if(element1.getText()!= "") {
	    		  String text = element1.getText();
	    		  System.out.println(element1.getText());
	    	  }
	    	  
	     
	      
	      
		
	
}
		driver.quit();
	
}
}
}
