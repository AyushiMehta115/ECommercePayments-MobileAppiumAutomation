package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import utility.TestInitilization;

import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@QATest",
        glue = {"stepdefs"},
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber.json"})



public class RunnerClass {

    @BeforeClass
    public static void setup() {

            System.out.println("Before Class method");

    }



    @AfterClass
    public static void tearDown(){
        System.out.println("After Class method");
        TestInitilization.testCompletion();
    }
}
