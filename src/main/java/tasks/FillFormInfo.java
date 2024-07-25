package tasks;

import interactions.Scrolling;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.ClearBy;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import ui.FormInfoPage;

public class FillFormInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean bol=FormInfoPage.inputDireccion.isVisibleFor(actor);
        System.out.println(String.valueOf(bol));
        if(FormInfoPage.inputDireccion.isVisibleFor(actor)){
            System.out.println("Entra if");
            actor.attemptsTo(
                    SendKeys.of("Jose").into(FormInfoPage.inputNombre),
                    SendKeys.of("Hurtado").into(FormInfoPage.inputApellido),
                    SendKeys.of("jhurtado@gmail.com").into(FormInfoPage.inputEmail),
                    SendKeys.of("Calle central").into(FormInfoPage.inputDireccion),
                    SendKeys.of("23052").into(FormInfoPage.inputCodigoPostal),
                    SendKeys.of("Lima").into(FormInfoPage.inputCiudad)
            );
            Scrolling.scrollAndroid();
            actor.attemptsTo(
                    Clear.field(FormInfoPage.selectPaisRegion1),
                    SendKeys.of("Perú").into(FormInfoPage.selectPaisRegion1),
                    SendKeys.of("968921853").into(FormInfoPage.inputTelefono1),
                    Click.on(FormInfoPage.radioMotivoViajeOcio),
                    Click.on(FormInfoPage.btnNextStep)
            );
        }else{
            System.out.println("Entra else");
            actor.attemptsTo(
                    SendKeys.of("Jose").into(FormInfoPage.inputNombre),
                    SendKeys.of("Hurtado").into(FormInfoPage.inputApellido),
                    SendKeys.of("jhurtado@gmail.com").into(FormInfoPage.inputEmail),
                    Clear.field(FormInfoPage.selectPaisRegion2),
                    SendKeys.of("Perú").into(FormInfoPage.selectPaisRegion2),
                    SendKeys.of("968921853").into(FormInfoPage.inputTelefono2),
                    Click.on(FormInfoPage.radioMotivoViajeOcio),
                    Click.on(FormInfoPage.btnNextStep)
            );
        }
    }
}
