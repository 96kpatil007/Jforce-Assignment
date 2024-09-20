package Pages;

import TestBase.WebTestBase;
import WebUtility.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends WebTestBase {
    @FindBy(id = "user-name")                       //User name textbox id
    WebElement userNameTextBox;                     // Creating a webElement for Username
    @FindBy(id = "password")
    WebElement passwordTextBox;
    @FindBy(id = "login-button")
    WebElement loginBtn;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void login(String userName,String password){                         //Using String Parameter to Pass the value
        WebDriverUtil.sendkeysByMethod(userNameTextBox,userName);
        WebDriverUtil.sendkeysByMethod(passwordTextBox,password);
        WebDriverUtil.waitUntilElementIsClickable(loginBtn);
    }
}
