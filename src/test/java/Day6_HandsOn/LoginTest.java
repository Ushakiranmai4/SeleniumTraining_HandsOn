package Day6_HandsOn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            new Object[] {"user1", "password1"},
            new Object[] {"user2", "password2"},
            new Object[] {"user3", "password3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
