package exercicio;

public class Exe9 {
    public static void encontrarMaiorEMenor(int[] array) {
        int maior = Integer.MIN_VALUE, segundoMaior = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior){
                maior = array[i];
            }else if (array[i] <=maior && array[i]>=segundoMaior){
                segundoMaior = array[i];
            }
        }
        System.out.printf("Maior: %d    Segundo maior: %d ", maior, segundoMaior);
    }
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 3, 6};
        encontrarMaiorEMenor(array);
    }
}
