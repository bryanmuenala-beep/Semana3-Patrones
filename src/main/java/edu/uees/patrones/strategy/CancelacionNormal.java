package edu.uees.patrones.strategy;

public class CancelacionNormal implements PoliticaCancelacion {

    @Override
    public boolean puedeCancelar(int horasAntes) {
        return horasAntes >= 24;
    }
}