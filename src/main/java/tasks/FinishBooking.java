package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.FinishBookingPage;

public class FinishBooking implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Click.on(FinishBookingPage.btnBookNow)
        );
    }
}
