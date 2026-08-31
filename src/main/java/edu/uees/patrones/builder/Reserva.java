package edu.uees.patrones.builder;

public class Reserva {

    private final String estudiante;
    private final String tutor;
    private final String fecha;
    private final String hora;

    private final String modalidad;
    private final String tema;
    private final String observaciones;

    public Reserva(
            String estudiante,
            String tutor,
            String fecha,
            String hora,
            String modalidad,
            String tema,
            String observaciones) {

        this.estudiante = estudiante;
        this.tutor = tutor;
        this.fecha = fecha;
        this.hora = hora;
        this.modalidad = modalidad;
        this.tema = tema;
        this.observaciones = observaciones;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public String getTutor() {
        return tutor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getTema() {
        return tema;
    }

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "estudiante='" + estudiante + '\'' +
                ", tutor='" + tutor + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", tema='" + tema + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}