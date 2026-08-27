package exercicio;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        int n1, n2, n3, media = 0;
        Scanner input = new Scanner(System.in);
        int[] notas = new int[3];
        System.out.println("Informe a primeira nota");
        notas[0] = input.nextInt();
        System.out.println("Informe a segunda nota");
        notas[1] = input.nextInt();
        System.out.println("Informe a terceira nota");
        notas[2] = input.nextInt();

        for (int nota : notas) {
            media += nota;
        }
        media = media/3;
        System.out.println("Sua média é "+media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
