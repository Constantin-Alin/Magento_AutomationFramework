package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class MensWearPage extends BasePage {
    Logger log = LogManager.getLogger(MensWearPage.class);

    @FindBy(xpath = "//a[@class='product-item-link'][1]")
    private WebElement clickProduct;

    public MensWearPage(WebDriver driver){
        super(driver);
    }

    public void clickOnProduct() {
        Wait.waitUntilElementIsClickable(clickProduct, driver);
        clickProduct.click();
        log.info("Clicking on product");
    }
}
