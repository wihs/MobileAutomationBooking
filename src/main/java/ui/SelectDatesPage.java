package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDatesPage {

    public static final Target btnFecIni = Target.the("btnFecIni")
            .located(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.booking:id/calendar_month_list\"]/android.view.ViewGroup[2]/android.view.View[1]/android.view.View[14]"));

    public static final Target btnFecFin = Target.the("btnFecFin")
            .located(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.booking:id/calendar_month_list\"]/android.view.ViewGroup[2]/android.view.View[1]/android.view.View[28]"));

    public static final Target btnSelectDates = Target.the("btnFecFin")
            .located(AppiumBy.id("com.booking:id/facet_date_picker_confirm"));

}
