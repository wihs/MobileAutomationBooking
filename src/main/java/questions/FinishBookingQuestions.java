package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.FinishBookingPage;

public class FinishBookingQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return FinishBookingPage.textTotalAmount.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new FinishBookingQuestions();
    }
}
