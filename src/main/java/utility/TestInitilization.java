package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import testdriver.Shell;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestInitilization  extends Shell {

    public static void testInitialization() {

        System.out.println("========================================================================================");
        System.out.println("                         Commencing Test Execution                                      ");
        System.out.println("========================================================================================");

        //-------initializing screenshot folder.
        utillClass.initializeScreenshotFolder();

        //-------Calling Driver Class
        log.info("Initiating Drivers");
        appInitialization();
    }


    public static void appInitialization(){
        try {
            System.out.println("Before Class method");
            DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0.0");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SM-G975F");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID,"R58M4318EGA");
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
            // desiredCapabilities.setCapability(MobileCapabilityType.APP,"");
            desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
            desiredCapabilities.setCapability("appPackage","com.flipkart.android");
            desiredCapabilities.setCapability("appActivity","com.flipkart.android.SplashActivity");

            URL url=new URL("http://127.0.0.1:4723/wd/hub");

            driver=new AppiumDriver(url,desiredCapabilities);
            //driver=new AndroidDriver<MobileElement>(url,desiredCapabilities);
            //driver=new AndroidDriver(url,desiredCapabilities);

        } catch (Exception e) {
            System.out.println("Cause is: "+e.getCause());
            System.out.println("Message is: "+e.getMessage());
            e.printStackTrace();
        }
    }


    public static void testCompletion() {
        //-------Closing the Automation session
        quitApp();

        System.out.println("========================================================================================");
        System.out.println("                         Wrapping Test Execution                                      ");
        System.out.println("========================================================================================");
    }

    //-------Close all browser
    public static void closeApp() {
        driver.close();
        log.info("Closing browser");
    }

    //-------Quit browsers
    public static void quitApp() {
        driver.quit();
        log.info("Quiting application");
    }
}
