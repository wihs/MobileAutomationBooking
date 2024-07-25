package ui;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import util.Utility;

public class SearchResultsPage {

//    public static final Target secondFoundItem = Target.the("secondFoundItem")
//            .located(AppiumBy.xpath("(//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]"));

    public static final Target secondFoundItem = Target.the("secondFoundItem")
            .located(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]"));


    public static final Target chooseRoom = Target.the("chooseRoom")
            .located(AppiumBy.id("com.booking:id/select_room_cta"));

    public static final Target chooseFirstOptionStandby = Target.the("chooseFirstOptionStandby")
            .located(AppiumBy.id("com.booking:id/recommended_block_reserve_button"));






//    public static void clicSecondItem(){
//        AppiumDriver driver = Utility.getDriver();
//        String text="";
//        try {
//            for (int i = 1; i < 5; i++) {
//                text=driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+i+"]/android.widget.FrameLayout/android.widget.TextView")).getText();
//                if(text.contains("alojamientos")){
//                    driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+i+2+"]")).click();
//                }
//            }
//        }catch (Exception exception){
//            exception.getStackTrace();
//        }
//    }

}
