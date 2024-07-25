package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

public class Scrolling {

    public static void scrollDown() {
        AppiumDriver driver = Utility.getDriver();

        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

//        new TouchAction(driver)
//                .press(PointOption.point(startX, startY))
//                .waitAction()
//                .moveTo(PointOption.point(startX, endY))
//                .release()
//                .perform();
    }
}
