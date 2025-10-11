
package Ej_1a10;

import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int NUM_ALUMNOS = 7;

        int[] edades = new int[NUM_ALUMNOS];

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edades[i] = entrada.nextInt();
        }

        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }

        double promedio = (double) suma / NUM_ALUMNOS;

        System.out.println("\nLa edad promedio es: " + promedio);

        if (promedio > 18) {
            System.out.println("✅ Positivo para salir de prácticas.");
        } else {
            System.out.println("❌ No está positivo para salir de prácticas.");
        }
    }
}
