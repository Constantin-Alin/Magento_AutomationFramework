package test;

import data.Constants;

import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.*;

import wait.Wait;

public class EndToEndTest extends BaseTest{

    @Test
    public void buyMensTopTest() {
        MensWearPage mensWearPage = new MensWearPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailAddress();
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        homePage.clickOnMensWearSection();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,2300)");
        Wait.waitInSeconds(2);
        mensWearPage.clickOnProduct();
        Wait.waitInSeconds(1);
        productPage.chooseProductSize();
        productPage.chooseProductColor();
        productPage.insertProductQuantity();
        productPage.clickOnAddToCartButton();
        Wait.waitInSeconds(4);
        String actualMessage = productPage.successfulAdditionMessage();
        String expectedMessage = Constants.ADDED_TOCART_MESSAGE;
        Assert.assertEquals(actualMessage, expectedMessage);
        productPage.clickOnCartButton();
        productPage.clickOnCheckOutButton();
        Wait.waitInSeconds(5);
        checkOutPage.clickOnNewAddressButton();
        Wait.waitInSeconds(2);
        checkOutPage.insertFirstName();
        checkOutPage.insertLastName();
        checkOutPage.insertStreetAddress();
        checkOutPage.insertShippingCity();
        checkOutPage.insertProvince();
        checkOutPage.insertPostCode();
        checkOutPage.selectCountry();
        checkOutPage.enterPhoneNumber();
        Wait.waitInSeconds(1);
        checkOutPage.clickOnShipHereButton();
        Wait.waitInSeconds(1);
        checkOutPage.selectShippingMethod();
        Wait.waitInSeconds(1);
        checkOutPage.clickOnNextButton();
        Wait.waitInSeconds(4);
        checkOutPage.clickOnPlaceOrderButton();
        Wait.waitInSeconds(4);
        String actualMessage2 = checkOutPage.getSuccessfulOrderMessage();
        String expectedMessage2 = Constants.PURCHASE_CONFIRMATION;
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }
}
