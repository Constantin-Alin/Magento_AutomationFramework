package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

import java.util.Properties;

public class DataHandler {
    static Logger log = LogManager.getLogger(DataHandler.class);

    public static String readFromPropertiesFile(File file, String attributeName) {
        Properties prop = new Properties();
        try {
            prop.load(DataHandler.class.getClassLoader().getResourceAsStream(file.getPath()));
            log.info("{} successfully read from properties file {}", attributeName, file.getName());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return prop.getProperty(attributeName);
    }
}
