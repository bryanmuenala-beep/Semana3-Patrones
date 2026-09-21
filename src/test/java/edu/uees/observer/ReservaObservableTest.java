package edu.uees.patrones.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaObservableTest {

    @Test
    void debeCambiarElEstadoDeLaReserva() {
        ReservaObservable reserva = new ReservaObservable();

        reserva.cambiarEstado("CONFIRMADA");

        assertEquals("CONFIRMADA", reserva.getEstado());
    }

    @Test
    void debeNotificarAlObservadorCuandoCambiaElEstado() {
        ReservaObservable reserva = new ReservaObservable();

        String[] estadoRecibido = new String[1];

        ObservadorReserva observador = estado ->
                estadoRecibido[0] = estado;

        reserva.agregarObservador(observador);

        reserva.cambiarEstado("CANCELADA");

        assertEquals("CANCELADA", estadoRecibido[0]);
    }

    @Test
    void debeDejarDeNotificarAUnObservadorEliminado() {
        ReservaObservable reserva = new ReservaObservable();

        int[] notificaciones = {0};

        ObservadorReserva observador = estado ->
                notificaciones[0]++;

        reserva.agregarObservador(observador);
        reserva.cambiarEstado("CONFIRMADA");

        reserva.eliminarObservador(observador);
        reserva.cambiarEstado("CANCELADA");

        assertEquals(1, notificaciones[0]);
    }
}