package TestCases;

import Pages.CheckOutPage;
import Pages.LoginPage;
import Pages.ProductPage;
import TestBase.WebTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyingProduct extends WebTestBase {
    public LoginPage loginTest;
    public ProductPage sortingTest;
    public CheckOutPage checkOutPage;

    @BeforeMethod
    public void preRequesite() {
        instilization();
        loginTest =new LoginPage();
        sortingTest =new ProductPage();
checkOutPage=new CheckOutPage();
    }
    @Test
    public void Sorting(){
        loginTest.login(prop.getProperty("username"), prop.getProperty("password"));
        sortingTest.sortFunction();
        Assert.assertEquals("Price (low to high)","Price (low to high)","Verfying Sorted Or not");
        sortingTest.selectProduct();
        checkOutPage.checkout();
        checkOutPage.Information();
        checkOutPage.confirmation();
    }
    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
