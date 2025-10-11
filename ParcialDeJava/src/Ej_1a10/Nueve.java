
package Ej_1a10;

import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int NUM_ELEMENTOS = 9;

        int[] numeros = new int[NUM_ELEMENTOS];

        for (int i = 0; i < NUM_ELEMENTOS; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int noDigitos = 0;

        for (int numero : numeros) {
            if (numero < 0 || numero > 9) {
                noDigitos++;
            }
        }

        System.out.println("\nCantidad de números que NO son dígitos: " + noDigitos);
    }
}
