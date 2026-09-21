package edu.uees.patrones.builder;

public class ValidadorReserva {

    public void validarCamposObligatorios(
            String estudiante,
            String tutor,
            String fecha,
            String hora) {

        if (estudiante == null || estudiante.isBlank()) {
            throw new IllegalStateException("El estudiante es obligatorio.");
        }

        if (tutor == null || tutor.isBlank()) {
            throw new IllegalStateException("El tutor es obligatorio.");
        }

        if (fecha == null || fecha.isBlank()) {
            throw new IllegalStateException("La fecha es obligatoria.");
        }

        if (hora == null || hora.isBlank()) {
            throw new IllegalStateException("La hora es obligatoria.");
        }
    }
}