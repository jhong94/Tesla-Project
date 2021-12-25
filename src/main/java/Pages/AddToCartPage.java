package Pages;

import Util.TestBase;
import Util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.tesla.com/";

    @FindBy(xpath = "//header/ol[2]/li[1]/a[@class=\"tds-site-nav-item tds-animate--backdrop tds--product-name\"]")
    WebElement shopButton;
    @FindBy(id = "searchform")
    WebElement searchButton;
    @FindBy(id = "searchTerm")
    WebElement enterSearch;
    @FindBy(linkText = "Men's Raven Lightweight Zip Up Bomber Jacket")
    WebElement ravenJacket;
    @FindBy(xpath = "//div[@class='size-1740250-00-A product__container__details__size__items__item color__key active']/label")
    WebElement sizeOfJacket;
    @FindBy(xpath = "//input[@class=\"btn-purchasable tds-btn tds-btn--primary tds-btn--width-full product__container__details__submit__buy submit__buy--desktop\"]")
    WebElement addToCart;
    @FindBy(xpath = "//button[@class='tds-btn tds-btn--secondary']")
    WebElement goToCart;

    public AddToCartPage(){
        PageFactory.initElements(driver, this);
    }

    public void goToTesla(){
        ut.goTo(baseURL);
    }

    public void buyAJacket() throws InterruptedException {
        shopButton.click();
        searchButton.click();
        enterSearch.sendKeys("mens bomber" + "\n");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ravenJacket);
        ut.clickElement(sizeOfJacket);
        addToCart.click();
        Thread.sleep(2000);
        goToCart.click();
    }
}
