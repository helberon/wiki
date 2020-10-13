import driverFactory.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
    private WebDriver driver;

    @BeforeTest
    public void setupPage() {
        driver = DriverManager.getDriver();
        driver.get("https://www.wikipedia.org/");
    }

    @Test
    public void helloTest(){
        System.out.println("Hello there!");
    }

    @AfterTest
    public void clearEnv() {
        DriverManager.closeDriver();
    }
}
