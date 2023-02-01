package seleniumlearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
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

}
