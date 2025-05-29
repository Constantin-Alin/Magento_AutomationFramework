package page.objects;

import data.Constants;
import data.Email;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class CreateAccountPage extends BasePage {
    Logger log = LogManager.getLogger(CreateAccountPage.class);

    @FindBy(xpath = " (//a[contains(text(), 'Create an Account')])[1]")
    private WebElement createAccountLink;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement insertFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement insertLastName;

    @FindBy(xpath = "//input[@id='email_address']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement initialPassword;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    private WebElement passwordConfirmation;

    @FindBy(xpath = "(//span[contains(text(), 'Create an Account')])[1]")
    private WebElement createAccountButton;

    @FindBy(xpath = "//div[@data-ui-id='message-success']")
    private WebElement successfulAccountCreationMessage;

    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    public void clickOnCreateAccountLink(){
        Wait.waitUntilElementIsClickable(createAccountLink,driver);
        createAccountLink.click();
        log.info("Clicking on the create an account link");
    }

    public void insertFirstName() {
        Wait.waitUntilElementIsVisible(insertFirstName, driver);
        insertFirstName.sendKeys(Constants.FIRST_NAME);
        log.info("Inserting first name");
    }

    public void insertLastName() {
        Wait.waitUntilElementIsVisible(insertLastName, driver);
        insertLastName.sendKeys(Constants.LAST_NAME);
        log.info("Inserting last name");
    }

    public void enterEmailAddress() {
        Wait.waitUntilElementIsVisible(emailAddress, driver);
        emailAddress.sendKeys(Email.generateRandomEmail());
        log.info("Entering email address");
    }

    public void enterPassword() {
        Wait.waitUntilElementIsVisible(initialPassword, driver);
        Wait.waitUntilElementIsVisible(passwordConfirmation, driver);
        initialPassword.sendKeys(Constants.PASSWORD);
        passwordConfirmation.sendKeys(Constants.PASSWORD);
        log.info("Entering password");
    }

    public void clickOnCreateAccountButton() {
        Wait.waitUntilElementIsClickable(createAccountButton, driver);
        createAccountButton.click();
        log.info("Clicking on the create an account button");
    }

    public String getSuccessfulAccountCreationMessage() {
        Wait.waitUntilElementIsVisible(successfulAccountCreationMessage, driver);
        log.info("Message acquired");
        return successfulAccountCreationMessage.getText();
    }
}
