package Day6_HandsOn;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void testLogin()
	{
		System.out.println("Logging in:");
	}
	
	@Test(dependsOnMethods= {"testLogin"})
	public void testAddToCart()
	{
		System.out.println("Adding to Cart:");
	}
	
	@Test(dependsOnMethods= {"testAddToCart"})
	public void testCheckout()
	{
		System.out.println("Checking out:");
	}
}
