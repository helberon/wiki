package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThisDayEventsPage extends BasePage{

    public static final String PAGE_IDENTIFIER = "This Day Page";

    @FindBy(xpath = "//table[@class='toccolours floatright']//a[@class='mw-selflink selflink']")
    private WebElement currentDay;

    @Override
    public String getHeaderText() {
        return null;
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    @Override
    public void openPage() {

    }

    public void chooseTomorrowDay(){

    }
}
