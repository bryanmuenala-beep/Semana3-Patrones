package edu.uees.patrones.builder;

public class DemoBuilder {

    public static void main(String[] args) {

        // Reserva 1: completa
        Reserva reservaCompleta = new ReservaBuilder()
                .estudiante("Carlos Mendoza")
                .tutor("Ing. Andrea Perez")
                .fecha("31/08/2026")
                .hora("10:00")
                .modalidad("Virtual")
                .tema("Patrones de diseño")
                .observaciones("Revisar Factory Method y Builder")
                .build();

        // Reserva 2: básica
        Reserva reservaBasica = new ReservaBuilder()
                .estudiante("Maria Lopez")
                .tutor("Ing. Juan Torres")
                .fecha("31/08/2026")
                .hora("14:00")
                .build();

        System.out.println("RESERVA COMPLETA");
        System.out.println(reservaCompleta);

        System.out.println();

        System.out.println("RESERVA BASICA");
        System.out.println(reservaBasica);

        // Prueba de validación
        try {

            Reserva reservaInvalida = new ReservaBuilder()
                    .estudiante("Pedro Ramirez")
                    .fecha("31/08/2026")
                    .hora("16:00")
                    .build();

            System.out.println(reservaInvalida);

        } catch (IllegalStateException e) {

            System.out.println();
            System.out.println("VALIDACION DEL BUILDER");
            System.out.println("Error: " + e.getMessage());
        }
    }
}