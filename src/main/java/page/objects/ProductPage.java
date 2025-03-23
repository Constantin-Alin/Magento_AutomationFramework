package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@id='option-label-color-93-item-52']")
    private WebElement productColor;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
    private WebElement productSize;

    @FindBy(xpath = "//input[@id='qty']")
    private WebElement clickProductQty;

    @FindBy(xpath = "//input[@id='qty']")
    private WebElement clearProductQty;

    @FindBy(xpath = "//input[@id='qty']")
    private WebElement insertProductQty;

    @FindBy(xpath = "//span[contains(text(), 'Add to Cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement clickOnCart;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    private WebElement clickOnCheckout;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public void chooseProductColor() {
        productColor.click();
    }

    public void chooseProductSize() {
        productSize.click();
    }

    public void insertProductQuantity() {
        clickProductQty.click();
        clearProductQty.clear();
        insertProductQty.sendKeys("3");
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public String successfulAdditionMessage() {
        return driver.findElement(By.xpath("//div[@data-ui-id='message-success']")).getText();
    }

    public void clickOnCartButton() {
        clickOnCart.click();
    }

    public void clickOnCheckOutButton() {
        clickOnCheckout.click();
    }

}
