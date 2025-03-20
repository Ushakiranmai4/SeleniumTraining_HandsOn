package Day6_HandsOn;

import org.testng.annotations.Test;

public class TestClassOne {

	@Test
	public void testOne() 
	{
        System.out.println("Executing testOne in TestClassOne: " + Thread.currentThread().getId());
    }
}
