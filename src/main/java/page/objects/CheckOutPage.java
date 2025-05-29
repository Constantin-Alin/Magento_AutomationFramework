package page.objects;

import data.Constants;
import data.StreetAddress;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class CheckOutPage extends BasePage {

    Logger log = LogManager.getLogger(CheckOutPage.class);

    @FindBy(xpath = "//button[@class='action action-show-popup']")
    private WebElement newAddressButton;

    @FindBy(xpath = "//input[@name='street[0]']")
    private WebElement insertStreetAddress;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement insertFirstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement insertLastName;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement shippingCity;

    @FindBy(xpath = "//select[@name='region_id']")
    private WebElement initialProvince;

    @FindBy(xpath = "//option[@data-title='Pennsylvania']")
    private WebElement finalProvince;

    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement postCode;

    @FindBy(xpath = "//select[@name='country_id']")
    private WebElement initialCountry;

    @FindBy(xpath = "//option[@data-title='United States']")
    private WebElement finalCountry;

    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement phoneNumber;

    @FindBy(xpath = "(//input[@class='radio'])[1]")
    private WebElement selectShipping;

    @FindBy(xpath = "//button[@data-role='opc-continue']")
    private WebElement nextButton;

    @FindBy(xpath = "//button[@title='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(xpath = "(//button[@data-role='action'])[1]")
    private WebElement shipHereButton;

    @FindBy(xpath = "//span[@class= 'base']")
    private WebElement successfulOrderMessage;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNewAddressButton() {
        Wait.waitUntilElementIsInvisible(driver);
        newAddressButton.click();
        log.info("Clicking on the new address button.");
    }

    public void insertStreetAddress() {
        Wait.waitUntilElementIsVisible(insertStreetAddress, driver);
        insertStreetAddress.sendKeys(StreetAddress.generateRandomAddress());
        log.info("Inserting street address");
    }

    public void insertFirstName() {
        Wait.waitUntilElementIsVisible(insertFirstName, driver);
        insertFirstName.sendKeys(Constants.FIRST_NAME_SHIPPING);
        log.info("Inserting first name");
    }

    public void insertLastName() {
        Wait.waitUntilElementIsVisible(insertLastName, driver);
        insertLastName.sendKeys(Constants.LAST_NAME_SHIPPING);
        log.info("Inserting last name");
    }

    public void insertShippingCity() {
        Wait.waitUntilElementIsVisible(shippingCity, driver);
        shippingCity.sendKeys(Constants.CITY);
        log.info("Inserting shipping city");
    }

    public void insertProvince() {
        Wait.waitUntilElementIsVisible(initialProvince, driver);
        Wait.waitUntilElementIsVisible(finalProvince, driver);
       initialProvince.click();
        finalProvince.click();
        log.info("Inserting provinces");
    }

    public void insertPostCode() {
        Wait.waitUntilElementIsVisible(postCode, driver);
        postCode.sendKeys(Constants.POSTCODE);
        log.info("Inserting postcode");
    }

    public void selectCountry() {
        Wait.waitUntilElementIsVisible(initialCountry, driver);
        Wait.waitUntilElementIsVisible(finalCountry, driver);
        initialCountry.click();
        finalCountry.click();
        log.info("Selecting country");
    }

    public void enterPhoneNumber() {
        Wait.waitUntilElementIsVisible(phoneNumber, driver);
       phoneNumber.sendKeys(Constants.PHONE_NUMBER);
       log.info("Entering phone number");
    }

    public void selectShippingMethod() {
        Wait.waitUntilElementIsClickable(selectShipping, driver);
        selectShipping.click();
        log.info("Selecting shipping method");
    }

    public void clickOnNextButton() {
        Wait.waitUntilElementIsClickable(nextButton, driver);
        nextButton.click();
        log.info("Clicking on next button");
    }

    public void clickOnPlaceOrderButton() {
        Wait.waitUntilElementClassIsInvisible(driver);
        placeOrderButton.click();
        log.info("Clicking on the place order button");
    }

    public String getSuccessfulOrderMessage() {
        Wait.waitUntilElementClassIsInvisible(driver);
        Wait.waitUntilElementIsVisible(successfulOrderMessage, driver);
        log.info("Message acquired");
        return successfulOrderMessage.getText();
    }

    public void clickOnShipHereButton() {
        Wait.waitUntilElementIsClickable(shipHereButton,driver);
        shipHereButton.click();
        log.info("Clicking on the ship here button");
    }
}
