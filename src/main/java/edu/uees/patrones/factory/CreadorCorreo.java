package edu.uees.patrones.factory;

public class CreadorCorreo extends CreadorNotificador {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorCorreo();
    }
}