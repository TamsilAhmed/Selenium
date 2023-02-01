package selenium.Operrations;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumOperations {
	@Test
	public void FindElements() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamsil Ahmed\\eclipse-workspace\\SeleniumLearning\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium \n");
		
		driver.findElement(By.linkText("Images")).click();
		
		element= driver.findElement(By.linkText("Videos"));
		element.click();
		element= driver.findElement(By.linkText("News"));
		element.click();
		

}
	
	//Test Suite
	@Test
	public void f() {
		System.out.println("This a test case 1");
	}
	@Test
	public void test2() {
		System.out.println("This a test case 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This a before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This a after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This a before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This a after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This a before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This a after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This a before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This a After suite");
	}

	@Test
	public void Horizontal() throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	action.dragAndDropBy(slider, 150, 0).build().perform();
	Thread.sleep(2000);
	action.dragAndDropBy(slider, -110, 0).build().perform();
	

}
	@Test
	public void Vertical() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-vertical']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(slider, 90, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(slider, -90, 0).build().perform();
		
	}
	
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
	
	@Test
	public void AlertsInformative() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	
	//Alerts Learning
	@Test
	public void AlertsTextRead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
		ele.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Assert.assertEquals("I am an example for alert box!", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
	@Test
	public void AlertsDecisionMaking() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void AlertsPassingValue() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tamsil%20Ahmed/eclipse-workspace/SeleniumLearning/HTMLfile/Alerts.html");
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Come");
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void DragAndDrob() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(source, destination).build().perform();
	}
	
	//Assertion Learning
	
	WebDriver driver;

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
	

	@Test
	
	public void GetMathod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ENTER);
		
		System.out.println("The title is " + driver.getTitle());
		System.out.println("The URL " + driver.getCurrentUrl());
	}
	@Test
	public void get() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='location']"));
		System.out.println(element.getAttribute("placeholder"));
		
		
	}

	
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
	
	
	@BeforeMethod
	public void Start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rightstartmath.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws Exception {
		
		WebElement menu = driver.findElement(By.xpath("//span[contains(text(),'Curriculum')]"));
		WebElement childmenu = driver.findElement(By.xpath("//span[contains(text(),'Research')]"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		Thread.sleep(2000);
		action.moveToElement(childmenu).doubleClick(childmenu).build().perform();
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
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
	
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@DataProvider(name="keywords")
	public Object[][] keywordGenerator(){
		Object[][] data = new Object[3][2];
		data[0][0] = "slenium";
		data[0][1] = "selenium - Google Search";	
		
		data[1][0] = "java";
		data[1][1] = "java - Google Search";
		
		data[2][0] = "C#";
		data[2][1] = "C# - Google Search";
		
		return data;
	}
	
	@Test(dataProvider = "keywords")
	public void Selenium(String keyword, String exptitle) {
		driver.findElement(By.name("q")).sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		
		
	}
	@Test(dataProvider = "keywords")
	
	public void java(String keyword,String exptitle) {
		driver.findElement(By.name("q")).sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		

	}
	@Test(dataProvider = "keywords")
	
	public void csharp(String keyword,String exptitle) {
		driver.findElement(By.name("q")).sendKeys(keyword + "\n");
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		
		
	}
	@AfterMethod
	public void close1() {
		driver.close();
		
	}
	
	public class DependsOnMethod {
		
		
		@Test(dependsOnMethods = {"test1"} )
		
		public void test() {
			Assert.assertEquals("True", "false");
		}
	@Test(groups = {"name"})
		
		public void test1() {
			Assert.assertEquals("True", "false");
		}
	
	
}
	@BeforeMethod
	public void startup1() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test(dataProvider = "keywordGenerator1")
	public void testing(String data, String expresult) {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(data + "\n");
		String actualResult = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
		Assert.assertEquals(actualResult, expresult);
	}

	@DataProvider(name = "keywordGenerator1")
	public Object[][] exxcelread() throws Exception {
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project Path is : " + projectpath);
		XSSFWorkbook workBook = new XSSFWorkbook(projectpath + "/ExcelFile/Textdata.xlsx");
		XSSFSheet workSheet = workBook.getSheetAt(0);
		int noOfColumns = workSheet.getRow(0).getPhysicalNumberOfCells();
		int rowCount = workSheet.getPhysicalNumberOfRows();

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
	public void close2() {
		driver.quit();
	}
	@Test
	public void JavaScript() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("hello");
		WebElement but = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", but);

	}
	
	@Test
	public void Syncronitation() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
	System.out.println("Ok " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))));
	System.out.println("Ok " + wait.until(ExpectedConditions.attributeContains(element, "name", "q")));
	System.out.println("Ok " + wait.until(ExpectedConditions.elementSelectionStateToBe(By.name("q"), true)));
		
		
	}
	
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


