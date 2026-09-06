package edu.uees.patrones.strategy;

public class GestorCancelacion {

    private PoliticaCancelacion politica;

    public GestorCancelacion(PoliticaCancelacion politica) {
        this.politica = politica;
    }

    public void setPolitica(PoliticaCancelacion politica) {
        this.politica = politica;
    }

    public boolean puedeCancelar(int horasAntes) {
        return politica.puedeCancelar(horasAntes);
    }
}