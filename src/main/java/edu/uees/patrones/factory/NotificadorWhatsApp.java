package edu.uees.patrones.factory;

public class NotificadorWhatsApp implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println(
            "Enviando WhatsApp a " + destinatario + ": " + mensaje
        );
    }
}