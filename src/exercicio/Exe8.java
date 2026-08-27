package exercicio;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um texto");
        String texto = input.nextLine();

        analisandoString(texto);
    }

    public static void analisandoString(String texto) {
        int contVogais = 0, contConsoantes = 0, contNum = 0, contOutros = 0;
        String vogais = "aáeéoóuú";
        String text = texto.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (vogais.indexOf(text.charAt(i)) != -1) {
                    contVogais++;
                } else {
                    contConsoantes++;
                }
            } else {
                if (Character.isDigit(text.charAt(i))) {
                    contNum++;
                } else {
                    contOutros++;
                }
            }
        }

        System.out.println("Vogais: " + contVogais);
        System.out.println("Consoantes: " + contConsoantes);
        System.out.println("Números: " + contNum);
        System.out.println("Outros: " + contOutros);
    }
}
