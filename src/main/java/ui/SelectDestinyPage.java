package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDestinyPage {

    public static final Target txtEnterDestiny = Target.the("txtEnterDestiny")
            .located(AppiumBy.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content"));

    public static final Target option1Destiny = Target.the("")
            .located(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
}
