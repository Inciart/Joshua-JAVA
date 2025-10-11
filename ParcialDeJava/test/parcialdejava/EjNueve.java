/*

 */
package parcialdejava;

import java.util.Scanner;

public class EjNueve {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int CANTIDAD_NUMEROS = 9;
        final int DIGITO_MINIMO = 0;
        final int DIGITO_MAXIMO = 9;
    

    
        // Array para almacenar los 9 numeros
        int[] numeros = new int[CANTIDAD_NUMEROS];
        
        // Variables contadoras
        int contadorNoDigitos = 0;
        int contadorDigitos = 0;
        
        System.out.println("=== CONTADOR DE NUMEROS NO DIGITOS ===");
        System.out.println("Cantidad de numeros a evaluar: " + CANTIDAD_NUMEROS);
        System.out.println("Rango de digitos: " + DIGITO_MINIMO + " al " + DIGITO_MAXIMO);
        System.out.println();
        
        // Solicitar los 9 numeros usando bucle for
        System.out.println("Ingrese los " + CANTIDAD_NUMEROS + " numeros:");
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        
        // Recorrer el array y contar digitos y no digitos usando bucle for
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            // Verificar si el numero esta en el rango de digitos usando condicional if
            if (numeros[i] >= DIGITO_MINIMO && numeros[i] <= DIGITO_MAXIMO) {
                contadorDigitos++;
            } else {
                contadorNoDigitos++;
            }
        }
        
        // Mostrar analisis detallado de cada numero
        System.out.println();
        System.out.println("=== ANALISIS DETALLADO ===");
        System.out.println("Numero\t\tTipo");
        System.out.println("------\t\t----");
        
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            String tipo;
            if (numeros[i] >= DIGITO_MINIMO && numeros[i] <= DIGITO_MAXIMO) {
                tipo = "DIGITO";
            } else {
                tipo = "NO DIGITO";
            }
            System.out.printf("%d\t\t%s%n", numeros[i], tipo);
        }
        
        // Mostrar resultados del conteo
        System.out.println();
        System.out.println("=== RESULTADOS DEL CONTEO ===");
        System.out.println("Total de numeros analizados: " + CANTIDAD_NUMEROS);
        System.out.println("Numeros que SI son digitos: " + contadorDigitos);
        System.out.println("Numeros que NO son digitos: " + contadorNoDigitos);
        
        // Calcular porcentajes usando operadores aritmeticos
        double porcentajeDigitos = ((double) contadorDigitos / CANTIDAD_NUMEROS) * 100;
        double porcentajeNoDigitos = ((double) contadorNoDigitos / CANTIDAD_NUMEROS) * 100;
        
        System.out.println();
        System.out.printf("Porcentaje de digitos: %.1f%%%n", porcentajeDigitos);
        System.out.printf("Porcentaje de no digitos: %.1f%%%n", porcentajeNoDigitos);
        
        System.out.println();
        
        // Mostrar conclusion usando condicional if
        if (contadorNoDigitos > 0) {
            System.out.println("=== CONCLUSION ===");
            System.out.println("✓ Se encontraron " + contadorNoDigitos + " numeros que NO son digitos");
            
            if (contadorNoDigitos > contadorDigitos) {
                System.out.println("La mayoria de numeros NO son digitos");
            } else if (contadorNoDigitos < contadorDigitos) {
                System.out.println("La mayoria de numeros SI son digitos");
            } else {
                System.out.println("Hay igual cantidad de digitos y no digitos");
            }
        } else {
            System.out.println("=== CONCLUSION ===");
            System.out.println("✓ TODOS los numeros son digitos (0-9)");
        }
        
        entrada.close();
    }
}
