package seleniumlearning;

import org.testng.Assert;
import org.testng.annotations.Test;

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
