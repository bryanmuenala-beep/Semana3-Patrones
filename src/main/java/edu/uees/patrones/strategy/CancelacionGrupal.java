package edu.uees.patrones.strategy;

public class CancelacionGrupal implements PoliticaCancelacion {

    @Override
    public boolean puedeCancelar(int horasAntes) {
        return horasAntes >= 48;
    }
}