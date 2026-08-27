package exercicio;

import java.util.Scanner;

public class Exe5 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base * altura);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor para a base do retângulo");
        double base = input.nextDouble();
        System.out.println("Informe um valor para a altura do retângulo");
        double altura = input.nextDouble();

        System.out.println("Área do retângulo " + calcularArea(base, altura));
        System.out.println("Perímetro do retângulo " + calcularPerimetro(base, altura));

    }
}
