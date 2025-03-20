package Day6_HandsOn;

import org.testng.annotations.Test;

public class WeekdayTest {

	public String day;

    
    public WeekdayTest(String day) {
        this.day = day;
    }

    @Test
    public void testWeekday() {
        System.out.println("Executing test for: " + day);
    }
}
