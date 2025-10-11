/*

 */
package parcialdejava;

import java.util.Scanner;

public class EjSeis {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUMERO_PAGOS = 6;
        final double TASA_CAMBIO_USD_COP = 4100.0; // Pesos colombianos por dolar
        final double SALARIO_MINIMO_COP = 1300000.0; // Salario minimo en pesos
    
        
        // Array para almacenar los pagos en dolares
        double[] pagosEnDolares = new double[NUMERO_PAGOS];
        double totalDolares = 0.0;
        double totalPesos;
        
        System.out.println("=== SISTEMA DE CONVERSION DE MONEDAS ===");
        System.out.println("Conversión: USD a COP (Pesos Colombianos)");
        System.out.println("Tasa de cambio: $1 USD = $" + TASA_CAMBIO_USD_COP + " COP");
        System.out.println("Salario minimo de referencia: $" + SALARIO_MINIMO_COP + " COP");
        System.out.println();
        
        // Solicitar los 6 pagos en dolares usando bucle for
        System.out.println("Ingrese los " + NUMERO_PAGOS + " pagos en dolares:");
        for (int i = 0; i < NUMERO_PAGOS; i++) {
            System.out.print("Pago " + (i + 1) + " (USD): $");
            pagosEnDolares[i] = entrada.nextDouble();
        }
        
        // Calcular el total en dolares usando bucle for
        for (int i = 0; i < NUMERO_PAGOS; i++) {
            totalDolares += pagosEnDolares[i];
        }
        
        // Convertir el total a pesos colombianos usando operadores aritmeticos
        totalPesos = totalDolares * TASA_CAMBIO_USD_COP;
        
        // Mostrar el detalle de cada pago convertido
        System.out.println();
        System.out.println("=== DETALLE DE PAGOS CONVERTIDOS ===");
        for (int i = 0; i < NUMERO_PAGOS; i++) {
            double pagoEnPesos = pagosEnDolares[i] * TASA_CAMBIO_USD_COP;
            System.out.printf("Pago %d: $%.2f USD = $%.2f COP%n", 
                             (i + 1), pagosEnDolares[i], pagoEnPesos);
        }
        
        // Mostrar totales
        System.out.println();
        System.out.println("=== TOTALES ===");
        System.out.printf("Total en dolares: $%.2f USD%n", totalDolares);
        System.out.printf("Total en pesos: $%.2f COP%n", totalPesos);
        
        System.out.println();
        
        // Verificar si supera el salario minimo usando condicional if
        if (totalPesos > SALARIO_MINIMO_COP) {
            double excedente = totalPesos - SALARIO_MINIMO_COP;
            System.out.println("=== VERIFICACION SALARIAL ===");
            System.out.println("✓ EL TRABAJADOR GANA MAS DE UN SALARIO MINIMO");
            System.out.printf("Excedente sobre salario minimo: $%.2f COP%n", excedente);
            
            // Calcular cuantos salarios minimos representa
            double salarios = totalPesos / SALARIO_MINIMO_COP;
            System.out.printf("Equivale a %.2f salarios minimos%n", salarios);
        } else {
            double faltante = SALARIO_MINIMO_COP - totalPesos;
            System.out.println("=== VERIFICACION SALARIAL ===");
            System.out.println("✗ EL TRABAJADOR NO SUPERA EL SALARIO MINIMO");
            System.out.printf("Faltante para salario minimo: $%.2f COP%n", faltante);
            
            // Calcular que porcentaje del salario minimo representa
            double porcentaje = (totalPesos / SALARIO_MINIMO_COP) * 100;
            System.out.printf("Representa el %.1f%% del salario minimo%n", porcentaje);
        }
        
        entrada.close();
    }
}
