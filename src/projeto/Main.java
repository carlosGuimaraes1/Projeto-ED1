package projeto;

import projeto.experimento.ExecutorExperimentos;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=========================================="
        );

        System.out.println(
                " EXPERIMENTO - ALGORITMOS DE ORDENACAO"
        );

        System.out.println(
                "=========================================="
        );

        ExecutorExperimentos.executar();

        System.out.println();
        System.out.println(
                "Experimento finalizado."
        );
    }
}
