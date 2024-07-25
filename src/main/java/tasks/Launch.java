package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import ui.HomePage;

public class Launch implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.btnCloseStartSession)
        );
    }

//    public static void closeStartSession(){
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                Click.on(HomePage.btnCloseStartSession)
//        );
//    }
}
