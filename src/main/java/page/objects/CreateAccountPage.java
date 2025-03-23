package page.objects;

import data.Constants;
import data.Email;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

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

    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    public void clickOnCreateAccountLink(){
        createAccountLink.click();
    }

    public void insertFirstName() {
        insertFirstName.sendKeys(Constants.FIRST_NAME);
    }

    public void insertLastName() {
        insertLastName.sendKeys(Constants.LAST_NAME);
    }

    public void enterEmailAddress() {
        emailAddress.sendKeys(Email.generateRandomEmail());
    }

    public void enterPassword() {
        initialPassword.sendKeys(Constants.PASSWORD);
        passwordConfirmation.sendKeys(Constants.PASSWORD);
    }

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }

    public String successfulAccountCreationMessage() {
        return driver.findElement(By.xpath("//div[@data-ui-id='message-success']")).getText();
    }
}
