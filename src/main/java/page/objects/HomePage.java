package page.objects;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//span[contains(text(), 'DISAGREE')])[2]")
    private WebElement disagreeButton;

    @FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    private WebElement loginLink;

    @FindBy(xpath = "//span[contains(text(), 'Men')]")
    private WebElement mensWearSection;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDisagreeButton() {
        disagreeButton.click();
    }

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void clickOnMensWearSection() {
        mensWearSection.click();
    }
    public String findColor() {
        return driver.findElement(By.xpath("//div[@data-ui-id='message-error']")).getCssValue(Constants.COLOR_XPATH);
    }

    public String findBackgroundColor() {
        return driver.findElement(By.xpath("//div[@class='message global demo']")).getCssValue(Constants.BACKGROUND_COLOR_XPATH);
    }

    public String findHeaderColor() {
        return driver.findElement(By.xpath("//div[@class='panel wrapper']")).getCssValue(Constants.BACKGROUND_COLOR_XPATH);
    }

    public String findTextColor() {
        return driver.findElement(By.xpath("//div[@class='content']")).getCssValue(Constants.COLOR_XPATH);
    }

    public String findCartBackgroundColor(){
        return driver.findElement(By.xpath("(//button[@class='action tocart primary'])[1]")).getCssValue(Constants.BACKGROUND_COLOR_XPATH);
    }

    public String findCartTextColor() {
        return driver.findElement(By.xpath("(//span[contains(text(), 'Add to Cart')])[1]")).getCssValue(Constants.COLOR_XPATH);
    }
}
