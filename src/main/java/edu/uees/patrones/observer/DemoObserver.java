package edu.uees.patrones.observer;

public class DemoObserver {

    public static void main(String[] args) {

        ReservaObservable reserva = new ReservaObservable();

        reserva.agregarObservador(new ObservadorNotificacion());
        reserva.agregarObservador(new ObservadorCalendario());
        reserva.agregarObservador(new ObservadorPanel());

        System.out.println("Cambio de estado de la reserva:");
        reserva.cambiarEstado("CONFIRMADA");

        System.out.println();

        System.out.println("Nuevo cambio de estado:");
        reserva.cambiarEstado("CANCELADA");
    }
}