package edu.uees.patrones.strategy;

public class DemoStrategy {

    public static void main(String[] args) {

        GestorCancelacion gestor =
                new GestorCancelacion(new CancelacionNormal());

        int horasAntes = 10;

        mostrarResultado("Politica normal", gestor, horasAntes);

        gestor.setPolitica(new CancelacionPrioritaria());
        System.out.println();
        mostrarResultado("Politica prioritaria", gestor, horasAntes);

        gestor.setPolitica(new CancelacionGrupal());
        System.out.println();
        mostrarResultado("Politica grupal", gestor, horasAntes);
    }

    private static void mostrarResultado(
            String nombrePolitica,
            GestorCancelacion gestor,
            int horasAntes) {

        System.out.println(nombrePolitica + ":");
        System.out.println(
                "¿Puede cancelar con " + horasAntes + " horas de anticipacion? "
                        + gestor.puedeCancelar(horasAntes)
        );
    }
}