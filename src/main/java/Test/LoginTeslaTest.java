package Test;

import Pages.LoginTeslaPage;
import Util.TestBase;
import org.testng.annotations.Test;

public class LoginTeslaTest extends TestBase {

    @Test() //Positive Test Case 01
    public void loginTest() throws InterruptedException {
        LoginTeslaPage login = new LoginTeslaPage();
        login.goToTesla();
        login.enterLogin();
        Thread.sleep(2000);
    }

    @Test() //Negative Test Case 01
    public void fakeLoginTest() throws InterruptedException {
        LoginTeslaPage login = new LoginTeslaPage();
        login.goToTesla();
        login.fakeLogin();
        Thread.sleep(2000);
    }
}
