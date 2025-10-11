package Ej_1a10;

import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int NUM_NOTAS = 10;

        double[] notas = new double[NUM_NOTAS];

        for (int i = 0; i < NUM_NOTAS; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        int ganaron = 0;
        int perdieron = 0;

        for (double nota : notas) {
            if (nota >= 3.0) {
                ganaron++;
            } else {
                perdieron++;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de estudiantes que ganaron: " + ganaron);
        System.out.println("Cantidad de estudiantes que perdieron: " + perdieron);
    }
}
