package test;

import annotations.MobileTest;
import data.Constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup(Method method) {
        boolean isMobile = method.isAnnotationPresent(MobileTest.class);
        ChromeOptions options = new ChromeOptions();
        if (isMobile){
            options = setMobileView();
        }
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }

    private ChromeOptions setMobileView(){
        Map<String,String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName","Samsung Galaxy S20 Ultra");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation",mobileEmulation);
        return options;
    }
}
