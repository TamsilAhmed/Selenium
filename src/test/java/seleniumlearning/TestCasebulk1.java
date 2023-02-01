package seleniumlearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasebulk1 {
	
	@Test(groups = {"smoke"})
	public void tc1() {
		Assert.assertEquals(7, 8);
	}
	@Test(groups = {"smoke"})
	public void tc2() {
		Assert.assertEquals(7, 2);
	}
	@Test(groups = {"smoke","sanity"})
	public void tc3() {
		Assert.assertEquals(7, 7);
	}
	@Test(groups = {"smoke"})
	public void tc4() {
		Assert.assertEquals(5, 8);
	}
	@Test(groups = {"sanity"})
	public void tc5() {
		Assert.assertEquals(5, 5);
	}
	@Test(groups = {"sanity"})
	public void tc6() {
		Assert.assertEquals(7, 8);
	}
	@Test(groups = {"smoke","sanity"})
	public void tc7() {
		Assert.assertEquals(7, 8);
	}

}
