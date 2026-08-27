package exercicio;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho do array");
        int size = input.nextInt();
        input.nextLine();
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double average = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite o valor para a posição %d", i + 1);
            array[i] = input.nextInt();
            input.nextLine();
            sum += array[i];

            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        average = (sum/array.length);
        System.out.println("Valor da soma dos elementos do array " + sum);
        System.out.printf("Valor da média do array %.1f %n", average);
        System.out.println("Menor valor do array " + min);
        System.out.println("Maior valor do array " + max);

    }
}
