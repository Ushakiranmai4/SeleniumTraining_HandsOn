package Day6_HandsOn;

import org.testng.annotations.Factory;

public class WeekdayFactory {

	@Factory
    public Object[] createInstances() {
        return new Object[]{
            new WeekdayTest("Monday"),
            new WeekdayTest("Tuesday"),
            new WeekdayTest("Wednesday"),
            new WeekdayTest("Thursday"),
            new WeekdayTest("Friday"),
            new WeekdayTest("Saturday"),
            new WeekdayTest("Sunday")
        };
    }
}
