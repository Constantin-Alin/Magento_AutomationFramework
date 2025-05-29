package page.objects;

import data.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class LoginPage extends BasePage {
    Logger log = LogManager.getLogger(LoginPage.class);

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    private WebElement passwordField;

    @FindBy(xpath = "(//button[@id='send2'])[1]")
    private  WebElement signInButton;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement invalidPasswordMessage;

    @FindBy(xpath = "//span[@class='base']")
    private WebElement successfulLoginMessage;

    @FindBy(xpath = "//div[@data-ui-id='message-error']")
    private WebElement emptyFieldsError;

    @FindBy(xpath = "//div[@id='email-error']")
    private WebElement emptyEmailFieldError;

    @FindBy(xpath = "//div[@id='pass-error']")
    private WebElement emptyPasswordFieldError;

    @FindBy(xpath = "//div[@data-ui-id='message-error']")
    private WebElement invalidLoginMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendEmailAddress() {
        Wait.waitUntilElementIsVisible(emailAddressField, driver);
        log.info("Inserting email address.");
        emailAddressField.sendKeys(Constants.LOGIN_NAME);
    }



    public void sendPassword() {
        Wait.waitUntilElementIsVisible(passwordField, driver);
        passwordField.sendKeys(Constants.LOGIN_PASSWORD);
        log.info("Inserting password");
    }

    public void clickOnSignInButton() {
        Wait.waitUntilElementIsClickable(signInButton, driver);
        signInButton.click();
        log.info("Clicking on sign in button");
    }

    public String successfulLoginConfirmation() {
        Wait.waitUntilElementIsVisible(successfulLoginMessage, driver);
        log.info("Login confirmed!");
        return successfulLoginMessage.getText();
    }

    public String emptyFieldsLogin() {
        Wait.waitUntilElementIsVisible(emptyFieldsError, driver);
        log.info("Error!");
        return emptyFieldsError.getText();
    }

    public String emptyEmailError() {
        Wait.waitUntilElementIsVisible(emptyEmailFieldError, driver);
        log.info("Error!");
        return emptyEmailFieldError.getText();
    }

    public String emptyPasswordError() {
        Wait.waitUntilElementIsVisible(emptyPasswordFieldError, driver);
        log.info("Error!");
        return emptyPasswordFieldError.getText();
    }

    public void sendInvalidPassword() {
        log.info("Sending invalid password.");
        invalidPasswordMessage.sendKeys(Constants.INVALID_PASSWORD);
    }

    public String invalidLoginAttempt() {
       Wait.waitUntilElementIsVisible(invalidLoginMessage, driver);
        log.info("Error!");
        return invalidLoginMessage.getText();
    }
}
