package pages;

import driverFactory.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public static final String PAGE_IDENTIFIER = "Main Page";
    public static final String HEADER_NAME = "Wikipedia, the free encyclopedia";
    private static final String PAGE_URL = "https://en.wikipedia.org/wiki/Main_Page/";

    private static final String HEADER_XPATH = "//title";

    @FindBy(xpath = "//div[@id='mp-otd']//b")
    private WebElement currentDay;

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

    public ThisDayEventsPage clickOnThisDay(){
        currentDay.click();
        return new ThisDayEventsPage();
    }
}
