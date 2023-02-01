package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTables {
	

	WebDriver driver;
	
	@BeforeMethod
	public void start() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://datatables.net/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@Test
	public void test() {
		WebElement Example = driver.findElement(By.xpath("//a[contains(text(),'Examples')]"));
		Example.click();
		WebElement config = driver.findElement(By.xpath("//a[contains(text(),'Zero configuration')]"));
		config.click();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		
		List<WebElement> noOfRows = table.findElements(By.tagName("tr"));
		System.out.println("No Of Rows " + noOfRows.size());
		
		int count =1;
		
		for(WebElement tableheader : noOfRows) {
			if(count==1) {
				System.out.println(tableheader + "\t" + "\t" + "\t");
			}
			System.out.println();
			count++;
			
		}
		List<WebElement>noOFcolumn = table.findElements(By.tagName("td"));
		for(WebElement column :noOFcolumn ) {
			System.out.print(column.getText() + "\t" + "\t" + "\t");
		}
			System.out.println();	
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
