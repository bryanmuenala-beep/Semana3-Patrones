package edu.uees.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class ReservaObservable {

    private EstadoReserva estado;
    private final List<ObservadorReserva> observadores = new ArrayList<>();

    public void agregarObservador(ObservadorReserva observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorReserva observador) {
        observadores.remove(observador);
    }

    public void cambiarEstado(String nuevoEstado) {
        cambiarEstado(EstadoReserva.valueOf(nuevoEstado));
    }

    public void cambiarEstado(EstadoReserva nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorReserva observador : observadores) {
            observador.actualizar(estado.name());
        }
    }

    public String getEstado() {
        return estado != null ? estado.name() : null;
    }
}