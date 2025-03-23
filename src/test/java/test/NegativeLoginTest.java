package test;

import data.Constants;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HomePage;
import page.objects.LoginPage;

import wait.Wait;

public class NegativeLoginTest extends BaseTest{

    @Test
    public void emptyFieldsLoginErrorTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        String actualMessage = loginPage.emptyFieldsLogin();
        String expectedMessage = Constants.MISSING_FIELDS_ERROR;
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void requiredEmailLoginErrorTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        String actualMessage = loginPage.emptyEmailError();
        String expectedMessage = Constants.PASSWORD_EMAIL_ERROR;
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void requiredPasswordLoginErrorTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        String actualMessage = loginPage.emptyPasswordError();
        String expectedMessage = Constants.PASSWORD_EMAIL_ERROR;
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void emptyPasswordFieldLoginErrorTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        loginPage.sendEmailAddress();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        String actualMessage = loginPage.emptyPasswordError();
        String expectedMessage = Constants.PASSWORD_EMAIL_ERROR;
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void emptyEmailFieldLoginErrorTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        String actualMessage = loginPage.emptyEmailError();
        String expectedMessage = Constants.PASSWORD_EMAIL_ERROR;
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void invalidAccountLoginErrorTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.clickOnLoginLink();
        loginPage.sendEmailAddress();
        loginPage.sendInvalidPassword();
        loginPage.clickOnSignInButton();
        Wait.waitInSeconds(1);
        String actualMessage = loginPage.invalidLoginAttempt();
        String expectedMessage = Constants.INVALID_LOGIN_ERROR;
        Assert.assertEquals(actualMessage, expectedMessage);
        String actualColor = homePage.findColor();
        String expectedColor = Constants.RED_COLOR;
        Assert.assertEquals(actualColor, expectedColor, "Error! The color is incorrect.");
    }
}
