package projeto.algoritmos;

import projeto.modelo.Resultado;

public class BolhaOtimizado {

    public static Resultado ordenar(int[] vetor, String tipoVetor) {

        Resultado resultado = new Resultado();

        resultado.setAlgoritmo("Bolha Otimizado");
        resultado.setTipoVetor(tipoVetor);
        resultado.setN(vetor.length);

        long comparacoes = 0;
        long trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < vetor.length - 1; i++) {

            boolean trocou = false;

            for (int j = 0; j < vetor.length - 1 - i; j++) {

                comparacoes++;

                if (vetor[j] > vetor[j + 1]) {

                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                    trocas++;
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }
        }

        long fim = System.nanoTime();

        resultado.setComparacoes(comparacoes);
        resultado.setTrocas(trocas);
        resultado.setTempoMs((fim - inicio) / 1_000_000.0);

        return resultado;
    }
}