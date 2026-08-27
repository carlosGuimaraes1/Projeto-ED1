package projeto.util;

import java.util.Arrays;
import java.util.Random;

public class GeradorVetores {

    private static final Random RANDOM = new Random();

    public static int[] getVetor(int n) {

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = RANDOM.nextInt(1_000_001);
        }

        return vetor;
    }

    public static int[] getVetorCrescente(int n) {

        int[] vetor = getVetor(n);

        Arrays.sort(vetor);

        return vetor;
    }

    public static int[] getVetorDecrescente(int n) {

        int[] vetor = getVetorCrescente(n);

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {

            int aux = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = aux;

            inicio++;
            fim--;
        }

        return vetor;
    }

    public static int[] getVetorAleatorio(int n) {
        return getVetor(n);
    }
}
