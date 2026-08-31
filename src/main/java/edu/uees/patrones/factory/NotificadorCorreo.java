package edu.uees.patrones.factory;

public class NotificadorCorreo implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println(
            "Enviando correo a " + destinatario + ": " + mensaje
        );
    }
}