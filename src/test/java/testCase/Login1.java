package testCase;

import org.testng.annotations.Test;

import base.base1;
import pages.page1;

public class Login1 extends base1{
	@Test
	public void login() {
		
		page1 login = new page1();
		login.page("agent@phptravels.com", "demoagent");
		
		
	}
	@Test
	public void login1() {
		
		page1 login = new page1();
		login.page("agent1@phptravels.com", "demoagent");
		
		
	}
	@Test
	public void login2() {
		
		page1 login = new page1();
		login.page("agent2@phptravels.com", "demoagent");
		
		
	}

}
