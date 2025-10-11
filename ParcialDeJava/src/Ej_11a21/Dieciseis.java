
package Ej_11a21;
public class Dieciseis {
    public static void main(String[] args) {
        
        // CONSTANTES para valores mágicos
        final int DIVISOR_PAR = 2;
        final int RESTO_PAR = 0;
        
        // Array con 9 números
        int[] numeros = {
            15, 22, 8, 33, 44, 
            17, 28, 9, 56
        };
        
        // Contadores inicializados en 0
        int contadorPares = 0;
        int contadorImpares = 0;
        
        // Mostrar la lista completa
        System.out.println("LISTA DE 9 NÚMEROS:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
        
        System.out.println("\n--- CLASIFICACIÓN PAR/IMPAR ---");
        
        // Recorrer array usando for each
        for (int numero : numeros) {
            
            // Usar operador aritmético módulo para determinar par/impar
            int resto = numero % DIVISOR_PAR;
            
            // Condicional if para clasificar
            if (resto == RESTO_PAR) {
                contadorPares++;
                System.out.println(numero + " -> PAR");
            } else {
                contadorImpares++;
                System.out.println(numero + " -> IMPAR");
            }
        }
        
        // Mostrar resultados finales
        System.out.println("\n--- RESUMEN DE CONTEO ---");
        System.out.println("Total de números: " + numeros.length);
        System.out.println("Números pares: " + contadorPares);
        System.out.println("Números impares: " + contadorImpares);
        
        // Verificación usando operadores aritméticos
        int totalVerificacion = contadorPares + contadorImpares;
        System.out.println("Verificación total: " + totalVerificacion);
        
        // Información adicional
        System.out.println("\n--- NÚMEROS ENCONTRADOS ---");
        System.out.print("Pares: ");
        for (int numero : numeros) {
            if (numero % DIVISOR_PAR == RESTO_PAR) {
                System.out.print(numero + " ");
            }
        }
        
        System.out.print("\nImpares: ");
        for (int numero : numeros) {
            if (numero % DIVISOR_PAR != RESTO_PAR) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
