package StepsDef;

import driverFactory.DriverManager;
import io.cucumber.java.After;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks {
    @After
    public void closeBrowser() {
        log.info("Closing driver");
        DriverManager.closeDriver();
    }
}
