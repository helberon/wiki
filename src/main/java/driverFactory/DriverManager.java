package driverFactory;

import enums.Browsers;
import enums.EnumHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.InputStream;
import java.util.Properties;


public class DriverManager {
    private static WebDriver driver;
//    Properties properties = new Properties();
//    String propFileName = "config.properties";
//    InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
//    properties.load(inputStream);

//    private static String driverName = System.getProperty("driverName");
    private static String driverName = System.getProperty("driver") == null ? "chrome" : System.getProperty("driver");

    public static WebDriver getDriver() {
        if (driver == null) {
            Browsers browser = EnumHelper.valueOf(Browsers.class, driverName);
            switch (browser) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
            }
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
        if (driver != null) {
            driver = null;
        }
    }
}
