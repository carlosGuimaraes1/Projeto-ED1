package projeto.algoritmos;

import projeto.modelo.Resultado;

public class Insercao {

    public static Resultado ordenar(int[] vetor, String tipoVetor) {

        Resultado resultado = new Resultado();

        resultado.setAlgoritmo("Insercao");
        resultado.setTipoVetor(tipoVetor);
        resultado.setN(vetor.length);

        long comparacoes = 0;
        long movimentacoes = 0;

        long inicio = System.nanoTime();

        for (int i = 1; i < vetor.length; i++) {

            int eleito = vetor[i];
            int j = i - 1;

            while (j >= 0) {

                comparacoes++;

                if (vetor[j] > eleito) {

                    vetor[j + 1] = vetor[j];

                    movimentacoes++;

                    j--;

                } else {
                    break;
                }
            }

            vetor[j + 1] = eleito;

            movimentacoes++;
        }

        long fim = System.nanoTime();

        resultado.setComparacoes(comparacoes);
        resultado.setTrocas(movimentacoes);
        resultado.setTempoMs((fim - inicio) / 1_000_000.0);

        return resultado;
    }
}
