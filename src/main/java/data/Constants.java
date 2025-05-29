package data;

import utils.DataHandler;

import java.io.File;

public class Constants {

    public static final String URL = DataHandler.readFromPropertiesFile(new File("data.properties"), "url");
   public static final String FIRST_NAME = DataHandler.readFromPropertiesFile(new File("data.properties"), "firstname");
   public static final String LAST_NAME = DataHandler.readFromPropertiesFile(new File("data.properties"), "lastname");
   public static final String PASSWORD = DataHandler.readFromPropertiesFile(new File("data.properties"), "password");
   public static final String CREATE_ACCOUNT_THANKYOU_MESSAGE = "Thank you for registering with Main Website Store.";
   public static final String LOGIN_NAME = DataHandler.readFromPropertiesFile(new File("data.properties"), "email");
   public static final String LOGIN_PASSWORD = DataHandler.readFromPropertiesFile(new File("data.properties"), "loginpassword");
   public static final String LOGIN_CONFIRMATION = "Home Page";
   public static final String ADDED_TOCART_MESSAGE = "You added Argus All-Weather Tank to your shopping cart.";
   public static final String PASSWORD_EMAIL_ERROR = "This is a required field.";
   public static final String MISSING_FIELDS_ERROR = "A login and a password are required.";
   public static final String INVALID_PASSWORD = DataHandler.readFromPropertiesFile(new File("data.properties"), "fakepassword");
   public static final String INVALID_LOGIN_ERROR = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
   public static final String PURCHASE_CONFIRMATION = "Thank you for your purchase!";
   public static final String FIRST_NAME_SHIPPING = "marian";
   public static final String LAST_NAME_SHIPPING = "popescu";
   public static final String CITY = "Harrisburg";
   public static final String POSTCODE = "19124";
   public static final String PHONE_NUMBER = "01525559213";
   public static final String RED_COLOR = "rgb(224, 43, 39)";
   public static final String LIGHT_RED_COLOR = "rgb(255, 1, 1)";
   public static final String COLOR_XPATH = "color";
   public static final String BACKGROUND_COLOR_XPATH = "background-color";
   public static final String WHITE_COLOR = "rgb(255, 255, 255)";
   public static final String BLUE_COLOR = "rgb(25, 121, 195)";
   public static final String PRODUCT_QTY = "3";
}
