package edu.uees.patrones.factory;

public class DemoFactory {

    public static void main(String[] args) {
        enviarCorreo();
        enviarSMS();
        enviarPush();
        enviarWhatsApp();
    }

    private static void enviarCorreo() {
        CreadorNotificador creadorCorreo = new CreadorCorreo();
        creadorCorreo.enviarNotificacion(
                "estudiante@uees.edu.ec",
                "Su tutoria ha sido confirmada."
        );
    }

    private static void enviarSMS() {
        CreadorNotificador creadorSMS = new CreadorSMS();
        creadorSMS.enviarNotificacion(
                "0999999999",
                "Recordatorio: tiene una tutoria programada."
        );
    }

    private static void enviarPush() {
        CreadorNotificador creadorPush = new CreadorPush();
        creadorPush.enviarNotificacion(
                "Estudiante",
                "Su tutor ha actualizado el horario de la tutoria."
        );
    }

    private static void enviarWhatsApp() {
        CreadorNotificador creadorWhatsApp = new CreadorWhatsApp();
        creadorWhatsApp.enviarNotificacion(
                "0988888888",
                "Su reserva de tutoria ha sido registrada correctamente."
        );
    }
}