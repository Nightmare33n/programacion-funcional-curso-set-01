/*
    Problema:
    Dada el arreglo de números, filtrar sólo los números pares.
 */

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] pares = Arrays.stream(arreglo).filter(n -> n % 2 == 0).toArray();

        for(int p : pares) {
            System.out.println(p);
        }
    }
}