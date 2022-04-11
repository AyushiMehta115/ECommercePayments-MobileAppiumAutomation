package stepdefs;

import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FlipkartMobileAutomation;
import utility.UtilityClass;

import static testdriver.Shell.log;

public class StepsHome {
    FlipkartMobileAutomation loginPage=new FlipkartMobileAutomation();
    private Scenario scenario;

    @Before
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("User can launch Flipkart Application on mobile")
    public void userCanLaunchFlipkartApplicationOnMobile() {
        Boolean strfail=loginPage.userCanLaunchFlipkartApplicationOnMobile();
        if(strfail.equals(true)){
            Assert.fail();
        }
        scenario.log("Flipkart application open successfully");
        log.info("Flipkart application open successfully");
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User selects Language as {}")
    public void userSelectsLanguageAsLanguage(String lang) {
        loginPage.userSelectsLanguageAsLanguage(lang);
        log.info("User preferred Language is set successfully");
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        loginPage.userClicksOnContinueButton();
        log.info("User gets navigated to flipkart home page successfully");
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }


    @When("User clicks on Login button")
    public void userClicksOnLoginButton() {
        MobileElement flipkartHome=loginPage.userClicksOnLoginButton();
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());

    }

    @And("User enters username and clicks Continue")
    public void userEntersUsernameAndClicksContinue() {
        loginPage.userEntersUsernameAndClicksContinue();
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User gets auto-logged in by auto-capturing and entering OTP")
    public void userGetsAutoLoggedInByAutoCapturingAndEnteringOTP() {
        loginPage.userGetsAutoLoggedInByAutoCapturingAndEnteringOTP();
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @Then("User clicks on Search text Box and enters Search Item as {}")
    public void userClicksOnSearchTextBoxAndEntersSearchItemAsSearchItem(String searchItem) {
        loginPage.userClicksOnSearchTextBoxAndEntersSearchItemAsSearchItem(searchItem);
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User selects item from the displayed list")
    public void userSelectsItemFromTheDisplayedList() {
        loginPage.userSelectsItemFromTheDisplayedList();
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User checks availability of product and clicks on order It button")
    public void userChecksAvailabilityOfProductAndClicksOnOrderItButton() {
        loginPage.userChecksAvailabilityOfProductAndClicksOnOrderItButton();
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User selects required size as {} and clicks on Continue button")
    public void userSelectsRequiredSizeAsSize(String size) {
        loginPage.userSelectsRequiredSizeAsSize(size);
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }

    @And("User validate payment details and click on Continue button")
    public void userValidatePaymentDetailsAndClickOnContinueButton() {
        loginPage.userValidatePaymentDetailsAndClickOnContinueButton();
        UtilityClass.captureScreenshotToScenario(scenario, UtilityClass.captureScreenshotOfBrowser());
    }
}
