package Day6_HandsOn;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"smoke"})
    public void testA()
	{
        System.out.println("Executing testA - Smoke Test");
    }

    @Test(groups = {"regression"})
    public void testB()
    {
        System.out.println("Executing testB - Regression Test");
    }

    @Test(groups = {"smoke"})
    public void testC() 
    {
        System.out.println("Executing testC - Smoke Test");
    }
}
