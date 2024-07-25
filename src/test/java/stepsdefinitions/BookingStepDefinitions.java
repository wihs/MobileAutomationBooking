package stepsdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.FinishBookingQuestions;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class BookingStepDefinitions {

    @Dado("que {string} quiere usar la app de booking")
    public void queQuiereUsarLaAppDeBooking(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(new Launch());
    }

    @Cuando("realiza el registro de la {string} destino a buscar")
    public void realizaElRegistroDeLaDestinoABuscar(String ciudad) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new EnterDestinyCity()
        );
    }

    @Y("realiza el registro de las fechas a buscar")
    public void realizaElRegistroDeLasFechasABuscar(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                new EnterTravelDates()
        );
    }

    @Y("realiza el registro de las habitaciones y personas")
    public void realizaElRegistroDeLasHabitacionesYPersonas(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                new EnterRoomsPeople()
        );
    }

    @Y("seleccionar la segunda opcion de los resultados")
    public void seleccionarLaSegundaOpcionDeLosResultados() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SearchAndChoose()
        );
    }

    @Y("llenar el formulario de reserva")
    public void llenarElFormularioDeReserva() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new FillFormInfo()
        );
    }
    @Entonces("verificar los datos de reserva")
    public void verificarLosDatosDeReserva() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new ResumenBooking()
        );
    }

    @Y("llena los datos de la tarjeta")
    public void llenaLosDatosDeLaTarjeta() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new FillFormCreditCard()
        );
    }

    @Entonces("verifica y realiza reserva")
    public void verificaYRealizaReserva() {
        String expectedTotalAmount = "US$8.143";
        OnStage.theActorInTheSpotlight().should(
                seeThat("FinishBooking TotalAmount", FinishBookingQuestions.value(),equalTo(expectedTotalAmount))
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                new FinishBooking()
        );
    }

}
