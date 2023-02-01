package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionlearning extends Baseclass{
	
	
	
	
	@Test
	public void AssertEqual() {
		
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "Selenium");
	
	}
	@Test
	public void AssertTrue() {
		
		WebElement element = driver.findElement(By.linkText("Downloads"));
		Assert.assertTrue(element.isDisplayed());
		
	}
	@Test
	public void AssertFalse() {
		
		WebElement element = driver.findElement(By.linkText("Downloads"));
		Assert.assertFalse(element.isDisplayed());
		
	}
	
	@Test
	public void SoftAssertLearning() {
		
		WebElement element = driver.findElement(By.linkText("Downloads"));
	
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Tamsil", "Ahmed");
		sa.assertFalse(element.isDisplayed());
		sa.assertNull(element);
		sa.assertEquals(20, 24);
		sa.assertAll();
		
		
		
	}
}

