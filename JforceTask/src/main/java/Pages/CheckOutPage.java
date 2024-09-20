package Pages;

import WebUtility.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static TestBase.WebTestBase.driver;

public class CheckOutPage {
    @FindBy(id = "checkout")
    WebElement checkOutProceed;
    @FindBy(id = "first-name")
    WebElement nameCheckOutPage;
    @FindBy(id ="last-name")
    WebElement lastNameCheckOutPage;
    @FindBy(id = "postal-code")
    WebElement postalCodeCheckOutPage;
@FindBy(id = "continue")
WebElement continueBtn;
@FindBy(id = "finish")
WebElement finishBtn;
@FindBy(xpath = "//div[@id='checkout_complete_container']/h2")
WebElement confirmationMsg;


    public CheckOutPage(){
        PageFactory.initElements(driver,this);
    }
    public void checkout(){
        WebDriverUtil.waitUntilElementIsClickable(checkOutProceed);
    }
    public void Information(){
        nameCheckOutPage.sendKeys("shubham");
        lastNameCheckOutPage.sendKeys("patil");
        postalCodeCheckOutPage.sendKeys("422019");
     WebDriverUtil.waitUntilElementIsClickable(continueBtn);
     WebDriverUtil.waitUntilElementIsClickable(finishBtn);
    }
    public void confirmation(){
        //System.out.println(confirmationMsg.getText());
        WebDriverUtil.getTextofElement(confirmationMsg);
    }
}
