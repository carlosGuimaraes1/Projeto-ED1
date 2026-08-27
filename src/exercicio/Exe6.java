package exercicio;

import java.util.Scanner;

public class Exe6 {
    public static boolean checkPrimo(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void procurarPrimos(int limite) {
        for (int i = 1; i <=limite; i++) {
            if (checkPrimo(i)){
                System.out.printf("%d,",i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o um numero para o limite de busca de números primos");
        int limite = input.nextInt();

        procurarPrimos(limite);
    }
}
