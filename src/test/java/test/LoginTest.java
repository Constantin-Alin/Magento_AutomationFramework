package test;

import annotations.MobileTest;
import data.Constants;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HomePage;
import page.objects.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
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
    }

    @Test
    @MobileTest
    public void mobileLoginTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        homePage.tapOnHamburgerMenu();
        homePage.tapOnAccountMenu();
        homePage.tapOnSignInLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailAddress();
        loginPage.sendPassword();
        loginPage.clickOnSignInButton();
        String actualMessage = loginPage.successfulLoginConfirmation();
        String expectedMessage = Constants.LOGIN_CONFIRMATION;
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}