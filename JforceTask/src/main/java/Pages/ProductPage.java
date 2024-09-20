package Pages;

import TestBase.WebTestBase;
import WebUtility.WebDriverUtil;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends WebTestBase {
    @FindBy(xpath ="//div[@id='header_container']/div[2]/div/span/select" )                     // Sorting low to high DropDown Common Xpath
    WebElement sortMenu;
@FindBy(xpath = "//div[@id='header_container']/div[2]/div/span/select/option[3]")
WebElement sortOption;
@FindBy(id = "add-to-cart-sauce-labs-onesie")                                                   //Product Id
WebElement productSelect;
@FindBy(id = "shopping_cart_container")
WebElement checkoutBtn;                                                     //Checkout menu id

    public ProductPage(){
        PageFactory.initElements(driver,this);                      //Using page factory class to Loacte WebElement and instillazation
    }
public void sortFunction(){
    Select select=new Select(sortMenu);                 // Using Select class for Selecting the value Lohi for Option Low to High
    select.selectByValue("lohi");
  //  System.out.println(sortOption.getText());

    }
    public void selectProduct(){
        WebDriverUtil.waitUntilElementIsClickable(productSelect);               // Selecting the Product
    WebDriverUtil.waitUntilElementIsClickable(checkoutBtn);                     // Click on the Checkout Logo to Land on Checkout Page

    }
}
