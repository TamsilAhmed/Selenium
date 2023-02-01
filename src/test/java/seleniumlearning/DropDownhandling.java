package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDownhandling {
	@Test
public void Dropdown() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/DropDown.html");
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//select[@name='cars']"));
	Select sel = new Select(element);
	
	sel.selectByIndex(3);
	Thread.sleep(3000);
	
	sel.selectByValue("volvo");
	
	Thread.sleep(3000);
	
	sel.selectByVisibleText("Saab");
	Thread.sleep(3000);
	
	sel.selectByIndex(2);
	
	Thread.sleep(3000);
	
	sel.deselectAll();
	Thread.sleep(3000);
	
	driver.close();
}

}
