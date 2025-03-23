package page.objects;

import data.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    private WebElement insertPassword;

    @FindBy(xpath = "(//button[@id='send2'])[1]")
    private  WebElement signInButton;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement invalidPassword;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendEmailAddress() {
        log.info("Inserting email address.");
        emailAddress.sendKeys(Constants.LOGIN_NAME);
    }

    public void sendPassword() {
        insertPassword.sendKeys(Constants.LOGIN_PASSWORD);
        log.info("Inserting password");
    }

    public void clickOnSignInButton() {
        signInButton.click();
        log.info("Clicking on sign in button");
    }

    public String successfulLoginConfirmation() {
        return driver.findElement(By.xpath("//span[@class='base']")).getText();
    }

    public String emptyFieldsLogin() {
        return driver.findElement(By.xpath("//div[@data-ui-id='message-error']")).getText();
    }

    public String emptyEmailError() {
        return driver.findElement(By.xpath("//div[@id='email-error']")).getText();
    }

    public String emptyPasswordError() {
        return driver.findElement(By.xpath("//div[@id='pass-error']")).getText();
    }

    public void sendInvalidPassword() {
        invalidPassword.sendKeys(Constants.INVALID_PASSWORD);
    }

    public String invalidLoginAttempt() {
        return driver.findElement(By.xpath("//div[@data-ui-id='message-error']")).getText();
    }
}
