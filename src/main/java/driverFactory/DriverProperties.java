package driverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverProperties {
    static String propFileName = "src/main/resources/config.properties";

    public static Properties getPropertiesFile(String fileLocation){
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(fileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
