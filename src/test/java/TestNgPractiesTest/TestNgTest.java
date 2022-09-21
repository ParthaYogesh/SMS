package TestNgPractiesTest;

import org.testng.annotations.Test;

public class TestNgTest 
{
	
@Test							//(dependsOnMethods = "step2Test" , alwaysRun=true)
public void step1Test()
{
	System.out.println("Script1");
	//Assert.fail();
}

@Test
public void step2Test()
{
	System.out.println("Script2");
}

}
