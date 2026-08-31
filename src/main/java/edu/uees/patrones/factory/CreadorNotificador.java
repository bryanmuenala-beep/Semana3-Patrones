package edu.uees.patrones.factory;

public abstract class CreadorNotificador {

    public abstract Notificador crearNotificador();

    public void enviarNotificacion(String destinatario, String mensaje) {
        Notificador notificador = crearNotificador();
        notificador.enviar(destinatario, mensaje);
    }
}