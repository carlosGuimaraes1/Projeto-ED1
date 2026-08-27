package exercicio;

public class Exe11 {
    public static void main(String[] args) {
        System.out.println(verificarPalindromo("Socorram me subi no onibus em Marrocos"));
    }

    public static boolean verificarPalindromo(String palindromo) {
        int inicio = 0, fim = palindromo.length() - 1;
        String result = palindromo.toLowerCase().replaceAll(" ", "");
        char[] charArray = result.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[inicio] == charArray[fim]) {
                inicio++;
                fim--;
            } else {
                return false;
            }
        }
        return true;
    }
}
