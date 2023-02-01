package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	@Test
	public void chechin() {
		
		String month = "August 2023";
		int date = 19;
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://phptravels.net/");
		 
		 WebElement checkin = driver.findElement(By.xpath("//input[@id='checkin']"));
		 checkin.click();
		 
		 String currentdate = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]/thead/tr[1]//th[@class='switch']")).getText();
         System.out.println(currentdate);
         
         WebElement nextarrow = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead/tr[1]//th[@class='next']"));

		 
         while(true) {
        	 if(currentdate.equals(month)) {
        		 System.out.println("The current month is : " + currentdate);
        		 break;
        	 }else {
        		 
        		 nextarrow.click();
        		 currentdate = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]/thead/tr[1]//th[@class='switch']")).getText();
        	 
        	
        	 
        	 }
         }
         WebElement dayToClick = driver.findElement(By.xpath("((//div[@class='datepicker-days']/table)[1]//tr//td[text()='"+date+"'])[1]"));

    	 dayToClick.click();

		
	}

}
