package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensWearPage extends BasePage {

    @FindBy(xpath = "//a[@class='product-item-link'][1]")
    private WebElement clickProduct;

    public MensWearPage(WebDriver driver){
        super(driver);
    }

    public void clickOnProduct() {
        clickProduct.click();
    }
}
