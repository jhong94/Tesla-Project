package Test;

import Pages.AddToCartPage;
import Pages.LoginTeslaPage;
import Util.TestBase;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {

    @Test()
    public void addItemToCartTest() throws InterruptedException {
        LoginTeslaPage page = new LoginTeslaPage();
        AddToCartPage cart = new AddToCartPage();
        cart.goToTesla();
        page.enterLogin();
        cart.buyAJacket();
        Thread.sleep(2000);
    }
}
