package exercicio;

import java.util.Arrays;

public class Exe10 {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int n){
        int[] values = new int[n];
        int anterior = 0 , atual = 1, proximo=0;
        for (int i = 1; i <n; i++) {
            proximo = anterior+atual;
            values[i] = proximo;
            anterior = atual;
            atual = proximo;
        }
        System.out.println(Arrays.toString(values));
    }
}
