/*

 */
package parcialdejava;

import java.util.Scanner;

public class EjDiez {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMAÑO_LISTAS = 5; // Mismo tamaño para ambas listas
    
        
        // Arrays para almacenar las edades de hombres y mujeres
        int[] edadesHombres = new int[TAMAÑO_LISTAS];
        int[] edadesMujeres = new int[TAMAÑO_LISTAS];
        
        // Variables para calcular promedios
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        double promedioHombres, promedioMujeres;
        
        System.out.println("=== ANALISIS DE EDADES POR GENERO ===");
        System.out.println("Tamaño de cada lista: " + TAMAÑO_LISTAS + " personas");
        System.out.println();
        
        // Solicitar edades de los hombres usando bucle for
        System.out.println("--- EDADES DE HOMBRES ---");
        for (int i = 0; i < TAMAÑO_LISTAS; i++) {
            System.out.print("Edad del hombre " + (i + 1) + ": ");
            edadesHombres[i] = entrada.nextInt();
        }
        
        // Solicitar edades de las mujeres usando bucle for
        System.out.println();
        System.out.println("--- EDADES DE MUJERES ---");
        for (int i = 0; i < TAMAÑO_LISTAS; i++) {
            System.out.print("Edad de la mujer " + (i + 1) + ": ");
            edadesMujeres[i] = entrada.nextInt();
        }
        
        // Calcular suma de edades de hombres usando bucle for
        for (int i = 0; i < TAMAÑO_LISTAS; i++) {
            sumaEdadesHombres += edadesHombres[i];
        }
        
        // Calcular suma de edades de mujeres usando bucle for
        for (int i = 0; i < TAMAÑO_LISTAS; i++) {
            sumaEdadesMujeres += edadesMujeres[i];
        }
        
        // Calcular promedios usando operadores aritmeticos
        promedioHombres = (double) sumaEdadesHombres / TAMAÑO_LISTAS;
        promedioMujeres = (double) sumaEdadesMujeres / TAMAÑO_LISTAS;
        
        // Mostrar las edades registradas
        System.out.println();
        System.out.println("=== EDADES REGISTRADAS ===");
        
        System.out.println("HOMBRES:");
        for (int i = 0; i < TAMAÑO_LISTAS; i++) {
            System.out.println("  Hombre " + (i + 1) + ": " + edadesHombres[i] + " años");
        }
        
        System.out.println();
        System.out.println("MUJERES:");
        for (int i = 0; i < TAMAÑO_LISTAS; i++) {
            System.out.println("  Mujer " + (i + 1) + ": " + edadesMujeres[i] + " años");
        }
        
        // Mostrar calculos y resultados
        System.out.println();
        System.out.println("=== CALCULOS DE PROMEDIOS ===");
        System.out.println("Suma edades hombres: " + sumaEdadesHombres + " años");
        System.out.printf("Promedio hombres: %.2f años%n", promedioHombres);
        
        System.out.println();
        System.out.println("Suma edades mujeres: " + sumaEdadesMujeres + " años");
        System.out.printf("Promedio mujeres: %.2f años%n", promedioMujeres);
        
        System.out.println();
        
        // Determinar cual promedio es mayor usando condicional if
        if (promedioHombres > promedioMujeres) {
            double diferencia = promedioHombres - promedioMujeres;
            System.out.println("=== RESULTADO DE COMPARACION ===");
            System.out.println("✓ EL PROMEDIO DE EDADES DE HOMBRES ES MAYOR");
            System.out.printf("Promedio hombres: %.2f años%n", promedioHombres);
            System.out.printf("Promedio mujeres: %.2f años%n", promedioMujeres);
            System.out.printf("Diferencia: %.2f años%n", diferencia);
        } else if (promedioMujeres > promedioHombres) {
            double diferencia = promedioMujeres - promedioHombres;
            System.out.println("=== RESULTADO DE COMPARACION ===");
            System.out.println("✓ EL PROMEDIO DE EDADES DE MUJERES ES MAYOR");
            System.out.printf("Promedio mujeres: %.2f años%n", promedioMujeres);
            System.out.printf("Promedio hombres: %.2f años%n", promedioHombres);
            System.out.printf("Diferencia: %.2f años%n", diferencia);
        } else {
            System.out.println("=== RESULTADO DE COMPARACION ===");
            System.out.println("= EMPATE: AMBOS PROMEDIOS SON IGUALES");
            System.out.printf("Promedio hombres: %.2f años%n", promedioHombres);
            System.out.printf("Promedio mujeres: %.2f años%n", promedioMujeres);
        }
        
        entrada.close();
    }
}
