package Day6_HandsOn;

import org.testng.annotations.Test;

public class TestClassTwo {

	@Test
	public void testTwo() 
	{
        System.out.println("Executing testTwo in TestClassTwo: " + Thread.currentThread().getId());
    }
}
