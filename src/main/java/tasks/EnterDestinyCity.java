package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.HomePage;
import ui.SelectDestinyPage;

public class EnterDestinyCity implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.btnEnterDestiny),
                SendKeys.of("Cusco").into(SelectDestinyPage.txtEnterDestiny),
                Click.on(SelectDestinyPage.option1Destiny)
        );
    }
}
