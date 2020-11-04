package pages;

import driverFactory.DriverManager;
import org.openqa.selenium.By;

public class MainPage extends BasePage{
    public static final String PAGE_IDENTIFIER = "Main Page";
    public static final String HEADER_NAME = "Wikipedia";
    private static final String PAGE_URL = "https://www.wikipedia.org/";

    private static final String HEADER_XPATH = "//title";

    @Override
    public String getHeaderText() {
        return DriverManager.getDriver().findElement(By.xpath(HEADER_XPATH)).getText();
    }

    @Override
    public boolean isOpened() {
        return DriverManager.getDriver().getCurrentUrl().equals(PAGE_URL) && getHeaderText().equals(HEADER_NAME);
    }

    @Override
    public void openPage() {
        DriverManager.getDriver().get(PAGE_URL);
    }
}
