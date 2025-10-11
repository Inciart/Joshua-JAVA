/*

 */
package parcialdejava;

import java.util.Scanner;

public class EjSiete {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PORCENTAJE_IVA = 0.19; // 19% de IVA
        final int NUMERO_PRODUCTOS = 5; // Numero de productos en la lista
        
        // Arrays para almacenar precios base y precios con IVA
        double[] preciosBase = new double[NUMERO_PRODUCTOS];
        double[] preciosConIVA = new double[NUMERO_PRODUCTOS];
        
        double totalBase = 0.0;
        double totalConIVA = 0.0;
        
        System.out.println("=== CALCULO DE PRECIOS CON IVA ===");
        System.out.println("IVA aplicable: " + (PORCENTAJE_IVA * 100) + "%");
        System.out.println("Numero de productos: " + NUMERO_PRODUCTOS);
        System.out.println();
        
        // Solicitar los precios base usando bucle for
        System.out.println("Ingrese los precios base de los productos:");
        for (int i = 0; i < NUMERO_PRODUCTOS; i++) {
            System.out.print("Precio base del producto " + (i + 1) + ": $");
            preciosBase[i] = entrada.nextDouble();
        }
        
        // Recorrer la lista y calcular precios con IVA usando bucle for
        for (int i = 0; i < NUMERO_PRODUCTOS; i++) {
            // Calcular precio con IVA usando operadores aritmeticos
            preciosConIVA[i] = preciosBase[i] + (preciosBase[i] * PORCENTAJE_IVA);
            
            // Acumular totales
            totalBase += preciosBase[i];
            totalConIVA += preciosConIVA[i];
        }
        
        // Mostrar cada producto con su precio base y precio con IVA
        System.out.println();
        System.out.println("=== LISTA DE PRODUCTOS CON IVA INCLUIDO ===");
        System.out.println("Producto\t\tPrecio Base\t\tIVA\t\tPrecio Final");
        System.out.println("--------\t\t-----------\t\t---\t\t------------");
        
        for (int i = 0; i < NUMERO_PRODUCTOS; i++) {
            double valorIVA = preciosBase[i] * PORCENTAJE_IVA;
            System.out.printf("Producto %d\t\t$%.2f\t\t\t$%.2f\t\t$%.2f%n", 
                             (i + 1), preciosBase[i], valorIVA, preciosConIVA[i]);
        }
        
        // Mostrar totales
        System.out.println();
        System.out.println("=== TOTALES ===");
        System.out.printf("Total sin IVA: $%.2f%n", totalBase);
        double totalIVAPagado = totalConIVA - totalBase;
        System.out.printf("Total IVA: $%.2f%n", totalIVAPagado);
        System.out.printf("Total con IVA: $%.2f%n", totalConIVA);
        
        // Mostrar estadisticas adicionales
        System.out.println();
        System.out.println("=== ESTADISTICAS ===");
        double promedioBase = totalBase / NUMERO_PRODUCTOS;
        double promedioConIVA = totalConIVA / NUMERO_PRODUCTOS;
        
        System.out.printf("Precio promedio sin IVA: $%.2f%n", promedioBase);
        System.out.printf("Precio promedio con IVA: $%.2f%n", promedioConIVA);
        
        entrada.close();
    }
}
