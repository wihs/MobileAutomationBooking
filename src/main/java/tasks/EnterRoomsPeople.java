package tasks;

import interactions.Scrolling;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import ui.HomePage;
import ui.SelectRoomsPeoplePage;

public class EnterRoomsPeople implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.btnRoomsPeople),
                Click.on(SelectRoomsPeoplePage.btnMoreChild)
        );
        Scrolling.scrollAndroid();
        actor.attemptsTo(
                Click.on(SelectRoomsPeoplePage.btnOkAgeChild),
                Click.on(SelectRoomsPeoplePage.btnApply)

        );
    }


}
