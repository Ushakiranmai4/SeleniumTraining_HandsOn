package Day6_HandsOn;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=2)
	public void testA()
	{
		System.out.println("this is test A");
	}
	
	@Test(priority=3)
	public void testB()
	{
		System.out.println("this is test B");
	}
	
	@Test(priority=1)
	public void testC()
	{
		System.out.println("this is test c");
	}
}
