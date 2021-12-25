package Test;

import Pages.ContactUsPage;
import Pages.LoginTeslaPage;
import Util.TestBase;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase {

    @Test()
    public void contactTest() throws InterruptedException {
        ContactUsPage page = new ContactUsPage();
        LoginTeslaPage login = new LoginTeslaPage();
        page.goToTesla();
        login.enterLogin();
        page.contactUs();
        Thread.sleep(2000);
    }
}
