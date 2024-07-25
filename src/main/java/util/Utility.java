package util;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static AppiumDriver getDriver(){
        WebDriver driver = Serenity.getDriver();
        if(driver instanceof WebDriverFacade){
            return (AppiumDriver) ((WebDriverFacade) driver).getProxiedDriver();
        }else{
            return (AppiumDriver) driver;
        }
    }
}
