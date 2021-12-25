package Pages;

import Util.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.tesla.com/";
    String expectedTitle = "New Owner Frequently Asked Questions";

    @FindBy(xpath = "//button[@class='tds-site-nav-item tds-animate--backdrop']")
    WebElement menuButton;
    @FindBy(xpath = "//dialog/ol/li[2]/a[13]")
    WebElement supportButton;
    @FindBy(xpath = "//a[@class='tds-btn tds-btn--large tds-btn--blue help-center']")
    WebElement contactButton;
    @FindBy(id = "select-first-choice")
    WebElement dropDown;
    @FindBy(xpath = "//select/option[@value='vehicleAppFeatures']")
    WebElement optionThree;
    @FindBy(xpath = "//select[@data-test='select-question-subtopic']")
    WebElement dropDownTwo;
    @FindBy(xpath = "//select/option[@value='autopilotFullSelfDrivingCapability']")
    WebElement optionFour;
    @FindBy(xpath = "//button[@class='tds-btn tds-btn--blue tds-btn--large']")
    WebElement submitButton;
    @FindBy(xpath = "//main/div[3]/div[3]/div[1]/a")
    WebElement whatIsAutoPilot;
    @FindBy(xpath = "//div[@class='pane-content']/h2")
    WebElement actualTitle;

    public ContactUsPage(){
        PageFactory.initElements(driver, this);
    }

    public void goToTesla(){
        ut.goTo(baseURL);
    }

    public void contactUs() throws InterruptedException {
        menuButton.click();
        supportButton.click();
        contactButton.click();
        dropDown.click();
        optionThree.click();
        dropDownTwo.click();
        optionFour.click();
        submitButton.click();
        whatIsAutoPilot.click();
        Thread.sleep(2000);
    }
}
