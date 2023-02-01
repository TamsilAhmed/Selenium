package sikulilearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadLearning {
	
	@Test
	
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		String projectpath = System.getProperty("user.dir");
		Screen sc = new Screen();
		Pattern pa = new Pattern(projectpath + "\\sources\\1674976443466.png");
		sc.click(pa);
		
		pa = new Pattern(projectpath + "\\sources\\1674976468458.png");
		sc.type(pa, projectpath + "\\sources\\1674976468458.png");
		
		pa = new Pattern(projectpath + "\\sources\\1674976482576.png");
		sc.click(pa);
	
	}

}
