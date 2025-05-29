package test;

import data.Constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
//        Wait.waitInSeconds(3);
    }

    @Test
    public void goToWebsiteTest() {
        // Pentru a deschide un browser folosim obiectul WebDriver din Selenium.

        // Pentru a naviga pe un site folosim metoda .get pe obiectul driver
    }

}
