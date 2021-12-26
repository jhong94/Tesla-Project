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
    @FindBy(linkText = "Key Card")
    WebElement keyCard;
    @FindBy(xpath = "//main//section/div/div[2]/div/div[2]/section/div[@class='product__container__details__buynow active']")
    WebElement addToCart;
    @FindBy(xpath = "//button[@class='tds-btn tds-btn--secondary']")
    WebElement goToCart;

    public AddToCartPage(){
        PageFactory.initElements(driver, this);
    }

    public void goToTesla(){
        ut.goTo(baseURL);
    }

    public void goToCheckOut() throws InterruptedException {
        shopButton.click();
        searchButton.click();
        enterSearch.sendKeys("card" + "\n");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", keyCard);
        ut.waitForElement(addToCart);
        addToCart.click();
        Thread.sleep(2000);
        goToCart.click();
    }
}
