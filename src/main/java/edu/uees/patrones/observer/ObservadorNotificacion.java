package edu.uees.patrones.observer;

public class ObservadorNotificacion implements ObservadorReserva {

    @Override
    public void actualizar(String estado) {
        System.out.println(
            "Notificacion: el estado de la reserva cambio a " + estado
        );
    }
}