package page.objects;

import data.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class ProductPage extends BasePage {
    Logger log = LogManager.getLogger(ProductPage.class);

    @FindBy(xpath = "//div[@id='option-label-color-93-item-52']")
    private WebElement productColor;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
    private WebElement productSize;

    @FindBy(xpath = "//input[@id='qty']")
    private WebElement productQty;

    @FindBy(xpath = "//input[@id='qty']")
    private WebElement insertProductQty;

    @FindBy(xpath = "//span[contains(text(), 'Add to Cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement clickOnCart;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    private WebElement clickOnCheckout;

    @FindBy(xpath = "//div[@data-ui-id='message-success']")
    private WebElement successfulAddition;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public void chooseProductColor() {
        Wait.waitUntilElementIsClickable(productColor, driver);
        productColor.click();
        log.info("Choosing product color");
    }

    public void chooseProductSize() {
        Wait.waitUntilElementIsClickable(productSize, driver);
        productSize.click();
        log.info("Choosing product size");
    }

    public void insertProductQuantity() {
        Wait.waitUntilElementIsClickable(insertProductQty, driver);
        productQty.click();
        productQty.clear();
        insertProductQty.sendKeys(Constants.PRODUCT_QTY);
        log.info("Inserting quantity");
    }

    public void clickOnAddToCartButton() {
        Wait.waitUntilElementIsClickable(addToCartButton, driver);
        addToCartButton.click();
        log.info("Clicking on the add to cart button");
    }

    public String successfulAdditionMessage() {
        Wait.waitUntilElementIsVisible(successfulAddition, driver);
        log.info("Message acquired");
        return successfulAddition.getText();
    }

    public void clickOnCartButton() {
        Wait.waitUntilElementIsClickable(clickOnCart, driver);
        clickOnCart.click();
        log.info("Clicking on the cart button");
    }

    public void clickOnCheckOutButton() {
       Wait.waitUntilElementIsClickable(clickOnCheckout, driver);
        clickOnCheckout.click();
        log.info("Clicking on the checkout button");
    }

}
