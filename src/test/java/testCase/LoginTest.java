package testCase;

import org.testng.annotations.Test;

import base.baseClass;
import pages.LoginPage;

public class LoginTest extends baseClass{
	@Test
	public void login1() {
		
		LoginPage lp = new LoginPage();
		lp.login("admin@phptravels.com", "demoadmin");
	}
	@Test
public void login2() {
		
		LoginPage lp = new LoginPage();
		lp.login("admin@phptravels.com", "demoadmin");
	}
	@Test
public void login3() {
	
	LoginPage lp = new LoginPage();
	lp.login("admin@phptravels.com", "demoadmin");
}
}
