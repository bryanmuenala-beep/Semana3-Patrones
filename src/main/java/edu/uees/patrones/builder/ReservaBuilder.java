package edu.uees.patrones.builder;

public class ReservaBuilder {

    private final ValidadorReserva validador = new ValidadorReserva();

    // Campos obligatorios
    private String estudiante;
    private String tutor;
    private String fecha;
    private String hora;

    // Campos opcionales con valores por defecto
    private String modalidad = "Presencial";
    private String tema = "No especificado";
    private String observaciones = "Sin observaciones";

    public ReservaBuilder estudiante(String estudiante) {
        this.estudiante = estudiante;
        return this;
    }

    public ReservaBuilder tutor(String tutor) {
        this.tutor = tutor;
        return this;
    }

    public ReservaBuilder fecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    public ReservaBuilder hora(String hora) {
        this.hora = hora;
        return this;
    }

    public ReservaBuilder modalidad(String modalidad) {
        this.modalidad = modalidad;
        return this;
    }

    public ReservaBuilder tema(String tema) {
        this.tema = tema;
        return this;
    }

    public ReservaBuilder observaciones(String observaciones) {
        this.observaciones = observaciones;
        return this;
    }

    public Reserva build() {

        validador.validarCamposObligatorios(
                estudiante,
                tutor,
                fecha,
                hora
        );

        return new Reserva(
                estudiante,
                tutor,
                fecha,
                hora,
                modalidad,
                tema,
                observaciones
        );
    }
}