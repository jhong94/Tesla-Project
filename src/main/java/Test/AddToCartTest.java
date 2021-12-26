package Test;

import Pages.AddToCartPage;
import Pages.LoginTeslaPage;
import Util.TestBase;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {

    @Test()
    public void purchaseAnItem() throws InterruptedException {
        LoginTeslaPage page = new LoginTeslaPage();
        AddToCartPage cart = new AddToCartPage();
        cart.goToTesla();
        page.enterLogin();
        cart.goToCheckOut();
        Thread.sleep(2000);
    }
}
