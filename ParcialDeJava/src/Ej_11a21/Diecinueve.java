
package Ej_11a21;
public class Diecinueve {
public class MatrizSuma {
    
    public static void main(String[] args) {
        
        // CONSTANTES para dimensiones de la matriz
        final int FILAS = 3;
        final int COLUMNAS = 3;
        final int TOTAL_ELEMENTOS = 9;
        
        // Declarar matriz 3x3
        int[][] matriz = new int[FILAS][COLUMNAS];
        
        // Llenar la matriz con 9 números enteros
        matriz[0][0] = 15;  matriz[0][1] = 8;   matriz[0][2] = 23;
        matriz[1][0] = 42;  matriz[1][1] = 7;   matriz[1][2] = 19;
        matriz[2][0] = 31;  matriz[2][1] = 12;  matriz[2][2] = 6;
        
        // Variable para la suma total inicializada en 0
        int sumaTotal = 0;
        
        // Mostrar la matriz completa
        System.out.println("=== MATRIZ 3x3 CON 9 NÚMEROS ENTEROS ===");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println(); // Salto de línea para cada fila
        }
        
        System.out.println("\n--- PROCESO DE SUMA ---");
        
        // Recorrer matriz y sumar todas las posiciones
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                
                // Mostrar posición y valor
                System.out.println("Posición [" + fila + "][" + columna + "] = " + matriz[fila][columna]);
                
                // Sumar usando operadores aritméticos
                sumaTotal = sumaTotal + matriz[fila][columna];
            }
        }
        
        // Mostrar resultado final
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Suma total de todas las posiciones: " + sumaTotal);
        System.out.println("Total de elementos sumados: " + TOTAL_ELEMENTOS);
        
        // Verificación adicional usando for each (alternativa)
        System.out.println("\n--- VERIFICACIÓN CON FOR EACH ---");
        int sumaVerificacion = 0;
        
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                sumaVerificacion = sumaVerificacion + elemento;
            }
        }
        
        System.out.println("Suma verificación: " + sumaVerificacion);
        
        // Condicional if para confirmar que ambas sumas coinciden
        if (sumaTotal == sumaVerificacion) {
            System.out.println("✓ Verificación exitosa: Las sumas coinciden");
        } else {
            System.out.println("✗ Error: Las sumas no coinciden");
        }
    }
   }
}
