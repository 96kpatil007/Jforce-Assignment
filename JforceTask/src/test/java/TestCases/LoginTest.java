package TestCases;

import Pages.LoginPage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends WebTestBase {
    public LoginPage loginPage;

    @BeforeMethod
    public void preRequesite(){
        instilization();
        loginPage =new LoginPage();
    }
    @Test(description = "Verify login page Using Valid Creditianls")
    public void verifyLoginPage(){
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @AfterMethod(description = "Closing the webPage")
    public void teardown() {
        driver.close();
    }

}
