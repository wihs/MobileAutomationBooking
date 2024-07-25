package interactions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import util.Utility;

import java.time.Duration;
import java.util.Collections;

public class Scrolling {

    public static  void scrollAndroid(){
        AppiumDriver driver = Utility.getDriver();
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth()/2;
        int startY = size.getHeight()/2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.20);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
        Sequence sequence = new Sequence(finger1,1)
                .addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),startX,startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1,Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100),PointerInput.Origin.viewport(),endX,endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
    }

}
