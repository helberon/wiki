package pages;

import driverFactory.DriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public abstract String getHeaderText();

    public abstract boolean isOpened();

    public abstract void openPage();
}
