package test;

import annotations.MobileTest;
import data.Constants;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.*;
import utils.Scroll;

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
        Scroll.scrollDown(driver, 2300);
        mensWearPage.clickOnProduct();
        productPage.chooseProductSize();
        productPage.chooseProductColor();
        productPage.insertProductQuantity();
        productPage.clickOnAddToCartButton();
        String actualMessage = productPage.successfulAdditionMessage();
        String expectedMessage = Constants.ADDED_TOCART_MESSAGE;
        Assert.assertEquals(actualMessage, expectedMessage);
        productPage.clickOnCartButton();
        productPage.clickOnCheckOutButton();
        checkOutPage.clickOnNewAddressButton();
        checkOutPage.insertFirstName();
        checkOutPage.insertLastName();
        checkOutPage.insertStreetAddress();
        checkOutPage.insertShippingCity();
        checkOutPage.insertProvince();
        checkOutPage.insertPostCode();
        checkOutPage.selectCountry();
        checkOutPage.enterPhoneNumber();
        checkOutPage.clickOnShipHereButton();
        checkOutPage.selectShippingMethod();
        checkOutPage.clickOnNextButton();
        checkOutPage.clickOnPlaceOrderButton();
        String actualMessage2 = checkOutPage.getSuccessfulOrderMessage();
        String expectedMessage2 = Constants.PURCHASE_CONFIRMATION;
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }

    @Test
    @MobileTest
    public void buyMensTopMobileTest() {
        MensWearPage mensWearPage = new MensWearPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.tapOnHamburgerMenu();
        homePage.tapOnAccountMenu();
        homePage.tapOnSignInLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailAddress();
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        homePage.tapOnHamburgerMenu();
        homePage.tapOnMensSectionMenu();
        homePage.tapOnAllMensSection();
        Scroll.scrollDown(driver, 2300);
        mensWearPage.clickOnProduct();
        productPage.chooseProductSize();
        productPage.chooseProductColor();
        productPage.insertProductQuantity();
        productPage.clickOnAddToCartButton();
        String actualMessage = productPage.successfulAdditionMessage();
        String expectedMessage = Constants.ADDED_TOCART_MESSAGE;
        Assert.assertEquals(actualMessage, expectedMessage);
        productPage.clickOnCartButton();
        productPage.clickOnCheckOutButton();
        checkOutPage.clickOnNewAddressButton();
        checkOutPage.insertFirstName();
        checkOutPage.insertLastName();
        checkOutPage.insertStreetAddress();
        checkOutPage.insertShippingCity();
        checkOutPage.insertProvince();
        checkOutPage.insertPostCode();
        checkOutPage.selectCountry();
        checkOutPage.enterPhoneNumber();
        checkOutPage.clickOnShipHereButton();
        checkOutPage.selectShippingMethod();
        checkOutPage.clickOnNextButton();
        checkOutPage.clickOnPlaceOrderButton();
        String actualMessage2 = checkOutPage.getSuccessfulOrderMessage();
        String expectedMessage2 = Constants.PURCHASE_CONFIRMATION;
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }
}
