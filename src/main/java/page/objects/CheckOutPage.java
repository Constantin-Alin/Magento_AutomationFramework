package page.objects;

import data.Constants;
import data.StreetAddress;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class);

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
        newAddressButton.click();
        log.info("Clicking on the new address button.");
    }

    public void insertStreetAddress() {
        insertStreetAddress.sendKeys(StreetAddress.generateRandomAddress());
        log.info("Inserting street address");
    }

    public void insertFirstName() {
        insertFirstName.sendKeys(Constants.FIRST_NAME_SHIPPING);
        log.info("Inserting first name");
    }

    public void insertLastName() {
        insertLastName.sendKeys(Constants.LAST_NAME_SHIPPING);
        log.info("Inserting last name");
    }

    public void insertShippingCity() {
        shippingCity.sendKeys(Constants.CITY);
        log.info("Inserting shipping city");
    }

    public void insertProvince() {
       initialProvince.click();
        finalProvince.click();
    }

    public void insertPostCode() {
        postCode.sendKeys(Constants.POSTCODE);
    }

    public void selectCountry() {
        initialCountry.click();
        finalCountry.click();
    }

    public void enterPhoneNumber() {
       phoneNumber.sendKeys(Constants.PHONE_NUMBER);
    }

    public void selectShippingMethod() {
        selectShipping.click();
    }

    public void clickOnNextButton() {
        nextButton.click();
    }

    public void clickOnPlaceOrderButton() {
        placeOrderButton.click();
    }

    public String getSuccessfulOrderMessage() {
        return successfulOrderMessage.getText();
    }

    public void clickOnShipHereButton() {
        shipHereButton.click();
    }
}
