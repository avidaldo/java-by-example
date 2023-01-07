package p02_basic_syntax.paso_valor.paso_arrays;

import java.util.Arrays;

class PasoArrays {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        printArray(array1);
        array1[0] = 0;  // innecesario ya que inicializa a 0 por defecto

        int[] array2 = array1;  // dos variables apuntando al mismo array
        int[] array3 = Arrays.copyOf(array1, array1.length); // dos arrays iguales

        IncrementaArray(array1);
        IncrementaArray(array2);
        IncrementaArray(array3);

        printArray(array1);
        printArray(array2);
        printArray(array3);
    }

    private static void IncrementaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
    }

}
