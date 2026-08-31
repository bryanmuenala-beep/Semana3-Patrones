package edu.uees.patrones.factory;

public class NotificadorPush implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println(
            "Enviando notificacion Push a " + destinatario + ": " + mensaje
        );
    }
}