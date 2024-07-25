package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class FinishBookingPage {

    public static final Target inputCardNumber = Target.the("inputCardNumber")
            .located(AppiumBy.id("com.booking:id/new_credit_card_number_edit"));

    public static final Target inputHolderName = Target.the("inputHolderName")
            .located(AppiumBy.id("com.booking:id/new_credit_card_holder_edit"));

    public static final Target inputExpirationDate = Target.the("inputExpirationDate")
            .located(AppiumBy.id("com.booking:id/new_credit_card_expiry_date_edit"));

    public static final Target inputCvv = Target.the("inputCvv")
            .located(AppiumBy.id("com.booking:id/new_credit_card_cvc_edit_text"));

    public static final Target btnBookNow = Target.the("btnBookNow")
            .located(AppiumBy.id("com.booking:id/action_button"));

    public static final Target textTotalAmount = Target.the("textTotalAmount")
            .located(AppiumBy.xpath("//android.widget.FrameLayout/android.widget.TextView[@resource-id=\"com.booking:id/title\"]"));


}
