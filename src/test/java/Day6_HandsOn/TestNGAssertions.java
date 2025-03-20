package Day6_HandsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

	@Test
	public void testAssertions() {
        
		Assert.assertEquals(5, 5);
		
        Assert.assertNotEquals("Hello", "World");
        
        Assert.assertTrue(10 > 5);
        
        Assert.assertFalse(5 > 10);
        
        Assert.assertNull(null);
        
        Assert.assertNotNull("TestNG");

        System.out.println("TestNG Assertions");
	}

}
