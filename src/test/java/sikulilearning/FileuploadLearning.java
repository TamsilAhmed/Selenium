package sikulilearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadLearning {
	
	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/image_upload/index.php");
		driver.manage().window().maximize();
		String projectpatch  = System.getProperty("user.dir");

		
		
		Screen sc = new Screen();
		
		Pattern pa = new Pattern(projectpatch + "\\Sikuli_images\\1674968224247.png");
		sc.click(pa);
		
		pa  = new Pattern(projectpatch + "\\Sikuli_images\\1674968978038.png");
		sc.type(pa, projectpatch +"\\Sikuli_images\\1674968978038.png" );
		
		pa =new Pattern(projectpatch + "\\Sikuli_images\\1674968620597.png");
		sc.click(pa);
	}

}
