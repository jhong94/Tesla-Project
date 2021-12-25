package Pages;

import Util.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.tesla.com/";
    String expectedTitle = "Tesla | Shop Search";

    @FindBy(xpath = "//header/ol[2]/li[1]/a[@class=\"tds-site-nav-item tds-animate--backdrop tds--product-name\"]")
    WebElement shopButton;
    @FindBy(id = "searchform")
    WebElement searchButton;
    @FindBy(id = "searchTerm")
    WebElement enterSearch;

    public SearchFunctionPage(){
        PageFactory.initElements(driver, this);
    }

    public void goToTesla(){
        ut.goTo(baseURL);
    }

    public void searchFunction(){
        shopButton.click();
        searchButton.click();
        enterSearch.sendKeys("jacket" + "\n");
        ut.validateTitle(expectedTitle);
    }

    public void negativeSearchFunction() {
        shopButton.click();
        searchButton.click();
        enterSearch.sendKeys("selenium" + "\n");
        ut.validateTitle(expectedTitle);
    }
}
