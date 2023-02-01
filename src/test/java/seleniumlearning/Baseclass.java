package seleniumlearning;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	@BeforeMethod
	public void startup() throws Exception {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
		prop.load(fs);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		browserLaunch(browser);
		
		
		System.out.println("getting the current directory path : "+System.getProperty("user.dir"));
		System.out.println("Browser from property file : " + browser);
		System.out.println("url from property file : " + url);
		

		driver.get(url);

	}

	private void browserLaunch(String browserName) {

		switch (browserName) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

	}

	@AfterMethod
	public void closeUp() {
		driver.quit();
	}

}
