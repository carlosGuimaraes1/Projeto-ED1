package exercicio;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mensagem = "Informe um número inteiro";
        boolean continuar = true;
        int num = 0;

        while (continuar){
            System.out.println(mensagem);
            num = input.nextInt();
            if (num<0){
                System.out.println("Valor invalido");
                continue;
            }
            continuar = false;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
