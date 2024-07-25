package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.FinishBookingPage;

public class FillFormCreditCard implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                SendKeys.of("4474118355632240").into(FinishBookingPage.inputCardNumber),
                SendKeys.of("4474118355631325").into(FinishBookingPage.inputCardNumber),
                SendKeys.of("Jose Hurtado").into(FinishBookingPage.inputHolderName),
                SendKeys.of("03/28").into(FinishBookingPage.inputExpirationDate),
                SendKeys.of("111").into(FinishBookingPage.inputCvv)
        );
    }
}
