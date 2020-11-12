package pages;

public class PageFactory {
    public static BasePage getPageByIdentifier(String identifier){
        switch (identifier){
            case MainPage.PAGE_IDENTIFIER:
                return new MainPage();
            case ThisDayEventsPage.PAGE_IDENTIFIER:
                return new ThisDayEventsPage();
            default: throw new IllegalArgumentException(String.format("Page '%s' doesn't exist"));
        }
    }
}
