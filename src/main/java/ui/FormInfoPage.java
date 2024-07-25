package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class FormInfoPage {

    public static final Target inputNombre = Target.the("inputNombre")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[1]"));

    public static final Target inputApellido = Target.the("inputApellido")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[2]"));

//    public static final Target inputEmail = Target.the("inputEmail")
//            .located(AppiumBy.xpath("((//android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"])[1]"));
    public static final Target inputEmail = Target.the("inputEmail")
            .located(AppiumBy.xpath("(//android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"])[1]"));


    public static final Target inputDireccion = Target.the("inputDireccion")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[3]"));

    public static final Target inputCodigoPostal = Target.the("inputCodigoPostal")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[4]"));

    public static final Target inputCiudad = Target.the("inputCiudad")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[5]"));

    public static final Target selectPaisRegion1 = Target.the("selectPaisRegion1")
            .located(AppiumBy.xpath("//javaClass[@resource-id=\"com.booking:id/bstage1_contact_country_value\"]/android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"]"));
    public static final Target selectPaisRegion2 = Target.the("selectPaisRegion2")
            .located(AppiumBy.xpath("(//android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"])[2]"));

//    public static final Target selectPaisRegion = Target.the("secondFoundItem")
//            .located(AppiumBy.xpath("(//android.view.View[@resource-id=\"com.booking:id/bui_input_container_background\"])[8]"));

    public static final Target inputTelefono1 = Target.the("inputTelefono1")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[6]"));
    public static final Target inputTelefono2 = Target.the("inputTelefono2")
            .located(AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"])[3]"));


    public static final Target radioMotivoViajeNegocios = Target.the("radioMotivoViajeNegocios")
            .located(AppiumBy.id("com.booking:id/business_purpose_business"));

    public static final Target radioMotivoViajeOcio = Target.the("radioMotivoViajeOcio")
            .located(AppiumBy.id("com.booking:id/business_purpose_leisure"));

    public static final Target btnNextStep = Target.the("btnNextStep")
            .located(AppiumBy.id("com.booking:id/action_button"));

}
