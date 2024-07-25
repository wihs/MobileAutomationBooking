package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SelectRoomsPeoplePage {

    public static final Target btnMoreChild = Target.the("btnMoreChild")
            .located(AppiumBy.xpath("(//android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_add_button\"])[3]"));

    public static final Target btnSelectAgeChild = Target.the("btnSelectAgeChild")
            .located(AppiumBy.accessibilityId("android:id/numberpicker_input"));

    public static final Target scrollAgeChild = Target.the("scrollAgeChild")
            .located(AppiumBy.xpath("//android.widget.Button[@text=\"17 años\"]"));

    public static final Target btnOkAgeChild = Target.the("btnOkAgeChild")
            .located(AppiumBy.id("android:id/button1"));

    public static final Target btnApply = Target.the("btnApply")
            .located(AppiumBy.id("com.booking:id/group_config_apply_button"));

}
