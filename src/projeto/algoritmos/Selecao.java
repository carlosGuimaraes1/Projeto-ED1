package projeto.algoritmos;

import projeto.modelo.Resultado;

public class Selecao {

    public static Resultado ordenar(int[] vetor, String tipoVetor) {

        Resultado resultado = new Resultado();

        resultado.setAlgoritmo("Selecao");
        resultado.setTipoVetor(tipoVetor);
        resultado.setN(vetor.length);

        long comparacoes = 0;
        long trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < vetor.length - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {

                comparacoes++;

                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {

                int aux = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = aux;

                trocas++;
            }
        }

        long fim = System.nanoTime();

        resultado.setComparacoes(comparacoes);
        resultado.setTrocas(trocas);
        resultado.setTempoMs((fim - inicio) / 1_000_000.0);

        return resultado;
    }
}
