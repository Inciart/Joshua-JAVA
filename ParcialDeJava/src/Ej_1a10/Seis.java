
package Ej_1a10;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes
        final int NUM_PAGOS = 6;
        final double TASA_CAMBIO = 3900; // 1 USD = 4000 COP (ejemplo)
        final double SALARIO_MINIMO = 1423500; // valor de referencia en pesos

        // Array de pagos en dólares
        double[] pagosDolares = new double[NUM_PAGOS];

        // Ingreso de pagos
        for (int i = 0; i < NUM_PAGOS; i++) {
            System.out.print("Ingrese el pago " + (i + 1) + " en dólares: ");
            pagosDolares[i] = entrada.nextDouble();
        }

        // Calcular el total en dólares
        double totalDolares = 0;
        for (double pago : pagosDolares) {
            totalDolares += pago;
        }

        // Convertir a pesos
        double totalPesos = totalDolares * TASA_CAMBIO;

        // Mostrar resultados
        System.out.println("\nTotal en dólares: $" + totalDolares);
        System.out.println("Total en pesos colombianos: $" + totalPesos);

        if (totalPesos > SALARIO_MINIMO) {
            System.out.println("✅ El trabajador gana más de un salario mínimo.");
        } else {
            System.out.println("❌ El trabajador NO gana más de un salario mínimo.");
        }
    }
}
