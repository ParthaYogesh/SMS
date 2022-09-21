package TestNgPractiesTest;
  
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTest2 
{
	@Test(groups = "regression", retryAnalyzer = org.sdet40.genericUtilty.RetryImplementation.class)
	public void step1Test()
	{
		Assert.fail();
		System.out.println("Script1");
	}

	@Test(groups = {"sanity" , "regression"})
	public void step2Test()
	{
		
		System.out.println("Script2");
	}
	
	}
