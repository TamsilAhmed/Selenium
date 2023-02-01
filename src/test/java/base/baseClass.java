package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static WebDriver driver;

	@BeforeMethod
	public void start() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://phptravels.net/admin");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	

	@AfterMethod(timeOut = 3000)
	public void close() {
		 driver.close();
	}
}
