package seleniumlearning;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindowLearn {
	
	WebDriver driver;
	@Test
	public void SwitchWindow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/src/test/java/seleniumlearning/loginpage.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));
		username.sendKeys("Tamsil");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		password.sendKeys("tam");
		Thread.sleep(1000);
		
		String parendwindow = driver.getWindowHandle();
		System.out.println(parendwindow);
		
		WebElement resetpassword = driver.findElement(By.xpath("//a[contains(text(),'Reset Password')]"));
		resetpassword.click();
		
		Set<String>windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		for(String address:windowhandles) {
			if(!address.contentEquals(parendwindow)) {
				System.out.println("The child window address is :" +address );
				driver.switchTo().window(address);
				break;
			}
		}
		
		WebElement newuser = driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));
		newuser.sendKeys("Ahemed");
		WebElement newpassword = driver.findElement(By.xpath("//input[@name='psw']"));
		newpassword.sendKeys("A@123");
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(parendwindow);
		
		
		WebElement username1 = driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));
		username1.sendKeys(" Ahmed");
		Thread.sleep(1000);
		WebElement password1 = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		password1.sendKeys("@123");
		Thread.sleep(1000);
	}

}
