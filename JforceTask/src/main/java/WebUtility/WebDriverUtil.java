package WebUtility;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverUtil extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 40;
    public static final long IMPLICIT_WAIT = 80;
    public static WebDriverWait webDriverWait;
    public static final long explicitWait = 34; //

    public static void waitUntilElementIsClickable(WebElement element) {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));            //Creating the click method Using Explicit wait
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void sendkeysByMethod(WebElement element, String text) {
        element.sendKeys(text);                 //Creating Sendkeys Method

    }

    public static String getTextofElement(WebElement element) {
        return element.getText();               //Creating GetText Method

    }
}
