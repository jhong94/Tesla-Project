package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

public class TestUtil extends TestBase {

    public void goTo(String url) {
        driver.navigate().to(url);
    }

    public WebElement waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        WebElement localElement = waitForElement(element);
        localElement.click();
    }

    public void screenShot() throws IOException {
        Date currentDate = new Date();
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotFileName + ".png"));
    }

    public void validateText(WebElement element, String getText) {
        WebElement localElement = waitForElement(element);
        String actualText = localElement.getText();
        Assert.assertEquals(actualText.toLowerCase(), getText.toLowerCase());
    }

    public void validateTitle(String title) {
        String actualTitle = driver.getTitle();
        String expectedTitle = title;
        Assert.assertEquals(actualTitle.toLowerCase(), expectedTitle.toLowerCase());
    }
}
