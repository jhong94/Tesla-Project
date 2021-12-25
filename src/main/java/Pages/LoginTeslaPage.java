package Pages;

import Util.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTeslaPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.tesla.com/";
    String expectedTitle = "Tesla Account | Tesla";

    @FindBy(xpath = "//header/ol[2]/li[2]/a[@class='tds-site-nav-item tds-animate--backdrop tds--product-name']")
    WebElement accountButton;
    @FindBy(id = "form-input-identity")
    WebElement userName;
    @FindBy(id = "form-input-credential")
    WebElement password;
    @FindBy(id = "form-submit-continue")
    WebElement signIn;

    public LoginTeslaPage(){
        PageFactory.initElements(driver, this);
    }

    public void goToTesla(){
        ut.goTo(baseURL);
    }

    public void enterLogin(){
        accountButton.click();
        userName.sendKeys("archaic.undated-05@icloud.com");
        password.sendKeys("whatever99!");
        signIn.click();
        ut.validateTitle(expectedTitle);
    }

    public void fakeLogin(){
        accountButton.click();
        userName.sendKeys("youcantseeme@johncena.com");
        password.sendKeys("canyousmellwhattherockiscooking");
        signIn.click();
    }
}
