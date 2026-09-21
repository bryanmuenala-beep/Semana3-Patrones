package edu.uees.patrones.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaBuilderTest {

    @Test
    void debeCrearReservaCuandoLosDatosObligatoriosSonValidos() {
        Reserva reserva = new ReservaBuilder()
                .estudiante("Carlos Mendoza")
                .tutor("Ing. Andrea Perez")
                .fecha("31/08/2026")
                .hora("10:00")
                .modalidad("Virtual")
                .tema("Patrones de diseño")
                .observaciones("Revisar patrones")
                .build();

        assertNotNull(reserva);
        assertEquals("Carlos Mendoza", reserva.getEstudiante());
        assertEquals("Ing. Andrea Perez", reserva.getTutor());
        assertEquals("31/08/2026", reserva.getFecha());
        assertEquals("10:00", reserva.getHora());
    }

    @Test
    void debeLanzarExcepcionCuandoFaltaTutor() {
        IllegalStateException excepcion = assertThrows(
                IllegalStateException.class,
                () -> new ReservaBuilder()
                        .estudiante("Carlos Mendoza")
                        .fecha("31/08/2026")
                        .hora("10:00")
                        .build()
        );

        assertEquals("El tutor es obligatorio.", excepcion.getMessage());
    }
}