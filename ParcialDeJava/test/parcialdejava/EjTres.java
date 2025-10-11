/*
Un arquitecto necesita encontrar el área de un lote rectangular
(Area = Base * Altura), si el lote pasa de 100 metros cuadrados 
informar que esta habilitado para la venta.
 */
package parcialdejava;

import java.util.Scanner;

public class EjTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double AREA_MINIMA_VENTA = 100.0;
        
        // Variables para las dimensiones del lote
        double base, altura, area;
        
        System.out.println("=== CALCULO DE AREA DE LOTE RECTANGULAR ===");
        System.out.println("Formula: Area = Base * Altura");
        System.out.println("Area minima para venta: " + AREA_MINIMA_VENTA + " m²");
        System.out.println();
        
        // Solicitar las dimensiones del lote
        System.out.print("Ingrese la base del lote (metros): ");
        base = entrada.nextDouble();
        
        System.out.print("Ingrese la altura del lote (metros): ");
        altura = entrada.nextDouble();
        
        // Calcular el area usando operadores aritmeticos
        area = base * altura;
        
        // Mostrar resultados del calculo
        System.out.println();
        System.out.println("=== RESULTADOS ===");
        System.out.printf("Base: %.2f metros%n", base);
        System.out.printf("Altura: %.2f metros%n", altura);
        System.out.printf("Area calculada: %.2f m²%n", area);
        
        System.out.println();
        
        // Determinar si el lote esta habilitado para la venta usando condicional if
        if (area > AREA_MINIMA_VENTA) {
            double excedente = area - AREA_MINIMA_VENTA;
            System.out.println("=== ESTADO DEL LOTE ===");
            System.out.println("✓ LOTE HABILITADO PARA LA VENTA");
            System.out.printf("El lote supera el area minima por %.2f m²%n", excedente);
        } else {
            double faltante = AREA_MINIMA_VENTA - area;
            System.out.println("=== ESTADO DEL LOTE ===");
            System.out.println("✗ LOTE NO HABILITADO PARA LA VENTA");
            System.out.printf("El lote necesita %.2f m² adicionales%n", faltante);
        }
        
        entrada.close();
    }
}