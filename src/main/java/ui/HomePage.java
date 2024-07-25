package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target btnCloseStartSession = Target.the("btnEnterDestiny")
            .located(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]"));

    public static final Target btnEnterDestiny = Target.the("btnEnterDestiny")
            .located(AppiumBy.id("com.booking:id/facet_search_box_accommodation_destination"));

    public static final Target btnEnterDates = Target.the("btnEnterDates")
            .located(AppiumBy.accessibilityId("com.booking:id/facet_search_box_accommodation_dates"));

    public static final Target btnRoomsPeople = Target.the("btnRoomsPeople")
            .located(AppiumBy.id("com.booking:id/facet_search_box_accommodation_occupancy"));

    public static final Target btnSearchDestiny = Target.the("btnSearchDestiny")
            .located(AppiumBy.id("com.booking:id/facet_search_box_cta"));
}
