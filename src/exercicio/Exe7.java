package exercicio;

import java.util.Arrays;
public class Exe7 {

    public static void inverterArray(int[] array) {
        int indiceInicio = 0, indiceFim = array.length-1, troca;
        for (int i = 0; i < array.length/2; i++) {
            if (indiceInicio < indiceFim){
                troca = array[indiceInicio];
                array[indiceInicio] = array[indiceFim];
                array[indiceFim] = troca;
                indiceInicio++;
                indiceFim--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        inverterArray(array);
    }
}
