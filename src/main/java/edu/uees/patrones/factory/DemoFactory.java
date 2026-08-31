package edu.uees.patrones.factory;

public class DemoFactory {

    public static void main(String[] args) {

        CreadorNotificador creadorCorreo = new CreadorCorreo();
        creadorCorreo.enviarNotificacion(
            "estudiante@uees.edu.ec",
            "Su tutoria ha sido confirmada."
        );

        CreadorNotificador creadorSMS = new CreadorSMS();
        creadorSMS.enviarNotificacion(
            "0999999999",
            "Recordatorio: tiene una tutoria programada."
        );

        CreadorNotificador creadorPush = new CreadorPush();
        creadorPush.enviarNotificacion(
            "Estudiante",
            "Su tutor ha actualizado el horario de la tutoria."
        );

        CreadorNotificador creadorWhatsApp = new CreadorWhatsApp();

creadorWhatsApp.enviarNotificacion(
    "0988888888",
    "Su reserva de tutoria ha sido registrada correctamente."
);
    }
}