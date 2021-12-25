package Pages;

import Util.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMovie extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://momedia.netlify.app";

    @FindBy(xpath="//input[@id='search-input']")
    WebElement searchInput;
    @FindBy(xpath = "//a[@href='/movies/19995']")
    WebElement firstMovieLocator;
    @FindBy(xpath = "//a[@href='/movies/19995']")
    WebElement movieTitleLocator;

    public void goToHomePage(){
        ut.goTo(baseURL);
    }
    public void enterMovieName(){
        searchInput.sendKeys("Spider-Man");
    }
    public SearchMovie() {
        PageFactory.initElements(driver, this);
    }
}


