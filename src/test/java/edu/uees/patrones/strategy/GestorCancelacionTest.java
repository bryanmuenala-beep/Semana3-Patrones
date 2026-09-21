package edu.uees.patrones.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorCancelacionTest {

    @Test
    void debeAplicarPoliticaNormal() {
        GestorCancelacion gestor =
                new GestorCancelacion(new CancelacionNormal());

        assertTrue(gestor.puedeCancelar(24));
        assertFalse(gestor.puedeCancelar(23));
    }

    @Test
    void debeAplicarPoliticaPrioritaria() {
        GestorCancelacion gestor =
                new GestorCancelacion(new CancelacionPrioritaria());

        assertTrue(gestor.puedeCancelar(2));
        assertFalse(gestor.puedeCancelar(1));
    }

    @Test
    void debeAplicarPoliticaGrupal() {
        GestorCancelacion gestor =
                new GestorCancelacion(new CancelacionGrupal());

        assertTrue(gestor.puedeCancelar(48));
        assertFalse(gestor.puedeCancelar(47));
    }

    @Test
    void debePermitirCambiarLaPolitica() {
        GestorCancelacion gestor =
                new GestorCancelacion(new CancelacionNormal());

        assertFalse(gestor.puedeCancelar(10));

        gestor.setPolitica(new CancelacionPrioritaria());

        assertTrue(gestor.puedeCancelar(10));
    }
}