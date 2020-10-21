package StepsDef;

import Steps.DefaultStepsData;
import driverFactory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@Slf4j
public class CommonStepDef extends DefaultStepsData {
    private WebDriver driver;

    @Given("I am on the main page")
    public void goToMainPage() {
        log.info("Opening main page");
        driver = DriverManager.getDriver();
        driver.get("https://www.wikipedia.org/");
    }

    @Then("I want to know that I am on right page")
    public void simpleTest() {
        log.info("Getting current URL");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.wikipedia.org/");
    }

    @After
    public void closeBrowser() {
        log.info("Closing driver");
        DriverManager.closeDriver();
        Assert.assertTrue(driver.toString().contains("null"));
    }
}
