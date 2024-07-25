package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.HomePage;
import ui.SearchResultsPage;

public class SearchAndChoose implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.btnSearchDestiny),
                Click.on(SearchResultsPage.secondFoundItem),
                Click.on(SearchResultsPage.chooseRoom),
                Click.on(SearchResultsPage.chooseFirstOptionStandby)
        );
    }
}
