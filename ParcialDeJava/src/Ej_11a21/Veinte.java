
package Ej_11a21;
public class Veinte {

/**
 * Ejercicio 20: Almacenar 8 números en matriz 2x4 y sumar solo los pares
 * @author Ingenieros en Sistemas
 */
public class MatrizSumaPares {
    
    public static void main(String[] args) {
        
        final int FILAS = 2;
        final int COLUMNAS = 4;
        final int TOTAL_ELEMENTOS = 8;
        final int DIVISOR_PAR = 2;
        final int RESTO_PAR = 0;
        
        // Declarar matriz 2x4
        int[][] matriz = new int[FILAS][COLUMNAS];
        
        // Llenar la matriz con 8 números enteros
        matriz[0][0] = 14;  matriz[0][1] = 7;   matriz[0][2] = 22;  matriz[0][3] = 15;
        matriz[1][0] = 8;   matriz[1][1] = 33;  matriz[1][2] = 16;  matriz[1][3] = 9;
        
        // Variables para contadores y suma inicializadas en 0
        int sumaPares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        // Mostrar la matriz completa
        System.out.println("=== MATRIZ 2x4 CON 8 NÚMEROS ENTEROS ===");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println(); // Salto de línea para cada fila
        }
        
        System.out.println("\n--- ANÁLISIS DE NÚMEROS PARES E IMPARES ---");
        
        // Recorrer matriz y identificar pares/impares
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                
                int numeroActual = matriz[fila][columna];
                
                // Usar operador aritmético módulo para verificar si es par
                int resto = numeroActual % DIVISOR_PAR;
                
                // Condicional if para verificar si es par
                if (resto == RESTO_PAR) {
                    sumaPares = sumaPares + numeroActual; // Operador aritmético suma
                    contadorPares++;
                    System.out.println("Posición [" + fila + "][" + columna + "] = " + numeroActual + " -> PAR (se suma)");
                } else {
                    contadorImpares++;
                    System.out.println("Posición [" + fila + "][" + columna + "] = " + numeroActual + " -> IMPAR (no se suma)");
                }
            }
        }
        
        // Mostrar resultado final
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Suma total de números PARES: " + sumaPares);
        System.out.println("Cantidad de números pares encontrados: " + contadorPares);
        System.out.println("Cantidad de números impares encontrados: " + contadorImpares);
        System.out.println("Total de elementos analizados: " + TOTAL_ELEMENTOS);
        
        // Mostrar los números pares encontrados
        System.out.println("\n--- NÚMEROS PARES IDENTIFICADOS ---");
        System.out.print("Números pares: ");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (matriz[fila][columna] % DIVISOR_PAR == RESTO_PAR) {
                    System.out.print(matriz[fila][columna] + " ");
                }
            }
        }
        System.out.println();
        
        // Verificación usando operadores aritméticos
        int totalVerificacion = contadorPares + contadorImpares;
        if (totalVerificacion == TOTAL_ELEMENTOS) {
            System.out.println("✓ Verificación exitosa: Se analizaron todos los elementos");
        } else {
            System.out.println("✗ Error: No se analizaron todos los elementos");
        }
    }
    }
}
