package edu.uees.patrones.observer;

public class ObservadorCalendario implements ObservadorReserva {

    @Override
    public void actualizar(String estado) {
        System.out.println(
            "Calendario: se actualizo la reserva con estado " + estado
        );
    }
}