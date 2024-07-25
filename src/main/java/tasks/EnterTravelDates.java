package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.HomePage;
import ui.SelectDatesPage;

public class EnterTravelDates implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Click.on(HomePage.btnEnterDates),
                Click.on(SelectDatesPage.btnFecIni),
                Click.on(SelectDatesPage.btnFecFin),
                Click.on(SelectDatesPage.btnSelectDates)
        );
    }
}
