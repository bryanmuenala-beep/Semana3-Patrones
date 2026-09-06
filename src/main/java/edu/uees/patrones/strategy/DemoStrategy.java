package edu.uees.patrones.strategy;

public class DemoStrategy {

    public static void main(String[] args) {

        GestorCancelacion gestor =
                new GestorCancelacion(new CancelacionNormal());

        int horasAntes = 10;

        System.out.println("Politica normal:");
        System.out.println(
                "¿Puede cancelar con " + horasAntes + " horas de anticipacion? "
                        + gestor.puedeCancelar(horasAntes)
        );

        gestor.setPolitica(new CancelacionPrioritaria());

        System.out.println();
        System.out.println("Politica prioritaria:");
        System.out.println(
                "¿Puede cancelar con " + horasAntes + " horas de anticipacion? "
                        + gestor.puedeCancelar(horasAntes)
        );

        gestor.setPolitica(new CancelacionGrupal());

        System.out.println();
        System.out.println("Politica grupal:");
        System.out.println(
                "¿Puede cancelar con " + horasAntes + " horas de anticipacion? "
                        + gestor.puedeCancelar(horasAntes)
        );
    }
}