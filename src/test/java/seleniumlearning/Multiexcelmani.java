package seleniumlearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiexcelmani {
	
	WebDriver driver;
	
	@BeforeMethod
	public void start() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}
	
	@Test(dataProvider = "keywordgenerator")
	public void test(String name, String exvalue) {
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(name + "\n");
		String actualResult = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
		Assert.assertEquals(actualResult, exvalue);
		
	}
	
	
	
	
@DataProvider(name = "keywordgenerator")
public Object[][] test1() throws Exception{
	
	String projectpath = System.getProperty("user.dir");
	System.out.println(projectpath);
	
	XSSFWorkbook workBook = new XSSFWorkbook(projectpath + "/ExcelFile/Textdata.xlsx");
	XSSFSheet workSheet = workBook.getSheetAt(1);
	int noOfColumns = workSheet.getRow(0).getPhysicalNumberOfCells();
	int rowCount = workSheet.getPhysicalNumberOfRows();
	
	System.out.println(noOfColumns);
	System.out.println(rowCount);
	

	Object[][] data = new Object[rowCount][noOfColumns];

	String keyword;
	int result;

	for (int i = 1; i < rowCount - 1; i++) {
		keyword = workSheet.getRow(i).getCell(0).getStringCellValue();
		result = (int) workSheet.getRow(i).getCell(1).getNumericCellValue();
		data[i][0] = keyword.toString();
		data[i][1] = String.valueOf(result);

	}
	return data;
}

@AfterMethod
public void close() {
	driver.quit();
}

}


