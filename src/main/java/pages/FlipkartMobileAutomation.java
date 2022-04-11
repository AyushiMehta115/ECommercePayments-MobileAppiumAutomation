package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testdriver.Shell;
import utility.TestInitilization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;


public class FlipkartMobileAutomation extends Shell{
    WebDriverWait wait;
    /**
     * Given("User can launch Flipkart Application on mobile")
     * @return
     */
    public Boolean userCanLaunchFlipkartApplicationOnMobile() {
        Boolean strfail=false;
        try {
            TestInitilization.testInitialization();
           // MobileElement titlePage=(MobileElement) driver.findElementByAccessibilityId("Flipkart");

        } catch (Exception e) {
            strfail=true;
            e.printStackTrace();
        }
        return strfail;
    }

   // And("User selects Language as <language>")
    public void userSelectsLanguageAsLanguage(String language) {

        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.flipkart.android:id/language_list")));

        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(560,1617))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(611,280))
                .release()
                .perform();

        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        (new TouchAction(driver)).tap(PointOption.point(112, 1933)).perform();
        System.out.println("User selects language as "+language);
    }

    //And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        MobileElement continueButton=driver.findElementById("com.flipkart.android:id/select_btn");
        continueButton.click();
    }

    //When("User clicks on Login button")
    public MobileElement userClicksOnLoginButton() {
        MobileElement flipkartHome = null;
        try {
            flipkartHome = driver.findElementByAccessibilityId("Flipkart home");

            (new TouchAction(driver)).tap(PointOption.point(1000, 196)).perform();

            MobileElement signUpNum = (MobileElement) driver.findElementById("com.google.android.gms:id/credential_primary_label");
            signUpNum.click();

        } catch(Exception e){
            e.printStackTrace();
        }
        return flipkartHome;
    }

    //And("User enters username and clicks Continue")
    public void userEntersUsernameAndClicksContinue() {
        try {
            (new TouchAction(driver)).tap(PointOption.point(248, 627)).perform();
            MobileElement phoneNum = (MobileElement) driver.findElementByAccessibilityId("Phone Number");

            MobileElement contButton = (MobileElement) driver.findElementById("com.flipkart.android:id/button");
            contButton.click();

            MobileElement el1 = (MobileElement) driver.findElementById("com.flipkart.android:id/phone_input");
            el1.sendKeys(prop.getProperty("password"));

            MobileElement el2 = (MobileElement) driver.findElementById("com.flipkart.android:id/button");
            el2.click();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    //And("User gets auto-logged in by auto-capturing and entering OTP")
    public void userGetsAutoLoggedInByAutoCapturingAndEnteringOTP() {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver,20);
        WebElement presence=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.flipkart.android:id/cart_bg_icon")));

        //MobileElement cart = (MobileElement) driver.findElementById("com.flipkart.android:id/cart_bg_icon");
        if (presence.isDisplayed()) {
            (new TouchAction(driver)).tap(PointOption.point(141, 333)).perform();
        }
    }

    //Then("User clicks on Search text Box and enters Search Item as {}")
    public void userClicksOnSearchTextBoxAndEntersSearchItemAsSearchItem(String searchItem) {

            MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Search grocery products");
            el5.sendKeys(searchItem);
            MobileElement el6 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]");
            el6.click();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            MobileElement noLocAccess = (MobileElement) driver.findElementById("com.flipkart.android:id/not_now_button");
            noLocAccess.click();
        }

    //And("User selects item from the displayed list")
    public void userSelectsItemFromTheDisplayedList() {
        List<WebElement> list=new ArrayList<>();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        WebElement item1=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView"));
        WebElement item2=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.ImageView"));
        WebElement item3=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]"));
        WebElement item4=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.ImageView[1]"));

        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

            if(i==0){
                list.get(i).click();
            }
        }

    }

    //And("User checks availability of product and clicks on order It button")
    public void userChecksAvailabilityOfProductAndClicksOnOrderItButton() {
        MobileElement orderButton = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
        orderButton.click();
    }

    //And("User selects required size as {} and clicks on Continue button")
    public void userSelectsRequiredSizeAsSize(String size) {
        Map<String,WebElement> map=new HashMap<>();

        WebElement size1=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
        WebElement size2=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
        WebElement size3=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
        WebElement size4=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
        //WebElement size5=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));

        map.put("XS",size1);
        map.put("S",size2);
        map.put("M",size3);
        map.put("L",size4);


        for (Map.Entry<String,WebElement> entry : map.entrySet()) {

            if(size.equalsIgnoreCase(entry.getKey())){
                size2.click();
            }
        }

        MobileElement continueButton = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView"));
        continueButton.click();
    }

    //And("User validate payment details and click on Continue button")
    public void userValidatePaymentDetailsAndClickOnContinueButton() {
        String address=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).getText();
        String price=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView")).getText();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
    }

}


