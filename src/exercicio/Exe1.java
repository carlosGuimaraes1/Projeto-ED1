package exercicio;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome;
        int anoAtual;
        int anoNascimento;
        int idade;
        String mensagem;

        Scanner scanner = new Scanner(System.in);

        // Leitura de projeto.dados
        System.out.print("Informe o nome: ");
        nome = scanner.next();

        System.out.print("Informe o ano atual: ");
        anoAtual = scanner.nextInt();

        System.out.print("Informe o ano de nascimento: ");
        anoNascimento = scanner.nextInt();

        // cálculo da idade
        idade = anoAtual - anoNascimento;

        mensagem = String.format("%s tem %d anos", nome, idade);
        System.out.println(mensagem);
    }
}
