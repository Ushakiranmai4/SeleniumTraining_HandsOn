package Day6_HandsOn;

import org.testng.annotations.Test;

public class ParallelExecutionForTest {

	@Test
    public void testA()
	{
        System.out.println("Executing testA: " + Thread.currentThread().getId());
    }

    @Test
    public void testB() 
    {
        System.out.println("Executing testB: " + Thread.currentThread().getId());
    }

    @Test
    public void testC()
    {
        System.out.println("Executing testC: " + Thread.currentThread().getId());
    }
}
