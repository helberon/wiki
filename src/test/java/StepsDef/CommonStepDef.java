package StepsDef;

import driverFactory.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.BasePage;
import pages.MainPage;
import pages.PageFactory;

@Slf4j
public class CommonStepDef {

    @Given("^I open '(.*)'$")
    public void goToMainPage(String pageIdentifier) {
        log.info("Opening main page");
        BasePage page = PageFactory.getPageByIdentifier(pageIdentifier);
        page.openPage();
    }

    @And("Click on current day in 'On this day' section")
    public void currentDayClick(){
        MainPage page = new MainPage();
        page.clickOnThisDay();
    }

    @Then("^I check page '(.*)' opened$")
    public void simpleTest(String pageIdentifier) {
        log.info("Getting current URL");
        BasePage page = PageFactory.getPageByIdentifier(pageIdentifier);
        Assert.assertTrue(page.isOpened());
    }


}
