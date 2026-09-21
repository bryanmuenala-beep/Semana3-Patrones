package edu.uees.patrones.strategy;

public abstract class PoliticaCancelacionBase implements PoliticaCancelacion {

    private final int horasMinimas;

    protected PoliticaCancelacionBase(int horasMinimas) {
        this.horasMinimas = horasMinimas;
    }

    @Override
    public boolean puedeCancelar(int horasAntes) {
        return horasAntes >= horasMinimas;
    }
}