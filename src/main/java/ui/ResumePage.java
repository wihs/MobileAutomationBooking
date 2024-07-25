package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ResumePage {

    public static final Target btnLastStep = Target.the("btnLastStep")
            .located(AppiumBy.id("com.booking:id/action_button"));
}
