package TesterDoHere;

import org.testng.Assert;
import org.testng.annotations.Test;
import DevelopersDoHere.DemoApp;

public class TestApp {

	@Test
	public void testlogin1()
	{
		DemoApp myapp=new DemoApp();
		Assert.assertEquals(0, myapp.userLogin("abc", "abc123")); //Failed Testcases as Password is incorrect
	}
	
	@Test
	public void testlogin2()
	{
		DemoApp myapp=new DemoApp();
		Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));	// Success Testcases as Both Username & Password are Correct
	}
	
}
