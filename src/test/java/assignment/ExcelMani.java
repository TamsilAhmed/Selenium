package assignment;

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

public class ExcelMani {
	
	WebDriver driver;
	@BeforeMethod
	public void Start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:/www.google.com");
	}
	
	@DataProvider(name="keyword")
	public Object[][] Excel() throws Exception{
		String Projectpath = System.getProperty("user.dir");
		System.out.println(Projectpath);
		XSSFWorkbook workBook = new XSSFWorkbook(Projectpath + "/ExcelFile/Textdata.xlsx");
		XSSFSheet workSheet = workBook.getSheetAt(0);
		int rowcount = workSheet.getRow(0).getPhysicalNumberOfCells();
		int noOfColumn = workSheet.getPhysicalNumberOfRows();
		
		Object[][] data = new Object[rowcount][noOfColumn];
		
		String keyword;
		int result;
		
		for(int i=1;i<rowcount-1;i++) {
			keyword = workSheet.getRow(i).getCell(0).getStringCellValue();
			result = (int)workSheet.getRow(i).getCell(1).getNumericCellValue();
			data[i][0] = keyword.toString();
			data[i][1] = String.valueOf(result);
		}
		
		return data;
	}
	
@Test(dataProvider="keyword")
public void test(String data,String expresult) {
	
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys(data + "\n");
	String acresult = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
	Assert.assertEquals(acresult, expresult);
	
}
@AfterMethod
public void close() {
	driver.close();
}
}
