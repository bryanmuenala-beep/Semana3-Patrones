package edu.uees.patrones.strategy;

public class CancelacionPrioritaria implements PoliticaCancelacion {

    @Override
    public boolean puedeCancelar(int horasAntes) {
        return horasAntes >= 2;
    }
}