package page.objects;

import data.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Scroll;
import utils.Wait;

public class HomePage extends BasePage {
    Logger log = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "(//span[contains(text(), 'DISAGREE')])[2]")
    private WebElement disagreeButton;

    @FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    private WebElement loginLink;

    @FindBy(xpath = "//span[contains(text(), 'Men')]")
    private WebElement mensWearSection;

    @FindBy(xpath = "//div[@data-ui-id='message-error']")
    private WebElement initialColor;

    @FindBy(xpath = "//div[@class='message global demo']")
    private WebElement backgroundColor;

    @FindBy(xpath = "//div[@class='panel wrapper']")
    private WebElement headerColor;

    @FindBy(xpath = "//div[@class='content']")
    private WebElement textColor;

    @FindBy(xpath = "(//button[@class='action tocart primary'])[1]")
    private WebElement cartButton;

    @FindBy(xpath = "(//span[contains(text(), 'Add to Cart')])[1]")
    private WebElement cartTextColor;

    @FindBy(xpath = "(//span[@class='action nav-toggle'])")
    private WebElement hamburgerHelperMenu;

    @FindBy(xpath = "(/html/body/div[3]/div/div/div[3]/a)")
    private WebElement accountMenu;

    @FindBy(xpath = "(//*[@id=\"store.links\"]/ul/li[2]/a)")
    private WebElement signInLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDisagreeButton() {
        Wait.waitUntilElementIsClickable(disagreeButton, driver);
        disagreeButton.click();
        log.info("Clicking on disagree button");
    }

    public void clickOnLoginLink() {
        Wait.waitUntilElementIsClickable(loginLink, driver);
        loginLink.click();
        log.info("Clicking on login link");
    }

    public void tapOnHamburgerMenu() {
        Wait.waitUntilElementIsClickable(hamburgerHelperMenu, driver);
        hamburgerHelperMenu.click();
        log.info("Tapping on Menu button");
    }

    public void tapOnAccountMenu() {
        Wait.waitUntilElementIsClickable(accountMenu, driver);
        accountMenu.click();
        log.info("Tapping on account section");
    }

    public void tapOnSignInLink() {
        Wait.waitUntilElementIsClickable(signInLink, driver);
        signInLink.click();
        log.info("Tapping on sign in link");
    }

    public void clickOnMensWearSection() {
        Wait.waitUntilElementIsClickable(mensWearSection, driver);
        mensWearSection.click();
        log.info("Clicking on menswear section");
    }
    public String findColor() {
        return initialColor.getCssValue(Constants.COLOR_XPATH);
    }

    public String findBackgroundColor() {
        return backgroundColor.getCssValue(Constants.BACKGROUND_COLOR_XPATH);
    }

    public String findHeaderColor() {
        return headerColor.getCssValue(Constants.BACKGROUND_COLOR_XPATH);
    }

    public String findTextColor() {
        return textColor.getCssValue(Constants.COLOR_XPATH);
    }

    public String findCartBackgroundColor(){
//        Wait.waitUntilElementIsVisible(cartButton, driver);
        Scroll.scrollToElement(driver, cartButton);
         hoverOverElement(cartButton);
        return cartButton.getCssValue(Constants.BACKGROUND_COLOR_XPATH);
    }

    public String findCartTextColor() {
         Wait.waitUntilElementIsVisible(cartTextColor, driver);
        return cartTextColor.getCssValue(Constants.COLOR_XPATH);
    }
}
