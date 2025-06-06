package test;

import data.Constants;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.CreateAccountPage;
import page.objects.HomePage;

public class CreateAccountTest extends BaseTest{

    @Test
    public void createAccountTest() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnDisagreeButton();
        createAccountPage.clickOnCreateAccountLink();
        createAccountPage.insertFirstName();
        createAccountPage.insertLastName();
        createAccountPage.enterEmailAddress();
        createAccountPage.enterPassword();
        createAccountPage.clickOnCreateAccountButton();
        String expectedMessage = Constants.CREATE_ACCOUNT_THANKYOU_MESSAGE;
        String actualMessage = createAccountPage.getSuccessfulAccountCreationMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
