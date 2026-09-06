package edu.uees.patrones.observer;

public class ObservadorPanel implements ObservadorReserva {

    @Override
    public void actualizar(String estado) {
        System.out.println(
            "Panel: se actualizo el estado de la reserva a " + estado
        );
    }
}