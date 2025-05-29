package test;

import data.Constants;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HomePage;
import page.objects.LoginPage;

public class ColorsTest extends BaseTest{

    @Test
    public void backgroundColorTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailAddress();
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        String actualMessage = loginPage.successfulLoginConfirmation();
        Assert.assertEquals(actualMessage, Constants.LOGIN_CONFIRMATION);
        String backgroundColor = homePage.findBackgroundColor();
        String headerColor = homePage.findHeaderColor();
        String headerColor2 = homePage.findHeaderColor();
        Assert.assertEquals(backgroundColor, Constants.LIGHT_RED_COLOR);
        Assert.assertEquals(headerColor, headerColor2);
    }

    @Test
    public void colorTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailAddress();
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        String actualMessage = loginPage.successfulLoginConfirmation();
        String expectedMessage = Constants.LOGIN_CONFIRMATION;
        Assert.assertEquals(actualMessage, expectedMessage);
        String actualTextColor = homePage.findTextColor();
        Assert.assertEquals(actualTextColor, Constants.WHITE_COLOR);
    }

    @Test
    public void addToCartColorTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailAddress();
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        String actualMessage = loginPage.successfulLoginConfirmation();
        String expectedMessage = Constants.LOGIN_CONFIRMATION;
        Assert.assertEquals(actualMessage, expectedMessage);
        String actualCartColor = homePage.findCartBackgroundColor();
        String actualTextColor = homePage.findCartTextColor();
        Assert.assertEquals(actualTextColor, Constants.WHITE_COLOR);
        Assert.assertEquals(actualCartColor, Constants.BLUE_COLOR);
    }
}
