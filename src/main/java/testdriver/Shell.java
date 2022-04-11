package testdriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import utility.UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Shell {

    //-------Initializing class variables
    public static UtilityClass utillClass;
    public static Logger log;
    public static Properties prop;
    public static AppiumDriver<MobileElement> driver;


    //-------Calling basic Log functions in static block
    static {
        utillClass = new UtilityClass();
        utillClass.setCurrentDateTime();
        utillClass.deleteOldLogfiles();

        //-------Config Log4j Property file
        PropertyConfigurator.configure("./src/main/java/config/Log4j.properties");
        log = Logger.getLogger("MyFW");
    }

    public File file;
    public String PropertyFilePath = ("./src/main/java/config/config.properties");

    //-------importing configuration files in Constructor
    public Shell() {
        try {
            prop = new Properties();
            FileInputStream fip = new FileInputStream(PropertyFilePath);
            prop.load(fip);
        } catch (Exception e) {
            System.out.println("Config file not found");
            e.printStackTrace();
        }
    }
}
